import java.util.Scanner;

public class digitfrq {
    public static int printFrequency(int n,int d){
        int counter=0;

        while(n>0){
             int temp= n%10;
             n=n/10;
             if(temp==d)
                 counter++;

             
        }
        return counter;

    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n=sc.nextInt();
            int d=sc.nextInt();
            int f=printFrequency(n, d);
            System.out.println(f);
        }
    }
    
}
