package chase.com;

public class Bank {
    public static void main(String[] args){
        String s1="vinod";
        String s2=new String("vinod");
        String s3="vinod";
        System.out.println(s1==s2);// here == refers and compare the reference variable
        System.out.println(s2==s3);// So here it check for same refernce variable pointing same object
        System.out.println(s3==s1);// if we use new keyword it create new object in hash
        System.out.println("");
        System.out.println(s1.equals(s2));// Here equals method refers containt in S1 and S2 refernce variable
        System.out.println(s2.equals(s3));
        System.out.println(s3.equals(s1));// here it compare subject in the refernce variable
    }
}
