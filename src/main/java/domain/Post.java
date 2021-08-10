package domain;

public class Post {
    private int ownerID;
    private String avatarUrl;
    private String userName;
    private String dateOfPublication;
    private String text;
    private Photo photo;
    private Video video;
    private VisualLink visualLink;
    private MultipleChoiceSurvey multipleChoiceSurvey;
    private Poster poster;
    private Graffiti graffiti;
    private int likesInfo;
    private Comments comments;
    private int commentsInfo;
    private AdditionalService aditionalService;
    private int numberOfSharedPostsInfo;
    private Share share;
    private boolean сanViewUnregisteredUser;

    public int getOwnerID() {
        return ownerID;
    }

    public String getText() {
        return text;
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

    public boolean isСanViewUnregisteredUser() {
        return сanViewUnregisteredUser;
    }

    public Graffiti getGraffiti() {
        return graffiti;
    }

    public Comments getComments() {
        return comments;
    }

    public Poster getPoster() {
        return poster;
    }

    public AdditionalService getAditionalService() {
        return aditionalService;
    }

    public int getCommentsInfo() {
        return commentsInfo;
    }

    public Photo getPhoto() {
        return photo;
    }

    public Video getVideo() {
        return video;
    }

    public int getLikesInfo() {
        return likesInfo;
    }

    public int getNumberOfSharedPostsInfo() {
        return numberOfSharedPostsInfo;
    }

    public MultipleChoiceSurvey getMultipleChoiceSurvey() {
        return multipleChoiceSurvey;
    }

    public Share getShare() {
        return share;
    }

    public VisualLink getVisualLink() {
        return visualLink;
    }

    public void setOwnerID(int ownerID) {
        this.ownerID = ownerID;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public void setDateOfPublication(String dateOfPublication) {
        this.dateOfPublication = dateOfPublication;
    }

    public void setСanViewUnregisteredUser(boolean сanViewUnregisteredUser) {
        this.сanViewUnregisteredUser = сanViewUnregisteredUser;
    }

    public void setAditionalService(AdditionalService aditionalService) {
        this.aditionalService = aditionalService;
    }

    public void setComments(Comments comments) {
        this.comments = comments;
    }

    public void setCommentsInfo(int commentsInfo) {
        this.commentsInfo = commentsInfo;
    }

    public void setGraffiti(Graffiti graffiti) {
        this.graffiti = graffiti;
    }

    public void setLikesInfo(int likesInfo) {
        this.likesInfo = likesInfo;
    }

    public void setMultipleChoiceSurvey(MultipleChoiceSurvey multipleChoiceSurvey) {
        this.multipleChoiceSurvey = multipleChoiceSurvey;
    }

    public void setNumberOfSharedPostsInfo(int numberOfSharedPostsInfo) {
        this.numberOfSharedPostsInfo = numberOfSharedPostsInfo;
    }

    public void setPhoto(Photo photo) {
        this.photo = photo;
    }

    public void setPoster(Poster poster) {
        this.poster = poster;
    }

    public void setShare(Share share) {
        this.share = share;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    public void setVisualLink(VisualLink visualLink) {
        this.visualLink = visualLink;
    }
}
































