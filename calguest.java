public class calguest {
    
    
    public static int calGuestman(int n){
        if(n<=1){
            return 1;

        }
        //single
        int singleWay=calGuestman(n-1);
        //pair
        int pairWay=(n-1)*calGuestman(n-2);
        return singleWay+pairWay;

    }
    public static void main(String[] args) {
        int n=4;
        System.out.println(calGuestman(n));
        
    }
    
}
