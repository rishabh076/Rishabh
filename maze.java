public class maze {
    public static int countPath(int i, int j, int n, int m){
        if(i==n || j==m){
            return 0;
        }
        if(i==n-1 && j==m-1){
            return 1;
        }
        //move downward 
        int downPath=countPath(i+1, j, n, m);
        //right path 
        int rightPath=countPath(i, j+1, n, m);
        return downPath+rightPath;
    }
    public static void main(String[] args) {
        
        int n=4,m=5;
        int result= countPath(0, 0, n, m);
        System.out.println(result);
        
    }
    
}
