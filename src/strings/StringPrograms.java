package strings;

import java.util.HashMap;
import java.util.HashSet;

public class StringPrograms {
    public String reverse(String str){
        if(str == null || str.length() == 0) return str;
        StringBuilder sbreverse = new StringBuilder();
        for(int i=str.length()-1; i>=0; i--){
            sbreverse.append(str.charAt(i));
        }
        return sbreverse.toString();
    }

    public String reverseVowels(String str){
        if(str == null || str.length() == 0) return str;
        HashSet<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');

        char[] strch = str.toCharArray();
        for(int i=0, j=str.length()-1; i<j; ){
            if( vowels.contains(strch[i]) && vowels.contains(strch[j]) ){
                char temp = strch[i];
                strch[i] = strch[j];
                strch[j] = temp;
                i++;
                j--;
            }
            if( !vowels.contains(strch[i]) ) i++;
            if( !vowels.contains(strch[j]) ) j--;
        }
        return String.valueOf(strch);
    }

    public String multiply(String num1, String num2) {
        int ans = 1;
        if(num1.length()>0 && num2.length()>0){
            ans = Integer.parseInt(num1) * Integer.parseInt(num2);
        }
        else if(num1.length()>0){
            ans = Integer.parseInt(num1);
        }
        else{
            ans = Integer.parseInt(num2);
        }
        return String.valueOf(ans);
    }

    public boolean isIsomorphic(String s, String t) {
        if(s.length()>0 && t.length()>0){
            HashMap<Character, Character> hmap = new HashMap<>();
            HashSet<Character> hset = new HashSet<>();
            for(int i=0;i<s.length();i++){
                if(!hmap.containsKey(s.charAt(i))){
                    if(hset.contains(t.charAt(i))) return false;
                    hmap.put(s.charAt(i), t.charAt(i));
                    hset.add(t.charAt(i));
                }
                else{
                    if(t.charAt(i) != hmap.get(s.charAt(i))) return false;
                }
            }

        }
        else if(s.length()>0 || t.length()>0) return false;
        return true;
    }

    public boolean wordPattern(String s, String str) {
        if(s.length()>0 && str.length()>0){
            String[] st = str.split(" ");
            if(s.length()!=st.length) return false;
            HashMap<Character, String> hmap = new HashMap<>();
            HashSet<String> hset = new HashSet<>();
            for(int i=0;i<s.length();i++){
                if(!hmap.containsKey(s.charAt(i))){
                    if(hset.contains(st[i])) return false;
                    hmap.put(s.charAt(i), st[i]);
                    hset.add(st[i]);
                }
                else{
                    if(!st[i].equals(hmap.get(s.charAt(i)))) return false;
                }
            }

        }
        else if(s.length()>0 || str.length()>0) return false;
        return true;
    }

    public int lengthOfLastWord(String s) {
        if(s.length()>0){
            s = s.trim();
            int j = s.length()-1;
            while( j>-1 && s.charAt(j)!=' '){
                j--;
            }
            return (j>=0)?s.length()-j-1: s.length();
        }
        return 0;
    }

    public boolean isPalindrome(String s) {
        if(s==null || s.length()==0) return true;
        int i=0, j=s.length()-1;
        while(i<j){
            if(!(Character.isDigit(s.charAt(i)) || Character.isLetter(s.charAt(i)))) i++;
            else if(!(Character.isDigit(s.charAt(j)) || Character.isLetter(s.charAt(j)))) j--;
            else if(Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(s.charAt(j))) return false;
            else{
                i++;
                j--;
            }
        }
        return true;
    }
}
