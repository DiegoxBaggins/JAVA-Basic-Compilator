package compi1.lenguaje.olc;

import java.io. *;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing. *;
import javax.swing.filechooser. *;
import analizadores.*;
import Objetos.*;
import java.util.ArrayList;
/**
 *
 * @author dalej
 */
public class PantallaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form PantallaPrincipal
     */
    public PantallaPrincipal() {
        initComponents();
        ComboBox1.removeAllItems();
    }

    public String Archivo = "";
    public ArrayList<Expresion> expresiones = new ArrayList<>();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu2 = new javax.swing.JMenu();
        jScrollPane2 = new javax.swing.JScrollPane();
        TextAreaConsola = new javax.swing.JTextArea();
        BottonAnalizar = new javax.swing.JButton();
        BotonAFD = new javax.swing.JButton();
        ComboBox1 = new javax.swing.JComboBox<>();
        VerArbolButon = new javax.swing.JButton();
        VerAFNButton = new javax.swing.JButton();
        VerSiguientesButton = new javax.swing.JButton();
        VerTransicionesButton = new javax.swing.JButton();
        VerAFDButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TextArea1 = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        labelImagen = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenuNuevo = new javax.swing.JMenuItem();
        MenuAbrir = new javax.swing.JMenuItem();
        MenuGuardar = new javax.swing.JMenuItem();
        MenuGuardarComo = new javax.swing.JMenuItem();

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("OLC");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setPreferredSize(new java.awt.Dimension(1400, 850));

        TextAreaConsola.setEditable(false);
        TextAreaConsola.setColumns(20);
        TextAreaConsola.setRows(5);
        jScrollPane2.setViewportView(TextAreaConsola);

        BottonAnalizar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        BottonAnalizar.setText("Analizar Entrada");
        BottonAnalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BottonAnalizarActionPerformed(evt);
            }
        });

        BotonAFD.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        BotonAFD.setText("Generar AFD");
        BotonAFD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAFDActionPerformed(evt);
            }
        });

        ComboBox1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        ComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBox1ActionPerformed(evt);
            }
        });

        VerArbolButon.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        VerArbolButon.setText("Ver Arbol");
        VerArbolButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerArbolButonActionPerformed(evt);
            }
        });

        VerAFNButton.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        VerAFNButton.setText("Ver AFN");
        VerAFNButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerAFNButtonActionPerformed(evt);
            }
        });

        VerSiguientesButton.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        VerSiguientesButton.setText("Ver Tabla de Siguientes");
        VerSiguientesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerSiguientesButtonActionPerformed(evt);
            }
        });

        VerTransicionesButton.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        VerTransicionesButton.setText("Ver Tabla de Transiciones");
        VerTransicionesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerTransicionesButtonActionPerformed(evt);
            }
        });

        VerAFDButton.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        VerAFDButton.setText("Ver AFD");
        VerAFDButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerAFDButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setText("Imagen       ER:                ");

        TextArea1.setColumns(20);
        TextArea1.setRows(5);
        jScrollPane3.setViewportView(TextArea1);

        jScrollPane1.setViewportView(labelImagen);

        jMenu1.setText("Archivo");

        MenuNuevo.setText("Nuevo");
        MenuNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuNuevoActionPerformed(evt);
            }
        });
        jMenu1.add(MenuNuevo);

        MenuAbrir.setText("Abrir");
        MenuAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAbrirActionPerformed(evt);
            }
        });
        jMenu1.add(MenuAbrir);

        MenuGuardar.setText("Guardar");
        MenuGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuGuardarActionPerformed(evt);
            }
        });
        jMenu1.add(MenuGuardar);

        MenuGuardarComo.setText("Guardar Como");
        MenuGuardarComo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuGuardarComoActionPerformed(evt);
            }
        });
        jMenu1.add(MenuGuardarComo);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BottonAnalizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotonAFD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(46, 46, 46)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 224, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(VerArbolButon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(VerAFNButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(VerSiguientesButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(VerTransicionesButton, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addComponent(VerAFDButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1))))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(BottonAnalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BotonAFD, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(VerArbolButon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(VerAFNButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(VerTransicionesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(VerSiguientesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(VerAFDButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(91, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAbrirActionPerformed
        abrirArchivo();
    }//GEN-LAST:event_MenuAbrirActionPerformed

    private void MenuGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuGuardarActionPerformed
        if ("".equals(Archivo)){
            guardarArchivoNuevo();
        }else{
            guardarArchivo();
        }
    }//GEN-LAST:event_MenuGuardarActionPerformed

    private void MenuNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuNuevoActionPerformed
        PantallaPrincipal interfaz1 = new PantallaPrincipal();
        //interfaz1.setBounds(0,0,800,600);
        interfaz1.setVisible(true);
        interfaz1.setResizable(false);
        interfaz1.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_MenuNuevoActionPerformed

    private void BottonAnalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BottonAnalizarActionPerformed
        try {
            ComboBox1.removeAllItems();
            labelImagen.setIcon(null);
            String entrada = TextArea1.getText();
            System.out.println();
            parser sintactico;
            sintactico = new parser(new lexico(new StringReader(entrada)));
            sintactico.parse();
            TextAreaConsola.setText(sintactico.Consola);
            expresiones = sintactico.expresiones;
            int elementos = expresiones.size();
            System.out.print(expresiones);
            for (int i = 0; i < elementos; i++) {
                Expresion expresion = expresiones.get(i);
                expresion.AgregarRaiz();
                System.out.print(expresion.nombre);
                expresion.graficarArbol();
                expresion.ConstruirSiguientes();
                expresion.ConstruirTransi();
                expresion.GraficarTransi();
                expresion.crearAFD();
            }
            llenarCombo();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_BottonAnalizarActionPerformed

    private void BotonAFDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAFDActionPerformed
        
    }//GEN-LAST:event_BotonAFDActionPerformed

    private void MenuGuardarComoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuGuardarComoActionPerformed
        guardarArchivoNuevo();
    }//GEN-LAST:event_MenuGuardarComoActionPerformed

    private void ComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBox1ActionPerformed
        
    }//GEN-LAST:event_ComboBox1ActionPerformed

    private void VerArbolButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerArbolButonActionPerformed
        String nombre = (String)ComboBox1.getSelectedItem();
        labelImagen.setIcon(new ImageIcon("./" + nombre + ".png"));
        labelImagen.setBorder(javax.swing.BorderFactory.createBevelBorder
        (javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_VerArbolButonActionPerformed

    private void VerAFNButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerAFNButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VerAFNButtonActionPerformed

    private void VerAFDButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerAFDButtonActionPerformed
        String nombre = (String)ComboBox1.getSelectedItem();
        labelImagen.setIcon(new ImageIcon("./" + nombre + "AFD.png"));
        labelImagen.setBorder(javax.swing.BorderFactory.createBevelBorder
        (javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_VerAFDButtonActionPerformed

    private void VerTransicionesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerTransicionesButtonActionPerformed
        String nombre = (String)ComboBox1.getSelectedItem();
        labelImagen.setIcon(new ImageIcon("./" + nombre + "Transiciones.png"));
        labelImagen.setBorder(javax.swing.BorderFactory.createBevelBorder
        (javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_VerTransicionesButtonActionPerformed

    private void VerSiguientesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerSiguientesButtonActionPerformed
        String nombre = (String)ComboBox1.getSelectedItem();
        labelImagen.setIcon(new ImageIcon("./" + nombre + "Siguientes.png"));
        labelImagen.setBorder(javax.swing.BorderFactory.createBevelBorder
        (javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_VerSiguientesButtonActionPerformed

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
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAFD;
    private javax.swing.JButton BottonAnalizar;
    private javax.swing.JComboBox<String> ComboBox1;
    private javax.swing.JMenuItem MenuAbrir;
    private javax.swing.JMenuItem MenuGuardar;
    private javax.swing.JMenuItem MenuGuardarComo;
    private javax.swing.JMenuItem MenuNuevo;
    private javax.swing.JTextArea TextArea1;
    private javax.swing.JTextArea TextAreaConsola;
    private javax.swing.JButton VerAFDButton;
    private javax.swing.JButton VerAFNButton;
    private javax.swing.JButton VerArbolButon;
    private javax.swing.JButton VerSiguientesButton;
    private javax.swing.JButton VerTransicionesButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelImagen;
    // End of variables declaration//GEN-END:variables


    private void abrirArchivo(){
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        fileChooser.setAcceptAllFileFilterUsed(false);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("archivos .olc", "olc");
        fileChooser.addChoosableFileFilter(filter);
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            String aux="";   
            String texto="";
            File archivo = fileChooser.getSelectedFile();
            Archivo = archivo.getAbsolutePath();
            System.out.println(Archivo);
            System.out.println(archivo.getName());
            try {
                System.out.println(archivo.getCanonicalPath());
            } catch (IOException ex) {
                Logger.getLogger(PantallaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("Selected file: " + archivo.getAbsolutePath());
            try{
            FileReader archivos=new FileReader(archivo);
            BufferedReader lee=new BufferedReader(archivos);
            while((aux=lee.readLine())!=null)
            {
             texto+= aux+ "\n";
            }
            lee.close();
            TextArea1.setText(texto);
            }
            catch(IOException ex)
            {
                JOptionPane.showMessageDialog(null,ex+"" +
               "\nNo se ha encontrado el archivo",
                     "ADVERTENCIA!!!",JOptionPane.WARNING_MESSAGE);
            }
        }
    }
    
    private void guardarArchivoNuevo() {
        try
        {
            JFrame parentFrame = new JFrame();
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
            fileChooser.setDialogTitle("Seleccionar Carpeta");
            fileChooser.setAcceptAllFileFilterUsed(false);
            FileNameExtensionFilter filter = new FileNameExtensionFilter("archivos .olc", "olc");
            fileChooser.addChoosableFileFilter(filter);
            int userSelection = fileChooser.showSaveDialog(parentFrame);
            if (userSelection == JFileChooser.APPROVE_OPTION) {
                File archivo = fileChooser.getSelectedFile();
                Archivo = archivo.getAbsolutePath();
                Archivo += ".olc";
                System.out.println("Save as file: " + Archivo);
                FileWriter  save=new FileWriter(Archivo);
                save.write(TextArea1.getText());
                save.close();
                JOptionPane.showMessageDialog(null,
                   "El archivo se a guardado Exitosamente",
                       "Información",JOptionPane.INFORMATION_MESSAGE);
            }
        }catch(IOException ex)
        {
          JOptionPane.showMessageDialog(null,
               "Su archivo no se ha guardado",
                  "Advertencia",JOptionPane.WARNING_MESSAGE);
        }
    }

    private void guardarArchivo() {
        try {
            FileWriter myWriter = new FileWriter(Archivo);
            myWriter.write(TextArea1.getText());
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
    }
    
    private void llenarCombo () {
        int elementos = expresiones.size();
        for (int i = 0; i < elementos; i++) {
            Expresion expresion = expresiones.get(i);
            ComboBox1.addItem(expresion.nombre);
        }
    }
}
