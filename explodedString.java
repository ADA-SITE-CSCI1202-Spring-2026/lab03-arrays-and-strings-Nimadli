public class explodedString {
    public static String explode(String a){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < a.length(); i++){
            StringBuilder temp = new StringBuilder();
            for(int j = 0; j <= i; j++){
                temp.append(a.charAt(j));
            }
            sb.append(temp);
        }
        return sb.toString();
    }
    public static void main(String args[]){
        String a = "Baku";
        System.out.println(explode(a));
    }
}
