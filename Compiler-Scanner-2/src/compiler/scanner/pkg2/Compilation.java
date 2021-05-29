/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiler.scanner.pkg2;

import java.util.ArrayList;

/**
 *
 * @author mode_
 */
public class Compilation {
    ArrayList<Character> lexeme = new ArrayList<>();//Arraylist for add found Lexemes
        ArrayList<Character> Identifier = new ArrayList<>();//Arraylist for add found Identifier
        ArrayList<Character> symbol = new ArrayList<>(); //Arraylist for add found Symbols
        ArrayList<Character> c = new ArrayList<>();//First Char list take the string input from String s1
        ArrayList<Character> c1 = new ArrayList<>();//SEcond Char list take sting after add @ in index 0 Take inputs from s
        ArrayList<Integer> index = new ArrayList<>();//Arraylist for add index of Symbols
        Lexeme L=new Lexeme();//Class Lexeme
         RegularExpression RE = new RegularExpression();
   public void compile (String s1){
        
        
       
        
        for (char ch : s1.toCharArray()) {
            c.add(ch);
        }
       
       
        ///For Loop For detect Lexeme
        for(int i=0;i<c.size();i++){
           if('@'==c.get(i)){
               for(int j=0;j<i;j++){
                   char var=c.get(j);
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
        
       
        
         //For loop for relational sumbol and logic symbol
         
       /* for (int i=0;i<index.size();i++){
           
            if(index.get(i)+1==index.get(i+1)){
                 vars=symbol.get(i);
                char var1=symbol.get(i+1); 
                 
                String s=new StringBuilder().append(vars).append(var1).toString();
                if(L.isSymbolrep(s)){
                    System.out.println(s+" is"+L.getToken(s)  );
                }else{
                    break;
                } }}*/
        ///For Loop For detect symbol and its index 
        for(int i=0;i<c.size();i++){
           if(L.isSymbol(c.get(i))){
              index.add(i);
              char var=c.get(i);
              symbol.add(var);
            }
        }
        //for loop for Print Symbols and its token
        for (int i =0 ; i<symbol.size();i++){
            
            char varchar = symbol.get(i);
           
            String varStr = Character.toString(varchar);
            if(L.isLex(varStr)){
                System.out.println("Symbol "+varStr+ " is "+L.getToken(varStr));
            }
            
        }
        //For Loop Detect Identifier
        if(lexeme.isEmpty()){//it will enter here if lexeme is not found
            //For Loop For Inc 1  inside arraylist Index
            for(int i =0;i<index.size();i++){
                int oldValue = index.get(i);
                int newValue = oldValue + 1;
                index.set(i, newValue);
            }
            //add 0 in Index 0
            index.add(0,0);
            //Add @ symbol in the begininng of line
            String s ="@"+s1;
             for (char ch : s.toCharArray()) {
                c1.add(ch);
            }
             //For Loop For convert all Symbol to /
             for(int i = 0;i<index.size()-1;i++){
                for (int j = index.get(i)+1;j<index.get(i+1);j++){
                char var =c1.get(j);
                if(!(j==index.get(i+1))){
                Identifier.add(var);
                }
   
            }
            Identifier.add('/');
        }
        }
        else{//it will enter here if lexeme is found
       //For Loop For convert all Symbol to /    
        for(int i = 0;i<index.size()-1;i++){
            for (int j = index.get(i)+1;j<index.get(i+1);j++){
                char var =c.get(j);
                if(!(j==index.get(i+1))){
                Identifier.add(var);
                }
 
            }
            Identifier.add('/');
        }}
       
        //Build identifier to string
        StringBuilder S_indentifier = new StringBuilder();
        for (Character ch : Identifier) {
            
            S_indentifier.append(ch);
            
            }
        //Split Each identifiers and constants and put it into an String array 
         String iden = S_indentifier.toString();
         String [] arr= iden.split("/");//array string that we solit each identifier
         //For loop to split each identifer
         for (int i =0;i<arr.length;i++){
             
             if(RE.isIdentefier(arr[i])){
                 System.out.println(arr[i]+" is Indentifier");
             } else if (L.isConstant(arr[i])){
                 System.out.println(arr[i]+" is Constant");
            }else{
                 System.out.println(arr[i]+" is not Indentifier");
             }
         }
   } 
}
