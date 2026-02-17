import java.util.Arrays;

public class anagrams {
    public static String sort(String a){
        char[] chars = a.toCharArray();
        Arrays.sort(chars);
        String b = new String(chars);
        return b;
    }
    public static Boolean anagram(String a, String b){
        return sort(a).equals(sort(b));
    }

    public static void main(String args[]){
       String a = "ab";
       String b = "ba";
       System.out.println((anagram(a, b)));
    }
}
