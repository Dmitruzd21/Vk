package domain;

public class Video {
    private int ownerID;
    private boolean videoPresence;
    private String videoUrl;
    private int numberOfVideoViewsInfo;

    public int getOwnerID() {
        return ownerID;
    }

    public boolean isVideoPresence() {
        return videoPresence;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public int getNumberOfVideoViewsInfo() {
        return numberOfVideoViewsInfo;
    }

    public void setOwnerID(int ownerID) {
        this.ownerID = ownerID;
    }

    public void setVideoPresence(boolean videoPresence) {
        this.videoPresence = videoPresence;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public void setNumberOfVideoViewsInfo(int numberOfVideoViewsInfo) {
        this.numberOfVideoViewsInfo = numberOfVideoViewsInfo;
    }
}
