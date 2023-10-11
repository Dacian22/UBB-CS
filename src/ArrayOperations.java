public class ArrayOperations {
    public int maximum(int[] array){
        int max = Integer.MIN_VALUE;
        for (int i = 0 ;i< array.length;i++){
            if(array[i] > max){
                max = array[i];
            }
        }

        return max;
    }

    public int minimum(int[] array){
        int min = Integer.MAX_VALUE;
        for (int i = 0 ;i< array.length;i++){
            if(array[i] < min){
                min = array[i];
            }
        }

        return min;
    }

    int maximal_sum(int[] array){
        int sum = 0;
        int min = this.minimum(array);

        for (int i = 0 ;i< array.length;i++){
            sum += array[i];
        }

        return sum - min;
    }

}
