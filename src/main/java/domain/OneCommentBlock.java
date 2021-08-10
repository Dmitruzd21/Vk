package domain;

public class OneCommentBlock {
    private int id;
    private int ownerID;
    private boolean interesting;
    private String userName;
    private String avatarUrl;
    private String dateOfPublication;
    private String text;
    private String photoUrl;
    private String videoUrl;
    private String audioUrl;
    private String fileUrl;
    private boolean answersInfo;
    private Answer answer;
    private int numberOfLikesInfo;
    private boolean canAnswer;
    private Complain complain;

    public int getId() {
        return id;
    }

    public int getOwnerID() {
        return ownerID;
    }

    public boolean isCanAnswer() {
        return canAnswer;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public int getNumberOfLikesInfo() {
        return numberOfLikesInfo;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public String getAudioUrl() {
        return audioUrl;
    }

    public String getText() {
        return text;
    }

    public String getDateOfPublication() {
        return dateOfPublication;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public String getUserName() {
        return userName;
    }

    public Answer getAnswer() {
        return answer;
    }

    public boolean isAnswersInfo() {
        return answersInfo;
    }

    public boolean isInteresting() {
        return interesting;
    }

    public Complain getComplain() {
        return complain;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setOwnerID(int ownerID) {
        this.ownerID = ownerID;
    }

    public void setAnswer(Answer answer) {
        this.answer = answer;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setNumberOfLikesInfo(int numberOfLikesInfo) {
        this.numberOfLikesInfo = numberOfLikesInfo;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    public void setDateOfPublication(String dateOfPublication) {
        this.dateOfPublication = dateOfPublication;
    }

    public void setCanAnswer(boolean canAnswer) {
        this.canAnswer = canAnswer;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public void setAudioUrl(String audioUrl) {
        this.audioUrl = audioUrl;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setComplain(Complain complain) {
        this.complain = complain;
    }

    public void setAnswersInfo(boolean answersInfo) {
        this.answersInfo = answersInfo;
    }

    public void setInteresting(boolean interesting) {
        this.interesting = interesting;
    }

}
