//import java.util.Scanner;

public class sort {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        int arr[]={9,8,7,6,5,4,3,1};
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        
       
    }
    
}
