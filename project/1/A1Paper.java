import java.util.Arrays;
import java.util.Scanner;
 
public class A1Paper {
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        // User input to enter what the A-size of the smallest papers Björn has
        int paperSize = input.nextInt();
        
        // Declaration of all the variables required 
        double tape = 0;
        double height = Math.pow(2,  (-3.0/4));
        double width = Math.pow(2, (-5.0/4));
        double perimeter = 2* (height + width * 2);
        double heightOrWidth = 1;
        double area = height * width * 2;
        double areaOfPaper = area / 2;
        
        // User input of how many paper size each Björn has. Input into array for each size of paper
        int[] papers = new int[paperSize - 1];
       
        // Loop to check if there are enough papers to make an A1 paper
        outer: {
        for (int i = 0; i < paperSize -1; i++) {
            int numPapers = input.nextInt();
            for (int j = 0; j < numPapers; j++) {
                area -=  areaOfPaper;
                papers[i] += 1;
                if (Math.pow(10, -10) > Math.abs(area)) {
                    break outer;
                }
            }
            areaOfPaper /= 2;
        }
        }
               
       // Amount of tape needed if there are enough papers to make A1. Depending on paper size, the height of the width gets divided in half
        for (int i = 0; i < paperSize - 1; i++){
            tape += papers[i] * 2 * (height + width);
            if (heightOrWidth > 0 ) {
                height /= 2;
            } else 
                width/= 2;
            
            heightOrWidth *= -1;
        }
        
        // Outputs to print when there is enough paper and when there is not
        if (Math.pow(10, -10) < Math.abs(area)) {
            System.out.print("impossible");
        } else 
            System.out.printf("%.11f\n", (tape - perimeter) / 2);
     
    }
}