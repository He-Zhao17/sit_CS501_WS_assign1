import java.util.Scanner;

public class A2_15 {
    public static void main(String[] args) {
        System.out.print("Enter x1 and y1: ");
        Scanner scan = new Scanner(System.in);
        if (scan.hasNextDouble()) {
            double x1 = scan.nextDouble();
            if (scan.hasNextDouble()) {
                double y1 = scan.nextDouble();
                System.out.print("\nEnter x2 and y2:");
                if (scan.hasNextDouble()) {
                    double x2 = scan.nextDouble();
                    if (scan.hasNextDouble()) {
                        double y2 = scan.nextDouble();
                        Double area = Math.pow(Math.pow ((x1 - x2), 2) + Math.pow((y1 - y2), 2), 0.5);
                        System.out.print("\nThe distance between the two points is ");
                        System.out.print(area);

                    } else {
                        System.out.println("\nError.");
                        return;
                    }
                } else {
                    System.out.println("\nError.");
                    return;
                }
            } else {
                System.out.println("\nError.");
                return;
            }
        } else {
            System.out.println("\nError.");
            return;
        }





    }
}