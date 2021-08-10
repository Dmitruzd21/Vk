package domain;

public class Graffiti {
    private int id;
    private int ownerID;
    private String url;

    public int getId() {
        return id;
    }

    public int getOwnerID() {
        return ownerID;
    }

    public String getUrl() {
        return url;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setOwnerID(int ownerID) {
        this.ownerID = ownerID;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
