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

        if (overflow ==1){
            result.add(overflow);
        }

        return result;
    }

    public ArrayList<Integer> difference( int[] number1, int[] number2){
        int overflow = 0;
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = number1.length - 1; i>=0;i--){
            int digit = (number1[i]-number2[i]-overflow)%10;
            if(digit < 0){
                digit +=10;
            }
            overflow = (number1[i]-number2[i]-overflow)/10 * -1;
            result.add(digit);
        }

        if (overflow ==1){
            result.add(overflow);
        }

        return result;
    }


    public ArrayList<Integer> multiplication( int[] number1, int number2){
        int overflow = 0;
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = number1.length - 1; i>=0;i--){
            int digit = (number1[i]*number2+overflow%10)%10;
            overflow/=10;
            overflow += (number1[i]*number2+overflow%10)/10;
            result.add(digit);
        }

        if (overflow > 0){
            result.add(overflow);
        }

        return result;
    }

    public ArrayList<Integer> division( int[] number1, int number2){
        int remainer = 0;
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = number1.length - 1; i>=0;i--){
            int divisor = number1[i];
            while((divisor + remainer) / number2 == 0){
                divisor = divisor*10+number1[i+1];
                i++;
                remainer *=10;
            }
            int digit = ((divisor + remainer)/number2)%10;

            remainer = ((divisor + remainer)/number2)/10 ;
            result.add(digit);
        }

        if (remainer > 0){
            result.add(remainer);
        }

        return result;
    }
}
