import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws Exception {
        BigNumbers operations = new BigNumbers();

        int[] a = {1,2,3};
        int[] b = {9,1,9};
        ArrayList<Integer> result = new ArrayList<>();
        result = operations.sum(a,b);
        System.out.printf(result.toString());
        result = operations.difference(b,a);
        System.out.printf(result.toString());
        result = operations.multiplication(a,10);
        System.out.printf(result.toString());
        result = operations.division(a,10);
        System.out.printf(result.toString());


        ElectronikShop ec = new ElectronikShop();

        int[] c = {5,1,2,3};
        int[] d = {8,1,9,7};
        int result2;
        result2 = ec.billigsteTastatur(c);
        System.out.println(result2);
        result2 = ec.teurersteGegenstand(d);
        System.out.println(result2);
        result2 = ec.teuersteLaufwerk(c,2);
        System.out.println(result2);
        result2 = ec.setup(15,c,d);
        System.out.println(result2);

    }
}