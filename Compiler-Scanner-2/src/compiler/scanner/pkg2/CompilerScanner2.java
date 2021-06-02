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
        String s ="Ire@3num=5;";
        dfk.keywordDFa(s);
        dfi.DFA_Constant(s);
        dfi.IdentifierDFA(s);
        dfs.SymbolDFA(s);
        

}}

