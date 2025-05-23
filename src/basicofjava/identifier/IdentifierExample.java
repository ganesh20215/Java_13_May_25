package basicofjava.identifier;

public class IdentifierExample {

    public static void main(String[] args) {

        //rule 1 : A valid identifier must have characters [A-Z].
        int ABC = 100;  //valid identifier

        //rule 2 : A valid identifier must have characters [a-z].
        int xyz = 200;  //valid identifier

        //rule 3 : we can define valid identifier with number as well.
        int ab100 = 300;  //valid identifier

        //rule 4 : we can't define identifier with number first and the character.
        //int 100tt = 400;  //invalid identifier

        //rule 5 : we can define valid identifier with _ symbol
        int _abtest = 500;  //valid identifier

        //rule 6 : we can define valid identifier with $ symbol
        int $$ab$test = 600;  //valid identifier

        //rule 7 : we can't define valid identifier with other special symbol (& % # @)
        //int ab@test = 700;  //invalid identifier

        //rule 8 : we can't use resvered keyword as an identifier
        //int float = 800;  //invalid identifier

        //rule 9 : There is no length limit for java identifiers, but it is not recommended to take to lengthy identifiers. Because it’s reduced the readability
        int asjhflkasjflasjdjashdkjasgdjhgasldhahadskjashdkjasdasndkjaskdnlkasdkjasdlasd = 600;  //valid identifier

        System.out.println($$ab$test);
    }
}
