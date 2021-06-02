
package compiler.scanner.pkg2;

public class DFA_For_Symbols {

    Lexeme L = new Lexeme();

    public void SymbolDFA(String s) {
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

                    if (c == '0') {
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

                System.out.println(L.getToken("!="));

            } else if (State == 'X') {
                System.out.println(L.getToken("&&"));

            } else if (State == 'D') {
                System.out.println(L.getToken(","));

            } else if (State == 'E') {
                System.out.println(L.getToken("-"));

            } else if (State == 'F') {
                System.out.println(L.getToken("."));

            } else if (State == 'G') {
                System.out.println(L.getToken("/"));

            } else if (State == 'H') {
                System.out.println(L.getToken(")"));

            } else if (State == 'I') {
                System.out.println(L.getToken("("));

            }else if (State == 'J') {
                System.out.println(L.getToken(";"));

            } else if (State == 'K') {
                System.out.println(L.getToken("<"));

            } else if (State == 'Y') {
                System.out.println(L.getToken("<="));

            } else if (State == 'L') {
                System.out.println(L.getToken("="));

            } else if (State == 'Z') {
                System.out.println(L.getToken("=="));

            } else if (State == 'M') {
                System.out.println(L.getToken(">"));

            } else if (State == '1') {
                System.out.println(L.getToken(">="));

            } else if (State == 'N') {
                System.out.println(L.getToken("@"));

            } else if (State == 'O') {
                System.out.println(L.getToken("*"));

            } else if (State == 'P') {
                System.out.println(L.getToken("+"));

            } else if (State == 'Q') {
                System.out.println(L.getToken("["));

            } else if (State == 'R') {
                System.out.println(L.getToken("]"));

            } else if (State == '2') {
                System.out.println(L.getToken("||"));

            } else if (State == 'T') {
                System.out.println(L.getToken("}"));

            } else if (State == 'U') {
                System.out.println(L.getToken("}"));

            } else if (State == 'V') {
                System.out.println(L.getToken("~"));

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

                        if (c == '0') {
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
    }
}
