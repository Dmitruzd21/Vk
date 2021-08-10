package domain;

public class AdditionalService {
    private int id;
    private int ownerID;
    private SaveToBookmarks saveToBookmarks;
    private DeleteFromBookmarks deleteFromBookmarks;
    private Complain complain;

    public int getOwnerID() {
        return ownerID;
    }

    public int getId() {
        return id;
    }

    public SaveToBookmarks getSaveToBookmarks () {
        return saveToBookmarks;
    }
    public DeleteFromBookmarks getDeleteFromBookmarks () {
        return deleteFromBookmarks;
    }
    public Complain getComplain (){
        return complain;
    }

    public void setOwnerID(int ownerID) {
        this.ownerID = ownerID;
    }

    public void setSaveToBookmarks(SaveToBookmarks saveToBookmarks) {
        this.saveToBookmarks = saveToBookmarks;
    }

    public void setDeleteFromBookmarks(DeleteFromBookmarks deleteFromBookmarks) {
        this.deleteFromBookmarks = deleteFromBookmarks;
    }

    public void setComplain(Complain complain) {
        this.complain = complain;
    }

    public void setId(int id) {
        this.id = id;
    }


}
