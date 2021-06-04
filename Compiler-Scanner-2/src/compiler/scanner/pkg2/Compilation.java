/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiler.scanner.pkg2;

import static compiler.scanner.pkg2.DFA_For_Symbols.noLex;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 *
 * @author mode_
 */
public class Compilation {
    RegularExpression RE = new RegularExpression();
    DFA_Keywords KeyWordScan = new DFA_Keywords();
    DFA_For_Symbols SymbolScanner = new DFA_For_Symbols();

    public String compile_output(String s1, int x) {
        LinkedList<Character> lexeme = new LinkedList<>();//Arraylist for add found Lexemes
        LinkedList<Character> Identifier = new LinkedList<>();//Arraylist for add found Identifier
        LinkedList<Character> symbol = new LinkedList<>(); //Arraylist for add found Symbols
        LinkedList<Character> c = new LinkedList<>();//First Char list take the string input from String s1
        LinkedList<Character> c1 = new LinkedList<>();//SEcond Char list take sting after add @ in index 0 Take inputs from s
        LinkedList<Integer> index = new LinkedList<>();//Arraylist for add index of Symbols
        Lexeme L=new Lexeme();//Class Lexeme
         RegularExpression RE = new RegularExpression();
             ScannerString sc =new ScannerString(s1);
                String symbols="";
        LinkedList<ScannerString> ReadUsing = new LinkedList<ScannerString>();
        if(s1.startsWith("/-")){
            symbols+=x+"\t"+"/-"+"\t"+L.getToken("/-")+"\t"+1+"\t"+"Matched"+"\n";
            return symbols;
        }else if (sc.startsWith(new ScannerString("Using"))) {
             Dictionary map = new Dictionary<Integer, String>();
            symbols += x + "\t" + "Using" + "\t" + "Read File" + "\t" + 1 + "\t" + "Matched" + "\n";
             ReadUsing= sc.split(new ScannerString(" "));
            System.out.println(ReadUsing.get(1).getString());

           String contents="";
                try {
                    //lines[1] file name like this Using D:\n.txtUsing D:\n.txt
                    String paths=ReadUsing.get(1).getString();
                    contents = new String(Files.readAllBytes(Paths.get(paths)));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                //read file line by Line and add in map
                String[] Usinglines = contents.split("\n");
                int num = 0;
                for (String line : Usinglines) {
                    map.add(num++, line);
                }
                LinkedList<Integer> MapKeys = map.getKeys();
                //scan Line in map
                Compilation scaner2 = new Compilation();
                for (int i = 0; i < MapKeys.size(); i++) {
                    symbols += scaner2.compile_output((String) map.get(i), i + 1);
                }

            return symbols;
        }
        
        else{
            
            

     int noLex=1;
        for (char ch : s1.toCharArray()) {
            c.insert(ch);
        }


        ///For Loop For detect Lexeme
        for(int i=0;i<c.size();i++){
           if('@'==c.get(i)){
               for(int j=0;j<i;j++){
                   char var=c.get(j);
                    lexeme.insert(var);
               }
           }

        }
        //Bulid Lexeme and search if its found or not
        //Lexeme ---> Token
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < lexeme.size(); i++){
            sb.append(lexeme.get(i));
        }

        String lex = sb.toString();
        L.isLex(lex);
        if( L.isLex(lex)==true){
        //symbols+=x+"\t"+lex+"\t"+L.getToken(lex)+"\t"+1+"\t"+"Matched"+"\n";}
                symbols += KeyWordScan.keywordDFa(s1, x);
        }
        else{
        symbols+=x+"\t"+lex+"\t"+L.getToken(lex)+"\t"+1+"\t"+"Not Matched"+"\n";
        }
        
        

        ///For Loop For detect symbol and its index 
        for(int i=0;i<c.size();i++){
           if(L.isSymbol(c.get(i))){
              index.insert(i);
              char var=c.get(i);
              symbol.insert(var);
            }
        }
        //for loop for Print Symbols and its token
        for (int i =0 ; i<symbol.size();i++){

            char varchar = symbol.get(i);

            String varStr = Character.toString(varchar);
            if(L.isLex(varStr)){
                //System.out.println("Symbol "+varStr+ " is "+L.getToken(varStr));
                noLex++;
                //symbols+=x+"\t"+varchar+"\t"+L.getToken(varStr)+"\t"+noLex+"\t"+"Matched"+"\n";
                
 
            }
        }
               symbols += SymbolScanner.SymbolDFA(s1, x);
        //For Loop Detect Identifier
        if(lexeme.size() == 0){//it will enter here if lexeme is not found
            //For Loop For Inc 1  inside arraylist Index
            for(int i =0;i<index.size();i++){
                int oldValue = index.get(i);
                int newValue = oldValue + 1;
                index.replace(i, newValue);
            }
            //add 0 in Index 0
            index.replace(0,0);
            //Add @ symbol in the begininng of line
            String s ="@"+s1;
             for (char ch : s.toCharArray()) {
                c1.insert(ch);
            }
             //For Loop For convert all Symbol to /
             for(int i = 0;i<index.size()-1;i++){
                for (int j = index.get(i)+1;j<index.get(i+1);j++){
                char var =c1.get(j);
                if(!(j==index.get(i+1))){
                Identifier.insert(var);
                }

            }
            Identifier.insert('/');
        }
        }
        else{//it will enter here if lexeme is found
       //For Loop For convert all Symbol to /    
        for(int i = 0;i<index.size()-1;i++){
            for (int j = index.get(i)+1;j<index.get(i+1);j++){
                char var =c.get(j);
                if(!(j==index.get(i+1))){
                Identifier.insert(var);
                }

            }
            Identifier.insert('/');
        }
        }

        //Build identifier to string
        StringBuilder S_indentifier = new StringBuilder();
        for(int i = 0; i < Identifier.size(); i++){
            S_indentifier.append(Identifier.get(i));
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
 
                 
            }else{
                 
             }
         }
         System.out.println(symbols);
         return symbols;
        }
    }

    public static int compile_error(String s1) {

    LinkedList<Character> lexeme = new LinkedList<>();
    LinkedList<Character> Identifier = new LinkedList<>();
    LinkedList<Character> symbol = new LinkedList<>();
    LinkedList<Character> c = new LinkedList<>();
    LinkedList<Character> c1 = new LinkedList<>();
    LinkedList<Integer> index = new LinkedList<>();//Arraylist for add index of Symbols
    Lexeme L = new Lexeme();//Class Lexeme
    RegularExpression RE = new RegularExpression();
        ScannerString sc =new ScannerString(s1);
        ScannerString sc1 =new ScannerString("/-");
                LinkedList<ScannerString> ReadUsing = new LinkedList<>();

      ScannerString useing =new ScannerString("Using");
   int error=0;
        //check if StringLine is comment
        if (sc.startsWith(sc1)) {
        }else if (sc.startsWith(useing)) {
             Dictionary map = new Dictionary<Integer, String>();
  ReadUsing= sc.split(new ScannerString(" "));  
            System.out.println(ReadUsing.get(1).getString());
            
           String contents="";
                try {
                    //lines[1] file name like this Using D:\n.txtUsing D:\n.txt
                    String paths=ReadUsing.get(1).getString();
                    contents = new String(Files.readAllBytes(Paths.get(paths)));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                //read file line by Line and add in map
                String[] Usinglines = contents.split("\n");
                int num = 0;
                for (String line : Usinglines) {
                    map.add(num++, line);
                }
                LinkedList<Integer> MapKeys = map.getKeys();
                //scan Line in map
                Compilation scaner2 = new Compilation();
                for (int i = 0; i < MapKeys.size(); i++) {
                    error += compile_error((String) map.get(i));
                }
            
            return error;
        } else {
            int noLex = 1;
            for (char ch : s1.toCharArray()) {
                c.insert(ch);
            }
            ///For Loop For detect Lexeme
            for (int i = 0; i < c.size(); i++) {
                if ('@' == c.get(i)) {
                    for (int j = 0; j < i; j++) {
                        char var = c.get(j);
                        lexeme.insert(var);
                    }
                }
            }
            //Bulid Lexeme and search if its found or not
            //Lexeme ---> Token
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<lexeme.size();i++){
                            sb.append(lexeme.get(i));

            }

            String lex = sb.toString();
            if (L.isLex(lex) == false) {error++;
            }
            ///For Loop For detect symbol and its index 
            for (int i = 0; i < c.size(); i++) {
                if (L.isSymbol(c.get(i))) {
                    index.insert(i);
                    char var = c.get(i);
                    symbol.insert(var);
                }
            }
            //For Loop Detect Identifier
            if (lexeme.size()==0) {//it will enter here if lexeme is not found
                //For Loop For Inc 1  inside arraylist Index
                for (int i = 0; i < index.size(); i++) {
                    int oldValue = index.get(i);
                    int newValue = oldValue + 1;
                    index.replace(i, newValue);
                }
                //add 0 in Index 0
                index.replace(0, 0);
                String s = s1;
                for (char ch : s.toCharArray()) {
                    c1.insert(ch);
                }
                //For Loop For convert all Symbol to /
                for (int i = 0; i < index.size() - 1; i++) {
                    for (int j = index.get(i) + 1; j < index.get(i + 1); j++) {
                        char var = c1.get(j);
                        if (!(j == index.get(i + 1))) {
                            Identifier.insert(var);
                        }
                    }
                    Identifier.insert('/');
                }
            } else {//it will enter here if lexeme is found
                //For Loop For convert all Symbol to /    
                for (int i = 0; i < index.size() - 1; i++) {
                    for (int j = index.get(i) + 1; j < index.get(i + 1); j++) {
                        char var = c.get(j);
                        if (!(j == index.get(i + 1))) {
                            Identifier.insert(var);
                        }
                    }
                    Identifier.insert('/');
                }
            }
            //Build identifier to string
            StringBuilder S_indentifier = new StringBuilder();
            for (int i=0;i<Identifier.size();i++) {
                S_indentifier.append(Identifier.get(i));
            }
            //Split Each identifiers and constants and put it into an String array 
            String iden = S_indentifier.toString();
            String[] arr = iden.split("/");//array string that we solit each identifier
            //For loop to split each identifer
            for (int i = 0; i < arr.length; i++) {
                if (RE.isIdentefier(arr[i])) {
                } else if (L.isConstant(arr[i])) {
                }
                else{error++;}
            }
        }
                    return error;

    }
}
