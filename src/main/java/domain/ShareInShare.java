package domain;

public class ShareInShare {
    private int id;
    private int ownerID;
    private boolean onMyWall;
    private String myWallUrl;
    private boolean inCommunity;
    private String communityUrl;
    private boolean inHistory;
    private boolean  inPersonalMessage;
    private String userUrl;
    private String comment;
    private String photoUrl;
    private String videoUrl;
    private String audioUrl;
    private String fileUrl;
    private Timer timer;

    public int getId() {
        return id;
    }

    public int getOwnerID() {
        return ownerID;
    }

    public String getAudioUrl() {
        return audioUrl;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public boolean isInCommunity() {
        return inCommunity;
    }

    public boolean isInHistory() {
        return inHistory;
    }

    public boolean isInPersonalMessage() {
        return inPersonalMessage;
    }

    public boolean isOnMyWall() {
        return onMyWall;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public String getComment() {
        return comment;
    }

    public String getCommunityUrl() {
        return communityUrl;
    }

    public String getMyWallUrl() {
        return myWallUrl;
    }

    public String getUserUrl() {
        return userUrl;
    }

    public Timer getTimer() {
        return timer;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setOwnerID(int ownerID) {
        this.ownerID = ownerID;
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

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setCommunityUrl(String communityUrl) {
        this.communityUrl = communityUrl;
    }

    public void setInCommunity(boolean inCommunity) {
        this.inCommunity = inCommunity;
    }

    public void setInHistory(boolean inHistory) {
        this.inHistory = inHistory;
    }

    public void setInPersonalMessage(boolean inPersonalMessage) {
        this.inPersonalMessage = inPersonalMessage;
    }

    public void setMyWallUrl(String myWallUrl) {
        this.myWallUrl = myWallUrl;
    }

    public void setOnMyWall(boolean onMyWall) {
        this.onMyWall = onMyWall;
    }

    public void setTimer(Timer timer) {
        this.timer = timer;
    }

    public void setUserUrl(String userUrl) {
        this.userUrl = userUrl;
    }
}

