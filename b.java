public class b {
    public static void printPermulation(String str,String permultation){
        if(str.length()==0){
            System.out.println(permultation);
            return;
        }
        for(int i=0;i<str.length();i++){
            char currChar=str.charAt(i);
            String newStr= str.substring(0, i)+str.substring(i+1);
            printPermulation(newStr, permultation+currChar);
        }
    }
    public static void main(String[] args) {
        String str="abc";
        printPermulation(str, " ");
    
    }
    
}
