/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiler.scanner.pkg2;

import static compiler.scanner.pkg2.Scanner.Result;
import static compiler.scanner.pkg2.Scanner.error;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.TextArea;
<<<<<<< Updated upstream
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
=======
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.*;
>>>>>>> Stashed changes
import javax.swing.JFileChooser;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
<<<<<<< Updated upstream
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Element;
import javax.swing.text.Utilities;
=======
import javax.swing.text.Highlighter;
>>>>>>> Stashed changes

/**
 *
 * @author lenovo
 */
public class ScannerGUI extends javax.swing.JFrame {
    public String scan;
    public String [] test=new String[5];
    public String path;
<<<<<<< Updated upstream
  
   public ScannerGUI(){
=======
    Set<String> s;
    public String dataGen;
    public String TextString;
    public int start;
    public int end;
    
    public ScannerGUI(){
>>>>>>> Stashed changes
       initComponents();
       Error();
       s= new TreeSet<String>(); 
       s.add("Divisio");
       s.add("DnferedFrom");
       s.add("WhetherDo-Else");
       s.add("Ire");
       s.add("Sire");
       s.add("Clo");
       s.add("SetOfClo");
       s.add("FBU");
       s.add("SFBU");
       s.add("NoneValue");
       s.add("TerminateThisNow");
       s.add("RingWhen( ){\n\n\n\n\t}");
       s.add("BackedValue");
       s.add("STT");
       s.add("Check–CaseOf");
       s.add("End");
       s.add("Beginning");
       s.add("Using");
       //////////////////////////////
        
   }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TextArea = new javax.swing.JTextArea();
        BrowseButton = new javax.swing.JButton();
        ScanButton = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        OutputTable = new javax.swing.JTable();
<<<<<<< Updated upstream
        CommentButton = new javax.swing.JButton();
=======
        jTextField1 = new javax.swing.JTextField();
        Genrate = new javax.swing.JButton();
>>>>>>> Stashed changes

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TextArea.setColumns(20);
        TextArea.setRows(5);
        TextArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                TextAreaMouseReleased(evt);
            }
        });
        TextArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TextAreaKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(TextArea);

        BrowseButton.setText("Browse");
        BrowseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrowseButtonActionPerformed(evt);
            }
        });

        ScanButton.setText("Scan");
        ScanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ScanButtonActionPerformed(evt);
            }
        });

        OutputTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Line NO", "Lexeme", "Return Token", " Lexeme NO in  Line ", "matchability"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane4.setViewportView(OutputTable);

<<<<<<< Updated upstream
        CommentButton.setText("Comment");
        CommentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CommentButtonActionPerformed(evt);
=======
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        Genrate.setText("Generate");
        Genrate.setToolTipText("");
        Genrate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenrateActionPerformed(evt);
>>>>>>> Stashed changes
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
<<<<<<< Updated upstream
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 175, Short.MAX_VALUE)
                .addComponent(CommentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ScanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BrowseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(286, 286, 286))
=======
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 6, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(ScanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BrowseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(274, 274, 274))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 815, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(Genrate, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())))))
>>>>>>> Stashed changes
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
<<<<<<< Updated upstream
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
=======
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Genrate)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
>>>>>>> Stashed changes
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BrowseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ScanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CommentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(184, 184, 184))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ScanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ScanButtonActionPerformed

        scan=TextArea.getText();
        System.out.println(scan);

        DefaultTableModel model = (DefaultTableModel)OutputTable.getModel();
        Object[] row = new Object[5];

        row[0] =test[0];
        row[1] =test[1];
        row[2] =test[2];
        row[3] =test[3];
        row[4] =test[4];

        model.addRow(row);
    }//GEN-LAST:event_ScanButtonActionPerformed

    public void Error(){
        TextArea.getDocument().addDocumentListener(new DocumentListener() {

        @Override
        public void removeUpdate(DocumentEvent e) {

        }

        @Override
        public void insertUpdate(DocumentEvent e) {
           
            start = e.getLength();
            end =e.getOffset();
            
            System.out.println("Start  "+ start);
            System.out.println("end  " +end);
            if(TextArea.getText().substring(end).equals("@")){
                do{
                    start = end + e.getLength();
                    end = e.getOffset();
                    System.out.println("Start  "+ start);
                    System.out.println("end  " +end);
                }while(!(TextArea.getText().substring(end).equals(";")));
                 
            }
            
        }

        @Override
        public void changedUpdate(DocumentEvent arg0) {
            
        }
    }); 
    }
    private void BrowseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrowseButtonActionPerformed
        if(evt.getSource()==BrowseButton){
<<<<<<< Updated upstream
            JFileChooser fileChooser = new JFileChooser();			
	    fileChooser.setCurrentDirectory(new File(".")); //sets current director
            int response = fileChooser.showOpenDialog(null); //select file to open
	    //int response = fileChooser.showSaveDialog(null); //select file to save
           Dictionary map=new Dictionary<Integer,String>();
	    if(response == JFileChooser.APPROVE_OPTION){
                path=fileChooser.getSelectedFile().getAbsolutePath();
              String contents = null;
                    try {
                     contents = new String(Files.readAllBytes(Paths.get(path)));
                    } catch (IOException e) {
                     e.printStackTrace();
                    }
                    String[] lines = contents.split("\n");
                       int num=0;
            for (String line : lines) {
                     map.add(num++, line);
            }
            int error=0;
             LinkedList <Integer> MapKeys=map.getKeys();
            for(int i=0;i<MapKeys.getSize();i++){
                Result((String) map.get(i),i);
                error+=error((String) map.get(i));
           }
		System.out.println(path);
=======
            JFileChooser fileChooser = new JFileChooser();

            fileChooser.setCurrentDirectory(new File(".")); //sets current directory

            int response = fileChooser.showOpenDialog(null); //select file to open
            //int response = fileChooser.showSaveDialog(null); //select file to save

            if(response == JFileChooser.APPROVE_OPTION){
                path=fileChooser.getSelectedFile().getAbsolutePath();
                System.out.println(path);
>>>>>>> Stashed changes
            }
        }
    }//GEN-LAST:event_BrowseButtonActionPerformed

