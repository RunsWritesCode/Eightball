import java.util.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;


public class EightBall {

    private ArrayList<String> answers;

    public EightBall() {
        this.answers = new ArrayList<>();
    }

    public int getNumberOfAnswers() {
        return this.answers.size();
    }

    public void add(String answer){
        this.answers.add(answer);

    }

    public String go() {
        Collections.shuffle(answers);
        return answers.get(0);
    }


}

