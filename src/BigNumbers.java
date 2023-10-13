import java.util.ArrayList;

public class BigNumbers {

    public ArrayList<Integer> sum( int[] number1, int[] number2) throws Exception {
        int overflow = 0;
        if(number1.length != number2.length){
            throw new Exception("Array length different");
        }
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = number1.length - 1; i>=0;i--){
            int digit = (number1[i]+number2[i]+overflow)%10;
            overflow = (number1[i]+number2[i]+overflow)/10;
            result.add(0,digit);
        }

        if (overflow ==1){
            result.add(0,overflow);
        }

        return result;
    }

    public ArrayList<Integer> difference( int[] number1, int[] number2) throws Exception {
        Integer overflow = 0;
        if(number1.length != number2.length){
            throw new Exception("Array length different");
        }
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = number1.length - 1; i>=0;i--){

            Integer digit = (number1[i]-number2[i]-overflow)%10;
            System.out.printf("d"+digit.toString());

            if(digit < 0){
                digit +=10;
                overflow = 1;
            }
            else{
                overflow = 0;
            }
            System.out.printf("d"+digit.toString());
//            overflow = (number1[i]-number2[i]-overflow);
//            if (overflow < 0){
//                overflow = 1;
//            }
            result.add(0,digit);
            System.out.println(overflow.toString());
//            overflow = (number1[i]-number2[i]-overflow)/10 * -1;

        }

        if (overflow ==1){
            result.add(0,overflow);
        }

        return result;
    }


    public ArrayList<Integer> multiplication( int[] number1, int number2) throws Exception {
        int overflow = 0;
        if(number1.length == 0){
            throw new Exception("Array length 0");
        }
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = number1.length - 1; i>=0;i--){
            int digit = (number1[i]*number2+overflow%10)%10;
            overflow/=10;
            overflow += (number1[i]*number2+overflow%10)/10;
            result.add(0,digit);
        }

        if (overflow > 0){
            result.add(0,overflow);
        }

        return result;
    }


    public ArrayList<Integer> division(int[] number1, int number2) throws Exception {
        Integer remainder = 0;
        if(number1.length == 0){
            throw new Exception("Array length 0");
        }
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < number1.length; i++) {
            int divisor = number1[i] + remainder * 10;
            int quotient = divisor / number2;
            remainder = divisor % number2;

            result.add(quotient);
        }

        while (result.size() > 0 && result.get(0) == 0) {
            result.remove(0);  // Remove leading zeros
        }

        if (result.isEmpty()) {
            result.add(0);  // Ensure there's at least one digit in the result
        }

        return result;
    }
}
