/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiler.scanner.pkg2;


import static compiler.scanner.pkg2.Scanner.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;






public class CompilerScanner2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //RegularExpression RE = new RegularExpression();

//        String s= "ajd12";
//        System.out.println(RE.isIdentefier(s));
        
       // ScannerGUI sc=new ScannerGUI();
        //sc.setVisible(true);
        //Result(sc.scan);
       // System.out.println(sc.scan);

        //String s= " aj d12";
        //System.out.println(RE.isIdentefier(s));
        ArrayList<Character> lexeme = new ArrayList<>();
        ArrayList<Character> Identifier = new ArrayList<>();
        ArrayList<Character> symbol = new ArrayList<>();
        ArrayList<Integer> index = new ArrayList<>();
        Lexeme L=new Lexeme();
        String s1= "@"+"reg3=reg3-1;}}";
        char [] c=s1.toCharArray();
        int len = c.length;
        ///For Loop For detect Lexeme
        for(int i=0;i<len;i++){
           if('@'==c[i]){
               for(int j=0;j<i;j++){
                   char var=c[j];
                    lexeme.add(var);
               }
           }
               
        }
        //Bulid Lexeme and search if its found or not
        //Lexeme ---> Token
        StringBuilder sb = new StringBuilder();
        for (Character ch : lexeme) {
            
            sb.append(ch);
        }
        
        String lex = sb.toString();
        System.out.println(lex);
        L.isLex(lex);
        System.out.println("Token is\t"+L.getToken(lex)); 
       
       
        
         
        ///For Loop For detect symbol and its index 
        for(int i=0;i<len;i++){
           if(L.isSymbol(c[i])){
              index.add(i);
              char var=c[i];
              symbol.add(var);
            }
        }
        //For Loop Detect Identifier
        if(lexeme.isEmpty()){
            
            index.add(0,0);
        }
        for(int i = 0;i<index.size()-1;i++){
            for (int j = index.get(i)+1;j<index.get(i+1);j++){
                char var =c[j];
                if(!(j==index.get(i+1))){
                Identifier.add(var);
                }
                
                
                
            }
            Identifier.add('/');
        }
        System.out.println("identifer brfore remove    "+Identifier);
        
        StringBuilder S_indentifier = new StringBuilder();
        for (Character ch : Identifier) {
            
            S_indentifier.append(ch);
            
            }
         String iden = S_indentifier.toString();
         String [] arr= iden.split("/");
        
        
        
       
         
        
        //OutPuts
        
        System.out.println("identifer after remove    "+Identifier);
       
         
        System.out.println("identifer    "+S_indentifier);
        System.out.println("identifer    "+iden);
        System.out.println("identifer    "+arr[0]);
        System.out.println("identifer    "+arr[1]);
        System.out.println("identifer    "+arr[2]);
        
        System.out.println("Index of Symbols     "+index);
        System.out.println("Symbols    "+symbol);
        
        
        
        
        
        for (int i =0 ; i<symbol.size();i++){
            char varchar = symbol.get(i);
            String varStr = Character.toString(varchar);
            if(L.isLex(varStr)){
                System.out.println("Symbol "+varStr+ " is "+L.getToken(varStr));
            }
            
        }
        
        
    
    
    
    
    
    
    

}}
