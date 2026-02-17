import java.util.Arrays;
public class sortingStrings {
    public static String sort(String a){
        char[] chars = a.toCharArray();
        Arrays.sort(chars);
        String b = new String(chars);
        return b;
    }
    public static void main(String args[]){
       String a = "efabdc";
       System.out.println(sort(a)); 
    }
}
