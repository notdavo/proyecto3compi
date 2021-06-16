package proyecto;

import proyecto.generated.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.swing.*;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutionException;


@Controller
public class MainController {
    public String todoTabla = "";

    @GetMapping("/")
    public String showForm(Model model) {
        Code code = new Code();
        model.addAttribute("code", code);
        return "index";
    }

    @PostMapping("/")
    public String submitForm(@ModelAttribute("code") Code code) {
        String codeString = code.getCode();
        miScanner inst;
        miParser parser;
        ParseTree tree = null;
        CommonTokenStream tokens;
        MyErrorListener errorListener;

        inst = new miScanner(CharStreams.fromString(codeString));
        tokens = new CommonTokenStream(inst);
        parser = new miParser(tokens);
        errorListener = new MyErrorListener();
        inst.removeErrorListeners();
        inst.addErrorListener( errorListener );
        parser.removeErrorListeners();
        parser.addErrorListener ( errorListener );

        try{
            tree = parser.program();

            Interprete inter = new Interprete();
            inter.visit(tree);

            todoTabla = inter.getMensaje();

        }catch(RecognitionException e){
            System.out.println("Error!!!");
            e.printStackTrace();
        }
        if (errorListener.hasErrors() == false) {
            System.out.println("Compilación Exitosa!!\n");
            //java.util.concurrent.Future<JFrame> treeGUI = org.antlr.v4.gui.Trees.inspect(tree, parser);
            //treeGUI.get().setVisible(true);
        }
        else {
            System.out.println("Compilación Fallida!!\n");
            System.out.println(errorListener.toString());
        }

        code.setCodeReturn(todoTabla);

        return "index";
    }
}
