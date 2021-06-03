/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiler.scanner.pkg2;

import java.util.ArrayList;

/**
 *
 * @author lenovo
 */
public class DFA_Identifier {

    public void IdentifierDFA(String s) {
        RegularExpression reg = new RegularExpression();
        char state = 'A';
        ScannerString sc =new ScannerString(s);
         ArrayList<Character> ch = new ArrayList<>();//Arraylist for add found Lexemes
        for (char c:sc.toCharArray()) {
            switch (state) {
                case ('A'): {
                    if (reg.isAlaphabet(c)) {
                        state = 'B';
                        ch.add(c);
                    }else{
                        state='F';
                        ch.add(c);
                    }
                }break;
                case ('B'): {
                    if (reg.isAlaphabet(c)) {
                        state = 'D';  
                        ch.add(c);

                        
                    } else if (reg.isNumber(c)) {
                        state = 'C';
                                                ch.add(c);

                    }
                }break;
                case ('C'): {
                    if (reg.isAlaphabet(c)) {
                        state = 'D';                   
                        ch.add(c);

                    } else if (reg.isNumber(c)) {
                        state = 'C';
                          ch.add(c);

                    }
                }break;
                case ('D'): {
                   if (reg.isAlaphabet(c)) {
                       state = 'D';   
                       ch.add(c);

                    } else if (reg.isNumber(c)) {
                        state = 'C';
                        ch.add(c);

                    }
              }break;
            }
        }
        if (state == 'B') {
            System.out.println("identifier"+ch);
        } else if (state == 'C') {
            System.out.println("identifier");

        } else if (state == 'D') {
            System.out.println("Identifier"+ch);

        } else {
            System.out.println("Not identifier"+ch);
            
        }
       
    }

    public void DFA_Constant(String s) {
        RegularExpression reg = new RegularExpression();
        char state = '1';
        ScannerString sc =new ScannerString(s);
        for (char c:sc.toCharArray()) {
            switch (state) {
                case ('1'): {
                    if (reg.isNumber(c)) {
                        state = '2';
                    }
                }break;
                case ('2'): {
                    if (reg.isNumber(c)) {
                        state = '2';
                    }
                }break;

            }
        }
        if(state=='2'){
            System.out.println("Constant");
        }
        else{
            System.out.println("Not Constant");
        }

    }

}
