package domain;

public class Photo {
    private int id;
    private int ownerID;
    private boolean photoPresence;
    private String photoUrl;

    public int getId() {
        return id;
    }

    public int getOwnerID() {
        return ownerID;
    }

    public boolean isPhotoPresence() {
        return photoPresence;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setId(int id) {
        this.id = id;
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
