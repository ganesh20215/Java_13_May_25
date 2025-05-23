package basicofjava.classesandobject;

public class ReturnStatementExample {

    public int multiplication(int a, int b){
        int mul = a * b;

        return mul;
    }

    public void addition(int a){
        System.out.println(100 + a);
    }

    public static void main(String[] args) {
        ReturnStatementExample rs = new ReturnStatementExample();
        int output = rs.multiplication(15, 20);


        rs.addition(output);
    }
}
