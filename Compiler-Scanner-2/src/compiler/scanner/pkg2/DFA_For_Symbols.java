
package compiler.scanner.pkg2;

public class DFA_For_Symbols {
    public static int noLex=0;
    public  String SymbolDFA(String s,int NoLine) {
            Lexeme L = new Lexeme();
String SymbolOutput="";
        char State = 'A';
        for (char c : s.toCharArray()) {
            // System.out.println("char "+c);

            switch (State) {
                case ('A'): {
                    {
                        if (c == '!') {
                            State = 'B';

                        } else if (c == '&') {
                            State = 'C';

                        } else if (c == ',') {
                            State = 'D';

                        } else if (c == '-') {
                            State = 'E';  //FINAL

                        } else if (c == '.') {
                            State = 'F'; //FINAL
                        } else if (c == '/') {
                            State = 'G';//FINAL
                        } else if (c == ')') {
                            State = 'H'; //FINAL WITH FINAL
                        } else if (c == '(') {
                            State = 'I';//FINAL WITH FINAL
                        } else if (c == ';') {
                            State = 'J';//FINAL WITH FINAL
                        } else if (c == '<') {
                            State = 'K';//FINAL
                        } else if (c == '=') {
                            State = 'L';

                        } else if (c == '>') {
                            State = 'M';

                        } else if (c == '@') {
                            State = 'N';

                        } else if (c == '*') {
                            State = 'O';

                        } else if (c == '+') {
                            State = 'P';

                        } else if (c == '[') {
                            State = 'Q';

                        } else if (c == ']') {
                            State = 'R';

                        } else if (c == '|') {
                            State = 'S';

                        } else if (c == '{') {
                            State = 'T';

                        } else if (c == '}') {
                            State = 'U';

                        } else if (c == '~') {
                            State = 'V';

                        }
                    }
                }
                break;
                case ('B'): {
                    if (c == '=') {
                        State = 'W';
                    }

                }
                break;
                case ('C'): {
                    if (c == '&') {
                        State = 'X';
                    }
                }
                break;
                case ('D'): {
                    State = 'A';  //Final State
                }
                break;
                case ('E'): {
                    State = 'A';    //Final State
                }
                break;
                case ('F'): {
                    State = 'A';    //Final State
                }
                break;
                case ('G'): {
                    State = 'A';    //Final State
                }
                break;
                case ('H'): {
                    State = 'A';    //Final State
                }
                break;
                case ('I'): {
                    State = 'A';    //Final State

                }
                break;
                case ('J'): {
                    State = 'A';    //Final State
                }
                break;
                case ('K'): {
                    if (c == '=') {
                        State = 'Y';
                    } else {
                        State = 'A';//Final State
                    }

                }
                break;
                case ('L'): {
                    if (c == '=') {
                        State = 'Z';
                    } else {
                        State = 'A';//Final State
                    }

                }
                break;
                case ('M'): {
                    if (c == '=') {
                        State = '1';
                    } else {
                        State = 'A';//Final State
                    }

                }
                break;
                case ('N'): {
                    State = 'A';    //Final State

                }
                break;
                case ('O'): {
                    State = 'A';    //Final State

                }
                break;
                case ('P'): {
                    State = 'A';    //Final State

                }
                break;
                case ('Q'): {
                    State = 'A';    //Final State

                }
                break;
                case ('R'): {
                    State = 'A';    //Final State
                }
                break;
                case ('S'): {

                    if (c == '|') {
                        State = '2';//Final State
                    }

                }
                break;
                case ('T'): {

                    State = 'A';    //Final State
                }
                break;
                case ('U'): {

                    State = 'A';    //Final State
                }
                break;
                case ('V'): {

                    State = 'A';    //Final State
                }
                break;
                case ('W'): {

                    State = 'A';    //Final State
                }
                break;
                case ('X'): {

                    State = 'A';    //Final State
                }
                break;
                case ('Y'): {

                    State = 'A';    //Final State
                }
                break;
                case ('Z'): {

                    State = 'A';    //Final State
                }
                break;
                case ('1'): {

                    State = 'A';    //Final State
                }
                break;
                case ('2'): {

                    State = 'A';    //Final State
                }
                break;
            }
            
            //------------------------------------------- Output-------------------------------------/////  
            //System.out.println("State  " + State);
            
            if (State == 'W') {
                noLex++;
                SymbolOutput+=NoLine+"\t"+"!="+"\t"+L.getToken("!=")+"\t"+noLex+"\t"+"Matched"+"\n";

            } else if (State == 'X') {   
                noLex++;
                SymbolOutput+=NoLine+"\t"+"&&"+"\t"+L.getToken("&&")+"\t"+noLex+"\t"+"Matched"+"\n";

            } else if (State == 'D') {
                noLex++;
                SymbolOutput+=NoLine+"\t"+","+"\t"+L.getToken(",")+"\t"+noLex+"\t"+"Matched"+"\n";

            } else if (State == 'E') {
                noLex++;
                SymbolOutput+=NoLine+"\t"+"-"+"\t"+L.getToken("-")+"\t"+noLex+"\t"+"Matched"+"\n";

            } else if (State == 'F') {
                  noLex++;              
              SymbolOutput+=NoLine+"\t"+"."+"\t"+L.getToken(".")+"\t"+noLex+"\t"+"Matched"+"\n";
            } else if (State == 'G') {
                noLex++;                
                SymbolOutput+=NoLine+"\t"+"/"+"\t"+L.getToken("/")+"\t"+noLex+"\t"+"Matched"+"\n";
            } else if (State == 'H') {
                noLex++;
             SymbolOutput+=NoLine+"\t"+")"+"\t"+L.getToken(")")+"\t"+noLex+"\t"+"Matched"+"\n";

            } else if (State == 'I') {
                noLex++;
                SymbolOutput+=NoLine+"\t"+"("+"\t"+L.getToken("(")+"\t"+noLex+"\t"+"Matched"+"\n";
            }else if (State == 'J') {   
                noLex++;

               SymbolOutput+=NoLine+"\t"+";"+"\t"+L.getToken(";")+"\t"+noLex+"\t"+"Matched"+"\n";
            } else if (State == 'K') {
                noLex++;
                SymbolOutput+=NoLine+"\t"+"<"+"\t"+L.getToken("<")+"\t"+noLex+"\t"+"Matched"+"\n";
            } else if (State == 'Y') {
                                noLex++;
                SymbolOutput+=NoLine+"\t"+"<="+"\t"+L.getToken("<=")+"\t"+noLex+"\t"+"Matched"+"\n";
            } else if (State == 'L') {                noLex++;

               SymbolOutput+=NoLine+"\t"+"="+"\t"+L.getToken("=")+"\t"+noLex+"\t"+"Matched"+"\n";
            } else if (State == 'Z') {                noLex++;

               SymbolOutput+=NoLine+"\t"+"=="+"\t"+L.getToken("==")+"\t"+noLex+"\t"+"Matched"+"\n";
            } else if (State == 'M') {                noLex++;

              SymbolOutput+=NoLine+"\t"+">"+"\t"+L.getToken(">")+"\t"+noLex+"\t"+"Matched"+"\n";

            } else if (State == '1') {                noLex++;

               SymbolOutput+=NoLine+"\t"+">="+"\t"+L.getToken(">=")+"\t"+noLex+"\t"+"Matched"+"\n";

            } else if (State == 'N') {                noLex++;

                SymbolOutput+=NoLine+"\t"+"@"+"\t"+L.getToken("@")+"\t"+noLex+"\t"+"Matched"+"\n";
            } else if (State == 'O') {                noLex++;

                SymbolOutput+=NoLine+"\t"+"*"+"\t"+L.getToken("*")+"\t"+noLex+"\t"+"Matched"+"\n";

            } else if (State == 'P') {                noLex++;

                SymbolOutput+=NoLine+"\t"+"+"+"\t"+L.getToken("+")+"\t"+noLex+"\t"+"Matched"+"\n";

            } else if (State == 'Q') {                noLex++;

                SymbolOutput+=NoLine+"\t"+"["+"\t"+L.getToken("[")+"\t"+noLex+"\t"+"Matched"+"\n";

            } else if (State == 'R') {                noLex++;

                SymbolOutput+=NoLine+"\t"+"]"+"\t"+L.getToken("]")+"\t"+noLex+"\t"+"Matched"+"\n";

            } else if (State == '2') {                noLex++;

               SymbolOutput+=NoLine+"\t"+"||"+"\t"+L.getToken("||")+"\t"+noLex+"\t"+"Matched"+"\n";

            } else if (State == 'T') {                noLex++;

                SymbolOutput+=NoLine+"\t"+"}"+"\t"+L.getToken("}")+"\t"+noLex+"\t"+"Matched"+"\n";

            } else if (State == 'U') {                noLex++;

                SymbolOutput+=NoLine+"\t"+"{"+"\t"+L.getToken("{")+"\t"+noLex+"\t"+"Matched"+"\n";

            } else if (State == 'V') {                noLex++;

                SymbolOutput+=NoLine+"\t"+"~"+"\t"+L.getToken("~")+"\t"+noLex+"\t"+"Matched"+"\n";

            } 

//            else {
//                System.out.println("FALSE");
//            }
//--------------------------------------------------------------/ 
         //   System.out.println("State befor Repeat  " + State);
//--------------------------------------------REPEATER------------------------------------------------------------------------//            
            if (State == 'A') {
                switch (State) {
                    
                    case ('A'): {
                        {
                            if (c == '!') {
                                State = 'B';

                            } else if (c == '&') {
                                State = 'C';

                            } else if (c == ',') {
                                State = 'D';

                            } else if (c == '-') {
                                State = 'E';  //FINAL

                            } else if (c == '.') {
                                State = 'F'; //FINAL
                            } else if (c == '/') {
                                State = 'G';//FINAL
                            } else if (c == ')') {
                                State = 'H'; //FINAL WITH FINAL
                            } else if (c == '(') {
                                State = 'I';//FINAL WITH FINAL
                            } else if (c == ';') {
                                State = 'J';//FINAL WITH FINAL
                            } else if (c == '<') {
                                State = 'K';//FINAL
                            } else if (c == '=') {
                                State = 'L';

                            } else if (c == '>') {
                                State = 'M';

                            } else if (c == '@') {
                                State = 'N';

                            } else if (c == '*') {
                                State = 'O';

                            } else if (c == '+') {
                                State = 'P';

                            } else if (c == '[') {
                                State = 'Q';

                            } else if (c == ']') {
                                State = 'R';

                            } else if (c == '|') {
                                State = 'S';

                            } else if (c == '{') {
                                State = 'T';

                            } else if (c == '}') {
                                State = 'U';

                            } else if (c == '~') {
                                State = 'V';

                            }
                        }
                    }
                    break;
                    case ('B'): {
                        if (c == '=') {
                            State = 'W';
                        }

                    }
                    break;
                    case ('C'): {
                        if (c == '&') {
                            State = 'X';
                        }
                    }
                    break;
                    case ('D'): {
                        State = 'D';  //Final State
                    }
                    break;
                    case ('E'): {
                        State = 'E';    //Final State
                    }
                    break;
                    case ('F'): {
                        State = 'F';    //Final State
                    }
                    break;
                    case ('G'): {
                        State = 'G';    //Final State
                    }
                    break;
                    case ('H'): {
                        State = 'H';    //Final State
                    }
                    break;
                    case ('I'): {
                        State = 'I';    //Final State

                    }
                    break;
                    case ('J'): {
                        State = 'J';    //Final State
                    }
                    break;
                    case ('K'): {
                        if (c == '=') {
                            State = 'Y';
                        } else {
                            State = 'K';//Final State
                        }

                    }
                    break;
                    case ('L'): {
                        if (c == '=') {
                            State = 'Z';
                        } else {
                            State = 'A';//Final State
                        }

                    }
                    break;
                    case ('M'): {
                        if (c == '=') {
                            State = '1';
                        } else {
                            State = 'M';//Final State
                        }

                    }
                    break;
                    case ('N'): {
                        State = 'N';    //Final State

                    }
                    break;
                    case ('O'): {
                        State = 'O';    //Final State

                    }
                    break;
                    case ('P'): {
                        State = 'P';    //Final State

                    }
                    break;
                    case ('Q'): {
                        State = 'Q';    //Final State

                    }
                    break;
                    case ('R'): {
                        State = 'R';    //Final State
                    }
                    break;
                    case ('S'): {

                        if (c == '|') {
                            State = '2';//Final State
                        }

                    }
                    break;
                    case ('T'): {

                        State = 'T';    //Final State
                    }
                    break;
                    case ('U'): {

                        State = 'U';    //Final State
                    }
                    break;
                    case ('V'): {

                        State = 'V';    //Final State
                    }
                    break;
                    case ('W'): {

                        State = 'W';    //Final State
                    }
                    break;
                    case ('X'): {

                        State = 'X';    //Final State
                    }
                    break;
                    case ('Y'): {

                        State = 'Y';    //Final State
                    }
                    break;
                    case ('Z'): {

                        State = 'Z';    //Final State
                    }
                    break;
                    case ('1'): {

                        State = '1';    //Final State
                    }
                    break;
                    case ('2'): {

                        State = '2';    //Final State
                    }
                    break;
                }
            }

        }

        //System.out.println("Char  "+c);
        return SymbolOutput;
    }
}
