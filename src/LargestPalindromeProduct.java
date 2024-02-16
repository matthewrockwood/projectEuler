public class LargestPalindromeProduct {
    public static int Palindrome() {
        int largest = 0;



        for (int i = 100; i < 1000; i++) {
            for (int j = 100; j < 1000; j++) {
                int num = j * i;
                if(isPalindrome.tfPalidrome(num)&& num> largest){
                    largest = num;
                }



            }
        }

        return largest;

    }
}
