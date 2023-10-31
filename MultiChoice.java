package TestSystem;
import java.util.Arrays;
public class MultiChoice extends Question{
    protected char[] answers;
    public MultiChoice(){
        super();
    }
    public MultiChoice(String text, String[] options, char[] answers){
        super(text,options);
        this.answers=answers;
    }

    public void setAnswers(char[] answers) {
        this.answers = answers;
    }

    public char[] getAnswers() {
        return answers;
    }

    public boolean check(char[] daan){
        char[] a = getAnswers();
        for(int i=0;i<daan.length;i++){
            daan[i]=Character.toUpperCase(daan[i]);
        }
        Arrays.sort(daan);
        Arrays.sort(a);
        String sortedStr1 = String.valueOf(daan);
        String sortedStr2 = String.valueOf(a);
        return sortedStr1.equals(sortedStr2);
    }
    public void print(){
        super.print();
    }
}
