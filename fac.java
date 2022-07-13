

public class fac {
    public static void calFact(int n, int fact){
        if(n==0){
            System.out.println(fact);
            return;
        }
        fact*=n;
        calFact(n-1, fact);

        
    }
    public static void main(String[] args) {
        calFact(5, 1);
        
    }
    
}
