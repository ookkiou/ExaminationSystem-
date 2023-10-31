package TestSystem;

import java.util.Arrays;

public class Question {
    protected String text;
    protected String[] options;
    public Question(){
        super();
    }
    public Question(String text,String[] options){
        this.options=options;
        this.text=text;
    }

    public String getText() {
        return text;
    }

    public String[] getOptions() {
        return options;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setOptions(String[] options) {
        this.options = options;
    }

    public void print(){
        System.out.println(getText());
        String[] a = getOptions();
        for(int i=0;i<getOptions().length;i++) {
            System.out.print(a[i]+"\t");
        }
        System.out.println();
        System.out.print("Please choose:");
    }
}
