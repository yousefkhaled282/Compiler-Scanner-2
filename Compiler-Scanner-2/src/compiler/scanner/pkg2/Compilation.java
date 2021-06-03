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
    LinkedList<Character> lexeme = new LinkedList<>();
    LinkedList<Character> Identifier = new LinkedList<>();
    LinkedList<Character> symbol = new LinkedList<>();
    LinkedList<Character> c = new LinkedList<>();
    LinkedList<Character> c1 = new LinkedList<>();
    LinkedList<Integer> index = new LinkedList<>();//Arraylist for add index of Symbols
    Lexeme L = new Lexeme();//Class Lexeme
    RegularExpression RE = new RegularExpression();
    DFA_Keywords KeyWordScan = new DFA_Keywords();
    DFA_For_Symbols SymbolScanner = new DFA_For_Symbols();

    public String compile_output(String s1, int x) {
        String OutputLine = "";
        ScannerString sc =new ScannerString(s1);
        ScannerString sc1 =new ScannerString("/-");
        //check if StringLine is comment
        if (sc.startsWith(sc1)) {
            OutputLine += x + "\t" + "/-" + "\t" + "Comment" + "\t" + 1 + "\t" + "Matched" + "\n";
            return OutputLine;
        } else {
            int noLex = 1;
            for (char ch : s1.toCharArray()) {
                c.insert(ch);
            }
            ///For Loop For detect Lexeme
            for (int i = 0; i < c.getSize(); i++) {
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
            for(int i=0;i<lexeme.getSize();i++){
                            sb.append(lexeme.get(i));

            }

            String lex = sb.toString();
            if (L.isLex(lex) == false) {
                OutputLine += x + "\t" + lex + "\t" + "Not Exits" + "\t" + noLex + "\t" + "Not Matched" + "\n";
            }
            ///For Loop For detect symbol and its index 
            for (int i = 0; i < c.getSize(); i++) {
                if (L.isSymbol(c.get(i))) {
                    index.insert(i);
                    char var = c.get(i);
                    symbol.insert(var);
                }
            }
            //Scan KeyWord Line useing KeyWordDFA
            OutputLine += KeyWordScan.keywordDFa(s1, x);
            //For Loop Detect Identifier
            if (lexeme.getSize()==0) {//it will enter here if lexeme is not found
                //For Loop For Inc 1  inside arraylist Index
                for (int i = 0; i < index.getSize(); i++) {
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
                for (int i = 0; i < index.getSize() - 1; i++) {
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
                for (int i = 0; i < index.getSize() - 1; i++) {
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
            for (int i=0;i<Identifier.getSize();i++) {
                S_indentifier.append(Identifier.get(i));
            }
            //Split Each identifiers and constants and put it into an String array 
            String iden = S_indentifier.toString();
            String[] arr = iden.split("/");//array string that we solit each identifier
            //For loop to split each identifer
            OutputLine += SymbolScanner.SymbolDFA(s1, x);
            for (int i = 0; i < arr.length; i++) {
                if (RE.isIdentefier(arr[i])) {
                    noLex++;
                    OutputLine += x + "\t" + arr[i] + "\t" + "Indentifier" + "\t" + noLex + "\t" + "Matched" + "\n";
                    //System.out.println(arr[i]+" is Indentifier");
                } else if (L.isConstant(arr[i])) {
                    noLex++;
                    OutputLine += x + "\t" + arr[i] + "\t" + "Constant" + "\t" + noLex + "\t" + "Matched" + "\n";
                }
            }
            return OutputLine;
        }
    }

    public static int compile_error(String s1) {
        ArrayList<Character> lexeme = new ArrayList<>();//Arraylist for add found Lexemes
        ArrayList<Character> Identifier = new ArrayList<>();//Arraylist for add found Identifier
        ArrayList<Character> symbol = new ArrayList<>(); //Arraylist for add found Symbols
        ArrayList<Character> c = new ArrayList<>();//First Char list take the string input from String s1
        ArrayList<Character> c1 = new ArrayList<>();//SEcond Char list take sting after add @ in index 0 Take inputs from s
        ArrayList<Integer> index = new ArrayList<>();//Arraylist for add index of Symbols
        Lexeme L = new Lexeme();//Class Lexeme
        RegularExpression RE = new RegularExpression();
        ScannerString sc =new ScannerString(s1);
        ScannerString sc1 =new ScannerString("/-");
        int error = 0;
        if (sc.startsWith(sc1)) {
            return 0;
        } else {
            int noLex = 1;
            for (char ch : s1.toCharArray()) {
                c.add(ch);
            }
            ///For Loop For detect Lexeme
            for (int i = 0; i < c.size(); i++) {
                if ('@' == c.get(i)) {
                    for (int j = 0; j < i; j++) {
                        char var = c.get(j);
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
            if (L.isLex(lex) == false) {error++;
            }
            ///For Loop For detect symbol and its index 
            for (int i = 0; i < c.size(); i++) {
                if (L.isSymbol(c.get(i))) {
                    index.add(i);
                    char var = c.get(i);
                    symbol.add(var);
                }
            }
            //For Loop Detect Identifier
            if (lexeme.isEmpty()) {//it will enter here if lexeme is not found
                //For Loop For Inc 1  inside arraylist Index
                for (int i = 0; i < index.size(); i++) {
                    int oldValue = index.get(i);
                    int newValue = oldValue + 1;
                    index.set(i, newValue);
                }
                index.add(0, 0);
                String s = s1;
                for (char ch : s.toCharArray()) {
                    c1.add(ch);
                }
                //For Loop For convert all Symbol to /
                for (int i = 0; i < index.size() - 1; i++) {
                    for (int j = index.get(i) + 1; j < index.get(i + 1); j++) {
                        char var = c1.get(j);
                        if (!(j == index.get(i + 1))) {
                            Identifier.add(var);
                        }
                    }
                    Identifier.add('/');
                }
            } else {//it will enter here if lexeme is found
                //For Loop For convert all Symbol to /    
                for (int i = 0; i < index.size() - 1; i++) {
                    for (int j = index.get(i) + 1; j < index.get(i + 1); j++) {
                        char var = c.get(j);
                        if (!(j == index.get(i + 1))) {
                            Identifier.add(var);
                        }
                    }
                    Identifier.add('/');
                }
            }
            //Build identifier to string
            StringBuilder S_indentifier = new StringBuilder();
            for (Character ch : Identifier) {
                S_indentifier.append(ch);
            }
            //Split Each identifiers and constants and put it into an String array 
            String iden = S_indentifier.toString();
            String[] arr = iden.split("/");//array string that we solit each identifier
            //For loop to split each identifer
            for (int i = 0; i < arr.length; i++) {
                if (RE.isIdentefier(arr[i])) {
                } else if (L.isConstant(arr[i])) {
                }else{error++;}
            }
            return error;
        }
    }
}
