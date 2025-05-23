package basicofjava.accessmodifier;

public class ExampleOfDefaultAccessModifier {

    int q = 800;

    void demoForDefault() {
        System.out.println("Default Method");
    }

    public static void main(String[] args) {
        ExampleOfDefaultAccessModifier e = new ExampleOfDefaultAccessModifier();
        System.out.println(e.q);
        e.demoForDefault();
    }
}
