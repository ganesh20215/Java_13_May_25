package basicofjava.arrays;

import java.util.Arrays;

public class OptimozedArray {

    public static void main(String[] args) {
        int[] a = {50, 80, 30, 40, 50};

/*        for (int x : a){
            System.out.println(x);
        }*/

        Arrays.sort(a);

        for (int x : a){
            System.out.println(x);
        }

    }
}
