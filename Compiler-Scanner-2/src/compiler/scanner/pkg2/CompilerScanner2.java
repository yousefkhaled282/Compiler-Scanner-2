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
        String x = "99999999" ;
        Lexeme lex = new Lexeme();
        if(lex.isConstant(x))
        {
                System.out.println("Constant");

        }
          
        
         
        }
       
    
    
}
