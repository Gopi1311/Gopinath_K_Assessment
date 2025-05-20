import java.util.Scanner;

public class Problem-1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the A value: ");
        double a=sc.nextDouble();
        System.out.println("Enter the B value: ");
        double b=sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter the Operation (add, sub, mul, div) :");
        String operation=sc.nextLine();

        double result=calculate(a,b,operation);
        System.out.println("Result : "+result);
        sc.close();
    }

    private static double calculate(double a, double b, String operation) {
        operation=operation.toLowerCase();
        switch (operation){
            case "add":
                return a+b;
            case "sub":
                return a-b;
            case "mul":
                return a*b;
            case "div":
                if(b!=0){
                    return a/b;
                }else {
                    System.out.println("Error: cannot divide by Zero");
                }
                return Double.NaN;
            default:
                System.out.println("Invalid Operation");
                return Double.NaN;
        }
    }
}
