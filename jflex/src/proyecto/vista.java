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
    enum sal{
     colorDeTexto,compilar
    };
    boolean Abierto=false;
    public String AbrirArchivo(File archivo){
        String documento = "";
        try{
            entrada=new FileInputStream(archivo);
            int ar;
            Abierto=true;
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
            Abierto=true;
            salida=new FileOutputStream(archivo);
            byte[] ward=documento.getBytes();
            salida.write(ward);
            mensaje="Este archivo fue guardado";
        }catch(Exception e){
            mensaje="Hay un problema:"+e.toString();
             Abierto=false;
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
        botonGuardar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        botonGuardarComo = new javax.swing.JButton();
        botonCorrer = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuPArchivo = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        abrirArchivo = new javax.swing.JMenuItem();
        guardarArchivo = new javax.swing.JMenuItem();
        guardarComo = new javax.swing.JMenuItem();
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

        codigoPrincipal.setBackground(new java.awt.Color(0, 191, 255));
        codigoPrincipal.setForeground(new java.awt.Color(13, 0, 159));
        codigoPrincipal.setCaretColor(new java.awt.Color(255, 255, 255));
        codigoPrincipal.setSelectedTextColor(new java.awt.Color(13, 0, 159));
        jScrollPane1.setViewportView(codigoPrincipal);

        jEditorPane2.setBackground(new java.awt.Color(0, 191, 255));
        jEditorPane2.setForeground(new java.awt.Color(255, 255, 255));
        jEditorPane2.setCaretColor(new java.awt.Color(255, 255, 255));
        jEditorPane2.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jEditorPane2.setMaximumSize(new java.awt.Dimension(1, 1));
        jEditorPane2.setName(""); // NOI18N
        jEditorPane2.setPreferredSize(new java.awt.Dimension(10, 20));
        jScrollPane2.setViewportView(jEditorPane2);

        botonGuardar.setAction(guardarArchivo.getAction());
        botonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/guardar-opcion-de-archivo_318-41914.jpg"))); // NOI18N
        botonGuardar.setPreferredSize(new java.awt.Dimension(25, 25));
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
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

        botonGuardarComo.setAction(guardarComo.getAction());
        botonGuardarComo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/save_3621.png"))); // NOI18N
        botonGuardarComo.setToolTipText("");
        botonGuardarComo.setPreferredSize(new java.awt.Dimension(25, 25));
        botonGuardarComo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarComoActionPerformed(evt);
            }
        });

        botonCorrer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/hombre-corriendo_318-1564.jpg"))); // NOI18N
        botonCorrer.setPreferredSize(new java.awt.Dimension(25, 25));
        botonCorrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCorrerActionPerformed(evt);
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

        menuPArchivo.setText("Archivo");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/nuevo.jpg"))); // NOI18N
        jMenuItem2.setText("Nuevo ");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        menuPArchivo.add(jMenuItem2);

        abrirArchivo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        abrirArchivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/open-folder-outline_318-41918.jpg"))); // NOI18N
        abrirArchivo.setText("Abrir...");
        abrirArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirArchivoActionPerformed(evt);
            }
        });
        menuPArchivo.add(abrirArchivo);

        guardarArchivo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        guardarArchivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/guardar-opcion-de-archivo_318-41914.jpg"))); // NOI18N
        guardarArchivo.setText("Guardar");
        guardarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarArchivoActionPerformed(evt);
            }
        });
        menuPArchivo.add(guardarArchivo);

        guardarComo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        guardarComo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/save_3621.png"))); // NOI18N
        guardarComo.setText("Guardar como");
        guardarComo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarComoActionPerformed(evt);
            }
        });
        menuPArchivo.add(guardarComo);

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/puerta-de-salida_318-48444.jpg"))); // NOI18N
        jMenuItem5.setText("Salir");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        menuPArchivo.add(jMenuItem5);

        jMenuBar1.add(menuPArchivo);

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
                        .addComponent(botonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonGuardarComo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonCorrer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addComponent(botonGuardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(botonCorrer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonGuardarComo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void abrirArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirArchivoActionPerformed
        seleccionar.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("Archivos de BatLan","btl"));
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
    }//GEN-LAST:event_abrirArchivoActionPerformed

    private void guardarComoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarComoActionPerformed
            guardarComo();
    }//GEN-LAST:event_guardarComoActionPerformed

    private void guardarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarArchivoActionPerformed
                       guardarPantalla();
             
    }//GEN-LAST:event_guardarArchivoActionPerformed

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
guardarPantalla();
    }//GEN-LAST:event_botonGuardarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void botonGuardarComoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarComoActionPerformed
        guardarComo();
    }//GEN-LAST:event_botonGuardarComoActionPerformed

    private void botonCorrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCorrerActionPerformed
        guardarPantalla();
        try {
            jEditorPane2.setText(tokenizar());        // TODO add your handling code here:
        } catch (IOException ex) {
            Logger.getLogger(vista.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botonCorrerActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        guardarPantalla();
        try {
            jEditorPane2.setText(tokenizar());
        } catch (IOException ex) {
            Logger.getLogger(vista.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        seleccionar.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("Archivos de BatLan","btl"));
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
    public void guardarComo(){
         seleccionar.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("Archivos de BatLan","btl"));
        if(seleccionar.showDialog(null, "Guardar como")==JFileChooser.APPROVE_OPTION){
              archivo=seleccionar.getSelectedFile();
              seleccionar.setName(archivo.getName()+".btl");
              archivo=seleccionar.getSelectedFile();
            
               if(archivo.getName().endsWith("btl")){
                String Documento=codigoPrincipal.getText();
                String mensaje=GuardarArchivo(archivo,Documento);
                if(mensaje!=null){
                    JOptionPane.showMessageDialog(null, mensaje);
                } else{
                    JOptionPane.showMessageDialog(null, mensaje);
                }
                    
            }
        } 
    }
    
  public void guardarPantalla(){ 
      try {
      if (!Abierto){
               seleccionar.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("Archivos de BatLan","btl"));
            if(seleccionar.showDialog(null, "Guardar") ==JFileChooser.APPROVE_OPTION){
                archivo=seleccionar.getSelectedFile();  
               String Documento=codigoPrincipal.getText().toLowerCase();
                String mensaje=GuardarArchivo(archivo,Documento);
                if(mensaje!=null){
                    JOptionPane.showMessageDialog(null, mensaje);
                } else{
                    JOptionPane.showMessageDialog(null, mensaje); 
                }

               } 
            } else {
                  archivo=seleccionar.getSelectedFile();
                String Documento=codigoPrincipal.getText().toLowerCase();
                String mensaje=GuardarArchivo(archivo,Documento);
                if(mensaje!=null){
                    //JOptionPane.showMessageDialog(null, mensaje);
                } else{
                    JOptionPane.showMessageDialog(null, mensaje); 
                }
     }
         
      }catch(Exception e){
          
      }
  }

    /**
     *
     * @return
     * @throws FileNotFoundException
     * @throws IOException
     */
    public String tokenizar() throws FileNotFoundException, IOException{
        try{
         String resultado="";
        String textoFormateado=""; 
        Reader lector = new BufferedReader(new FileReader(archivo));
        Lexer lexer = new Lexer (lector);
        
         jEditorPane2.setContentType("text/html");
         //codigoPrincipal.setContentType("text/html");
        
        while (true){
            Token token=lexer.yylex();            
            if (token == null){
             //codigoPrincipal.setText(textoFormateado);            
                return resultado;
            }     
                switch (token){
                case SUMA:
                    resultado=resultado+ "<font color=\"gray\">+ Simbolo SUMA</font><br>";
                    textoFormateado=textoFormateado+"<font color=\"gray\">+</font>";
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
                    resultado=resultado+" <font color=\"red\">"+ lexer.lexeme+" Simbolo desconocido<br>";
                   textoFormateado=textoFormateado+"<font color=\"red\">"+lexer.lexeme+"</font>"; 
                    break;
                case TEXTO:                    
                    resultado=resultado+ "<font color=\"#0d009f\">"+lexer.lexeme+" Texto</font><br>";
                    textoFormateado=textoFormateado+"<font color=\"blue\">"+lexer.lexeme+"</font>";
                    break;                
                case INT:
                    resultado=resultado+ "<font color=\"green\">"+lexer.lexeme +" Entero<br></font>";
                    textoFormateado=textoFormateado+"<font color=\"white\">"+lexer.lexeme+"</font>";
                    break;
                case PR:
                    resultado=resultado+ "<font color=\"white\">"+lexer.lexeme +" Palabra reservada</font><br>";
                    textoFormateado=textoFormateado+"<font color=\"green\">"+"bdouble"+"</font>";
                    break;
                case LIB:
                    resultado=resultado+ "<font color=\"white\">"+lexer.lexeme +" Nombre de libreria</font><br>";
                    textoFormateado=textoFormateado+"<font color=\"green\">"+"bdouble"+"</font>";          
                    break; 
                case VAR:
                    resultado=resultado+ "<font color=\"white\">"+lexer.lexeme +" Nombre de variable</font><br>";
                    textoFormateado=textoFormateado+"<font color=\"green\">"+"bdouble"+"</font>";        
                    break;
                case COMA:
                    resultado=resultado+ "<font color=\"white\">, Simbolo COMA</font><br>";
                    textoFormateado=textoFormateado+"<font color=\"green\">"+"bdouble"+"</font>";       
                    break; 
                case DOSP:
                    resultado=resultado+ "<font color=\"white\">: Dos puntos</font><br>";
                    textoFormateado=textoFormateado+"<font color=\"green\">"+"bdouble"+"</font>";          
                    break; 
                case PARENTESISD:
                    resultado=resultado+ "<font color=\"white\">) Parentesis Derecho</font><br>";
                    textoFormateado=textoFormateado+"<font color=\"white\">"+")"+"</font>";
                    break;  
                case PARENTESISI:
                    resultado=resultado+ "<font color=\"white\">( Parentesis Izquierdo</font><br>";
                    textoFormateado=textoFormateado+"<font color=\"white\">"+"("+"</font>";
                    break; 
                case INICIOB:
                    resultado=resultado+ "<font color=\"white\">{ Inicio de Bloque</font><br>";
                    textoFormateado=textoFormateado+"<font color=\"white\">"+"{"+"</font>";
                    break;     
                case FINALB:
                    resultado=resultado+ "<font color=\"white\">} Final de Bloque</font><br>";
                    textoFormateado=textoFormateado+"<font color=\"white\">"+"}"+"</font>";
                    break;
              case COMILLAD:
                    resultado=resultado+ "<font color=\"white\">Comilla Doble</font><br>";
                    textoFormateado=textoFormateado+"<font color=\"white\">"+"\\u0022"+"</font>";
                    break;  
              case COMILLAS:
                    resultado=resultado+ "<font color=\"white\">Comilla Simple</font><br>";
                    textoFormateado=textoFormateado+"<font color=\"white\">"+"\\u0027"+"</font>";
                    break;  
              case FLOAT:
                    resultado=resultado+ "<font color=\"white\">"+lexer.lexeme+" Numero Flotante<br>";
                    textoFormateado=textoFormateado+"<font color=\"white\">"+lexer.lexeme+"</font>";
                    break;   
              case OBJETO:
                    resultado=resultado+ "<font color=\"white\">"+lexer.lexeme+" OBJETO</font><br>";
                    textoFormateado=textoFormateado+"<font color=\"white\">"+lexer.lexeme+"</font>";
                    break; 
              case EVENTO:
                    resultado=resultado+"<font color=\"white\">"+lexer.lexeme+" EVENTO</font><br>";
                    textoFormateado=textoFormateado+"<font color=\"white\">"+lexer.lexeme+"</font>";
                    break;  
               case ESPACIO:
                    resultado=resultado+ lexer.lexeme+ "<font color=\"white\"> ESPACIO</font><br>";
                    textoFormateado=textoFormateado+"<font color=\"white\">"+lexer.lexeme+"</font>";
                    break; 
                case HTML:
                    resultado=resultado+ "<font color=\"orange\">"+lexer.lexeme+"HTML</font><br>";
                    //textoFormateado=textoFormateado+"<font color=\"white\">"+lexer.lexeme+"</font>";
                    break;
                case DIFERENTE:
                    resultado=resultado+"<font color=\"white\">!= Diferente</font><br>";
                    textoFormateado=textoFormateado+"<font color=\"white\">"+lexer.lexeme+"</font>";
                    break; 
                 case OPERA:
                    resultado=resultado+"<font color=\"white\">"+lexer.lexeme+" Operacion</font><br>";
                    textoFormateado=textoFormateado+"<font color=\"white\">"+lexer.lexeme+"</font>";
                    break;    
                 case FUNCION:
                    resultado=resultado+"<font color=\"white\">"+lexer.lexeme+" FUNCION</font><br>";
                    textoFormateado=textoFormateado+"<font color=\"white\">"+lexer.lexeme+"</font>";
                    break; 
                  case PUNTO:
                    resultado=resultado+ "<font color=\"gray\">. Simbolo PUNTO</font><br>";
                    textoFormateado=textoFormateado+"<font color=\"gray\">+</font>";
                    break;
                case DIRECTIVAS:  
                    resultado=resultado+ "<font color=\"gray\">@ Directivas</font><br>";
                    textoFormateado=textoFormateado+"<font color=\"gray\">+</font>";
                    break;
                case MODULO: 
                    resultado=resultado+ "<font color=\"gray\">% Operador: Modulo</font><br>";
                    textoFormateado=textoFormateado+"<font color=\"gray\">+</font>";
                    break;
                case ANGLED: 
                    resultado=resultado+ "<font color=\"gray\">"+lexer.lexeme+"Operador: Mayor que</font><br>";
                    textoFormateado=textoFormateado+"<font color=\"gray\">+</font>";
                    break;
                case ANGLEI:  
                    resultado=resultado+ "<font color=\"gray\">"+lexer.lexeme+"Operador: Menor que</font><br>";
                    textoFormateado=textoFormateado+"<font color=\"gray\">+</font>";
                    break;
                
                case COMPARACION: 
                    resultado=resultado+ "<font color=\"gray\"> ==  Operador: Menor que</font><br>";
                    textoFormateado=textoFormateado+"<font color=\"gray\">+</font>";
                    break;
                case ASPERSON:
                    resultado=resultado+ "<font color=\"gray\"> &  Operador: Menor que</font><br>";
                    textoFormateado=textoFormateado+"<font color=\"gray\">+</font>";
                    break;
                case NOT: 
                    resultado=resultado+ "<font color=\"gray\">Operador: Negación</font><br>";
                    textoFormateado=textoFormateado+"<font color=\"gray\">+</font>";
                    break;
                case SUMAM: 
                    resultado=resultado+ "<font color=\"gray\">Operador de suma</font><br>";
                    textoFormateado=textoFormateado+"<font color=\"gray\">+</font>";
                    break;
                case RESTAM: 
                    resultado=resultado+ "<font color=\"gray\">Operador de resta</font><br>";
                    textoFormateado=textoFormateado+"<font color=\"gray\">+</font>";
                    break;
                case MULTIPLICACIONM: 
                    resultado=resultado+ "<font color=\"gray\">Operador de multiplicación</font><br>";
                    textoFormateado=textoFormateado+"<font color=\"gray\">+</font>";
                    break;
                case DIVISIONM: 
                    resultado=resultado+ "<font color=\"gray\"> Operador de división</font><br>";
                    textoFormateado=textoFormateado+"<font color=\"gray\">+</font>";
                    break;
                case AND: 
                    resultado=resultado+ "<font color=\"gray\">Operador: lógico</font><br>";
                    textoFormateado=textoFormateado+"<font color=\"gray\">+</font>";
                    break;
                case POW: 
                    resultado=resultado+ "<font color=\"gray\">Operador: potencia</font><br>";
                    textoFormateado=textoFormateado+"<font color=\"gray\">+</font>";
                    break;
                case OR: 
                    resultado=resultado+ "<font color=\"gray\">Operador: lógico</font><br>";
                    textoFormateado=textoFormateado+"<font color=\"gray\">+</font>";
                    break;
               
            }
    }
        }catch(Exception e){
            
        }
        return null;
        
 }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem abrirArchivo;
    private javax.swing.JButton botonCorrer;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JButton botonGuardarComo;
    private javax.swing.JEditorPane codigoPrincipal;
    private javax.swing.JMenuItem guardarArchivo;
    private javax.swing.JMenuItem guardarComo;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JEditorPane jEditorPane2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenu menuPArchivo;
    // End of variables declaration//GEN-END:variables
}
