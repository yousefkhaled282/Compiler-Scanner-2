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
    public boolean SymbolDFA(String s){
     
    char State ='A';
     for (char c : s.toCharArray()){
         switch(State){
             case('A'):{
                 {
                 if(c=='!'){
                     State='B';
                 }else if(c=='&'){
                     State='C';
                     
                 }else if(c=='-'){
                     State='D';
                 }else if(c=='.'){
                     State='E';  //FINAL
                 }else if(c=='/'){
                     State='F'; //FINAL
                 }else if(c=='<'){
                     State='G';//FINAL
                 }else if(c=='='){
                     State='H'; //FINAL WITH FINAL
                 }else if(c=='>'){
                     State='I';//FINAL WITH FINAL
                 }else if(c=='*'){
                     State='J';//FINAL WITH FINAL
                 }else if(c=='+'){
                     State='K';//FINAL
                 }else if(c=='|'){
                     State='L';
                 }else if(c=='~'){
                     State='M';//FINAL
                 }
                }
                 }break;
             case('B'):
                 {
                     if(c=='='){
                         State='N';
                     }
                 
                 }break;
             case('C'):
                 {
                 if(c=='&'){
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
               if(c=='='){
                         State='P';
                     }else{
                   State='G';
               }
             }break;
             case('H'):
                 {
                if(c=='='){
                         State='Q';
                     }else{
                   State='H';
               }
             }break;
             case('I'):  
                 {
                     if(c=='='){
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
                     if(c=='|'){
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
         return true;
     }else if(State=='D'){
         return true;
     }else if(State=='F'){
         return true;
     }else if(State=='G'){
         return true;
     }else if(State=='H'){
         return true;
     }else if(State=='I'){
         return true;
     }else if(State=='J'){
         return true;
     }else if(State=='K'){
         return true;
     }
     else if(State=='M'){
         return true;
     }
     else if(State=='N'){
         return true;
     }
     else if(State=='O'){
         return true;
     }
     else if(State=='p'){
         return true;
     }
     else if(State=='Q'){
         return true;
     }
     else if(State=='R'){
        return true;
     }
     
     else if(State=='S'){
        return true;
     }
    else{
    return false;
    }
}}
