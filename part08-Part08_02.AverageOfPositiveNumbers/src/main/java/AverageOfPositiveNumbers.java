
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0 ;
        int count = 0 ;
        while (true) {
            int t = Integer.valueOf(scanner.nextLine());
            if (t==0) {
                break;
            }
            if (t>0) {
                sum = sum + t ;
                count++;
            } 
        }
        if (count==0) {
            System.out.println("Cannot calculate the average");
        }
        double avg = (1.0*sum)/count ;
        System.out.println(avg);
    }
}
