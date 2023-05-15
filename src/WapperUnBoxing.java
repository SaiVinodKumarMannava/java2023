public class WapperUnBoxing {
    public static void main(String[] args){
        Integer i=new Integer(3);
        int a=i.intValue();
        int b=a;
        System.out.print(i+ " "+a+" "+b);
    }
}
