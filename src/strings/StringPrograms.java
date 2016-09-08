package strings;

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
}
