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
        String x = "99999999" ; //checking lexemes
        String z="compiler2133,88rrriri"; // identifier checking
        String tok ="Divisio";// Check lexeme
        Lexeme lex = new Lexeme();
        RegularExpression reg= new RegularExpression();
        System.out.println(reg.isIdentefier(z));
        
        //Check number and return 
        if(lex.isConstant(x))
        {
                System.out.println("Constant");

        }
        //Return Token and Check Lexeme Found or not
        if(lex.isLex(tok)){
            System.out.println(lex.getToken(tok));
        }  
        
         
        }
       
    
    
}
