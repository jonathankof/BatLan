/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.io.File;

/**
 *
 * @author Admin
 */
public class proyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new vista().setVisible(true);
<<<<<<< HEAD
        String ruta="C:/Users/Admin/Documents/GitHub/BatLan/jflex/src/proyecto/Lexer.flex";
=======
        String archivo=(new File (".").getAbsolutePath());
        String ruta=archivo+"/src/proyecto/Lexer.flex";
>>>>>>> Cupido
        generadorlexico(ruta);
    }
    public static void generadorlexico(String ruta){
        File archivo=new File(ruta);
        jflex.Main.generate(archivo);
    }
    
}
