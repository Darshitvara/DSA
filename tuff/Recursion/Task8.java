public class Task8 {
    public static void main(String x[]){
        System.out.println(isPalindrom("aba"));
    }
    public static boolean isPalindrom(String s){
        int mid = s.length()/2;
        int len = s.length();
        boolean flag = true;
        if(len==0){
            return false;
        }
       for(int i = 0;i<=mid ;i++){
            if(s.charAt(i) != s.charAt(len-1-i)){
                flag = false;
                return flag;
            }
       }
       
       return flag;
    }
}
