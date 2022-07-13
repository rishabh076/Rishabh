public class recursion1 {
    public static int calculatefactorial(int n){
        if(n==1 || n==0){
            return 1;
        }
        int fact_nm1=calculatefactorial(n-1);
        int fact_n=n*fact_nm1;
        return fact_n;

    
    }
        
      
    public static void main(String[] args) {

        int n=5;
        int ans=calculatefactorial(n);
        System.out.println(ans);
  
       
        
    }
    
}
