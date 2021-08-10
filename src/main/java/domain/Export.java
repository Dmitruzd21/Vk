package domain;

public class Export {
    private int ownerID;
    private GenerateLinkForExport generateLinkForExport;
    private EmbedCode embedCode;
    private Preview preview;
    private int width;

    public int getOwnerID() {
        return ownerID;
    }

    public GenerateLinkForExport getGenerateLinkForExport() {
        return generateLinkForExport;
    }

    public EmbedCode getEmbedCode() {
        return embedCode;
    }

    public Preview getPreview() {
        return preview;
    }

    public int getWidth() {
        return width;
    }

    public void setOwnerID(int ownerID) {
        this.ownerID = ownerID;
    }

    public void setGenerateLinkForExport(GenerateLinkForExport generateLinkForExport) {
        this.generateLinkForExport = generateLinkForExport;
    }

    public void setEmbedCode(EmbedCode embedCode) {
        this.embedCode = embedCode;
    }

    public void setPreview(Preview preview) {
        this.preview = preview;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
