import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> listInts = new ArrayList<Integer>() {{
            add(1);
            add(7);
            add(3);
            add(4);
        }};

        // Display values.
        for (int value : listInts) {
            System.out.print(value + " ");
        }
        System.out.println();

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
        for(Integer n : list) {
         //   int x = n * n;
            System.out.println(n);
        }

    }
}
