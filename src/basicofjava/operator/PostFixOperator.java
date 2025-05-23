package basicofjava.operator;

public class PostFixOperator {

    public static void main(String[] args) {

        //Postfix Incremental Operator
        //1. PIO always we can use with ++ symbol
        //2. PIO always we can use after variable
        //3. PIO we can't use with number's
        //4. PIO always increased the value by one only
        //5. PIO always assigned value first to the variable and then it increase the value later on

      /*  int x = 10;
        int y = x++;
        int z = y;*/

        //Postfix Decremental Operator
        //1. PDO always we can use with -- symbol
        //2. PDO always we can use after variable
        //3. PDO we can't use with number's
        //4. PDO always decreased the value by one only
        //5. PDO always assigned value first to the variable and then it increase the value later on

        int x = 10;
        int y = x--;
        int z = y;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
