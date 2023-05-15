import java.util.Arrays;
public class Anagrams {
    public static void main(String[] args){
        String x="SILENT";
        String y="LISTEN";
        char a[]= x.toCharArray();
        char b[]=y.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        Boolean result = Arrays.equals(a,b);
        if(result == true)
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");
    }
}
