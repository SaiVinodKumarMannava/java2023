package chase.com;
import java.lang.String;
import java.util.Scanner;


public class Percentage {
    public void marksInExams() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your Marks:");
        float marks= scanner.nextFloat();
        if(marks >100){
            System.out.println("you are out of class");
        }
       else if (marks > 70) {
            System.out.print("You got A grade");
        } else if (marks >=60 /*&& marks<70*/ ) {
            System.out.println("You got B grade");
        } else if (marks >=50 /*&& marks <60 */) {
            System.out.println("You got C grade");
        } else {
            System.out.println("you failed");
        }
    }
}

