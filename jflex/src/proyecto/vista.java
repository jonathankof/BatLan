/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class vista extends javax.swing.JFrame {

    /**
     * Creates new form vista
     */
    public vista() {
        initComponents();
        this.setLocationRelativeTo(this);
        
        //this.setExtendedState(vista.MAXIMIZED_BOTH);
    }
    JFileChooser seleccionar=new JFileChooser();
    File archivo;
    File archivoAbierto;
    FileInputStream entrada;
    FileOutputStream salida;
    public String AbrirArchivo(File archivo){
        String documento = "";
        try{
            entrada=new FileInputStream(archivo);
            int ar;
            while((ar=entrada.read())!=-1){
                char caracter=(char)ar;
                documento+=caracter;
            }
        }catch(Exception e){
            
        }
        return documento;
    }
    public String GuardarArchivo(File archivo, String documento){
        String mensaje=null;
        try{
            salida=new FileOutputStream(archivo);
            byte[] ward=documento.getBytes();
            salida.write(ward);
            mensaje="Este archivo fue guardado";
        }catch(Exception e){
            
        }
        
        return mensaje;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        codigoPrincipal = new javax.swing.JEditorPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jEditorPane2 = new javax.swing.JEditorPane();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();

        jMenu4.setText("jMenu4");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BatLan");

        codigoPrincipal.setBackground(new java.awt.Color(0, 0, 0));
        codigoPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        codigoPrincipal.setCaretColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(codigoPrincipal);

        jEditorPane2.setBackground(new java.awt.Color(0, 0, 0));
        jEditorPane2.setForeground(new java.awt.Color(255, 255, 255));
        jEditorPane2.setCaretColor(new java.awt.Color(255, 255, 255));
        jEditorPane2.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jEditorPane2.setMaximumSize(new java.awt.Dimension(1, 1));
        jEditorPane2.setName(""); // NOI18N
        jEditorPane2.setPreferredSize(new java.awt.Dimension(10, 20));
        jScrollPane2.setViewportView(jEditorPane2);

        jButton1.setAction(jMenuItem4.getAction());
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/guardar-opcion-de-archivo_318-41914.jpg"))); // NOI18N
        jButton1.setPreferredSize(new java.awt.Dimension(25, 25));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setAction(jMenuItem2.getAction());
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/nuevo.jpg"))); // NOI18N
        jButton2.setPreferredSize(new java.awt.Dimension(25, 25));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setAction(jMenuItem6.getAction());
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/save_3621.png"))); // NOI18N
        jButton3.setToolTipText("");
        jButton3.setPreferredSize(new java.awt.Dimension(25, 25));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/hombre-corriendo_318-1564.jpg"))); // NOI18N
        jButton4.setPreferredSize(new java.awt.Dimension(25, 25));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/open-folder-outline_318-41918.jpg"))); // NOI18N
        jButton5.setPreferredSize(new java.awt.Dimension(25, 25));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setAction(jMenuItem5.getAction());
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/puerta-de-salida_318-48444.jpg"))); // NOI18N
        jButton6.setPreferredSize(new java.awt.Dimension(25, 25));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jMenu1.setText("Archivo");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/nuevo.jpg"))); // NOI18N
        jMenuItem2.setText("Nuevo ");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/open-folder-outline_318-41918.jpg"))); // NOI18N
        jMenuItem3.setText("Abrir...");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/guardar-opcion-de-archivo_318-41914.jpg"))); // NOI18N
        jMenuItem4.setText("Guardar");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/save_3621.png"))); // NOI18N
        jMenuItem6.setText("Guardar como");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/puerta-de-salida_318-48444.jpg"))); // NOI18N
        jMenuItem5.setText("Salir");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Run forest run");

        jMenuItem12.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F11, 0));
        jMenuItem12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/hombre-corriendo_318-1564.jpg"))); // NOI18N
        jMenuItem12.setText("Correr");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem12);

        jMenuBar1.add(jMenu3);

        jMenu5.setText("Ayuda");

        jMenuItem13.setText("Documentación");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem13);

        jMenuItem14.setText("Acerca de BatLan");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem14);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
                        .addGap(0, 0, 0)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(5, 5, 5))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        AcercadeBATLAN acercadeBATLAN= new AcercadeBATLAN(this, rootPaneCheckingEnabled);
        acercadeBATLAN.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        if(seleccionar.showDialog(null,"Abrir")==JFileChooser.APPROVE_OPTION){
            archivo=seleccionar.getSelectedFile();
            archivoAbierto=archivo;
                 }
        if(archivo.canRead()){
            if(archivo.getName().endsWith("btl")){
                String documento=AbrirArchivo(archivo);
                codigoPrincipal.setText(documento);
            }else{
                JOptionPane.showMessageDialog(null,"Este Archivo no pertenece a este lenguaje");
            }
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
       if(seleccionar.showDialog(null, "Guardar")==JFileChooser.APPROVE_OPTION){
            archivo=seleccionar.getSelectedFile();
            
            if(archivo.getName().endsWith("txt")){
                String Documento=codigoPrincipal.getText();
                String mensaje=GuardarArchivo(archivo,Documento);
                if(mensaje!=null){
                    JOptionPane.showMessageDialog(null, mensaje);
                } else{
                    JOptionPane.showMessageDialog(null, mensaje);
                }
                    
            }
        }
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        
            
            
                String Documento=codigoPrincipal.getText();
                String mensaje=GuardarArchivo(archivo,Documento);
                if(mensaje!=null){
                    JOptionPane.showMessageDialog(null, mensaje);
                } else{
                    JOptionPane.showMessageDialog(null, mensaje);
                }
                    
            
        
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
String Documento=codigoPrincipal.getText();
                String mensaje=GuardarArchivo(archivo,Documento);
                if(mensaje!=null){
                    JOptionPane.showMessageDialog(null, mensaje);
                } else{
                    JOptionPane.showMessageDialog(null, mensaje);
                }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(seleccionar.showDialog(null, "Guardar")==JFileChooser.APPROVE_OPTION){
            archivo=seleccionar.getSelectedFile();
            
            if(archivo.getName().endsWith("txt")){
                String Documento=codigoPrincipal.getText();
                String mensaje=GuardarArchivo(archivo,Documento);
                if(mensaje!=null){
                    JOptionPane.showMessageDialog(null, mensaje);
                } else{
                    JOptionPane.showMessageDialog(null, mensaje);
                }
                    
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
tokenizar();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
tokenizar();        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if(seleccionar.showDialog(null,"Abrir")==JFileChooser.APPROVE_OPTION){
            archivo=seleccionar.getSelectedFile();
            archivoAbierto=archivo;
                 }
        if(archivo.canRead()){
            if(archivo.getName().endsWith("btl")){
                String documento=AbrirArchivo(archivo);
                codigoPrincipal.setText(documento);
            }else{
                JOptionPane.showMessageDialog(null,"Este Archivo no pertenece a este lenguaje");
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton6ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vista().setVisible(true);
            }
        });
    }
   // throws IOException
public void tokenizar(){
      
    
        String texto=codigoPrincipal.getText();
        String texto2=texto.toLowerCase();
         
        File archivo = new File ("archivo.txt");
        PrintWriter writer;
        try {            
            writer = new PrintWriter(archivo);
            writer.print(texto2);
            writer.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(vista.class.getName()).log(Level.SEVERE, null, ex);
        }       
        Reader lector = new BufferedReader(new FileReader("archivo.txt"));
        Lexer lexer;
        Reader lector2=lector;
        lexer = new Lexer (lector);
        
         jEditorPane2.setContentType("text/html");
        String resultado="";
        String textoFormateado="";
        while (true){
            Token token =lexer.yylex();            
            if (token == null){
               jEditorPane2.setText(resultado);
               
                return;
            }     
                switch (token){
                case SUMA:
                    resultado=resultado+ "<font color=\"gray\">+ Simbolo SUMA</font><br>";
                    textoFormateado=textoFormateado+"+";
                    break;
                case RESTA:
                    resultado=resultado+ "<font color=\"gray\">- Simbolo Menos</font><br>";
                    textoFormateado=textoFormateado+"<font color=\"gray\">-</font>";
                    break;
                case MULTIPLICACION:
                    resultado=resultado+ "<font color=\"gray\">* Simbolo Multiplicacion</font><br>";
                    textoFormateado=textoFormateado+"<font color=\"gray\">*</font>";
                    break;
                case DIVISION:
                    resultado=resultado+ "<font color=\"gray\">/ Simbolo Division</font><br>";
                    textoFormateado=textoFormateado+"<font color=\"gray\">/</font>";
                    break;
                case ASIGNACION:
                    resultado=resultado+ "<font color=\"gray\">= Simbolo Asignacion</font><br>";
                    textoFormateado=textoFormateado+"<font color=\"gray\">=</font>";
                    break;
                case ERROR:
                    resultado=resultado+ lexer.lexeme+ " Simbolo desconocido<br>";
                   textoFormateado=textoFormateado+"<font color=\"red\">"+lexer.lexeme+"</font>"; 
                    break;
                case TEXTO:                    
                    resultado=resultado+ lexer.lexeme  + " Texto<br>";
                    textoFormateado=textoFormateado+"<font color=\"blue\">"+lexer.lexeme+"</font>";
                    break;                
                case INT:
                    resultado=resultado+ lexer.lexeme + "<font color=\"green\"> Entero<br></font>";
                    
                    break;
                case BINT:
                    resultado=resultado+ "bint Palabra reservada<br>";
                    textoFormateado=textoFormateado+"<font color=\"green\">"+"bint"+"</font>";
                    break;
                case BDOUBLE:
                    resultado=resultado+ "bdouble Palabra reservada<br>";
                    textoFormateado=textoFormateado+"<font color=\"green\">"+"bdouble"+"</font>";
                    break; 
                case BFLOAT:
                    resultado=resultado+ "bint Palabra reservada<br>";
                    textoFormateado=textoFormateado+"<font color=\"green\">"+"bfloat"+"</font>";
                    break; 
                case BCHAR:
                    resultado=resultado+ "bchar Palabra reservada<br>";
                    textoFormateado=textoFormateado+"<font color=\"green\">"+"bchar"+"</font>";
                    break;      
               case BBYTE:
                    resultado=resultado+ "bint Palabra reservada<br>";
                    textoFormateado=textoFormateado+"<font color=\"green\">"+"bbyte"+"</font>";
                    break;   
                case PARENTESISD:
                    resultado=resultado+ ") Parentesis Derecho<br>";
                    textoFormateado=textoFormateado+"<font color=\"black\">"+")"+"</font>";
                    break;  
                case PARENTESISI:
                    resultado=resultado+ "( Parentesis Izquierdo<br>";
                    textoFormateado=textoFormateado+"<font color=\"black\">"+"("+"</font>";
                    break; 
                case INICIOB:
                    resultado=resultado+ "{ Inicio de Bloque<br>";
                    textoFormateado=textoFormateado+"<font color=\"black\">"+"{"+"</font>";
                    break;     
                case FINALB:
                    resultado=resultado+ "} Final de Bloque<br>";
                    textoFormateado=textoFormateado+"<font color=\"black\">"+"}"+"</font>";
                    break;
              case COMILLAD:
                    resultado=resultado+ "Comilla Doble<br>";
                    textoFormateado=textoFormateado+"<font color=\"black\">"+"\\u0022"+"</font>";
                    break;  
              case COMILLAS:
                    resultado=resultado+ "Comilla Simple<br>";
                    textoFormateado=textoFormateado+"<font color=\"black\">"+"\\u0027"+"</font>";
                    break;  
              case FLOAT:
                    resultado=resultado+ lexer.lexeme+ " Numero Flotante<br>";
                    textoFormateado=textoFormateado+"<font color=\"black\">"+lexer.lexeme+"</font>";
                    break;   
              case OBJETO:
                    resultado=resultado+ lexer.lexeme+ " OBJETO<br>";
                    textoFormateado=textoFormateado+"<font color=\"black\">"+lexer.lexeme+"</font>";
                    break; 
              case EVENTO:
                    resultado=resultado+ lexer.lexeme+ " EVENTO<br>";
                    textoFormateado=textoFormateado+"<font color=\"black\">"+lexer.lexeme+"</font>";
                    break;  
               case ESPACIO:
                    resultado=resultado+ lexer.lexeme+ " EVENTO<br>";
                    textoFormateado=textoFormateado+"<font color=\"black\">"+lexer.lexeme+"</font>";
                    break;     
                default:
                    resultado=resultado+ "<"+ lexer.lexeme + "> ";
            }
    }
     
        
 }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JEditorPane codigoPrincipal;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JEditorPane jEditorPane2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
