package basicofjava.languagefundamentals;

public class LocalVariable {


    public void methodForLocalVariable(){
        int m = 900;        //local variable
    }

    public static void main(String[] args) {
        LocalVariable l = new LocalVariable();
        l.methodForLocalVariable();
    }
}
