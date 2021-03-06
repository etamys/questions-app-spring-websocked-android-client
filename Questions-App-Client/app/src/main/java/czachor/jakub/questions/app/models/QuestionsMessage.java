package czachor.jakub.questions.app.models;

import com.google.gson.Gson;

import java.util.List;

public class QuestionsMessage {
    private MessageType type;
    private List<Long> answers;
    private Long questionId;

    public QuestionsMessage() {
    }

    public QuestionsMessage(MessageType type) {
        this.type = type;
    }

    public MessageType getType() {
        return type;
    }

    public void setType(MessageType type) {
        this.type = type;
    }

    public List<Long> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Long> answers) {
        this.answers = answers;
    }

    public Long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    public String json() {
        return new Gson().toJson(this);
    }
}
