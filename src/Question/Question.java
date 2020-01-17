package Question;

public class Question {
    final int id;
    public int nextId;
    private String question;
    private int answerCode;

    public Question(String question, int answerCode) {
        this.question = question;
        this.answerCode = answerCode;
        this.id = nextId++;
    }

}
