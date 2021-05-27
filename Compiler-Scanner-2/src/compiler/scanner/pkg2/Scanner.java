/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiler.scanner.pkg2;
import java.util.*;
/**
 *
 * @author mustafa mahamoud
 */
public class Scanner {        
     public static void Result(String lineOfCurrencies,int x){
                                ScannerGUI sc=new ScannerGUI();

        String[] currencies = lineOfCurrencies.split(" ");
        Lexeme lex = new Lexeme();  
        RegularExpression reg= new RegularExpression();
         if(lineOfCurrencies.startsWith("/")||lineOfCurrencies.startsWith("/*")||lineOfCurrencies.endsWith("*/")){
             //do not read
            }else{
        for(int i=0;i<currencies.length;i++){
           
            
         if(lex.isLex(currencies[i])){
             String str1 = Integer.toString(x);
             String out=str1+" "+currencies[i]+" "+lex.getToken(currencies[i])+" "+"Matched"+" "+"error";
            System.out.println("Line No"+x+"Lexeme  "+currencies[i]+" Token"+lex.getToken(currencies[i])+"  Matched");

        }  
        }
         }
         
         
    }
     public static int error(String lineOfCurrencies){
        String[] currencies = lineOfCurrencies.split(" ");
        Lexeme lex = new Lexeme();
        RegularExpression reg= new RegularExpression();
        int errors=0;  
         if(lineOfCurrencies.startsWith("/")||lineOfCurrencies.startsWith("/*")||lineOfCurrencies.endsWith("*/")){
             //do not read
            }else{
        for(int i=0;i<currencies.length;i++){
           
            
        if(lex.isConstant(currencies[i]))
        {
                errors--;
        } if(lex.isLex(currencies[i])){
            System.out.print("");
          }else{
            if(reg.isIdentefier(currencies[i])==false){
                    errors++;
            }
        }  
        }
         }
        return errors;
    }
}
