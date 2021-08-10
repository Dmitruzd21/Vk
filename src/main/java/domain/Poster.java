package domain;

public class Poster {
    private int id;
    private int ownerID;
    private String topic;
    private String backgroundUrl;
    private String text;
    private String sourсeUrl;
    private boolean author;
    private String authorName;
    private MapYandex mapYandex;

    public int getId() {
        return id;
    }

    public int getOwnerID() {
        return ownerID;
    }

    public String getText() {
        return text;
    }

    public boolean isAuthor() {
        return author;
    }

    public MapYandex getMapYandex() {
        return mapYandex;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getBackgroundUrl() {
        return backgroundUrl;
    }

    public String getSourсeUrl() {
        return sourсeUrl;
    }

    public String getTopic() {
        return topic;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setOwnerID(int ownerID) {
        this.ownerID = ownerID;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setAuthor(boolean author) {
        this.author = author;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setBackgroundUrl(String backgroundUrl) {
        this.backgroundUrl = backgroundUrl;
    }

    public void setMapYandex(MapYandex mapYandex) {
        this.mapYandex = mapYandex;
    }

    public void setSourсeUrl(String sourсeUrl) {
        this.sourсeUrl = sourсeUrl;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
}
