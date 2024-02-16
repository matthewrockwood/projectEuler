public class SmallestMutiple {
    public static int smallest(){
        int test = 0;
        int num = 0;

        while(test != 20) {
            num++;
            for(int i = 1; i <= 20; i++){
                if(num%i == 0){
                    test++;
                }
                else{
                    test = 0;
                    break;
                }
            }

        }
        return num;
    }
}
