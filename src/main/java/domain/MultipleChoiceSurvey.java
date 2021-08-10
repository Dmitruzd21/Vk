package domain;

public class MultipleChoiceSurvey {
    private int ownerID;
    private String question;
    private String nameOfObject;
    private int numberOfAnswersInfo;
    private String answer;
    private int numberOfVoters;
    private String mainPageUrl;

    public int getOwnerID() {
        return ownerID;
    }

    public int getNumberOfAnswersInfo() {
        return numberOfAnswersInfo;
    }

    public int getNumberOfVoters() {
        return numberOfVoters;
    }

    public String getAnswer() {
        return answer;
    }

    public String getMainPageUrl() {
        return mainPageUrl;
    }

    public String getNameOfObject() {
        return nameOfObject;
    }

    public String getQuestion() {
        return question;
    }

    public void setOwnerID(int ownerID) {
        this.ownerID = ownerID;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public void setMainPageUrl(String mainPageUrl) {
        this.mainPageUrl = mainPageUrl;
    }

    public void setNameOfObject(String nameOfObject) {
        this.nameOfObject = nameOfObject;
    }

    public void setNumberOfAnswersInfo(int numberOfAnswersInfo) {
        this.numberOfAnswersInfo = numberOfAnswersInfo;
    }

    public void setNumberOfVoters(int numberOfVoters) {
        this.numberOfVoters = numberOfVoters;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

}
