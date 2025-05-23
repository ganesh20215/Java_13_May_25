package basicofjava.languagefundamentals;

public class InstanceVariable {

    int y = 500;        //Instance/Global Variable //store in heap memory


    public static void main(String[] args) {
        InstanceVariable iv = new InstanceVariable();
        InstanceVariable iv2 = new InstanceVariable();
        System.out.println(iv.y);
        System.out.println(iv2.y);
    }
}
