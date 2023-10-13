import java.util.ArrayList;

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

        Main.test_prob_1_method_1();
        Main.test_prob_1_method_2();
        Main.test_prob_1_method_3();
        Main.test_prob_1_method_4();

    }

    public static void test_prob_1_method_1() throws Exception {
        JavaUniversity uni = new JavaUniversity();
        int [] notes ={100,2,3,4};
        ArrayList<Integer> result = new ArrayList<>();
        result = uni.insufficient_notes(notes);
        System.out.println(result);
        assert result.size() == 3;


        try{
            int[] notes2 ={};
            result = uni.insufficient_notes(notes2);
            System.out.println(result);
            assert false;
        }
        catch (Exception e){

        }

    }

    public static void test_prob_1_method_2() throws Exception {
        JavaUniversity uni = new JavaUniversity();
        int [] notes ={100,2,3,4};
        float result = uni.average_notes(notes);
        System.out.println(result);
        assert result == 27.25;


        try{
            int[] notes2 ={};
            result = uni.average_notes(notes2);
            System.out.println(result);
            assert false;
        }
        catch (Exception e){

        }

    }


    public static void test_prob_1_method_3() throws Exception {
        JavaUniversity uni = new JavaUniversity();
        int [] notes ={100,2,3,4,58};
        ArrayList<Integer> result = new ArrayList<>();
        result = uni.rounded_notes(notes);
        System.out.println(result);
        assert result.get(4) == 60;
        assert result.get(3) == 4;


        try{
            int[] notes2 ={};
            result = uni.rounded_notes(notes2);
            System.out.println(result);
            assert false;
        }
        catch (Exception e){

        }

    }

    public static void test_prob_1_method_4() throws Exception {
        JavaUniversity uni = new JavaUniversity();
        int [] notes ={2,3,4,58};
        int result = uni.maxima_rounded_note(notes);
        System.out.println(result);
        assert result == 60;


        try{
            int[] notes2 ={};
            result = uni.maxima_rounded_note(notes2);
            System.out.println(result);
            assert false;
        }
        catch (Exception e){

        }

    }

    public static void test_prob_2_method_1() throws Exception {
        ArrayOperations op = new ArrayOperations();

        int[] array = {1,2,5,3,4};

        int result = op.maximum(array);
        assert result == 5;

        try{
            int[] array2 ={};
            result = op.maximum(array2);
            System.out.println(result);
            assert false;
        }
        catch (Exception e){

        }

    }

    public static void test_prob_2_method_2() throws Exception {
        ArrayOperations op = new ArrayOperations();

        int[] array = {1,2,5,0,3,4};

        int result = op.minimum(array);
        assert result == 0;

        try{
            int[] array2 ={};
            result = op.minimum(array2);
            System.out.println(result);
            assert false;
        }
        catch (Exception e){

        }

    }

    public static void test_prob_2_method_3() throws Exception {
        ArrayOperations op = new ArrayOperations();

        int[] array = {1,2,5,3,4};

        int result = op.maximal_sum(array);
        assert result == 14;

        try{
            int[] array2 ={};
            result = op.maximal_sum(array2);
            System.out.println(result);
            assert false;
        }
        catch (Exception e){

        }

    }

    public static void test_prob_2_method_4() throws Exception {
        ArrayOperations op = new ArrayOperations();

        int[] array = {1,2,5,3,4};

        int result = op.minimal_sum(array);
        assert result == 10;

        try{
            int[] array2 ={};
            result = op.minimal_sum(array2);
            System.out.println(result);
            assert false;
        }
        catch (Exception e){

        }

    }
}