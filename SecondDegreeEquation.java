import java.util.Scanner;

public class SecondDegreeEquation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double a = s.nextDouble();
        double b = s.nextDouble();
        double c = s.nextDouble();
        
        if (a == 0) {
            if (b == 0) {
                if (c != 0) {
                    System.out.println("No solution");
                } else {
                    System.out.println("Infinitely many solutions");
                }
            } else {
                double x = -c / b;
                System.out.printf("%.2f%n", x);
            }
        } else {
            double dis = b*b - 4*a*c;
            if (dis < 0) {
                System.out.println("No solution");
            } else if (dis == 0) {
                double x = -b / (2*a);
                System.out.printf("%.2f%n", x);
            } else {
                double x1 = (-b + Math.sqrt(dis)) / (2*a);
                double x2 = (-b - Math.sqrt(dis)) / (2*a); 
                System.out.printf("%.2f%n", x1);
                System.out.printf("%.2f%n", x2);               
            }
        }

        s.close();
    }
}
