public class Split {
    public static void main(String[] args) {
        String s1="welcome to java";
        String[] s = s1.split(" ");
        for( String temp : s){
            System.out.print(temp);
        }
    }
}
