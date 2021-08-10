package domain;

public class Photo {
    private int ownerID;
    private boolean photoPresence;
    private String photoUrl;

    public int getOwnerID() {
        return ownerID;
    }

    public boolean isPhotoPresence() {
        return photoPresence;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setOwnerID(int ownerID) {
        this.ownerID = ownerID;
    }

    public void setPhotoPresence(boolean photoPresence) {
        this.photoPresence = photoPresence;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }
}
