import java.util.Scanner;

public class Problem-3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num=sc.nextInt();
        int val=1;
        if(num % 2==0) {
            num-=1;
        }
        for(int i=1;i<=num;i++){

            System.out.print(val);
            if(i<num){
                System.out.print(",");
            }
            val+=2;
        }

        sc.close();
    }
}
