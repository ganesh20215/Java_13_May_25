package basicofjava.loops;

public class IfElseIfLadder {

    public static void main(String[] args) {

        int marks = 40;
        if (marks >= 190 && marks <= 200) {
            System.out.println("Candidate is eligible for MBBS..");
        } else if (marks >= 175 && marks <= 189) {
            System.out.println("Candidate is eligible for IIT....");
        } else if (marks >= 150 && marks <= 174) {
            System.out.println("Candidate is NIT Engineering....");
        } else if (marks >= 120 && marks <= 149) {
            System.out.println("Candidate is MIT Engineering....");
        } else if (marks >= 90 && marks <= 119) {
            System.out.println("Candidate is Engineering....");
        } else if (marks >= 70 && marks <= 89) {
            System.out.println("Candidate is Pharamacy....");
        } else if (marks >= 60 && marks <= 69) {
            System.out.println("Candidate is BCA....");
        } else if (marks >= 40 && marks <= 59) {
            System.out.println("Candidate is BSC....");
        } else {
            System.out.println("Candidate is failed.....");
        }
    }
}
