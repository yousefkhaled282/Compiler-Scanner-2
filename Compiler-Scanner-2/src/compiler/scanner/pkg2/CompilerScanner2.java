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

<<<<<<< Updated upstream
    }

    }
=======
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
       
       //ScannerGUI sc=new ScannerGUI();
       //sc.setVisible(true);
       //String ss ="//";
      //DFAtoCode df=new DFAtoCode();
        //char s ='||'  ;
        String s="Ire@3num=5;";
        DFA_For_Symbols DfaSym = new DFA_For_Symbols();
        DfaSym.SymbolDFA(s);

//     for (char c:s.toCharArray()){
//        // System.out.println("char "+c);
//         
//         switch(State){
//             case('A'):{
//                 {
//                 if(c=='!'){
//                     State='B';
//                    
//                 }else if(c=='&'){
//                     State='C';
//                     
//                 }else if(c=='-'){
//                     State='D';
//                   
//                 }else if(c=='.'){
//                     State='E';  //FINAL
//                     
//                 }else if(c=='/'){
//                     State='F'; //FINAL
//                 }else if(c=='<'){
//                     State='G';//FINAL
//                 }else if(c=='='){
//                     State='H'; //FINAL WITH FINAL
//                 }else if(c=='>'){
//                     State='I';//FINAL WITH FINAL
//                 }else if(c=='*'){
//                     State='J';//FINAL WITH FINAL
//                 }else if(c=='+'){
//                     State='K';//FINAL
//                 }else if(c=='|'){
//                     State='L';
//                     
//                 }else if(c=='~'){
//                     State='M';//FINAL
//                 }
//                }
//                 }break;
//             case('B'):
//                 {
//                     if(c=='='){
//                         State='N';
//                     }
//                 
//                 }break;
//             case('C'):
//                 {
//                 if(c=='&'){
//                         State='O';
//                     }
//                 }break;
//             case('D'):{
//                 State='A';
//             }break;
//             case('E'):{
//                 State='A';
//             }break;
//             case('F'):{
//                State='A';
//             }break;
//             case('G'):{
//               if(c=='='){
//                         State='P';
//                     }else{
//                   State='A';
//               }
//             }break;
//             case('H'):
//                 {
//                if(c=='='){
//                    State='Q';
//                     }else{
//                   State='A';
//               }
//             }break;
//             case('I'):  
//                 {
//                     if(c=='='){
//                         State='R';
//                     }else{
//                   State='A';
//               }
//                 
//             }break;
//             case('J'):  
//                 {
//                 State='A';
//             }break;
//             case('K'):  
//                 {
//                 State='A';
//             }break;
//             case('L'):  
//                 {
//                     if(c=='|'){
//                         State='S';
//                 }
//                 
//                 
//             }break;
//             case('M'):  
//                 {
//                 State='A';
//                 
//             }break;
//             case('N'):  
//                 {
//                 State='A';
//                 
//             }break;
//             case('O'):  
//                 {
//                 State='A';
//                 
//             }break;
//             case('P'):  
//                 {
//                 State='A';
//                 
//             }break;
//             case('Q'):  
//                 {
//                 State='A';
//                 
//             }break;
//             case('R'):  
//                 {
//                 State='A';     
//             }break;
//             case('S'):  
//                 {
//                 
//                 State='A';
//             }break;}
//         ////////////////////////////REpeat
//        if(State=='A'){
//           switch(State){
//             case('A'):{
//                 {
//                 if(c=='!'){
//                     State='B';
//                    
//                 }else if(c=='&'){
//                     State='C';
//                     
//                 }else if(c=='-'){
//                     State='D';
//                   
//                 }else if(c=='.'){
//                     State='E';  //FINAL
//                     
//                 }else if(c=='/'){
//                     State='F'; //FINAL
//                 }else if(c=='<'){
//                     State='G';//FINAL
//                 }else if(c=='='){
//                     State='H'; //FINAL WITH FINAL
//                 }else if(c=='>'){
//                     State='I';//FINAL WITH FINAL
//                 }else if(c=='*'){
//                     State='J';//FINAL WITH FINAL
//                 }else if(c=='+'){
//                     State='K';//FINAL
//                 }else if(c=='|'){
//                     State='L';
//                     
//                 }else if(c=='~'){
//                     State='M';//FINAL
//                 }
//                }
//                 }break;
//             case('B'):
//                 {
//                     if(c=='='){
//                         State='N';
//                     }
//                 
//                 }break;
//             case('C'):
//                 {
//                 if(c=='&'){
//                         State='O';
//                     }
//                 }break;
//             case('D'):{
//                 State='D';
//             }break;
//             case('E'):{
//                 State='E';
//             }break;
//             case('F'):{
//                State='F';
//             }break;
//             case('G'):{
//               if(c=='='){
//                         State='P';
//                     }else{
//                   State='G';
//               }
//             }break;
//             case('H'):
//                 {
//                if(c=='='){
//                    State='Q';
//                     }else{
//                   State='H';
//               }
//             }break;
//             case('I'):  
//                 {
//                     if(c=='='){
//                         State='R';
//                     }else{
//                   State='I';
//               }
//                 
//             }break;
//             case('J'):  
//                 {
//                 State='J';
//             }break;
//             case('K'):  
//                 {
//                 State='K';
//             }break;
//             case('L'):  
//                 {
//                     if(c=='|'){
//                         State='S';
//                 }
//                 
//                 
//             }break;
//             case('M'):  
//                 {
//                 State='M';
//                 
//             }break;
//             case('N'):  
//                 {
//                 State='N';
//                 
//             }break;
//             case('O'):  
//                 {
//                 State='O';
//                 
//             }break;
//             case('P'):  
//                 {
//                 State='P';
//                 
//             }break;
//             case('Q'):  
//                 {
//                 State='Q';
//                 
//             }break;
//             case('R'):  
//                 {
//                 State='R';     
//             }break;
//             case('S'):  
//                 {
//                 
//                 State='A';
//             }break; 
//        }     
//                
//         }
//         //System.out.println("Char  "+c);
//         //System.out.println("State  "+State);
//           if (State=='E'){
//              
//         System.out.println(L.getToken("."));     
//               ;
//        }else if(State=='D'){
//            System.out.println(L.getToken("-"));  
//           
//         }else if(State=='F'){
//             System.out.println( L.getToken("/")); 
//            ;
//        }else if(State=='G'){
//            System.out.println(L.getToken("<"));  
//            
//        }else if(State=='H'){
//             System.out.println( L.getToken("="));
//             System.out.println(c);
//        }else if(State=='I'){
//             System.out.println(L.getToken(">"));  
//             L.getToken(">");
//        }else if(State=='J'){
//            System.out.println(L.getToken("*")); 
//            L.getToken("*");
//        }else if(State=='K'){
//            System.out.println( L.getToken("+"));
//            L.getToken("+");
//        }
//         else if(State=='M'){
//            System.out.println( L.getToken("~")); 
//            L.getToken("~");
//        }
//        else if(State=='N'){
//            System.out.println(L.getToken("!="));  
//            L.getToken("!=");
//        }
//        else if(State=='O'){
//            System.out.println(L.getToken("&&")); 
//            L.getToken("&&");
//            System.out.println(c);
//         }
//         else if(State=='p'){
//            System.out.println(L.getToken("<="));
//            L.getToken("<=");
//        }
//        else if(State=='Q'){
//            System.out.println(L.getToken("==")); 
//           L.getToken("==");
//        }
//        else if(State=='R'){
//            System.out.println(L.getToken(">=")); 
//            L.getToken(">=");
//        }
//     
//     else if(State=='S'){
//        System.out.println(L.getToken(">=")); 
//        L.getToken(">=");
//     }
//    else{
//     System.out.println("F");  
//    } 
//     }
         
         
       // System.out.println(State);
         
   
     
          
             
    
    
                
    
    
    
    
>>>>>>> Stashed changes

