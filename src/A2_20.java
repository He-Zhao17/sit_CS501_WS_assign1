import java.util.Scanner;

public class A2_20 {
    public static void main(String[] args) {
        System.out.print("Enter balance and interest rate: ");
        Scanner scan = new Scanner(System.in);
        if (scan.hasNextDouble()) {
            double balance = scan.nextDouble();
            if (scan.hasNextDouble()) {
                double inte = scan.nextDouble();
                double intNe = balance * (inte / 1200);
                System.out.print("The interest is ");
                System.out.print(intNe);
            }
        } else {
            System.out.println("Error.");
            return;
        }
    }
}
