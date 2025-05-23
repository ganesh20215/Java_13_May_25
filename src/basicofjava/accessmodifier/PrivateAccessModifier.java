package basicofjava.accessmodifier;

public class PrivateAccessModifier {

    private int p = 700;

    private void demoMethod(){
        System.out.println("Private Method");
    }

    public static void main(String[] args) {
        PrivateAccessModifier pam = new PrivateAccessModifier();
        System.out.println(pam.p);
        pam.demoMethod();
    }
}
