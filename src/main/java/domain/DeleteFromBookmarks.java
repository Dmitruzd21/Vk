package domain;

public class DeleteFromBookmarks {
    private int id;

    private int ownerID;

    public int getOwnerID() {
        return ownerID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setOwnerID(int ownerID) {
        this.ownerID = ownerID;
    }
}
