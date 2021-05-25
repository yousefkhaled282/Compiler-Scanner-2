/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiler.scanner.pkg2;

import static java.lang.Character.isAlphabetic;
import static java.lang.Character.*;

/**
 *
 * @author Mustafa Mahmoud
 */
public class RegularExpression {
    public static final String ALPHABET="a b c d e f g h i j k l m n o p q r s t u v w x y z _ " +
            "Q W E R T Y U I O P A S D F G H J K L Z X C V B N M";
    public static final String NUMBER=" 0 1 2 3 4 5 6 7 8 9";
    public static boolean isAlaphabet(String token){return ALPHABET.contains(token);}
    public static boolean isNumber(String token){return NUMBER.contains(token);}
    
    
}
    
