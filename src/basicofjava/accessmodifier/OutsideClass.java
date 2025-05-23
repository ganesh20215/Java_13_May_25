package basicofjava.accessmodifier;

public class OutsideClass {

    public static void main(String[] args) {

        //private access modifier
/*        PrivateAccessModifier pam = new PrivateAccessModifier();
        System.out.println(pam.p);
        pam.demoMethod();*/

        //default access modifier
        ExampleOfDefaultAccessModifier e = new ExampleOfDefaultAccessModifier();
        System.out.println(e.q);
        e.demoForDefault();
    }
}
