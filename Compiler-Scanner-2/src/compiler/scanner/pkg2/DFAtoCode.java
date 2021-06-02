/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiler.scanner.pkg2;

/**
 *
 * @author mode_
 */
public class DFAtoCode {
    public void SymbolDFA(String s){
     
    char State ='A';
    char[] c = s.toCharArray();//[=,=,+,*]
     for (int i=0;i<c.length;i++){
         switch(State){
             case('A'):{
                 {
                 if(c[i]=='!'){
                     State='B';
                 }else if(c[i]=='&'){
                     State='C';
                     
                 }else if(c[i]=='-'){
                     State='D';
                 }else if(c[i]=='.'){
                     State='E';  //FINAL
                 }else if(c[i]=='/'){
                     State='F'; //FINAL
                 }else if(c[i]=='<'){
                     State='G';//FINAL
                 }else if(c[i]=='='){
                     State='H'; //FINAL WITH FINAL
                 }else if(c[i]=='>'){
                     State='I';//FINAL WITH FINAL
                 }else if(c[i]=='*'){
                     State='J';//FINAL WITH FINAL
                 }else if(c[i]=='+'){
                     State='K';//FINAL
                 }else if(c[i]=='|'){
                     State='L';
                 }else if(c[i]=='~'){
                     State='M';//FINAL
                 }
                }
                 }break;
             case('B'):
                 {
                     if(c[i]=='='){
                         State='N';
                     }
                 
                 }break;
             case('C'):
                 {
                 if(c[i]=='&'){
                         State='O';
                     }
                 
                
                 }break;
             case('D'):{
                 State='D';
             }break;
             case('E'):{
                 State='E';
             }break;
             case('F'):{
                State='F';
             }break;
             case('G'):{
               if(c[i]=='='){
                         State='P';
                     }else{
                   State='G';
               }
             }break;
             case('H'):
                 {
                if(c[i]=='='){
                         State='Q';
                     }else{
                   State='H';
               }
             }break;
             case('I'):  
                 {
                     if(c[i]=='='){
                         State='R';
                     }else{
                   State='I';
               }
                 
             }break;
             case('J'):  
                 {
                 State='J';
             }break;
             case('K'):  
                 {
                 State='K';
             }break;
             case('L'):  
                 {
                     if(c[i]=='|'){
                         State='S';
                     }
                 
                 
             }break;
             case('M'):  
                 {
                 State='M';
             }break;
             case('N'):  
                 {
                 State='N';
             }break;
             case('O'):  
                 {
                 State='O';
             }break;
             case('P'):  
                 {
                 State='P';
             }break;
             case('Q'):  
                 {
                 State='Q';
             }break;
             case('R'):  
                 {
                 State='R';
             }break;
             case('S'):  
                 {
                 State='S';
             }break;
          
         }
     }
     if (State=='E'){
         System.out.println("E");         
     }else if(State=='D'){
        System.out.println("d");  
     }else if(State=='F'){
         System.out.println("f");  
     }else if(State=='G'){
        System.out.println("g");  
     }else if(State=='H'){
         System.out.println("h");  
     }else if(State=='I'){
        System.out.println("i");  
     }else if(State=='J'){
         System.out.println("j");  
     }else if(State=='K'){
         System.out.println("k");  
     }
     else if(State=='M'){
        System.out.println("m");  
     }
     else if(State=='N'){
         System.out.println("n");  
     }
     else if(State=='O'){
        System.out.println("o");  
     }
     else if(State=='p'){
         System.out.println("p");  
     }
     else if(State=='Q'){
         System.out.println("q");  
     }
     else if(State=='R'){
        System.out.println("r");  
     }
     
     else if(State=='S'){
        System.out.println("s");  
     }
    else{
     System.out.println("Flase");  
    }
}}
