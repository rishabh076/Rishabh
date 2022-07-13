//import java.util.Scanner;

public class arr {
    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);
        int arr[]={4, 1,3,6,34,7};
        int max=arr[1];
        int min=arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max)
            max=arr[i];
            if(arr[i]<min)
            min=arr[i];



        }
        
        System.err.println("Your max is "+max);
        System.out.println("Your min is "+min);


    }
    
}
