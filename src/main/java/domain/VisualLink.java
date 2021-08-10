package domain;

public class VisualLink {
    private int ownerID;
    private boolean visualLinkPresence;
    private String visualLinkUrl;

    public int getOwnerID() {
        return ownerID;
    }

    public boolean isVisualLinkPresence() {
        return visualLinkPresence;
    }

    public String getVisualLinkUrl() {
        return visualLinkUrl;
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
