package domain;

public class Share {
    private int id;
    private int ownerID;
    private ShareInShare shareInShare;
    private Export export;

    public int getId() {
        return id;
    }

    public int getOwnerID() {
        return ownerID;
    }

    public ShareInShare getShareInShare() {
        return shareInShare;
    }

    public Export getExport() {
        return export;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setOwnerID(int ownerID) {
        this.ownerID = ownerID;
    }

    public void setShareInShare(ShareInShare shareInShare) {
        this.shareInShare = shareInShare;
    }

    public void setExport(Export export) {
        this.export = export;
    }
}