<<<<<<< Updated upstream
    private void ScanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ScanButtonActionPerformed
        //Input Scanner
        Dictionary map=new Dictionary<Integer,String>();
         scan=TextArea.getText();
                int error=0;

        if(scan != null){
         String[] lines = scan.split("\n");
         int num=0;
            for (String line : lines) {
                if(line!=null){
                     map.add(num++, line);
                     
                }
                
        }}
           LinkedList <Integer> MapKeys=map.getKeys();
           for(int i=0;i<MapKeys.getSize();i++){
             Result((String) map.get(i),i);
            error+=error((String) map.get(i));
           }
         // System.out.print(error);
           
         DefaultTableModel model = (DefaultTableModel)OutputTable.getModel();
         Object[] row = new Object[5];
=======
    private void TextAreaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextAreaKeyReleased
        // TODO add your handling code here:
       
    }//GEN-LAST:event_TextAreaKeyReleased

    private void TextAreaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextAreaMouseReleased
        // TODO add your handling code here:
   
>>>>>>> Stashed changes
        
    }//GEN-LAST:event_TextAreaMouseReleased

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
       
      
    }//GEN-LAST:event_jTextField1ActionPerformed

<<<<<<< Updated upstream
    private void CommentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CommentButtonActionPerformed
                                            
        // TODO add your handling code here:
        int line = 0;
        try {
        int offset = TextArea.getCaretPosition();
        line = TextArea.getLineOfOffset(offset);
        System.out.println(line + 1);
        } catch (BadLocationException ex) {
            Logger.getLogger(ScannerGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        Document doc = TextArea.getDocument();
        Element root = doc.getDefaultRootElement();
        Element contentEl = root.getElement(line);

        int start = contentEl.getStartOffset();
        int end = contentEl.getEndOffset();
        
        // remove words in the line (-1 to prevent removing newline character)
        String txt;
        try {
            txt = doc.getText(start, end - start - 1);
        
        if(txt == null){
            doc.remove(start, end - start - 1);
            doc.insertString(start,"/-"+txt, null);
        }
        else if(txt != null && txt.indexOf("/-") == 0)
        {
            doc.remove(start, end - start - 1);
            txt = "" + txt.substring(1, txt.length());
            txt = "" + txt.substring(1, txt.length());
            doc.insertString(start,""+txt, null);
        }
        else
        {
            doc.remove(start, end - start - 1);
            doc.insertString(start,"/-" + (txt != null ? txt : ""), null);
        }
        } catch (BadLocationException ex) {
            Logger.getLogger(ScannerGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_CommentButtonActionPerformed

=======
    private void GenrateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenrateActionPerformed
        // TODO add your handling code here:
        TextArea.append(dataGen + '@');
        
    }//GEN-LAST:event_GenrateActionPerformed
    
   
        
    
    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
    if(evt.getKeyCode()==KeyEvent.VK_BACK_SPACE||evt.getKeyCode()==KeyEvent.VK_DELETE)
        {
           
        }
        else
        {   
            String to_check=jTextField1.getText();
            int to_check_len=to_check.length();
            for(String data:s)
            {
                String check_from_data="";
                for(int i=0;i<to_check_len;i++)
                {
                    if(to_check_len<=data.length())
                    {
                        check_from_data = check_from_data+data.charAt(i);
                    }
                }
                //System.out.print(check_from_data);
                if(check_from_data.equals(to_check))
                {
                    System.out.print("Found");
                    
                    jTextField1.setText(data);
                    dataGen=data;
                    jTextField1.setSelectionStart(to_check_len);
                    jTextField1.setSelectionEnd(data.length());
                    break;
                    
                }
            }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1KeyReleased
   
>>>>>>> Stashed changes
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
            java.util.logging.Logger.getLogger(ScannerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ScannerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ScannerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ScannerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ScannerGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BrowseButton;
<<<<<<< Updated upstream
    private javax.swing.JButton CommentButton;
=======
    private javax.swing.JButton Genrate;
>>>>>>> Stashed changes
    private javax.swing.JTable OutputTable;
    private javax.swing.JButton ScanButton;
    private javax.swing.JTextArea TextArea;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
