/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiler.scanner.pkg2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;




public class CompilerScanner2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap    
       int numLine=0;
        Scanner scanner = new Scanner(System.in);
        //file
      try {
      File myObj = new File("C:\\Users\\mustafa mahamoud\\Documents\\GitHub\\Compiler-Scanner-2\\Compiler-Scanner-2\\File.txt");
      Scanner myReader = new Scanner(myObj); 
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        numLine++;
         map.put(numLine, data);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
      int d=0;
       for (Integer i : map.keySet()) {
            Result(map.get(i),i);
            d+=error(map.get(i));
    }
       System.out.println("erroe"+d);
             
             
        //input     
//        String line;
//        while(true){     
//            line = scanner.nextLine();
//            if(line.equals("")){
//                break;              
//            }
//            numLine++;
//            map.put(numLine, line);
////Ire @ decrease(){
////Ire @ 3num = 5 ;
//        }      
//        for (Integer i : map.keySet()) {
//            Result(map.get(i),i);
//    }

    }
    public static void Result(String lineOfCurrencies,int x){
        String[] currencies = lineOfCurrencies.split(" ");
        Lexeme lex = new Lexeme();
        RegularExpression reg= new RegularExpression();
         if(lineOfCurrencies.startsWith("/")||lineOfCurrencies.startsWith("/*")||lineOfCurrencies.endsWith("*/")){
             //do not read
            }else{
        for(int i=0;i<currencies.length;i++){
           
            
         if(lex.isLex(currencies[i])){
            System.out.println("Line No"+x+"Lexeme  "+currencies[i]+" Token"+lex.getToken(currencies[i])+"  Matched");
          
        }  
        }
         }
    }
    
     public static int error(String lineOfCurrencies){
        String[] currencies = lineOfCurrencies.split(" ");
        Lexeme lex = new Lexeme();
        RegularExpression reg= new RegularExpression();
        int errors=0,num=0;  
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
