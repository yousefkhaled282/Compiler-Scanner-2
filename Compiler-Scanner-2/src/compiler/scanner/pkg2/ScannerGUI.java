/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiler.scanner.pkg2;

import static compiler.scanner.pkg2.Compilation.compile_output;
import static compiler.scanner.pkg2.DFA_For_Symbols.noLex;

import static compiler.scanner.pkg2.Compilation.compile_error;
import static compiler.scanner.pkg2.DFA_For_Symbols.SymbolDFA;
import static compiler.scanner.pkg2.DFA_Keywords.keywordDFa;
import static compiler.scanner.pkg2.Scanner.Result;
import static compiler.scanner.pkg2.Scanner.error;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.TextArea;
import java.awt.event.KeyEvent;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import static java.util.regex.Pattern.compile;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Element;
import javax.swing.text.Utilities;

/**
 *
 * @author lenovo
 */
public class ScannerGUI extends javax.swing.JFrame {

    public String scan;
    public String[] test = new String[5];
    public String path;
    Set<String> s;
    public String dataGen;
    public String TextString;
    public int start;
    public int end;
    public int error;

    public ScannerGUI() {
        initComponents();
        s = new TreeSet<String>();
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
        s.add("RingWhen");
        s.add("BackedValue");
        s.add("STT");
        s.add("Check–CaseOf");
        s.add("End");
        s.add("Beginning");
        s.add("Using");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TextArea = new javax.swing.JTextArea();
        BrowseButton = new javax.swing.JButton();
        ScanButton = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        OutputTable = new javax.swing.JTable();
        CommentButton = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        errorLabel = new javax.swing.JLabel();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TextArea.setColumns(20);
        TextArea.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        TextArea.setRows(5);
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

        CommentButton.setText("Comment");
        CommentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CommentButtonActionPerformed(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
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

        jButton1.setText("Genertate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Type Here For Autocomplete");

        errorLabel.setText("No. of Error");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 817, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(499, 499, 499))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(CommentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ScanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BrowseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jScrollPane4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(372, 372, 372)
                                .addComponent(errorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(493, 493, 493))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(errorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BrowseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ScanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CommentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 854, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BrowseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrowseButtonActionPerformed
        if (evt.getSource() == BrowseButton) {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new File(".")); //sets current director
            int response = fileChooser.showOpenDialog(null); //select file to open
            //int response = fileChooser.showSaveDialog(null); //select file to save
            Dictionary map = new Dictionary<Integer, String>();
            if (response == JFileChooser.APPROVE_OPTION) {
                path = fileChooser.getSelectedFile().getAbsolutePath();
                String contents = null;
                try {
                    contents = new String(Files.readAllBytes(Paths.get(path)));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                String[] lines = contents.split("\n");
                int num = 0;
                for (String line : lines) {
                    map.add(num++, line);
                }
                error = 0;
                String out = "";
                LinkedList<Integer> MapKeys = map.getKeys();
                for (int i = 0; i < MapKeys.getSize(); i++) {
                    out += compile_output((String) map.get(i), i + 1);
                    error += compile_error((String) map.get(i));
                    noLex = 1;

                }
                DefaultTableModel model = (DefaultTableModel) OutputTable.getModel();
                String[] Result = out.split("\n");
                for (String line : Result) {
                    String[] currencies = line.split("\t");
                    // System.out.println(currencies.length);
                    Object[] row = new Object[5];
                    for (int i = 0; i < currencies.length; i++) {
                        row[i] = currencies[i];
                    }
                    model.addRow(row);
                }
                System.out.println(error);
                        String s=Integer.toString(error);
        //System.out.print(out);
        errorLabel.setText("No of errors : "+s);
            }
        }
    }//GEN-LAST:event_BrowseButtonActionPerformed

    private void ScanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ScanButtonActionPerformed
        //Input Scanner
        DefaultTableModel model = (DefaultTableModel) OutputTable.getModel();
        model.setRowCount(0);
        noLex = 1;

        Dictionary map = new Dictionary<Integer, String>();
        scan = TextArea.getText();

        if (scan != null) {
            String[] lines = scan.split("\n");
            int num = 0;
            for (String line : lines) {
                if (line != null) {
                    map.add(num++, line);

                }

            }
        }
        String out = "";
        error = 0;

        LinkedList<Integer> MapKeys = map.getKeys();
        for (int i = 0; i < MapKeys.getSize(); i++) {
            out += compile_output((String) map.get(i), i + 1);
            //out+=keywordDFa((String) map.get(i),i+1)+SymbolDFA((String) map.get(i),i+1);  
            error += compile_error((String) map.get(i));
            noLex = 1;
        }
        System.out.print(error);
        String s=Integer.toString(error);
        //System.out.print(out);
        errorLabel.setText("No of errors : "+s);
        String[] lines = out.split("\n");
        for (String line : lines) {
            String[] currencies = line.split("\t");
            // System.out.println(currencies.length);
            Object[] row = new Object[5];
            for (int i = 0; i < currencies.length; i++) {
                row[i] = currencies[i];
            }
            model.addRow(row);
        }

    }//GEN-LAST:event_ScanButtonActionPerformed

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

            if (txt == null) {
                doc.remove(start, end - start - 1);
                doc.insertString(start, "/-" + txt, null);
            } else if (txt != null && txt.indexOf("/-") == 0) {
                doc.remove(start, end - start - 1);
                txt = "" + txt.substring(1, txt.length());
                txt = "" + txt.substring(1, txt.length());
                doc.insertString(start, "" + txt, null);
            } else {
                doc.remove(start, end - start - 1);
                doc.insertString(start, "/-" + (txt != null ? txt : ""), null);
            }
        } catch (BadLocationException ex) {
            Logger.getLogger(ScannerGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_CommentButtonActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        TextArea.append(dataGen + '@');
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getKeyCode() == KeyEvent.VK_DELETE) {

        } else {
            String to_check = jTextField1.getText();
            int to_check_len = to_check.length();
            for (String data : s) {
                String check_from_data = "";
                for (int i = 0; i < to_check_len; i++) {
                    if (to_check_len <= data.length()) {
                        check_from_data = check_from_data + data.charAt(i);
                    }
                }
                //System.out.print(check_from_data);
                if (check_from_data.equals(to_check)) {
                    System.out.print("Found");

                    jTextField1.setText(data);
                    dataGen = data;
                    jTextField1.setSelectionStart(to_check_len);
                    jTextField1.setSelectionEnd(data.length());
                    break;

                }
            }
        }
    }//GEN-LAST:event_jTextField1KeyReleased

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
    private javax.swing.JButton CommentButton;
    private javax.swing.JTable OutputTable;
    private javax.swing.JButton ScanButton;
    private javax.swing.JTextArea TextArea;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
