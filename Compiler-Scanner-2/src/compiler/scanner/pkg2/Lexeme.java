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
class Lexeme {

    public static final char[] NUMBER = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    public static final char[] Symbols = {'+', '-', '*', '/', '=', '&', ';', '>', '<', '{', '}', '[', ']', '|', '@', '!', '~', '\'', '\"', '.', '(', ')', '|', '&', '~'};

    public boolean isSymbol(char token) {
        boolean result = false;
        for (int i = 0; i < Symbols.length; i++) {
            if (token == Symbols[i]) {
                result = true;

            }
        }
        return result;
    }

    public boolean isNumber(char token) {
        boolean result = false;
        for (int i = 0; i < 10; i++) {
            if (token == NUMBER[i]) {
                result = true;
            }
        }
        return result;
    }

    public boolean isConstant(String Token) {
        boolean result = false;
        for (int i = 0; i < Token.length(); i++) {
            char c = Token.charAt(i);

            if (isNumber(c)) {
                result = true;
            } else {
                return false;
            }

        }
        return result;
    }

    public final String[] Lex = {"Divisio", "InferedFrom",
        "WhetherDo", "Else", "Ire", "Sire", "Clo", "SetOfClo", "FBU", "SFBU", "NoneValue",
        "TerminateThisNow", "RingWhen", "BackedValue", "STT", "Check", "CaseOf",
        "Beginning", "End", "+", "-", "*",
        "/", "&&", "||", "~", "==",
        "<", ">", "!=", "<=", ">=",
        "=", ".", "{", "}", "[", "]",
        "'", "", "Using", "/#", "#/",
        "/-", "@", ";", "(", ")"};

    public boolean isLex(String token) {
        for (int i = 0; i < Lex.length; i++) {
            if (Lex[i].equals(token)) {
                return true;
            }
        }
        return false;
    }

    public static String getToken(String token) {
        switch (token) {
            case "Divisio":
                return "Class";
            case "InferedFrom":
                return "Inheritance";
            case "WhetherDo":
                return "Condition";
            case "Else":
                return "Condition";
            case "Ire":
                return "Integer";
            case "Sire":
                return "SInteger";
            case "Clo":
                return "Character";
            case "SetOfClo":
                return "String";
            case "FBU":
                return "Float";
            case "SFBU":
                return "SFloat";
            case "NoneValue":
                return "Void";
            case "TerminateThisNow":
                return "Break";
            case "RingWhen":
                return "Loop";
            case "BackedValue":
                return "Return";
            case "STT":
                return "Struct";
            case "Check":
                return "Switch";
            case "CaseOf":
                return "Case";
            case "Beginning":
                return "Start Statement";
            case "End":
                return "End Statement";
            case "+":
            case "-":
            case "*":
            case "/":
                return "Airthmetic OP";
            case "&&":
            case "||":
            case "~":
                return "Logic operators";
            case "==":
            case "<":
            case ">":
            case "!=":
            case "<=":
            case ">=":
                return "relational operators";
            case "=":
                return "Assignment operator";
            case ".":
                return "Access Operator";
            case "}":
            case "{":
            case "(":
            case ")":
            case "[":
            case "]":
                return "Braces";
            case "'":
            case "\"":
                return "Quotation Mark";
            case "Using":
                return "Inclusion";
            case "/#":
            case "#/":
            case "/-":
                return "Comment";
            case "@":
            case ";":
                return "Delimiter";
            default:
                return "Not Exist";
        }
    }

}
