package Question;

public class Question {
    final int id;
    public int nextId;
    private String question;
    private int answerCode;

    public Question() {
        this.id = nextId++;
    }

}
