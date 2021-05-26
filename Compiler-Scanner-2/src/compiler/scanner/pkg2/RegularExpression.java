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
    public static final char[] ALPHABET={'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n' ,'o' ,'p' ,'q' ,'r' ,'s' ,'t', 'u','v', 'w', 'x', 'y', 'z', '_' ,'Q', 'W','E', 'R', 'T', 'Y', 'U', 'I', 'O', 'P', 'A', 'S', 'D', 'F', 'G', 'H', 'J' ,'K' ,'L', 'Z', 'X', 'C', 'V' ,'B' ,'N','M'};
    public static final char[] NUMBER={'0','1', '2', '3', '4', '5', '6', '7', '8', '9'};
    public static boolean isAlaphabet(char token)
    {
        boolean result = false;
         for(int i=0;i<53;i++)
        {
            if(token == ALPHABET[i])
            {
                result = true;
            }
        }
        return result;
    }
     public static boolean isNumber(char token)
     {  
         boolean result = false;
         for(int i=0;i<10;i++)
        {
            if(token == NUMBER[i])
            {
                result = true;
            }
        }
        return result;
    }
    
    public static boolean isIdentefier(String Token)
    {
        boolean result = false;
        for(int i=0;i<Token.length();i++)
        {
            char c = Token.charAt(i);
            if(i==0)
            {
                if(isNumber(c))
                {
                    return false;
                }
            }
            else if(isNumber(c) || isAlaphabet(c))
            {
                result = true;
            }
            else if(c == ' ')
            {
                return false;
            }
        }
        return result;        
    }
    
}
    
    