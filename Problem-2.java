import java.util.Scanner;

public class Problem-2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int a=sc.nextInt();
        int val=1;
        for(int i=1;i<=a;i++){
            System.out.print( val);
            if(i<a){
                System.out.print(",");
            }
            val+=2;
        }
        sc.close();
    }

}
