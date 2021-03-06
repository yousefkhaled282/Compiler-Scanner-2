/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiler.scanner.pkg2;

import static compiler.scanner.pkg2.ScannerController.compile_error;
import static compiler.scanner.pkg2.DFA_For_Symbols.noLex;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.Document;
import javax.swing.text.Element;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;
import javax.swing.text.BadLocationException;

/**
 *
 * @author lenovo
 */
public class ScannerGUI extends javax.swing.JFrame implements DocumentListener {

    private static enum Mode {
        INSERT, COMPLETION
    }
    private Mode mode = Mode.INSERT;
    private final LinkedList<ScannerString> words = new LinkedList<>();
    private static final String COMMIT_ACTION = "commit";

    public String scan;
    public String[] test = new String[5];
    public String path;
    public String dataGen;
    public String TextString;
    public int start;
    public int end;
    public int error;
    LinkedList<ScannerString> lines = new LinkedList<>();
    LinkedList<ScannerString> Outlines = new LinkedList<>();
    LinkedList<ScannerString> currencies = new LinkedList<>();

    public ScannerGUI() {
        initComponents();
        InputMap im = jTextArea1.getInputMap();
        ActionMap am = jTextArea1.getActionMap();
        im.put(KeyStroke.getKeyStroke("ENTER"), COMMIT_ACTION);
        am.put(COMMIT_ACTION, new CommitAction());
        words.insert(new ScannerString("Divisio"));
        words.insert(new ScannerString("InferedFrom"));
        words.insert(new ScannerString("WhetherDo"));
        words.insert(new ScannerString("Else"));
        words.insert(new ScannerString("Ire"));
        words.insert(new ScannerString("Sire"));
        words.insert(new ScannerString("Clo"));
        words.insert(new ScannerString("SetOfClo"));
        words.insert(new ScannerString("FBU"));
        words.insert(new ScannerString("SFBU"));
        words.insert(new ScannerString("NoneValue"));
        words.insert(new ScannerString("TerminateThisNow"));
        words.insert(new ScannerString("RingWhen(){}"));
        words.insert(new ScannerString("BackedValue"));
        words.insert(new ScannerString("STT"));
        words.insert(new ScannerString("Check"));
        words.insert(new ScannerString("CaseOf"));
        words.insert(new ScannerString("End"));
        words.insert(new ScannerString("Beginning"));
        words.insert(new ScannerString("Using"));
        jTextArea1.getDocument().addDocumentListener(this);

    }

