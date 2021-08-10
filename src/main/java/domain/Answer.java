package domain;

public class Answer {
    private int ownerID;
    private String userName;
    private String avatarUrl;
    private String dateOfPublication;
    private String text;
    private String photoUrl;
    private String videoUrl;
    private String audioUrl;
    private String fileUrl;
    private int numberOfLikesInfo;
    private boolean canAnswer;
    private boolean сanViewUnregisteredUser;

    public int getOwnerID() {
        return ownerID;
    }

    public String getUserName() {
        return userName;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public String getDateOfPublication() {
        return dateOfPublication;
    }

    public String getText() {
        return text;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public String getAudioUrl() {
        return audioUrl;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public int getNumberOfLikesInfo() {
        return numberOfLikesInfo;
    }

    public boolean isСanViewUnregisteredUser() {
        return сanViewUnregisteredUser;
    }

    public boolean isCanAnswer() {
        return canAnswer;
    }

    public void setOwnerID(int ownerID) {
        this.ownerID = ownerID;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setСanViewUnregisteredUser(boolean сanViewUnregisteredUser) {
        this.сanViewUnregisteredUser = сanViewUnregisteredUser;
    }

    public void setAudioUrl(String audioUrl) {
        this.audioUrl = audioUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public void setCanAnswer(boolean canAnswer) {
        this.canAnswer = canAnswer;
    }

    public void setDateOfPublication(String dateOfPublication) {
        this.dateOfPublication = dateOfPublication;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    public void setNumberOfLikesInfo(int numberOfLikesInfo) {
        this.numberOfLikesInfo = numberOfLikesInfo;
    }

    public void setText(String text) {
        this.text = text;
    }

}
