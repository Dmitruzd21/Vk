package domain;

public class Comments {
    private int id;
    private int ownerID;
    private int numberOfCommentsInfo; // количество комментариев;
    private OneCommentBlock oneCommentBlock;
    private boolean сanViewUnregisteredUser;
    private boolean groupsCanPost; //информация о том, могут ли сообщества комментировать запись;

    public int getOwnerID() {
        return ownerID;
    }

    public int getId() {
        return id;
    }

    public OneCommentBlock getOneCommentBlock() {
        return oneCommentBlock;
    }

    public boolean isСanViewUnregisteredUser() {
        return сanViewUnregisteredUser;
    }

    public boolean isGroupsCanPost() {
        return groupsCanPost;
    }

    public int getNumberOfCommentsInfo() {
        return numberOfCommentsInfo;
    }

    public void setOwnerID(int ownerID) {
        this.ownerID = ownerID;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setOneCommentBlock(OneCommentBlock oneCommentBlock) {
        this.oneCommentBlock = oneCommentBlock;
    }

    public void setСanViewUnregisteredUser(boolean сanViewUnregisteredUser) {
        this.сanViewUnregisteredUser = сanViewUnregisteredUser;
    }

    public void setGroupsCanPost(boolean groupsCanPost) {
        this.groupsCanPost = groupsCanPost;
    }

    public void setNumberOfCommentsInfo(int numberOfCommentsInfo) {
        this.numberOfCommentsInfo = numberOfCommentsInfo;
    }
}