    @Override
    public void insertUpdate(DocumentEvent ev) {
        if (ev.getLength() != 1) {
            return;
        }

        int pos = ev.getOffset();
        ScannerString content = null;
        try {
            content = new ScannerString(jTextArea1.getText(0, pos + 1));
        } catch (BadLocationException e) {
            System.out.println(e.getMessage());
        }

        // Find where the word starts
        int w;
        for (w = pos; w >= 0; w--) {
            if (!Character.isLetter(content.charAt(w))) {
                break;
            }
        }

        if (pos - w == 0) {
            return;
        }

        ScannerString prefix = content.substring(w + 1);
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).startsWith(prefix)) {
                ScannerString completion = words.get(i).substring(pos - w);
                SwingUtilities.invokeLater(new CompletionTask(completion.getString(), pos + 1));
                break;
            } else {
                mode = Mode.INSERT;
            }
        }
    }

    @Override
    public void removeUpdate(DocumentEvent arg0) {

    }

    @Override
    public void changedUpdate(DocumentEvent arg0) {

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
        jTextArea1 = new javax.swing.JTextArea();
        BrowseButton = new javax.swing.JButton();
        ScanButton = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        OutputTable = new javax.swing.JTable();
        CommentButton = new javax.swing.JButton();
        errorLabel = new javax.swing.JLabel();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        BrowseButton.setText("Browse");
        BrowseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrowseButtonActionPerformed(evt);
            }
        });

        ScanButton.setText("Compile");
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

        errorLabel.setText("No. of Error");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 817, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(499, 499, 499))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(173, 173, 173)
                                .addComponent(CommentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ScanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BrowseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(568, 568, 568)
                                .addComponent(errorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(493, 493, 493))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(errorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BrowseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ScanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CommentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                System.out.println(path);
                String contents = null;
                try {
                    //Using D:\m.txt
                    contents = new String(Files.readAllBytes(Paths.get(path)));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                //read file line by Line and add in map
                ScannerString sc = new ScannerString(contents);
                lines = sc.split(new ScannerString("\n"));
                int num = 0;
                for (int i = 0; i < lines.size(); i++) {

                    map.add(num++, lines.get(i).getString());
                }
                error = 0;
                String RowOutput = "";
                LinkedList<Integer> MapKeys = map.getKeys();
                //scan Line in map
                ScannerController scaner2 = new ScannerController();
                for (int i = 0; i < MapKeys.size(); i++) {
                    RowOutput += scaner2.compile_output((String) map.get(i), i + 1);
                    error += compile_error((String) map.get(i));
                    noLex = 1;

                }
                //display scanner output in table
                DefaultTableModel model = (DefaultTableModel) OutputTable.getModel();
                ScannerString Ro = new ScannerString(RowOutput);
                Outlines = Ro.split(new ScannerString("\n"));
                //String[] lines = RowOutput.split("\n");
                for (int i = 0; i < Outlines.size(); i++) {
                    ScannerString ScanOutput = new ScannerString(Outlines.get(i).getString());
                    currencies = ScanOutput.split(new ScannerString("\t"));
                    //System.out.println(currencies.get(2).getString());
                    Object[] row = new Object[5];
                    for (int c = 0; c < currencies.size(); c++) {
                        row[c] = currencies.get(c).getString();
                    }
                    model.addRow(row);
                }
                System.out.println(error);
                String s = Integer.toString(error);
                errorLabel.setText("No of errors : " + s);
            }
        }
    }//GEN-LAST:event_BrowseButtonActionPerformed

    private void ScanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ScanButtonActionPerformed
        //Input Scanner
        //Input Scanner
        DefaultTableModel model = (DefaultTableModel) OutputTable.getModel();
        model.setRowCount(0);
        noLex = 1;
        Dictionary map = new Dictionary<Integer, String>();
        scan = jTextArea1.getText();
        ScannerString sc = new ScannerString(scan);
        //read line bylinefrpm textArea and add in map
        if (scan != null) {
            lines = sc.split(new ScannerString("\n"));
            int num = 0;
            for (int i = 0; i < lines.size(); i++) {
                if (lines.get(i).getString() != null) {

                    map.add(num++, lines.get(i).getString());
                }

            }

            ScannerController scaner2 = new ScannerController();
            error = 0;
            //scan Lines in map
            LinkedList<Integer> MapKeys = map.getKeys();
            String RowOutput = "";
            for (int i = 0; i < MapKeys.size(); i++) {
                RowOutput += scaner2.compile_output((String) map.get(i), i + 1);
                error += compile_error((String) map.get(i));
                noLex = 1;
            }
            String s = Integer.toString(error);
            //display scanner output in table
            errorLabel.setText("No of errors : " + s);
            ScannerString Ro = new ScannerString(RowOutput);
            Outlines = Ro.split(new ScannerString("\n"));
            //String[] lines = RowOutput.split("\n");
            for (int i = 0; i < Outlines.size(); i++) {
                ScannerString ScanOutput = new ScannerString(Outlines.get(i).getString());
                currencies = ScanOutput.split(new ScannerString("\t"));
                //System.out.println(currencies.get(2).getString());
                Object[] row = new Object[5];
                for (int c = 0; c < currencies.size(); c++) {
                    row[c] = currencies.get(c).getString();
                }
                model.addRow(row);
            }
        }

    }//GEN-LAST:event_ScanButtonActionPerformed

    private void CommentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CommentButtonActionPerformed

        // TODO add your handling code here:
        int line = 0;
        try {
            int offset = jTextArea1.getCaretPosition();
            line = jTextArea1.getLineOfOffset(offset);
            System.out.println(line + 1);
        } catch (BadLocationException ex) {
            Logger.getLogger(ScannerGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        Document doc = jTextArea1.getDocument();
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

    private class CompletionTask implements Runnable {

        String completion;
        int position;

        CompletionTask(String completion, int position) {
            this.completion = completion;
            this.position = position;
        }

        @Override
        public void run() {
            jTextArea1.insert(completion, position);
            jTextArea1.setCaretPosition(position + completion.length());
            jTextArea1.moveCaretPosition(position);
            mode = Mode.COMPLETION;
        }
    }

    private class CommitAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent ev) {
            if (mode == Mode.COMPLETION) {
                int pos = jTextArea1.getSelectionEnd();
                jTextArea1.setCaretPosition(pos);
                mode = Mode.INSERT;
            } else {
                jTextArea1.replaceSelection("\n");
            }
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BrowseButton;
    private javax.swing.JButton CommentButton;
    private javax.swing.JTable OutputTable;
    private javax.swing.JButton ScanButton;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
