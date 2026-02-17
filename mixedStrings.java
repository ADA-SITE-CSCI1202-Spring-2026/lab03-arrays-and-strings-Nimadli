public class mixedStrings {
    public static String swap(String a){
        char[] chars = a.toCharArray();
        char temp = chars[0];
        chars[0] = chars[chars.length - 1];
        chars[chars.length - 1] = temp;
        return new String(chars);
    }
    public static String mix(String a){
        String[] stringArray = a.split(" ");
        for(int i = 0; i < stringArray.length; i ++){
            stringArray[i] = swap(stringArray[i]);
        }
        return String.join(" ", stringArray);
    }
    public static void main(String args[]){
        String a = "This is PP2 Fall 2021";
        System.out.println(mix(a));
    }
}
