public class ArrayOperations {
    public int maximum(int[] array){
        int max = Integer.MAX_VALUE;
        for (int i = 0 ;i< array.length;i++){
            if(array[i] > max){
                max = array[i];
            }
        }

        return max;
    }
}
