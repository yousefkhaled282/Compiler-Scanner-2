/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiler.scanner.pkg2;






public class CompilerScanner2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DFA_Keywords dfk=new DFA_Keywords();
        DFA_For_Symbols dfs= new DFA_For_Symbols();
        DFA_Identifier dfi=new DFA_Identifier();
        Compilation c=new Compilation();
        
//        String s = "Ire@num=3;\nIre@num=3;";
//        String[] splitted = s.split("\n");
//        for(int i = 0; i < splitted.length; i++){
//            System.out.println(c.compile_output(splitted[i], i));
//        }
//        
                
       
//        String s ="reg3=reg3-1;}";
//        System.out.println(c.compile_output(s,0));
//        System.out.println(dfk.keywordDFa(s,1));
//        dfi.DFA_Constant(s);
//        dfi.IdentifierDFA(s);
//        System.out.println(dfs.SymbolDFA(s,1));
        
       ScannerGUI sc=new ScannerGUI();
       sc.setVisible(true);

}}

