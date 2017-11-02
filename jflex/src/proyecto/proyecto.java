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
        String ruta="C:/Users/Administardor/Documents/GitHub/BatLan/jflex/src/proyecto/Lexer.flex";
        generadorlexico(ruta);
    }
    public static void generadorlexico(String ruta){
        File archivo=new File(ruta);
        jflex.Main.generate(archivo);
    }
    
}
