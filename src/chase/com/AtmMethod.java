package chase.com;

import java.util.Scanner;

public class AtmMethod {
    public boolean atmmethod(){
        String username="Sai@gmail.com";
        String pin="Sai@2";
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Username: ");
        String inputusername=s.nextLine();
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter Pin: ");
        String inputpin= s1.nextLine();
        if(inputusername.equalsIgnoreCase(username) && inputpin.equals(pin)){
            return true;
        }
        else{
            return false;
        }
    }
}
