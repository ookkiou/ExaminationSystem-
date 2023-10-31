package TestSystem;
import java.util.Scanner;
public class SingleChoice extends Question{
    protected char answer;
    public SingleChoice(){
        super();
    }

    public char getAnswer() {
        return answer;
    }

    public void setAnswer(char answer) {
        this.answer = answer;
    }

    public SingleChoice(String text, String[] options, char answer){
        super(text,options);
        this.answer=answer;
    }
    public boolean check(char answer){
        return Character.toUpperCase(answer) == getAnswer();
    }
    public void print(){
        super.print();
    }
}
