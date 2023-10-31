package TestSystem;
import java.util.Scanner;
public class Test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        MultiChoice d1 = new MultiChoice("Characteristics of object-oriented program design is ", new String[]{"A.package","B.derive","C.polymorphism","D.Static"},new char[]{'A','B','C'});
        d1.print();
        String t1;
        t1 = sc.nextLine();
        char[] answer1 = t1.toCharArray();
        boolean check1 = d1.check(answer1);
        if(check1){
            System.out.println("OK");
        }
        else{
            System.out.println("NO");
        }
        SingleChoice d2 = new SingleChoice("Default value of int type is",new String[]{"A.0","B.1","C.2","D.3"},'A');
        d2.print();
        String t2;
        t2 = sc.nextLine();
        char[] answer2 = t2.toCharArray();
        if(answer2.length != 1){
            System.out.println("NO");
        }
        else{
            boolean check2 = d2.check(answer2[0]);
            if(check2){
                System.out.println("OK");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
