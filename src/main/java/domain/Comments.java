package domain;

public class Comments {
    private int ownerID;
    private OneCommentBlock oneCommentBlock;
    private boolean сanViewUnregisteredUser;

    public int getOwnerID() {
        return ownerID;
    }

    public OneCommentBlock getOneCommentBlock() {
        return oneCommentBlock;
    }

    public boolean isСanViewUnregisteredUser() {
        return сanViewUnregisteredUser;
    }

    public void setOwnerID(int ownerID) {
        this.ownerID = ownerID;
    }

    public void setOneCommentBlock(OneCommentBlock oneCommentBlock) {
        this.oneCommentBlock = oneCommentBlock;
    }

    public void setСanViewUnregisteredUser(boolean сanViewUnregisteredUser) {
        this.сanViewUnregisteredUser = сanViewUnregisteredUser;
    }
}
