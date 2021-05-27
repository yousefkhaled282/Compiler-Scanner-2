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
        int[] noLex=new int[Lexeme.Lex.length];
        Lexeme lex = new Lexeme();  
        RegularExpression reg= new RegularExpression();
         if(lineOfCurrencies.startsWith("/")||lineOfCurrencies.startsWith("/*")||lineOfCurrencies.endsWith("*/")){
             //do not read
            }else{
                for(int i=0;i<currencies.length;i++){
                if(lex.isLex(currencies[i])){
                    int index=Lexeme.Get(currencies[i]);
                    int count=noLex[index];
                    noLex[index]=++count;        
        }   
                }
        for(int i=0;i<currencies.length;i++){
           if(lex.isLex(currencies[i])){
               int index=Lexeme.Get(currencies[i]);
              String NoLine = Integer.toString(x);
              String NoLex = Integer.toString(noLex[index]);
               System.out.println("Line No"+x+"Lexeme  "+currencies[i]+" Token"+lex.getToken(currencies[i])+"  Matched"+noLex[index]);
               String Result[]={NoLine,currencies[i],lex.getToken(currencies[i]),"Matched",NoLex};
               for (int z= 0; z <Result.length; z++){
                           sc.test[z] = Result[z];
                }
               //sc.test=Result;
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
