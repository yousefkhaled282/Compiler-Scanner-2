/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiler.scanner.pkg2;

/**
 *
 * @author Mustafa Mahmoud
 */
public class DFA_Lexema {
    public String LexemaDFA(String s)
    {
        String result = "";
         String State = "A";
        for (char c : s.toCharArray()) {
            // System.out.println("char "+c);

            switch (State) {
                case ("A"): {

                    if (c == 'B') {
                        State = "B";
                    } else if (c == 'C') {
                        State = "C";
                    } else if (c == 'D') {
                        State = "D";
                    } else if (c == 'E') {
                        State = "E"; //FINAL
                    } else if (c == 'F') {
                        State = "F"; //FINAL
                    } else if (c == 'I') {
                        State = "G";//FINAL
                    } else if (c == 'N') {
                        State = "H"; //FINAL WITH FINAL
                    } else if (c == 'R') {
                        State = "I";//FINAL WITH FINAL
                    } else if (c == 'S') {
                        State = "J";//FINAL WITH FINAL
                    } else if (c == 'T') {
                        State = "K";//FINAL
                    } else if (c == 'U') {
                        State = "L";
                    } else if (c == 'W') {
                        State = "M";//FINAL
                    }
                    else{State = "False";}break;

                }
                
                case "B": {
                    if (c == 'a') {
                        State = "N";
                    } else if (c == 'o') {
                        State = "O";
                    }
                    else{State = "False";}break;
                }
                case "N": {
                    if (c == 'c') {
                        State = "AF";
                    }
                    else{State = "False";}break;
                }
                case "AF": {
                    if (c == 'k') {
                        State = "AX";
                    }
                    else{State = "False";}break;
                }
                case "AX": {
                    if (c == 'e') {
                        State = "BL";
                    }
                    else{State = "False";}break;
                }
                case "BL": {
                    if (c == 'd') {
                        State = "BW";
                    }
                    else{State = "False";}break;
                }
                case "BW": {
                    if (c == 'v') {
                        State = "CG";
                    }
                    else{State = "False";}break;
                }
                case "CG": {
                    if (c == 'a') {
                        State = "CQ";
                    }
                    else{State = "False";}break;
                }
                case "CQ": {
                    if (c == 'l') {
                        State = "CZ";
                    }
                    else{State = "False";}break;
                }
                case "CZ": {
                    if (c == 'u') {
                        State = "DG";
                    }
                    else{State = "False";}break;
                }
                case "DG": {
                    if (c == 'e') {
                        State = "DL";
                    }
                    else{State = "False";}break;
                }
                case "DL": {
                    if (c == '@') {
                        State = "BA";
                    }
                    else{State = "False";}break;
                }
                case "O": {
                    if (c == 'g') {
                        State = "AG";
                    }
                    else{State = "False";}break;
                }
                case "AG": {
                    if (c == 'i') {
                        State = "AY";
                    }
                    else{State = "False";}break;
                }
                case "AY": {
                    if (c == 'n') {
                        State = "BM";
                    }
                    else{State = "False";}break;
                }
                case "BM": {
                    if (c == 'n') {
                        State = "BX";
                    }
                    else{State = "False";}break;
                }
                case "BX": {
                    if (c == 'i') {
                        State = "CH";
                    }
                    else{State = "False";}break;
                }
                case "CH": {
                    if (c == 'n') {
                        State = "CR";
                    }
                    else{State = "False";}break;
                }
                case "CR": {
                    if (c == 'g') {
                        State = "DA";
                    }
                    else{State = "False";}break;
                }
                case "DA": {
                    if (c == '@') {
                        State = "BA";
                    }
                    else{State = "False";}break;
                }
                case "C": {
                    if (c == 'h') {
                        State = "P";
                    } else if (c == 'l') {
                        State = "Q";
                    }
                    else{State = "False";}break;
                }
                case "P": {
                    if (c == 'e') {
                        State = "AH";
                    }
                    else{State = "False";}break;
                }
                case "AH": {
                    if (c == 'c') {
                        State = "AZ";
                    }
                    else{State = "False";}break;
                }
                case "AZ": {
                    if (c == 'k') {
                        State = "BN";
                    }
                    else{State = "False";}break;
                }
                case "BN": {
                    if (c == '-') {
                        State = "BY";
                    }
                    else{State = "False";}break;
                }
                case "BY": {
                    if (c == 'C') {
                        State = "CI";
                    }
                    else{State = "False";}break;
                }
                case "CI": {
                    if (c == 'a') {
                        State = "CS";
                    }
                    else{State = "False";}break;
                }
                case "CS": {
                    if (c == 's') {
                        State = "DB";
                    }
                    else{State = "False";}break;
                }
                case "DB": {
                    if (c == 'e') {
                        State = "DH";
                    }
                    else{State = "False";}break;
                }
                case "DH": {
                    if (c == 'O') {
                        State = "DM";
                    }
                    else{State = "False";}break;
                }
                case "DM": {
                    if (c == 'f') {
                        State = "DQ";
                    }
                    else{State = "False";}break;
                }
                case "DQ": {
                    if (c == '@') {
                        State = "BA";
                    }
                    else{State = "False";}break;
                }
                case "Q": {
                    if (c == 'o') {
                        State = "AI";
                    }
                    else{State = "False";}break;
                }
                case "AI": {
                    if (c == '@') {
                        State = "BA";
                    }
                    else{State = "False";}break;
                }
                case "D": {
                    if (c == 'i') {
                        State = "R";
                    }
                    else{State = "False";}break;
                }
                case "R": {
                    if (c == 'v') {
                        State = "AJ";
                    }
                    else{State = "False";}break;
                }
                case "AJ": {
                    if (c == 'i') {
                        State = "BB";
                    }
                    else{State = "False";}break;
                }
                case "BB": {
                    if (c == 's') {
                        State = "BO";
                    }
                    else{State = "False";}break;
                }
                case "BO": {
                    if (c == 'i') {
                        State = "BZ";
                    }
                    else{State = "False";}break;
                }
                case "BZ": {
                    if (c == 'o') {
                        State = "CJ";
                    }
                    else{State = "False";}break;
                }
                case "CJ": {
                    if (c == '@') {
                        State = "BA";
                    }
                    else{State = "False";}break;
                }
                case "E": {
                    if (c == 'n') {
                        State = "S";
                    }
                    else{State = "False";}break;
                }
                case "S": {
                    if (c == 'd') {
                        State = "AK";
                    }
                    else{State = "False";}break;
                }
                case "AK": {
                    if (c == '@') {
                        State = "BA";
                    }
                    else{State = "False";}break;
                }
                case "F": {
                    if (c == 'B') {
                        State = "T";
                    }
                    else{State = "False";}break;
                }
                case "T": {
                    if (c == 'U') {
                        State = "AL";
                    }
                    else{State = "False";}break;
                }
                case "AL": {
                    if (c == '@') {
                        State = "BA";
                    }
                    else{State = "False";}break;
                }
                case "G": {
                    if (c == 'n') {
                        State = "U";
                    } else if (c == 'r') {
                        State = "V";
                    }
                    else{State = "False";}break;
                }
                case "U": {
                    if (c == 'f') {
                        State = "AM";
                    }
                    else{State = "False";}break;
                }
                case "AM": {
                    if (c == 'e') {
                        State = "BC";
                    }
                    else{State = "False";}break;
                }
                case "BC": {
                    if (c == 'r') {
                        State = "BP";
                    }
                    else{State = "False";}break;
                }
                case "BP": {
                    if (c == 'e') {
                        State = "CA";
                    }
                    else{State = "False";}break;
                }
                case "CA": {
                    if (c == 'd') {
                        State = "CK";
                    }
                    else{State = "False";}break;
                }
                case "CK": {
                    if (c == 'F') {
                        State = "CT";
                    }
                    else{State = "False";}break;
                }
                case "CT": {
                    if (c == 'r') {
                        State = "DC";
                    }
                    else{State = "False";}break;
                }
                case "DC": {
                    if (c == 'o') {
                        State = "DI";
                    }
                    else{State = "False";}break;
                }
                case "DI": {
                    if (c == 'm') {
                        State = "DN";
                    }
                    else{State = "False";}break;
                }
                case "DN": {
                    if (c == '@') {
                        State = "BA";
                    }
                    else{State = "False";}break;
                }
                case "V": {
                    if (c == 'e') {
                        State = "AN";
                    }
                    else{State = "False";}break;
                }
                case "AN": {
                    if (c == '@') {
                        State = "BA";
                    }
                    else{State = "False";}break;
                }
                case "H": {
                    if (c == 'o') {
                        State = "W";
                    }
                    else{State = "False";}break;
                }
                case "W": {
                    if (c == 'n') {
                        State = "AO";
                    }
                    else{State = "False";}break;
                }
                case "AO": {
                    if (c == 'e') {
                        State = "BD";
                    }
                    else{State = "False";}break;
                }
                case "BD": {
                    if (c == 'V') {
                        State = "BQ";
                    }
                    else{State = "False";}break;
                }
                case "BQ": {
                    if (c == 'a') {
                        State = "CB";
                    }
                    else{State = "False";}break;
                }
                case "CB": {
                    if (c == 'l') {
                        State = "CL";
                    }
                    else{State = "False";}break;
                }
                case "CL": {
                    if (c == 'u') {
                        State = "CU";
                    }
                    else{State = "False";}break;
                }
                case "CU": {
                    if (c == 'e') {
                        State = "DD";
                    }
                    else{State = "False";}break;
                }
                case "DD": {
                    if (c == '@') {
                        State = "BA";
                    }
                    else{State = "False";}break;
                }
                case "I": {
                    if (c == 'i') {
                        State = "X";
                    }
                    else{State = "False";}break;
                }
                case "X": {
                    if (c == 'n') {
                        State = "AP";
                    }
                    else{State = "False";}break;
                }
                case "AP": {
                    if (c == 'g') {
                        State = "BE";
                    }
                    else{State = "False";}break;
                }
                case "BE": {
                    if (c == 'W') {
                        State = "BR";
                    }
                    else{State = "False";}break;
                }
                case "BR": {
                    if (c == 'h') {
                        State = "CC";
                    }
                    else{State = "False";}break;
                }
                case "CC": {
                    if (c == 'e') {
                        State = "CM";
                    }
                    else{State = "False";}break;
                }
                case "CM": {
                    if (c == 'n') {
                        State = "CV";
                    }
                    else{State = "False";}break;
                }
                case "CV": {
                    if (c == '@') {
                        State = "BA";
                    }
                    else{State = "False";}break;
                }
                case "J": {
                    if (c == 'F') {
                        State = "Y";
                    } else if (c == 'T') {
                        State = "Z";
                    } else if (c == 'e') {
                        State = "AA";
                    } else if (c == 'i') {
                        State = "AB";
                    }
                    else{State = "False";}break;
                }
                case "Y": {
                    if (c == 'B') {
                        State = "AQ";
                    }
                    else{State = "False";}break;
                }
                case "AQ": {
                    if (c == 'U') {
                        State = "BF";
                    }
                    else{State = "False";}break;
                }
                case "BF": {
                    if (c == '@') {
                        State = "BA";
                    }
                    else{State = "False";}break;
                }
                case "Z": {
                    if (c == 'T') {
                        State = "AR";
                    }
                    else{State = "False";}break;
                }
                case "AR": {
                    if (c == '@') {
                        State = "BA";
                    }
                    else{State = "False";}break;
                }
                case "AA": {
                    if (c == 't') {
                        State = "AS";
                    }
                    else{State = "False";}break;
                }
                case "AS": {
                    if (c == 'o') {
                        State = "BG";
                    }
                    else{State = "False";}break;
                }
                case "BG": {
                    if (c == 'f') {
                        State = "BS";
                    }
                    else{State = "False";}break;
                }
                case "BS": {
                    if (c == 'C') {
                        State = "CD";
                    }
                    else{State = "False";}break;
                }
                case "CD": {
                    if (c == 'l') {
                        State = "CN";
                    }
                    else{State = "False";}break;
                }
                case "CN": {
                    if (c == 'o') {
                        State = "CW";
                    }
                    else{State = "False";}break;
                }
                case "CW": {
                    if (c == '@') {
                        State = "BA";
                    }
                    else{State = "False";}break;
                }
                case "AB": {
                    if (c == 'r') {
                        State = "AT";
                    }
                    else{State = "False";}break;
                }
                case "AT": {
                    if (c == 'e') {
                        State = "BH";
                    }
                    else{State = "False";}break;
                }
                case "BH": {
                    if (c == 'e') {
                        State = "AC";
                    }
                    else{State = "False";}break;
                }
                case "AC": {
                    if (c == 'r') {
                        State = "AU";
                    }
                    else{State = "False";}break;
                }
                case "AU": {
                    if (c == 'm') {
                        State = "BI";
                    }
                    else{State = "False";}break;
                }
                case "BI": {
                    if (c == 'i') {
                        State = "BT";
                    }
                    else{State = "False";}break;
                }
                case "BT": {
                    if (c == 'n') {
                        State = "CE";
                    }
                    else{State = "False";}break;
                }
                case "CE": {
                    if (c == 'a') {
                        State = "CO";
                    }
                    else{State = "False";}break;
                }
                case "CO": {
                    if (c == 't') {
                        State = "CX";
                    }
                    else{State = "False";}break;
                }
                case "CX": {
                    if (c == 'e') {
                        State = "DE";
                    }
                    else{State = "False";}break;
                }
                case "DE": {
                    if (c == 'T') {
                        State = "DJ";
                    }
                    else{State = "False";}break;
                }
                case "DJ": {
                    if (c == 'h') {
                        State = "DO";
                    }
                    else{State = "False";}break;
                }
                case "DO": {
                    if (c == 'i') {
                        State = "DR";
                    }
                    else{State = "False";}break;
                }
                case "DR": {
                    if (c == 's') {
                        State = "DT";
                    }
                    else{State = "False";}break;
                }
                case "DT": {
                    if (c == 'N') {
                        State = "DV";
                    }
                    else{State = "False";}break;
                }
                case "DV": {
                    if (c == 'o') {
                        State = "DX";
                    }
                    else{State = "False";}break;
                }
                case "DX": {
                    if (c == 'W') {
                        State = "DY";
                    }
                    else{State = "False";}break;
                }
                case "DY": {
                    if (c == '@') {
                        State = "BA";
                    }
                    else{State = "False";}break;
                }
                case "L": {
                    if (c == 's') {
                        State = "AD";
                    }
                    else{State = "False";}break;
                }
                case "AD": {
                    if (c == 'i') {
                        State = "AV";
                    }
                    else{State = "False";}break;
                }
                case "AV": {
                    if (c == 'n') {
                        State = "BJ";
                    }
                    else{State = "False";}break;
                }
                case "BJ": {
                    if (c == 'g') {
                        State = "BU";
                    }
                    else{State = "False";}break;
                }
                case "BU": {
                    if (c == '@') {
                        State = "BA";
                    }
                    else{State = "False";}break;
                }
                case "M": {
                    if (c == 'h') {
                        State = "AE";
                    }
                    else{State = "False";}break;
                }
                case "AE": {
                    if (c == 'e') {
                        State = "AW";
                    }
                    else{State = "False";}break;
                }
                case "AW": {
                    if (c == 't') {
                        State = "BK";
                    }
                    else{State = "False";}break;
                }
                case "BK": {
                    if (c == 'h') {
                        State = "BV";
                    }
                    else{State = "False";}break;
                }
                case "BV": {
                    if (c == 'e') {
                        State = "CF";
                    }
                    else{State = "False";}break;
                }
                case "CF": {
                    if (c == 'r') {
                        State = "CP";
                    }
                    else{State = "False";}break;
                }
                case "CP": {
                    if (c == 'D') {
                        State = "CY";
                    }
                    else{State = "False";}break;
                }
                case "CY": {
                    if (c == 'o') {
                        State = "DF";
                    }
                    else{State = "False";}break;
                }
                case "DF": {
                    if (c == '-') {
                        State = "DK";
                    }
                    else{State = "False";}break;
                }
                case "DK": {
                    if (c == 'E') {
                        State = "DP";
                    }
                    else{State = "False";}break;
                }
                case "DP": {
                    if (c == 'l') {
                        State = "DS";
                    }
                    else{State = "False";}break;
                }
                case "DS": {
                    if (c == 's') {
                        State = "DU";
                    }
                    else{State = "False";}break;
                }
                case "DU": {
                    if (c == 'e') {
                        State = "DW";
                    }
                    else{State = "False";}break;
                }
                case "DW": {
                    if (c == '@') {
                        State = "BA";
                    }
                    else{State = "False";}break;
                }
                case "BA": {
                    State = "BA";
                    result = "BA";
                }
                

            }
            
//        System.out.println("inter "+i);
            //System.out.println("Char " + c);
           // System.out.println("State " + State);
              
        }
        if (State == "BA") {
                System.out.println("Lexema");
            } 
        
        return result;
    }
}
