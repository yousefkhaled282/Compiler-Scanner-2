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

   public static String compile_output (String s1,int x){
         ArrayList<Character> lexeme = new ArrayList<>();//Arraylist for add found Lexemes
        ArrayList<Character> Identifier = new ArrayList<>();//Arraylist for add found Identifier
        ArrayList<Character> symbol = new ArrayList<>(); //Arraylist for add found Symbols
        ArrayList<Character> c = new ArrayList<>();//First Char list take the string input from String s1
        ArrayList<Character> c1 = new ArrayList<>();//SEcond Char list take sting after add @ in index 0 Take inputs from s
        ArrayList<Integer> index = new ArrayList<>();//Arraylist for add index of Symbols
        Lexeme L=new Lexeme();//Class Lexeme
         RegularExpression RE = new RegularExpression();
                String symbols="";
                String ss="";
        if(s1.startsWith("/-")){
            symbols+=x+"\t"+"/-"+"\t"+L.getToken("/-")+"\t"+1+"\t"+"Matched"+"\n";
            return symbols;
        }else{
          
     int noLex=1;
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
        //System.out.println(lex);
        L.isLex(lex);
        if( L.isLex(lex)==true){
        symbols+=x+"\t"+lex+"\t"+L.getToken(lex)+"\t"+1+"\t"+"Matched"+"\n";}else{
        symbols+=x+"\t"+lex+"\t"+L.getToken(lex)+"\t"+1+"\t"+"Not Matched"+"\n";
        }
        //System.out.println("Token is\t"+L.getToken(lex)); 
        //For loop for relational sumbol and logic symbol
         
      for (int i=0;i<index.size();i++){
           
            if(index.get(i)+1==index.get(i+1)){
                 char vars=symbol.get(i);
                char var1=symbol.get(i+1); 
                 
                ss=new StringBuilder().append(vars).append(var1).toString();
               
                } }
       DFAtoCode df=new DFAtoCode();
        
        System.out.println(df.SymbolDFA(ss));
        
        
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
                //System.out.println("Symbol "+varStr+ " is "+L.getToken(varStr));
                noLex++;
                symbols+=x+"\t"+varchar+"\t"+L.getToken(varStr)+"\t"+noLex+"\t"+"Matched"+"\n";

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
                 noLex++;
                  symbols+=x+"\t"+arr[i]+ "\t"+"Indentifier"+"\t"+noLex+"\t"+"Matched"+"\n";
                 //System.out.println(arr[i]+" is Indentifier");
             } else if (L.isConstant(arr[i])){
                 noLex++;
                symbols+=x+"\t"+arr[i]+"\t"+"Constant"+"\t"+noLex+"\t"+"Matched"+"\n";

                 //System.out.println(arr[i]+" is Constant");
            }else{
                 //System.out.println(arr[i]+" is not Indentifier");
             }
         }
         System.out.println(symbols);
         return symbols;
        } } 
   
    public static int  compile_error (String s1){
        int error=0;
         if(s1.startsWith("/-")){
              return 0;}else{
           ArrayList<Character> lexeme = new ArrayList<>();//Arraylist for add found Lexemes
        ArrayList<Character> Identifier = new ArrayList<>();//Arraylist for add found Identifier
        ArrayList<Character> symbol = new ArrayList<>(); //Arraylist for add found Symbols
        ArrayList<Character> c = new ArrayList<>();//First Char list take the string input from String s1
        ArrayList<Character> c1 = new ArrayList<>();//SEcond Char list take sting after add @ in index 0 Take inputs from s
        ArrayList<Integer> index = new ArrayList<>();//Arraylist for add index of Symbols
        Lexeme L=new Lexeme();//Class Lexeme
         RegularExpression RE = new RegularExpression();
        
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
        if( L.isLex(lex)==true){
            error--;
        }else{
            error++;
       
        }        
       
        
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
             } else if (L.isConstant(arr[i])){
            }else{
                 error++;
             }
         }
         return error;
   } }
}
