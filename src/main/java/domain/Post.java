package domain;

public class Post {
    private int id;
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
    private LikesInfo likesInfo;
    private Comments comments;
    private int commentsInfo;
    private AdditionalService aditionalService;
    private int numberOfSharedPostsInfo;
    private Share share;
    private boolean сanViewUnregisteredUser;
    private int fromId; //идентификатор автора записи (от чьего имени опубликована запись).
    private int createdBy;  //идентификатор администратора, который опубликовал запись (возвращается только для сообществ при запросе с ключом доступа администратора). Возвращается в записях, опубликованных менее 24 часов назад.
    private boolean friendsOnly; //1, если запись была создана с опцией «Только для друзей».
    private boolean markedAsAds; //информация о том, содержит ли запись отметку "реклама" (1 — да, 0 — нет).
    private boolean isPinned;   //информация о том, что запись закреплена.
    private boolean canPin;  //информация о том, может ли текущий пользователь закрепить запись (1 — может, 0 — не может).
    private boolean canDelete;  //информация о том, может ли текущий пользователь удалить запись (1 — может, 0 — не может).
    private boolean canEdit;  //информация о том, может ли текущий пользователь редактировать запись (1 — может, 0 — не может).

    public int getId() {
        return id;
    }

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

    public LikesInfo getLikesInfo () {
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

    public boolean isFriendsOnly() {
        return friendsOnly;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public int getFromId() {
        return fromId;
    }

    public boolean isCanDelete() {
        return canDelete;
    }

    public boolean isCanEdit() {
        return canEdit;
    }

    public boolean isCanPin() {
        return canPin;
    }

    public boolean isMarkedAsAds() {
        return markedAsAds;
    }

    public boolean isPinned() {
        return isPinned;
    }

    public void setId(int id) {
        this.id = id;
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

    public void setLikesInfo(LikesInfo likesInfo) {
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

    public void setFromId(int fromId) {
        this.fromId = fromId;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public void setFriendsOnly(boolean friendsOnly) {
        this.friendsOnly = friendsOnly;
    }

    public void setCanDelete(boolean canDelete) {
        this.canDelete = canDelete;
    }

    public void setCanEdit(boolean canEdit) {
        this.canEdit = canEdit;
    }

    public void setCanPin(boolean canPin) {
        this.canPin = canPin;
    }

    public void setMarkedAsAds(boolean markedAsAds) {
        this.markedAsAds = markedAsAds;
    }

    public void setPinned(boolean pinned) {
        isPinned = pinned;
    }
}
































