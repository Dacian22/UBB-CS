import java.util.Arrays;

public class ElectronikShop {
    public int billigsteTastatur(int[] tastaturen) throws Exception {
        if(tastaturen.length == 0){
            throw new Exception("Array length 0");
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0 ;i< tastaturen.length;i++){
            if(tastaturen[i] < min){
                min = tastaturen[i];
            }
        }

        return min;
    }

    public int teurersteGegenstand(int[] gegenstand){
        int max = Integer.MIN_VALUE;
        for (int i = 0 ;i< gegenstand.length;i++){
            if(gegenstand[i] > max){
                max = gegenstand[i];
            }
        }

        return max;
    }

    public int teuersteLaufwerk(int[] price, int budget){
        int max = Integer.MIN_VALUE;
        for (int i = 0 ;i< price.length;i++){
            if(price[i] > max && price[i] <= budget){
                max = price[i];
            }
        }

        return max;
    }


    public int setup(int budget, int[] tastaturen, int[] laufwerk){
        int max = Integer.MIN_VALUE;
        Arrays.stream(tastaturen).sorted();
        Arrays.stream(laufwerk).sorted();

        for (int i = 0 ;i< tastaturen.length;i++){
            for (int j = 0 ;j< laufwerk.length;j++) {
                if (laufwerk[j] +tastaturen[i]  > max && (laufwerk[j] +tastaturen[i]) <= budget) {
                    max = laufwerk[j] +tastaturen[i];
                }
            }
        }

        return max;
    }

}
