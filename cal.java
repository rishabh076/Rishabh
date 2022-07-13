import java.util.Scanner;

public class cal {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("input the value of a and b");
            int a= sc.nextInt();
            int b=sc.nextInt();
            int sum=0;
            sum=a+b;
           int  mul=a*b;
           int sub=a-b;

            System.out.println("your sum is "+sum);
            System.out.println("your mul is "+mul);
            System.out.println("your sub is "+sub);
        }

        
    }
    
}
