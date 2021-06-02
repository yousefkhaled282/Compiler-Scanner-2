/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiler.scanner.pkg2;

import static compiler.scanner.pkg2.DFA_For_Symbols.noLex;

/**
 *
 * @author mode_
 */
public class DFA_Keywords {

    public static String keywordDFa(String s,int NoLine) {
        String State = "A";
        Lexeme L = new Lexeme();
        String KeyWordOutput="";
        for (char c : s.toCharArray()) {
            switch (State) {
///////////////////------=---------------cOLUM1---------------------------------------------------------------------------------------------------////                
                case ("A"): {
                    if (c == 'B') {
                        State = "B";

                    } else if (c == 'C') {
                        State = "C";

                    } else if (c == 'D') {
                        State = "D";

                    } else if (c == 'E') {
                        State = "E";  

                    } else if (c == 'F') {
                        State = "F"; 
                    } else if (c == 'I') {
                        State = "G";
                    } else if (c == 'N') {
                        State = "H"; 
                    } else if (c == 'R') {
                        State = "I";
                    } else if (c == 'S') {
                        State = "J";
                    } else if (c == 'T') {
                        State = "K";
                    } else if (c == 'U') {
                        State = "L";

                    } else if (c == 'W') {
                        State = "M";

                    } else {
                        State = "0";
                    }
                }
                break;
///////////////////------=---------------cOLUM2---------------------------------------------------------------------------------------------------////
                case ("B"): {
                    if (c == 'a') {
                        State = "N";
                    } else if (c == 'e') {
                        State = "O";
                    } else {
                        State = "0";
                    }

                }
                break;
                case ("C"): {
                    if (c == 'h') {
                        State = "P";
                    } else if (c == 'l') {
                        State = "Q";
                    } else {
                        State = "0";
                    }

                }
                break;
                case ("D"): {
                    if (c == 'i') {
                        State = "R";

                    } else {
                        State = "0";
                    }

                }
                break;
                case ("E"): {
                    if (c == 'n') {
                        State = "S";

                    } else {
                        State = "0";
                    }

                }
                break;
                case ("F"): {
                    if (c == 'B') {
                        State = "T";

                    } else {
                        State = "0";
                    }

                }
                break;
                case ("G"): {
                    if (c == 'n') {
                        State = "U";
                    } else if (c == 'r') {
                        State = "V";
                    } else {
                        State = "0";
                    }

                }
                break;
                case ("H"): {
                    if (c == 'o') {
                        State = "W";

                    } else {
                        State = "0";
                    }

                }
                break;
                case ("I"): {
                    if (c == 'i') {
                        State = "X";

                    } else {
                        State = "0";
                    }

                }
                break;
                case ("J"): {
                    if (c == 'F') {
                        State = "Y";
                    } else if (c == 'T') {
                        State = "AR";
                    } else if (c == 'e') {
                        State = "AA";
                    } else if (c == 'i') {
                        State = "AB";
                    } else {
                        State = "0";
                    }

                }
                break;
                case ("K"): {
                    if (c == 'e') {
                        State = "AC";

                    } else {
                        State = "0";
                    }

                }
                break;
                case ("L"): {
                    if (c == 's') {
                        State = "AD";

                    } else {
                        State = "0";
                    }

                }
                break;
                case ("M"): {
                    if (c == 'h') {
                        State = "AE";

                    } else {
                        State = "0";
                    }

                }
                break;
///////////////////------=---------------cOLUM3---------------------------------------------------------------------------------------------------////
                case ("N"): {
                    if (c == 'c') {
                        State = "AF";

                    } else {
                        State = "0";
                    }

                }
                break;
                case ("O"): {
                    if (c == 'g') {
                        State = "AG";

                    } else {
                        State = "0";
                    }

                }
                break;
                case ("P"): {
                    if (c == 'e') {
                        State = "AH";

                    } else {
                        State = "0";
                    }

                }
                break;
                case ("Q"): {
                    if (c == 'o') {
                        State = "AI"; //final State

                    } else {
                        State = "0";
                    }

                }
                break;
                case ("R"): {
                    if (c == 'v') {
                        State = "AJ";

                    } else {
                        State = "0";
                    }

                }
                break;
                case ("S"): {
                    if (c == 'd') {
                        State = "AK";//Final States

                    } else {
                        State = "0";
                    }

                }
                break;
                case ("T"): {
                    if (c == 'U') {
                        State = "AL"; //final State

                    } else {
                        State = "0";
                    }

                }
                break;
                case ("U"): {
                    if (c == 'f') {
                        State = "AM";

                    } else {
                        State = "0";
                    }

                }
                break;
                case ("V"): {
                    if (c == 'e') {
                        State = "AN";//final State

                    } else {
                        State = "0";
                    }

                }
                break;
                case ("W"): {
                    if (c == 'n') {
                        State = "AO";

                    } else {
                        State = "0";
                    }

                }
                break;
                case ("X"): {
                    if (c == 'n') {
                        State = "AP";

                    } else {
                        State = "0";
                    }

                }
                break;
                case ("Y"): {
                    if (c == 'B') {
                        State = "AQ";

                    } else {
                        State = "0";
                    }

                }
                break;
                case ("Z"): {
                    if (c == 'T') {
                        State = "AR";//Final state

                    } else {
                        State = "0";
                    }

                }
                break;
                case ("AA"): {
                    if (c == 't') {
                        State = "AS";

                    } else {
                        State = "0";
                    }

                }
                break;
                case ("AB"): {
                    if (c == 'r') {
                        State = "AT";

                    } else {
                        State = "0";
                    }

                }
                break;
                case ("AC"): {
                    if (c == 'r') {
                        State = "AU";

                    } else {
                        State = "0";
                    }

                }
                break;
                case ("AD"): {
                    if (c == 'i') {
                        State = "AV";

                    } else {
                        State = "0";
                    }

                }
                break;
                case ("AE"): {
                    if (c == 'e') {
                        State = "AW";

                    } else {
                        State = "0";
                    }

                }
                break;
///////////////////------=---------------cOLUM4---------------------------------------------------------------------------------------------------////
                case ("AF"): {
                    if (c == 'k') {
                        State = "AX";

                    } else {
                        State = "0";
                    }

                }
                break;
                case ("AG"): {
                    if (c == 'i') {
                        State = "AY";

                    } else {
                        State = "0";
                    }

                }
                break;
                case ("AH"): {
                    if (c == 'c') {
                        State = "AZ";

                    } else {
                        State = "0";
                    }

                }
                break;
                case ("AI"): {

                    State = "A"; //finial state to OutPut Clo
                }
                break;
                case ("AJ"): {
                    if (c == 'i') {
                        State = "BA";

                    } else {
                        State = "0";
                    }

                }
                break;
                case ("AK"): {

                    State = "A"; //finial state to OutPut End

                }
                break;
                case ("AL"): {

                    State = "A"; //finial state to OutPut FBU

                }
                break;
                case ("AM"): {
                    if (c == 'e') {
                        State = "BB";

                    } else {
                        State = "0";
                    }

                }
                break;
                case ("AN"): {
                    State = "A"; //finial state to OutPut Ire

                }
                break;
                case ("AO"): {
                    if (c == 'e') {
                        State = "BC";

                    } else {
                        State = "0";
                    }

                }
                break;
                case ("AP"): {
                    if (c == 'g') {
                        State = "BD";

                    } else {
                        State = "0";
                    }

                }
                break;
                case ("AQ"): {
                    if (c == 'U') {
                        State = "BE"; //final state

                    } else {
                        State = "0";
                    }

                }
                break;
                case ("AR"): {
                    State = "A"; //finial state to OutPut STT

                }
                break;
                case ("AS"): {
                    if (c == 'o') {
                        State = "BF";

                    } else {
                        State = "0";
                    }
                }
                break;
                case ("AT"): {
                    if (c == 'a') {
                        State = "BG"; //fnial state 

                    } else {
                        State = "0";
                    }

                }
                break;
                case ("AU"): {
                    if (c == 'm') {
                        State = "BH";

                    } else {
                        State = "0";
                    }

                }
                break;
                case ("AV"): {
                    if (c == 'n') {
                        State = "BI";

                    } else {
                        State = "0";
                    }

                }
                break;
                case ("AW"): {
                    if (c == 't') {
                        State = "BJ";

                    } else {
                        State = "0";
                    }

                }
                break;
                ////---------------------------------------------cOLUMN5-------------------------------//               
                case ("AX"): {
                    if (c == 'e') {
                        State = "BK";

                    } else {
                        State = "0";
                    }

                }
                break;
                case ("AY"): {
                    if (c == 'n') {
                        State = "BL";

                    }

                }
                break;
                case ("AZ"): {
                    if (c == 'k') {
                        State = "BM";

                    } else {
                        State = "0";
                    }

                }
                break;
                case ("BA"): {
                    if (c == 's') {
                        State = "BN";

                    } else {
                        State = "0";
                    }

                }
                break;
                case ("BB"): {
                    if (c == 'r') {
                        State = "BO";

                    } else {
                        State = "0";
                    }

                }
                break;
                case ("BC"): {
                    if (c == 'v') {
                        State = "BP";

                    } else {
                        State = "0";
                    }

                }
                break;
                case ("BD"): {
                    if (c == 'W') {
                        State = "BQ";

                    } else {
                        State = "0";
                    }

                }
                break;
                case ("BE"): {

                    State = "A"; //final state of output SFBU
                }
                break;
                case ("BF"): {
                    if (c == 'f') {
                        State = "BR";

                    } else {
                        State = "0";
                    }

                }
                break;
                case ("BG"): {
                    State = "A"; //final state of output Sire

                }
                break;
                case ("BH"): {
                    if (c == 'i') {
                        State = "BS";

                    }

                }
                break;
                case ("BI"): {
                    if (c == 'j') {
                        State = "BT";

                    } else {
                        State = "0";
                    }

                }
                break;
                case ("BJ"): {
                    if (c == 'h') {
                        State = "BU";

                    } else {
                        State = "0";
                    }

                }
                //-----------------------------------------------------------------COLUM6-----------------------------------------  //             
                break;
                case ("BK"): {
                    if (c == 'd') {
                        State = "BV";

                    } else {
                        State = "0";
                    }

                }
                break;
                case ("BL"): {
                    if (c == 'n') {
                        State = "BW";

                    } else {
                        State = "0";
                    }

                }
                break;
                case ("BM"): {
                    if (c == '-') {
                        State = "BX";

                    } else {
                        State = "0";
                    }

                }
                break;
                case ("BN"): {
                    if (c == 'i') {
                        State = "BY";

                    } else {
                        State = "0";
                    }

                }
                break;
                case ("BO"): {
                    if (c == 'e') {
                        State = "BZ";

                    } else {
                        State = "0";
                    }

                }
                break;
                case ("BP"): {
                    if (c == 'a') {
                        State = "CA";

                    } else {
                        State = "0";
                    }

                }
                break;
                case ("BQ"): {
                    if (c == 'h') {
                        State = "CB";

                    } else {
                        State = "0";
                    }

                }
                break;
                case ("BR"): {
                    if (c == 'c') {
                        State = "CC";

                    } else {
                        State = "0";
                    }

                }
                break;
                case ("BS"): {
                    if (c == 'n') {
                        State = "CB";

                    } else {
                        State = "0";
                    }

                }
                break;
                case ("BT"): {
                    State = "A"; //final State output Using;

                }
                break;
                case ("BU"): {
                    if (c == 'e') {
                        State = "CE";

                    } else {
                        State = "0";
                    }

                }
////-------------------------------------COL 7---------------------------------------------------//                
                break;
                case ("BV"): {
                    if (c == 'V') {
                        State = "CF";

                    } else {
                        State = "0";
                    }

                }
                break;
                case ("BW"): {
                    if (c == 'i') {
                        State = "CG";

                    } else {
                        State = "0";
                    }

                }
                break;
                case ("BX"): {
                    if (c == 'C') {
                        State = "CH";

                    } else {
                        State = "0";
                    }

                }
                break;
                case ("BY"): {
                    if (c == 'o') {
                        State = "CI";//FINAL STATE

                    } else {
                        State = "0";
                    }

                }
                break;
                case ("BZ"): {
                    if (c == 'd') {
                        State = "CJ";

                    } else {
                        State = "0";
                    }

                }
                break;
                case ("CA"): {
                    if (c == 'l') {
                        State = "CK";

                    } else {
                        State = "0";
                    }

                }
                break;
                case ("CB"): {
                    if (c == 'e') {
                        State = "CL";

                    } else {
                        State = "0";
                    }

                }
                break;
                case ("CC"): {
                    if (c == 'l') {
                        State = "CM";

                    } else {
                        State = "0";
                    }

                }
                break;
                case ("CD"): {
                    if (c == 'a') {
                        State = "CN";

                    } else {
                        State = "0";
                    }

                }
                break;
                case ("CE"): {
                    if (c == 'r') {
                        State = "CO";

                    } else {
                        State = "0";
                    }

                }
                break;
////////------------------------------------------COL 8 -----------------//                
                case ("CF"): {
                    if (c == 'a') {
                        State = "CP";

                    } else {
                        State = "0";
                    }

                }
                break;
                case ("CG"): {
                    if (c == 'n') {
                        State = "CQ";//fINAL STATE

                    } else {
                        State = "0";
                    }

                }
                break;
                case ("CH"): {
                    if (c == 'a') {
                        State = "CR";

                    } else {
                        State = "0";
                    }

                }
                break;
                case ("CI"): {
                    State = "A";//OUTPUT DIVISIO

                }
                break;
                case ("CJ"): {
                    if (c == 'F') {
                        State = "CS";

                    } else {
                        State = "0";
                    }

                }
                break;
                case ("CK"): {
                    if (c == 'u') {
                        State = "CT";

                    } else {
                        State = "0";
                    }

                }
                break;
                case ("CL"): {
                    if (c == 'n') {
                        State = "CU";

                    } else {
                        State = "0";
                    }

                }
                break;
                case ("CM"): {
                    if (c == 'o') {
                        State = "CV";

                    } else {
                        State = "0";
                    }

                }
                break;
                case ("CN"): {
                    if (c == 't') {
                        State = "CW";

                    } else {
                        State = "0";
                    }

                }
                break;
                case ("CO"): {
                    if (c == 'D') {
                        State = "CX";

                    } else {
                        State = "0";
                    }

                }
                break;

                //-------------------------------------COL-9--------------------------------------------------
                case ("CP"): {
                    if (c == 'i') {
                        State = "CY";

                    } else {
                        State = "0";
                    }

                }
                break;
                case ("CQ"): {
                    if (c == 'g') {
                        State = "CZ";

                    } else {
                        State = "0";
                    }

                }
                break;
                case ("CR"): {
                    if (c == 's') {
                        State = "DA";

                    } else {
                        State = "0";
                    }

                }
                break;
                case ("CS"): {
                    if (c == 'r') {
                        State = "DB";

                    } else {
                        State = "0";
                    }

                }
                break;
                case ("CT"): {
                    if (c == 'e') {
                        State = "DC";

                    } else {
                        State = "0";
                    }

                }
                break;
                case ("CU"): {

                    State = "A";//OUTPUT RINGWHEN

                }
                break;
                case ("CV"): {

                    State = "A";//OUTPUT SETOFCLO

                }
                break;
                case ("CW"): {
                    if (c == 'e') {
                        State = "DD";

                    } else {
                        State = "0";
                    }

                }
                break;
                case ("CX"): {
                    if (c == 'o') {
                        State = "DE";

                    }else {
                        State = "0";
                    }

                }
                break;

//---------------------------------COL-10-------------------------------------------------------------------------
                case ("CY"): {
                    if (c == 'u') {
                        State = "DF";

                    }else {
                        State = "0";
                    }

                }
                break;
                case ("CZ"): {

                    State = "A";//OUTPUT BEGINNING

                }
                break;
                case ("DA"): {
                    if (c == 'e') {
                        State = "DG";

                    }else {
                        State = "0";
                    }

                }
                break;
                case ("DB"): {
                    if (c == 'o') {
                        State = "DH";

                    }else {
                        State = "0";
                    }

                }
                break;
                case ("DC"): {

                    State = "A"; //OUTPUT NONEVALUE

                }
                break;
                case ("DD"): {
                    if (c == 'T') {
                        State = "DI";

                    }else {
                        State = "0";
                    }

                }
                break;
                case ("DE"): {
                    if (c == '-') {
                        State = "DJ";

                    }else {
                        State = "0";
                    }

                }
                break;

                //---------------------COL-11--------------------------------------------------------------
                case ("DF"): {
                    if (c == 'e') {
                        State = "DK";

                    }else {
                        State = "0";
                    }

                }
                break;
                case ("DG"): {
                    if (c == 'O') {
                        State = "DL";

                    }else {
                        State = "0";
                    }

                }
                break;
                case ("DH"): {
                    if (c == 'm') {
                        State = "DM";

                    }else {
                        State = "0";
                    }

                }
                break;
                case ("DI"): {
                    if (c == 'h') {
                        State = "DN";

                    }else {
                        State = "0";
                    }

                }
                break;
                case ("DJ"): {
                    if (c == 'e') {
                        State = "DO";

                    }else {
                        State = "0";
                    }

                }
                break;
                //----------------------------------------COL-12---------------------------------------------------------------
                case ("DK"): {

                    State = "A";//OUTPUT BAKEDVALUE

                }
                break;
                case ("DL"): {
                    if (c == 'f') {
                        State = "DP";

                    }else {
                        State = "0";
                    }

                }
                break;
                case ("DM"): {

                    State = "A";//OUTPUT INFERRED FROM

                }
                break;
                case ("DN"): {
                    if (c == 'i') {
                        State = "DQ";

                    }else {
                        State = "0";
                    }

                }
                break;
                case ("DO"): {
                    if (c == 'l') {
                        State = "DR";

                    }else {
                        State = "0";
                    }

                }
                break;
                ///--------------------------------------------COL-13-------------------------------------------------------------

                case ("DP"): {

                    State = "A";//OUTPUT CHECK-CASEOF 

                }
                break;
                case ("DQ"): {
                    if (c == 's') {
                        State = "DS";

                    }else {
                        State = "0";
                    }

                }
                break;
                case ("DR"): {
                    if (c == 's') {
                        State = "DT";

                    }else {
                        State = "0";
                    }

                }
                break;
                ////////////////////-COL-14////////////////////////-----------------------------------------

                case ("DS"): {
                    if (c == 'N') {
                        State = "DU";

                    }else {
                        State = "0";
                    }

                }
                break;
                case ("DT"): {
                    if (c == 'e') {
                        State = "DV";

                    }else {
                        State = "0";
                    }

                }
                break;
//---------------------------------COL-15------------------------------------------------------

                case ("DU"): {
                    if (c == 'o') {
                        State = "DW";

                    }else {
                        State = "0";
                    }

                }
                break;
                case ("DV"): {

                    State = "A";//OUTPUT WHETHERDO-ELSE

                }
                break;
////------------------------------COL-16---------------------------------------------------------

                case ("DW"): {
                    if (c == 'w') {
                        State = "DX";

                    }else {
                        State = "0";
                    }

                }
                break;
////--------------------------------COL-17------------------------------------------------------

                case ("DX"): {

                    State = "A";//OUTPUT TERMINATE
                }
                break;
            }//end  switch
                if (State == "DK") {
                          KeyWordOutput+=NoLine+"\t"+"BackedValue"+"\t"+L.getToken("BackedValue")+"\t"+noLex+"\t"+"Matched"+"\n";

                } else if (State == "CZ") {
                   KeyWordOutput+=NoLine+"\t"+"Beginning"+"\t"+L.getToken("Beginning")+"\t"+noLex+"\t"+"Matched"+"\n";
                } else if (State == "DP") {
                     KeyWordOutput+=NoLine+"\t"+"Check-CaseOf"+"\t"+L.getToken("Check-CaseOf")+"\t"+noLex+"\t"+"Matched"+"\n";
                } else if (State == "AI") {             
                     KeyWordOutput+=NoLine+"\t"+"Clo"+"\t"+L.getToken("Clo")+"\t"+noLex+"\t"+"Matched"+"\n";
                } else if (State == "CI") {
                     KeyWordOutput+=NoLine+"\t"+"Divisio"+"\t"+L.getToken("Divisio")+"\t"+noLex+"\t"+"Matched"+"\n";
                } else if (State == "AK") {
                    KeyWordOutput+=NoLine+"\t"+"End"+"\t"+L.getToken("End")+"\t"+noLex+"\t"+"Matched"+"\n";
                } else if (State == "AL") {
                     KeyWordOutput+=NoLine+"\t"+"FBU"+"\t"+L.getToken("FBU")+"\t"+noLex+"\t"+"Matched"+"\n";
                } else if (State == "DM") {
                     KeyWordOutput+=NoLine+"\t"+"InferedFrom"+"\t"+L.getToken("InferedFrom")+"\t"+noLex+"\t"+"Matched"+"\n";
                } else if (State == "AN") {
                      KeyWordOutput+=NoLine+"\t"+"Ire"+"\t"+L.getToken("Ire")+"\t"+noLex+"\t"+"Matched"+"\n";
                   // System.out.println(L.getToken("Ire"));

                } else if (State == "DC") {
                    KeyWordOutput+=NoLine+"\t"+"NoneValue"+"\t"+L.getToken("NoneValue")+"\t"+noLex+"\t"+"Matched"+"\n";
                } else if (State == "CU") {
                   KeyWordOutput+=NoLine+"\t"+"RingWhen"+"\t"+L.getToken("RingWhen")+"\t"+noLex+"\t"+"Matched"+"\n";
                } else if (State == "BE") {
                    KeyWordOutput+=NoLine+"\t"+"SFBU"+"\t"+L.getToken("SFBU")+"\t"+noLex+"\t"+"Matched"+"\n";
                } else if (State == "AR") {
                     KeyWordOutput+=NoLine+"\t"+"STT"+"\t"+L.getToken("STT")+"\t"+noLex+"\t"+"Matched"+"\n";
                } else if (State == "CV") {
                    KeyWordOutput+=NoLine+"\t"+"SetOfClo"+"\t"+L.getToken("SetOfClo")+"\t"+noLex+"\t"+"Matched"+"\n";
                } else if (State == "BG") {
                     KeyWordOutput+=NoLine+"\t"+"Sire"+"\t"+L.getToken("Sire")+"\t"+noLex+"\t"+"Matched"+"\n";
                } else if (State == "DX") {
                     KeyWordOutput+=NoLine+"\t"+"TerminateThisNow"+"\t"+L.getToken("TerminateThisNow")+"\t"+noLex+"\t"+"Matched"+"\n";
                } else if (State == "BT") {
                     KeyWordOutput+=NoLine+"\t"+"Using"+"\t"+L.getToken("Using")+"\t"+noLex+"\t"+"Matched"+"\n";
                    //System.out.println(L.getToken("Using"));

                } else if (State == "DV") {
                     KeyWordOutput+=NoLine+"\t"+"WhetherDo-Else"+"\t"+L.getToken("WhetherDo-Else")+"\t"+noLex+"\t"+"Matched"+"\n";
                    //System.out.println(L.getToken("WhetherDo-Else"));

                } 

            
            if (State == "0") {
                switch (State) {
///////////////////------=---------------cOLUM1---------------------------------------------------------------------------------------------------////                
                    case ("A"): {
                        if (c == 'B') {
                            State = "B";

                        } else if (c == 'C') {
                            State = "C";

                        } else if (c == 'D') {
                            State = "D";

                        } else if (c == 'E') {
                            State = "E";  //FINAL

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
                            State = "M";

                        } else {
                            State = "0";
                        }
                    }
                    break;
///////////////////------=---------------cOLUM2---------------------------------------------------------------------------------------------------////
                    case ("B"): {
                        if (c == 'a') {
                            State = "N";
                        } else if (c == 'e') {
                            State = "O";
                        } 

                    }
                    break;
                    case ("C"): {
                        if (c == 'h') {
                            State = "P";
                        } else if (c == 'l') {
                            State = "Q";
                        } 
                    }
                    break;
                    case ("D"): {
                        if (c == 'i') {
                            State = "R";

                        } 

                    }
                    break;
                    case ("E"): {
                        if (c == 'n') {
                            State = "S";

                        } 
                    }
                    break;
                    case ("F"): {
                        if (c == 'B') {
                            State = "T";

                        } 
                    }
                    break;
                    case ("G"): {
                        if (c == 'n') {
                            State = "U";
                        } else if (c == 'r') {
                            State = "V";
                        } 

                    }
                    break;
                    case ("H"): {
                        if (c == 'o') {
                            State = "W";

                        } 

                    }
                    break;
                    case ("I"): {
                        if (c == 'i') {
                            State = "X";

                        } 
                    }
                    break;
                    case ("J"): {
                        if (c == 'F') {
                            State = "Y";
                        } else if (c == 'T') {
                            State = "AR";
                        } else if (c == 'e') {
                            State = "AA";
                        } else if (c == 'i') {
                            State = "AB";
                        } 

                    }
                    break;
                    case ("K"): {
                        if (c == 'e') {
                            State = "AC";

                        } 

                    }
                    break;
                    case ("L"): {
                        if (c == 's') {
                            State = "AD";

                        } 

                    }
                    break;
                    case ("M"): {
                        if (c == 'h') {
                            State = "AE";

                        } 
                    }
                    break;
///////////////////------=---------------cOLUM3---------------------------------------------------------------------------------------------------////
                    case ("N"): {
                        if (c == 'c') {
                            State = "AF";

                        }

                    }
                    break;
                    case ("O"): {
                        if (c == 'g') {
                            State = "AG";

                        }
                    }
                    break;
                    case ("P"): {
                        if (c == 'e') {
                            State = "AH";

                        }

                    }
                    break;
                    case ("Q"): {
                        if (c == 'o') {
                            State = "AI"; //final State

                        }

                    }
                    break;
                    case ("R"): {
                        if (c == 'v') {
                            State = "AJ";

                        }

                    }
                    break;
                    case ("S"): {
                        if (c == 'd') {
                            State = "AK";//Final States

                        }

                    }
                    break;
                    case ("T"): {
                        if (c == 'U') {
                            State = "AL"; //final State

                        }

                    }
                    break;
                    case ("U"): {
                        if (c == 'f') {
                            State = "AM";

                        }
                    }
                    break;
                    case ("V"): {
                        if (c == 'e') {
                            State = "AN";//final State

                        }
                    }
                    break;
                    case ("W"): {
                        if (c == 'n') {
                            State = "AO";

                        }
                    }
                    break;
                    case ("X"): {
                        if (c == 'n') {
                            State = "AP";

                        }

                    }
                    break;
                    case ("Y"): {
                        if (c == 'B') {
                            State = "AQ";

                        }
                    }
                    break;
                    case ("Z"): {
                        if (c == 'T') {
                            State = "AR";//Final state

                        }

                    }
                    break;
                    case ("AA"): {
                        if (c == 't') {
                            State = "AS";

                        }

                    }
                    break;
                    case ("AB"): {
                        if (c == 'r') {
                            State = "AT";

                        }

                    }
                    break;
                    case ("AC"): {
                        if (c == 'r') {
                            State = "AU";

                        }
                    }
                    break;
                    case ("AD"): {
                        if (c == 'i') {
                            State = "AV";

                        }

                    }
                    break;
                    case ("AE"): {
                        if (c == 'e') {
                            State = "AW";

                        }

                    }
                    break;
///////////////////------=---------------cOLUM4---------------------------------------------------------------------------------------------------////
                    case ("AF"): {
                        if (c == 'k') {
                            State = "AX";

                        }

                    }
                    break;
                    case ("AG"): {
                        if (c == 'i') {
                            State = "AY";

                        }

                    }
                    break;
                    case ("AH"): {
                        if (c == 'c') {
                            State = "AZ";

                        }

                    }
                    break;
                    case ("AI"): {

                        State = "AI"; //finial state to OutPut Clo
                    }
                    break;
                    case ("AJ"): {
                        if (c == 'i') {
                            State = "BA";

                        }

                    }
                    break;
                    case ("AK"): {

                        State = "AK"; //finial state to OutPut End

                    }
                    break;
                    case ("AL"): {

                        State = "AL"; //finial state to OutPut FBU

                    }
                    break;
                    case ("AM"): {
                        if (c == 'e') {
                            State = "BB";

                        }else {
                        State = "0";
                    }

                    }
                    break;
                    case ("AN"): {
                        State = "AN"; //finial state to OutPut Ire

                    }
                    break;
                    case ("AO"): {
                        if (c == 'e') {
                            State = "BC";

                        }

                    }
                    break;
                    case ("AP"): {
                        if (c == 'g') {
                            State = "BD";

                        }

                    }
                    break;
                    case ("AQ"): {
                        if (c == 'U') {
                            State = "BE"; //final state

                        }
                    }
                    break;
                    case ("AR"): {
                        State = "AR"; //finial state to OutPut STT

                    }
                    break;
                    case ("AS"): {
                        if (c == 'o') {
                            State = "BF";

                        }

                    }
                    break;
                    case ("AT"): {
                        if (c == 'a') {
                            State = "BG"; //fnial state 

                        }

                    }
                    break;
                    case ("AU"): {
                        if (c == 'm') {
                            State = "BH";

                        }

                    }
                    break;
                    case ("AV"): {
                        if (c == 'n') {
                            State = "BI";

                        }
                    }
                    break;
                    case ("AW"): {
                        if (c == 't') {
                            State = "BJ";

                        }

                    }
                    break;
                    ////---------------------------------------------cOLUMN5-------------------------------//               
                    case ("AX"): {
                        if (c == 'e') {
                            State = "BK";

                        }

                    }
                    break;
                    case ("AY"): {
                        if (c == 'n') {
                            State = "BL";

                        }

                    }
                    break;
                    case ("AZ"): {
                        if (c == 'k') {
                            State = "BM";

                        }

                    }
                    break;
                    case ("BA"): {
                        if (c == 's') {
                            State = "BN";

                        }

                    }
                    break;
                    case ("BB"): {
                        if (c == 'r') {
                            State = "BO";

                        }

                    }
                    break;
                    case ("BC"): {
                        if (c == 'v') {
                            State = "BP";

                        }

                    }
                    break;
                    case ("BD"): {
                        if (c == 'W') {
                            State = "BQ";

                        }

                    }
                    break;
                    case ("BE"): {

                        State = "BE"; //final state of output SFBU
                    }
                    break;
                    case ("BF"): {
                        if (c == 'f') {
                            State = "BR";

                        }

                    }
                    break;
                    case ("BG"): {
                        State = "BE"; //final state of output Sire

                    }
                    break;
                    case ("BH"): {
                        if (c == 'i') {
                            State = "BS";

                        }

                    }
                    break;
                    case ("BI"): {
                        if (c == 'j') {
                            State = "BT";

                        }

                    }
                    break;
                    case ("BJ"): {
                        if (c == 'h') {
                            State = "BU";

                        }

                    }
                    //-----------------------------------------------------------------COLUM6-----------------------------------------  //             
                    break;
                    case ("BK"): {
                        if (c == 'd') {
                            State = "BV";

                        }

                    }
                    break;
                    case ("BL"): {
                        if (c == 'n') {
                            State = "BW";

                        }

                    }
                    break;
                    case ("BM"): {
                        if (c == '-') {
                            State = "BX";

                        }

                    }
                    break;
                    case ("BN"): {
                        if (c == 'i') {
                            State = "BY";

                        }

                    }
                    break;
                    case ("BO"): {
                        if (c == 'e') {
                            State = "BZ";

                        }

                    }
                    break;
                    case ("BP"): {
                        if (c == 'a') {
                            State = "CA";

                        }

                    }
                    break;
                    case ("BQ"): {
                        if (c == 'h') {
                            State = "CB";

                        }

                    }
                    break;
                    case ("BR"): {
                        if (c == 'c') {
                            State = "CC";

                        }

                    }
                    break;
                    case ("BS"): {
                        if (c == 'n') {
                            State = "CB";

                        }else {
                        State = "0";
                    }

                    }
                    break;
                    case ("BT"): {
                        State = "BT"; //final State output Using;

                    }
                    break;
                    case ("BU"): {
                        if (c == 'e') {
                            State = "CE";

                        }

                    }
////-------------------------------------COL 7---------------------------------------------------//                
                    break;
                    case ("BV"): {
                        if (c == 'V') {
                            State = "CF";

                        }

                    }
                    break;
                    case ("BW"): {
                        if (c == 'i') {
                            State = "CG";

                        }

                    }
                    break;
                    case ("BX"): {
                        if (c == 'C') {
                            State = "CH";

                        }

                    }
                    break;
                    case ("BY"): {
                        if (c == 'o') {
                            State = "CI";//FINAL STATE

                        }

                    }
                    break;
                    case ("BZ"): {
                        if (c == 'd') {
                            State = "CJ";

                        }

                    }
                    break;
                    case ("CA"): {
                        if (c == 'l') {
                            State = "CK";

                        }

                    }
                    break;
                    case ("CB"): {
                        if (c == 'e') {
                            State = "CL";

                        }

                    }
                    break;
                    case ("CC"): {
                        if (c == 'l') {
                            State = "CM";

                        }

                    }
                    break;
                    case ("CD"): {
                        if (c == 'a') {
                            State = "CN";

                        }

                    }
                    break;
                    case ("CE"): {
                        if (c == 'r') {
                            State = "CO";

                        }

                    }
                    break;
////////------------------------------------------COL 8 -----------------//                
                    case ("CF"): {
                        if (c == 'a') {
                            State = "CP";

                        }

                    }
                    break;
                    case ("CG"): {
                        if (c == 'n') {
                            State = "CQ";//fINAL STATE

                        }

                    }
                    break;
                    case ("CH"): {
                        if (c == 'a') {
                            State = "CR";

                        }

                    }
                    break;
                    case ("CI"): {
                        State = "CI";//OUTPUT DIVISIO

                    }
                    break;
                    case ("CJ"): {
                        if (c == 'F') {
                            State = "CS";

                        }

                    }
                    break;
                    case ("CK"): {
                        if (c == 'u') {
                            State = "CT";

                        }

                    }
                    break;
                    case ("CL"): {
                        if (c == 'n') {
                            State = "CU";

                        }

                    }
                    break;
                    case ("CM"): {
                        if (c == 'o') {
                            State = "CV";

                        }

                    }
                    break;
                    case ("CN"): {
                        if (c == 't') {
                            State = "CW";

                        }
                    }
                    break;
                    case ("CO"): {
                        if (c == 'D') {
                            State = "CX";

                        }

                    }
                    break;

                    //-------------------------------------COL-9--------------------------------------------------
                    case ("CP"): {
                        if (c == 'i') {
                            State = "CY";

                        }

                    }
                    break;
                    case ("CQ"): {
                        if (c == 'g') {
                            State = "CZ";

                        }

                    }
                    break;
                    case ("CR"): {
                        if (c == 's') {
                            State = "DA";

                        }

                    }
                    break;
                    case ("CS"): {
                        if (c == 'r') {
                            State = "DB";

                        }

                    }
                    break;
                    case ("CT"): {
                        if (c == 'e') {
                            State = "DC";

                        }

                    }
                    break;
                    case ("CU"): {

                        State = "CU";//OUTPUT RINGWHEN

                    }
                    break;
                    case ("CV"): {

                        State = "CV";//OUTPUT SETOFCLO

                    }
                    break;
                    case ("CW"): {
                        if (c == 'e') {
                            State = "DD";

                        }

                    }
                    break;
                    case ("CX"): {
                        if (c == 'o') {
                            State = "DE";

                        }

                    }
                    break;

//---------------------------------COL-10-------------------------------------------------------------------------
                    case ("CY"): {
                        if (c == 'u') {
                            State = "DF";

                        }

                    }
                    break;
                    case ("CZ"): {

                        State = "CZ";//OUTPUT BEGINNING

                    }
                    break;
                    case ("DA"): {
                        if (c == 'e') {
                            State = "DG";

                        }

                    }
                    break;
                    case ("DB"): {
                        if (c == 'o') {
                            State = "DH";

                        }

                    }
                    break;
                    case ("DC"): {

                        State = "DC"; //OUTPUT NONEVALUE

                    }
                    break;
                    case ("DD"): {
                        if (c == 'T') {
                            State = "DI";

                        }

                    }
                    break;
                    case ("DE"): {
                        if (c == '-') {
                            State = "DJ";

                        }

                    }
                    break;

                    //---------------------COL-11--------------------------------------------------------------
                    case ("DF"): {
                        if (c == 'e') {
                            State = "DK";

                        }

                    }
                    break;
                    case ("DG"): {
                        if (c == 'O') {
                            State = "DL";

                        }else {
                        State = "0";
                    }

                    }
                    break;
                    case ("DH"): {
                        if (c == 'm') {
                            State = "DM";

                        }

                    }
                    break;
                    case ("DI"): {
                        if (c == 'h') {
                            State = "DN";

                        }

                    }
                    break;
                    case ("DJ"): {
                        if (c == 'e') {
                            State = "DO";

                        }

                    }
                    break;
                    //----------------------------------------COL-12---------------------------------------------------------------
                    case ("DK"): {

                        State = "DK";//OUTPUT BAKEDVALUE

                    }
                    break;
                    case ("DL"): {
                        if (c == 'f') {
                            State = "DP";

                        }

                    }
                    break;
                    case ("DM"): {

                        State = "DM";//OUTPUT INFERRED FROM

                    }
                    break;
                    case ("DN"): {
                        if (c == 'i') {
                            State = "DQ";

                        }else {
                        State = "0";
                    }

                    }
                    break;
                    case ("DO"): {
                        if (c == 'l') {
                            State = "DR";

                        }

                    }
                    break;
                    ///--------------------------------------------COL-13-------------------------------------------------------------

                    case ("DP"): {

                        State = "DP";//OUTPUT CHECK-CASEOF 

                    }
                    break;
                    case ("DQ"): {
                        if (c == 's') {
                            State = "DS";

                        }

                    }
                    break;
                    case ("DR"): {
                        if (c == 's') {
                            State = "DT";

                        }

                    }
                    break;
                    ////////////////////-COL-14////////////////////////-----------------------------------------

                    case ("DS"): {
                        if (c == 'N') {
                            State = "DU";

                        }

                    }
                    break;
                    case ("DT"): {
                        if (c == 'e') {
                            State = "DV";

                        }

                    }
                    break;
//---------------------------------COL-15------------------------------------------------------

                    case ("DU"): {
                        if (c == 'o') {
                            State = "DW";

                        }

                    }
                    break;
                    case ("DV"): {

                        State = "DV";//OUTPUT WHETHERDO-ELSE

                    }
                    break;
////------------------------------COL-16---------------------------------------------------------

                    case ("DW"): {
                        if (c == 'w') {
                            State = "DX";

                        }

                    }
                    break;
////--------------------------------COL-17------------------------------------------------------

                    case ("DX"): {

                        State = "DX";//OUTPUT TERMINATE
                    }
                    break;

                }//end  2nd switch
            }//endif
        }//end for
        return  KeyWordOutput;

    }//end fn
}
