package QuestionList;


import Question.Question;

import java.util.ArrayList;
import java.util.List;

public class QuestionList {

    public QuestionList() {

    }

    List<Question> questionList = new ArrayList<>();

    public void addQuestion(Question question) {
        questionList.add(question);
    }

    public ArrayList<Question> printOriginalList() {
        List<Question> questionList = new ArrayList();
        Question q1 = new Question("What was Elvis' real hair colour?\n" +
                "1. blond\n" +
                "2. black\n" +
                "3. brown", 1);
        questionList.add(q1);
        Question q2 = new Question("How many bones are in the human body?\n" +
                "1. 573\n" +
                "2. 206\n" +
                "3. 209", 2);
        questionList.add(q2);
        Question q3 = new Question("What year was Microsoft founded?\n" +
                "1. 1023\n" +
                "2. 1975\n" +
                "3. 1990", 2);
        questionList.add(q3);
        Question q4 = new Question("In what year was Java released?\n" +
                "1. 1996\n" +
                "2. 1995\n" +
                "3. 1865", 1);
        questionList.add(q4);
        return null;

    }



}
