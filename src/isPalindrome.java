public class isPalindrome {
    public static boolean tfPalidrome(int x){
        String nums = String.valueOf(x);

        for(int i = 0; i < nums.length()/2; i++){
            if(nums.charAt(i) != nums.charAt(nums.length() - 1 - i)){
                return false;
            }
        }
        return true;
    }
}
