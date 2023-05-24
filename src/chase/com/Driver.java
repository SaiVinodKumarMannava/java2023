package chase.com;

public class Driver {
    public static void main(String[] args) {
        //MethodwithoutReturnArguments m=new MethodwithoutReturnArguments();
       // m.add(); This is for method without return type and without arguments


        /*MWithAR m=new MWithAR();// This is for method with return type and with arguments
       int result= m.add1(1,2);
       System.out.println(result);*/


        //MWoRandA m=new MWoRandA();
        //m.add(1,2);    This is method without return type and with arguments


        MwRandOA m=new MwRandOA();
        m.add();
        int result=m.add();
        System.out.print(result);//Method with return type and without argument
    }
}
