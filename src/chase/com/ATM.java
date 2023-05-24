package chase.com;
import java.util.Scanner;

public class ATM {
    public static void main(String[] args){
       AtmMethod atm=new AtmMethod();
       boolean finalresult = atm.atmmethod();
       if(finalresult){
           System.out.println("Login Success");
       }else{
           System.out.println("Login Failed");
       }
    }
}
