public class tile {
    public static int calTareeke(int n,int m){
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        //vertical
        int verticalPath=calTareeke(n-m, m);
        //Horizontal
        int horzontalPath= calTareeke(n-1, m);
        return verticalPath+horzontalPath;
    }
    public static void main(String[] args) {
        int n=4,m=2;

        System.out.println(calTareeke(n, m));

        
    }
    
}
