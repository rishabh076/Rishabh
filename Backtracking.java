public class Backtracking {
    public static void printPemutaton(String str,String perm,int idx){
        if(str.length()==0){
            System.out.println(perm);
            return;
        }
        for(int i=0;i<str.length();i++){
            char currchar=str.charAt(i);
            String newstr=str.substring(0, i)+str.substring(i+1);
            printPemutaton(newstr, perm+currchar, idx+i);
        }
    }
    
    public static void main(String[] args) {
        String str="ABC";
        printPemutaton(str, " ", 0);
        
    }
}
