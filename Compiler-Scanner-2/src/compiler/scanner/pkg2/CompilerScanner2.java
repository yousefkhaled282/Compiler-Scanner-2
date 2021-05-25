/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiler.scanner.pkg2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;


public class CompilerScanner2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap<String, String> Reverse = new HashMap<String, String>();
        Lexeme lexo = new Lexeme();
        HashMap<String, String> x =lexo.Lex;
        System.out.println(x.keySet());
        System.out.println(x.get("Divisio"));
         ArrayList<String> keys = new ArrayList<String>(x.keySet());
        for(int i=keys.size()-1; i>=0;i--){
            System.out.println(x.get(keys.get(i)));
        }
        }
       
    
    
}
