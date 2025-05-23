package basicofjava.operator;

public class PreFixOperator {

    public static void main(String[] args) {
        //Prefix Incremental Operator
        //1. PIO always we can use with ++ symbol
        //2. PIO always we can use before variable
        //3. PIO we can't use with number's
        //4. PIO always increased the value by one only
        //5. PIO always increased value by one first and then assignment will be happened.

     /*   int x = 10;
        int y = ++x;
        int z = y;*/

        int x = 10;
        int y = --x;
        int z = y;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

    }
}
