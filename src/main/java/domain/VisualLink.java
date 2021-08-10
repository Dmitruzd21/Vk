package domain;

public class VisualLink {
    private int id;
    private int ownerID;
    private boolean visualLinkPresence;
    private String visualLinkUrl;


    public int getId() {
        return id;
    }

    public int getOwnerID() {
        return ownerID;
    }

    public boolean isVisualLinkPresence() {
        return visualLinkPresence;
    }

    public String getVisualLinkUrl() {
        return visualLinkUrl;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setOwnerID(int ownerID) {
        this.ownerID = ownerID;
    }

    public void setVisualLinkPresence(boolean visualLinkPresence) {
        this.visualLinkPresence = visualLinkPresence;
    }

    public void setVisualLinkUrl(String visualLinkUrl) {
        this.visualLinkUrl = visualLinkUrl;
    }
}
