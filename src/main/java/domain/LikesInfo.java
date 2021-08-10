package domain;

public class LikesInfo {
    private int id;
    private int count;  //(integer) — число пользователей, которым понравилась запись;
    private boolean userLikesInfo;  //* (integer, [0,1]) — наличие отметки «Мне нравится» от текущего пользователя (1 — есть, 0 — нет);
    private boolean canLike; //* (integer, [0,1]) — информация о том, может ли текущий пользователь поставить отметку «Мне нравится» (1 — может, 0 — не может);

    public int getId() {
        return id;
    }

    public boolean isUserLikesInfo() {
        return userLikesInfo;
    }

    public boolean isCanLike() {
        return canLike;
    }

    public int getCount() {
        return count;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUserLikesInfo(boolean userLikesInfo) {
        this.userLikesInfo = userLikesInfo;
    }

    public void setCanLike(boolean canLike) {
        this.canLike = canLike;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
