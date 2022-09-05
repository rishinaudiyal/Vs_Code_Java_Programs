import java.util.*;

import java.util.Arrays;
import java.util.stream.IntStream;



public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter p r and x");
        int p = sc.nextInt();
        int r = sc.nextInt();
        int x = sc.nextInt();

        if (p <= 0)
            System.exit(0);
        if (p > 10000)
            System.exit(0);
        if (r <= 0)
            System.exit(0);
        if (r > 10000)
            System.exit(0);
        if (p > r)
            System.exit(0);
        if (x <= 0)
            System.exit(0);
        if (x > 36)
            System.exit(0);

        int lengt = r - p;
        System.out.println("" + lengt);
       // int arrlen = lengt + 1;


        int[] arr = IntStream.rangeClosed(p, r).toArray();
        System.out.println(Arrays.toString(arr));

       
       // String s= Arrays.toString(arr);
       sc.close();
    }
}
