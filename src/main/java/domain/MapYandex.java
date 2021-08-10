package domain;

public class MapYandex {
    private int id;
    private int ownerID;
    private String locationUrl;

    public int getId() {
        return id;
    }

    public int getOwnerID() {
        return ownerID;
    }

    public String getLocationUrl() {
        return locationUrl;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setOwnerID(int ownerID) {
        this.ownerID = ownerID;
    }

    public void setLocationUrl(String locationUrl) {
        this.locationUrl = locationUrl;
    }
}
