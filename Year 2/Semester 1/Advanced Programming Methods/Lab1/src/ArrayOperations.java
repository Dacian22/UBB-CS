package src;


import javax.lang.model.type.NullType;


public class ArrayOperations {
    public int maximum(int[] array) throws Exception {
        if (array.length == 0) {
            throw new Exception("Array length 0");
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }

    public int minimum(int[] array) throws Exception {
        if (array.length == 0) {
            throw new Exception("Array length 0");
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;
    }

    int maximal_sum(int[] array) throws Exception {
        if (array.length == 0) {
            throw new Exception("Array length 0");
        }
        int sum = 0;
        int min = this.minimum(array);

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return sum - min;
    }

    int minimal_sum(int[] array) throws Exception {
        if (array.length == 0) {
            throw new Exception("Array length 0");
        }
        int sum = 0;
        int max = this.maximum(array);

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return sum - max;
    }

}
