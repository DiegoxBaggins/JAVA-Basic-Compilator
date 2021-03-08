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
    public ArrayList<Estado> alfabeto = new ArrayList<>();
    public ArrayList<Estado> cadenas = new ArrayList<>();
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu2 = new javax.swing.JMenu();
        jScrollPane2 = new javax.swing.JScrollPane();
        TextAreaConsola = new javax.swing.JTextArea();
        BottonAnalizar = new javax.swing.JButton();
        ComboBox1 = new javax.swing.JComboBox<>();
        VerArbolButon = new javax.swing.JButton();
        VerAFNButton = new javax.swing.JButton();
        VerSiguientesButton = new javax.swing.JButton();
        VerTransicionesButton = new javax.swing.JButton();
        VerAFDButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        TextArea1 = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        labelImagen = new javax.swing.JLabel();
        LabelTitulo = new javax.swing.JLabel();
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
        setPreferredSize(new java.awt.Dimension(1500, 800));

        TextAreaConsola.setEditable(false);
        TextAreaConsola.setBackground(new java.awt.Color(51, 51, 51));
        TextAreaConsola.setColumns(20);
        TextAreaConsola.setForeground(new java.awt.Color(255, 255, 255));
        TextAreaConsola.setRows(5);
        jScrollPane2.setViewportView(TextAreaConsola);

        BottonAnalizar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        BottonAnalizar.setText("Analizar Entrada");
        BottonAnalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BottonAnalizarActionPerformed(evt);
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

        TextArea1.setColumns(20);
        TextArea1.setRows(5);
        jScrollPane3.setViewportView(TextArea1);

        jScrollPane1.setBackground(new java.awt.Color(153, 255, 153));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane1.setViewportView(labelImagen);

        LabelTitulo.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        LabelTitulo.setText("Imagen:");

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
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BottonAnalizar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(VerAFDButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(VerArbolButon, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(VerAFNButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(VerTransicionesButton)
                            .addComponent(VerSiguientesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(LabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 767, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 758, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LabelTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(VerAFNButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(VerTransicionesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(VerArbolButon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(VerAFDButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(VerSiguientesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BottonAnalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(135, 135, 135))
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
        Archivo = "";
        PantallaPrincipal interfaz1 = new PantallaPrincipal();
        //interfaz1.setBounds(0,0,800,600);
        interfaz1.setVisible(true);
        interfaz1.setResizable(false);
        interfaz1.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_MenuNuevoActionPerformed

    private void BottonAnalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BottonAnalizarActionPerformed
        try {
            String consola = "";
            ComboBox1.removeAllItems();
            labelImagen.setIcon(null);
            Compi1LenguajeOLC.Errores.clear();
            String entrada = TextArea1.getText();
            System.out.println();
            parser sintactico;
            sintactico = new parser(new lexico(new StringReader(entrada)));
            sintactico.parse();
            consola += mostarErrores();
            generarHTML();
            expresiones = sintactico.expresiones;
            alfabeto = sintactico.alfabeto;
            cadenas = sintactico.cadenas;
            int elementos = expresiones.size();
            //System.out.print(expresiones);
            for (int i = 0; i < elementos; i++) {
                Expresion expresion = expresiones.get(i);
                expresion.AgregarRaiz();
                //System.out.print(expresion.nombre);
                expresion.graficarArbol();
                expresion.ConstruirSiguientes();
                expresion.ConstruirTransi();
                expresion.GraficarTransi();
                expresion.crearAFD();
                expresion.graficarAFN();
            }
            consola += evaluarCadena();
            generarJSON();
            llenarCombo();
            TextAreaConsola.setText(consola);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_BottonAnalizarActionPerformed

    private void MenuGuardarComoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuGuardarComoActionPerformed
        guardarArchivoNuevo();
    }//GEN-LAST:event_MenuGuardarComoActionPerformed

    private void ComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBox1ActionPerformed
        
    }//GEN-LAST:event_ComboBox1ActionPerformed

    private void VerArbolButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerArbolButonActionPerformed
        String nombre = (String)ComboBox1.getSelectedItem();
        labelImagen.setIcon(new ImageIcon("./ARBOLES_201903969/" + nombre + ".jpg"));
        labelImagen.setBorder(javax.swing.BorderFactory.createBevelBorder
        (javax.swing.border.BevelBorder.RAISED));
        LabelTitulo.setText("Arbol: "+ nombre);
    }//GEN-LAST:event_VerArbolButonActionPerformed

    private void VerAFNButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerAFNButtonActionPerformed
        labelImagen.setIcon(null);
        String nombre = (String)ComboBox1.getSelectedItem();
        labelImagen.setIcon(new ImageIcon("./AFND_201903969/" + nombre + ".jpg"));
        labelImagen.setBorder(javax.swing.BorderFactory.createBevelBorder
        (javax.swing.border.BevelBorder.RAISED));
        LabelTitulo.setText("AFND: "+ nombre);
    }//GEN-LAST:event_VerAFNButtonActionPerformed

    private void VerAFDButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerAFDButtonActionPerformed
        labelImagen.setIcon(null);
        String nombre = (String)ComboBox1.getSelectedItem();
        labelImagen.setIcon(new ImageIcon("./AFD_201903969/" + nombre + ".jpg"));
        labelImagen.setBorder(javax.swing.BorderFactory.createBevelBorder
        (javax.swing.border.BevelBorder.RAISED));
        LabelTitulo.setText("AFD: "+ nombre);
    }//GEN-LAST:event_VerAFDButtonActionPerformed

    private void VerTransicionesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerTransicionesButtonActionPerformed
        labelImagen.setIcon(null);
        String nombre = (String)ComboBox1.getSelectedItem();
        labelImagen.setIcon(new ImageIcon("./TRANSICIONES_201903969/" + nombre + ".jpg"));
        labelImagen.setBorder(javax.swing.BorderFactory.createBevelBorder
        (javax.swing.border.BevelBorder.RAISED));
        LabelTitulo.setText("Tabla de Transiciones: "+ nombre);
    }//GEN-LAST:event_VerTransicionesButtonActionPerformed

    private void VerSiguientesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerSiguientesButtonActionPerformed
        labelImagen.setIcon(null);
        String nombre = (String)ComboBox1.getSelectedItem();
        labelImagen.setIcon(new ImageIcon("./SIGUIENTES_201903969/" + nombre + ".jpg"));
        labelImagen.setBorder(javax.swing.BorderFactory.createBevelBorder
        (javax.swing.border.BevelBorder.RAISED));
        LabelTitulo.setText("Tabla Siguiente: "+ nombre);
    }//GEN-LAST:event_VerSiguientesButtonActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BottonAnalizar;
    private javax.swing.JComboBox<String> ComboBox1;
    private javax.swing.JLabel LabelTitulo;
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
    
    private static String mostarErrores (){
        String codigo = "";
        for (Errors Errore : Compi1LenguajeOLC.Errores) {
        codigo +="Error de tipo " + Errore.tipo + " en la Linea " + 
        Errore.fila + " y columna "+ Errore.columna +". Componente " + Errore.valor + 
        " no reconocido.\n";
        }
        return codigo;
    }
    
    public static void generarHTML() throws IOException{
        FileWriter fichero = null;
                PrintWriter pw = null;
                try {
                    fichero = new FileWriter("./ERRORES_201903969/errores.html");
                    pw = new PrintWriter(fichero);
                    pw.println("<html>");
                    pw.println("<head><title>REPORTE DE ERRORES</title></head>");
                    pw.println("<body>");
                    pw.println("<div align=\"center\">");
                    pw.println("<h1>Reporte de Errores</h1>");
                    pw.println("<br></br>");
                    pw.println("<table border=1>");
                    pw.println("<tr>");
                    pw.println("<td bgcolor=yellow>TIPO</td>");
                    pw.println("<td bgcolor=yellow>VALOR</td>");
                    pw.println("<td bgcolor=yellow>FILA</td>");
                    pw.println("<td bgcolor=yellow>COLUMNA</td>");
                    pw.println("</tr>");
                    for(int i=0;i<Compi1LenguajeOLC.Errores.size();i++){
                        pw.println("<tr>");
                        pw.println("<td>"+Compi1LenguajeOLC.Errores.get(i).tipo  + "</td>");
                        pw.println("<td>"+Compi1LenguajeOLC.Errores.get(i).valor + "</td>");
                        pw.println("<td>"+Compi1LenguajeOLC.Errores.get(i).fila + "</td>");
                        pw.println("<td>"+Compi1LenguajeOLC.Errores.get(i).columna + "</td>");
                        pw.println("</tr>");
                    }
                    pw.println("</table>");
                    pw.println("</div");
                    pw.println("</body>");
                    pw.println("</html>");
                } catch (Exception e) {
                }finally{
                    if(null!=fichero){
                            fichero.close();
                    }
                }
                try {
            //Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + "Reportes\\"+"Reporte ErroresL.html");
            //System.out.println("Final");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private String evaluarCadena(){
        String evaluacion = "";
        alfabeto.forEach(alfabeto1 -> {
            System.out.println(alfabeto1.nombre + "  " + alfabeto1.hojas + "  " + alfabeto1.aceptacion);
        });
        cadenas.forEach(alfabeto1 -> {
            System.out.println(alfabeto1.nombre + "  " + alfabeto1.hojas + "  " + alfabeto1.aceptacion);
        });
        for(Estado alfabeto1 :cadenas){
            for (Expresion expresione : expresiones) {
                if (expresione.nombre.equals(alfabeto1.nombre)){
                    alfabeto1.aceptacion = expresione.evaluarCadena(alfabeto1.hojas, alfabeto);
                } 
            }
            System.out.println(alfabeto1.nombre + "  " + alfabeto1.hojas + "  " + alfabeto1.aceptacion);
            evaluacion += "Cadena: " + alfabeto1.hojas + "  Evaluada con: " + alfabeto1.nombre + "   Resultado:" + alfabeto1.aceptacion + "\n";
        }
        return evaluacion;
    }
    
    public void generarJSON() throws IOException{
        String nombre = "salidas";
        if (!"".equals(Archivo)){
            try {
            File f = null;
            f = new File(Archivo);
            nombre = f.getName();
            System.out.println("File name: "+ nombre);

            } catch(Exception e) {
              e.printStackTrace();
            }   
        }
        FileWriter fichero = null;
                PrintWriter pw = null;
                try {
                    fichero = new FileWriter("./Salidas_201903969/" + nombre + ".json");
                    pw = new PrintWriter(fichero);
                    pw.println("[");
                    for(int i = 0; i < cadenas.size()-1; i ++){
                        Estado alfabeto1 = cadenas.get(i);
                        pw.println("    {");
                        pw.println("        \"Valor\":\""+ alfabeto1.hojas + "\",");
                        pw.println("        \"ExpresionRegular\":\""+ alfabeto1.nombre + "\",");
                        pw.println("        \"Resultado\":\""+ alfabeto1.aceptacion + "\"");
                        pw.println("    },");
                    }
                    Estado alfabeto1 = cadenas.get(cadenas.size()-1);
                        pw.println("    {");
                        pw.println("        \"Valor\":\""+ alfabeto1.hojas + "\",");
                        pw.println("        \"ExpresionRegular\":\""+ alfabeto1.nombre + "\",");
                        pw.println("        \"Resultado\":\""+ alfabeto1.aceptacion + "\"");
                        pw.println("    }");
                    pw.println("]");
                } catch (Exception e) {
                }finally{
                    if(null!=fichero){
                            fichero.close();
                    }
                }
                try {
            //Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + "Reportes\\"+"Reporte ErroresL.html");
            //System.out.println("Final");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
