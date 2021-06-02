/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiler.scanner.pkg2;

/**
 *
 * @author lenovo
 */
public class DFA_Identifier {

    public void IdentifierDFA(String s) {
        RegularExpression reg = new RegularExpression();
        char state = 'A';
        for (char c:s.toCharArray()) {
            switch (state) {
                case ('A'): {
                    if (reg.isAlaphabet(c)) {
                        state = 'B';
                    }else{
                        state='F';
                    }
                }break;
                case ('B'): {
                    if (reg.isAlaphabet(c)) {
                        state = 'D';
                        
                    } else if (reg.isNumber(c)) {
                        state = 'C';
                    }
                }break;
                case ('C'): {
                    if (reg.isAlaphabet(c)) {
                        state = 'D';
                    } else if (reg.isNumber(c)) {
                        state = 'C';
                    }
                }break;
                case ('D'): {
                   if (reg.isAlaphabet(c)) {
                       state = 'D';
                    } else if (reg.isNumber(c)) {
                        state = 'C';
                    }
              }break;
            }
        }
        if (state == 'B') {
            System.out.println("identifier");
        } else if (state == 'C') {
            System.out.println("identifier");

        } else if (state == 'D') {
            System.out.println("Identifier");

        } else {
            System.out.println("Not identifier");
            
        }
       
    }

    public void DFA_Constant(String s) {
        RegularExpression reg = new RegularExpression();
        char state = '1';
        for (char c:s.toCharArray()) {
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
