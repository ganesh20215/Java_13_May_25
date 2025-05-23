package basicofjava.languagefundamentals;

public class StaticMethod {

    int a = 300;
    static int b = 400;

    //static method
    public static void testMethod_1() {
        System.out.println("Test Method 1");
//        System.out.println(b);
//        System.out.println(a);
    }

    //non static method
    public void testMethod_2() {
        System.out.println("Test Method 2");
        System.out.println(b);
        System.out.println(a);
    }

    public static void main(String[] args) {
        //testMethod_1();
        StaticMethod sm = new StaticMethod();
        sm.testMethod_2();
    }
}
