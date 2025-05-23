package basicofjava.loops;

public class NestedForLoopExample {

    public static void main(String[] args) {

        for (int i = 1; i <= 3; i++) {      //Outer loop represent to the rows
            for (int j = 1; j <= 3; j++) {  //Inner loop represent to the column
                System.out.println(i + " " + j);
            }
        }
    }
}
