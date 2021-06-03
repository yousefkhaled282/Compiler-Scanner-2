
package compiler.scanner.pkg2;



public class ScannerString {
    private String str;
    private char[] strCharArray;
    
    public ScannerString(String str){
        this.str = str;
        strCharArray = toCharArray();
    }
    
    public void setString(String str){
        this.str = str;
        strCharArray = toCharArray();
    }
    
    public String getString(){
        return this.str;
    }
    
    public final char[] toCharArray(){
        char [] result = new char[str.length()];
        for(int i = 0; i < str.length(); i++){
            result[i] = str.charAt(i);
        }
        return result;
    }
    
    public boolean equals(ScannerString compareTo){
        char [] compareToCharArray = compareTo.toCharArray();
        boolean result = true;
        if(strCharArray.length != compareToCharArray.length)
            return false;
        for(int i = 0; i < strCharArray.length; i++){
         if(strCharArray[i] != compareToCharArray[i])
             return false;
        }
        return result;
    }
    
    public boolean startsWith(ScannerString prefix){
        char[] prefixCharArray = prefix.toCharArray();
        
        if(prefixCharArray.length > strCharArray.length)
            return false;
        
        for(int i = 0; i < prefixCharArray.length; i++){
            if(strCharArray[i] != prefixCharArray[i])
                return false;
        }
        
        return true;
    }
    
    public boolean endsWith(ScannerString suffix){
        char[] suffixCharArray = suffix.toCharArray();
        
        if(suffixCharArray.length > strCharArray.length){
            return false;
        }
        
        int diff = strCharArray.length - suffixCharArray.length;
        
        if(diff == 0)
            return this.equals(suffix);
        
        
        int k = suffixCharArray.length - 1;
        for(int i = strCharArray.length - 1; i >= diff; i--){
            if(strCharArray[i] != suffixCharArray[k])
                return false;
            k--;
        }
        
        return true;
    }
    
    public int getLength(){
        return strCharArray.length;
    }
    
    
    
    public LinkedList<ScannerString> split(ScannerString splitter){
        LinkedList<ScannerString> result = new LinkedList<>();
        int start = 0;
        int pos = this.indexOf(splitter);
        while(pos >= start){
            if(pos > start){
                ScannerString s = this.substring(start, pos);
                result.insert(s);
            }
            start = pos + splitter.getLength();
            pos = this.indexOf(splitter, start);
        }
        if(start < this.getLength()){
            ScannerString se = this.substring(start);
            result.insert(se);
        }
        return result;
    }
    
    
    
    public ScannerString substring(int start){
        
        if(start < 0)
            return null;
        int substringLength = this.getLength() - start;
        
        if(substringLength < 0){
            return null;
        }
        char [] substring = new char[substringLength];
        
        int k = 0;
        for(int i = start; i < this.getLength(); i++){
            substring[k] = this.strCharArray[i];
            k++;
        }
        
        return new ScannerString(String.valueOf(substring));
        
    }
    
    
    
    public ScannerString substring(int start, int end){
        
        if(start < 0 || end > strCharArray.length || end < start)
            return null;
        char[] substring = new char[end - start];
        int k = 0;
        for(int i = start; i < end; i++){
            substring[k] = strCharArray[i];
            k++;
        }
        String sub = String.valueOf(substring);
        return new ScannerString(sub);
    }
    
    
    public int indexOf(ScannerString string, int fromIndex){
        char[] stringCharArray = string.toCharArray();
        boolean match = true;
        if(stringCharArray.length > strCharArray.length)
            return -1;
        
        if(stringCharArray.length == strCharArray.length){
//            for(int i = 0; i < stringCharArray.length; i++){
//                if(stringCharArray[i] != strCharArray[i])
//                    match = false;
//            }
            return this.equals(string)? 0 : -1;
        }
        
        for(int i = fromIndex; i < strCharArray.length; i++){
            int k = 0;
            match = true;
            for(int j = i; j < stringCharArray.length || k < stringCharArray.length; j++){         
                if(stringCharArray[k] != strCharArray[j]){
                    match = false;
                    break;
                }
                k++;
            }
            if(match){
                return i;
            }
                
        }
        return -1;
    }
    
    
    public int indexOf(ScannerString string){
        char[] stringCharArray = string.toCharArray();
        boolean match = true;
        if(stringCharArray.length > strCharArray.length)
            return -1;
        
        if(stringCharArray.length == strCharArray.length){
            for(int i = 0; i < stringCharArray.length; i++){
                if(stringCharArray[i] != strCharArray[i])
                    match = false;
            }
            return match? 0 : -1;
        }
        
        for(int i = 0; i < strCharArray.length; i++){
            int k = 0;
            match = true;
            for(int j = i; j < stringCharArray.length || k < stringCharArray.length; j++){         
                if(stringCharArray[k] != strCharArray[j]){
                    match = false;
                    break;
                }
                k++;
            }
            if(match){
                return i;
            }
        }
        return -1;
    }
    
    
    
}
