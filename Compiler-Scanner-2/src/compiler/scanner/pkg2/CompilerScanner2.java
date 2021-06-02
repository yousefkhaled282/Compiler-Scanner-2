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

//  index.add(12);
//  String ss="";
  
//        String s= "ajd12";
//        System.out.println(RE.isIdentefier(s));
        /*for (int i=0;i<index.size()-1;i++){
           
            if(index.get(i)+1==index.get(i+1)){
                char vars=symbol.get(i);
                char var1=symbol.get(i+1); 
                 
                ss=new StringBuilder().append(vars).append(var1).toString();
               
                } }*/
        //System.out.println(ss);
       Lexeme l=new Lexeme(); 
       //ScannerGUI sc=new ScannerGUI();
       //sc.setVisible(true);
       //String ss ="//";
      //DFAtoCode df=new DFAtoCode();
        //char s ='||';
        DFA_Identifier iden=new DFA_Identifier();
        
         String s="hhh";
         iden.DFA_Constant(s);

                
    
    
    
    

}}
