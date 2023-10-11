import java.util.ArrayList;

public class BigNumbers {

    public ArrayList<Integer> sum( int[] number1, int[] number2){
        int overflow = 0;
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = number1.length - 1; i>=0;i--){
            int digit = (number1[i]+number2[i]+overflow)%10;
            overflow = (number1[i]+number2[i]+overflow)/10;
            result.add(digit);
        }

        return result;
    }
}