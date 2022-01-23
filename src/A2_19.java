import java.util.Scanner;

public class A2_19 {
    public static void main(String[] args){
        System.out.print("Enter the coordinates of three points separated " +
                "by spaces like x1, y1, x2, y2, x3, y3: ");
        Scanner scann = new Scanner(System.in);
        int i = 0;
        double x1, x2, x3, y1, y2, y3;
        if (scann.hasNextDouble()) {
            x1 = scann.nextDouble();
            if (scann.hasNextDouble()) {
                y1 = scann.nextDouble();
                if (scann.hasNextDouble()) {
                    x2 = scann.nextDouble();
                    if (scann.hasNextDouble()) {
                        y2 = scann.nextDouble();
                        if (scann.hasNextDouble()) {
                            x3 = scann.nextDouble();
                            if (scann.hasNextDouble()) {
                                y3 = scann.nextDouble();
                                double side1 = Math.pow(Math.pow ((x1 - x2), 2) + Math.pow((y1 - y2), 2), 0.5);
                                double side2 = Math.pow(Math.pow ((x1 - x3), 2) + Math.pow((y1 - y3), 2), 0.5);
                                double side3 = Math.pow(Math.pow ((x3 - x2), 2) + Math.pow((y3 - y2), 2), 0.5);
                                double s = (side1 + side2 + side3) / 2;
                                double area = Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);
                                System.out.print("The area of the triangle is ");
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
            }else {
                System.out.println("\nError.");
                return;
            }
        } else {
            System.out.println("\nError.");
            return;
        }
    }
}
