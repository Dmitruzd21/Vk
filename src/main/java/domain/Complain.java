package domain;

public class Complain {
    private int ownerID;
    private String listName;
    private boolean spam;
    private boolean insult;
    private boolean adultMaterial;
    private boolean childPornography;
    private boolean drugPropaganda;
    private boolean saleOfWeapons;
    private boolean violence;
    private boolean callForBullying;
    private boolean callForSuicide;
    private boolean animalAbuse;
    private boolean misleadingFraud;
    private boolean extremism;
    private boolean hostileSpeech;
    private boolean unoriginalContent;

    public int getOwnerID() {
        return ownerID;
    }

    public String getListName() {
        return listName;
    }

    public boolean isAdultMaterial() {
        return adultMaterial;
    }

    public boolean isAnimalAbuse() {
        return animalAbuse;
    }

    public boolean isCallForBullying() {
        return callForBullying;
    }

    public boolean isCallForSuicide() {
        return callForSuicide;
    }

    public boolean isChildPornography() {
        return childPornography;
    }

    public boolean isDrugPropaganda() {
        return drugPropaganda;
    }

    public boolean isExtremism() {
        return extremism;
    }

    public boolean isHostileSpeech() {
        return hostileSpeech;
    }

    public boolean isInsult() {
        return insult;
    }

    public boolean isMisleadingFraud() {
        return misleadingFraud;
    }

    public boolean isSaleOfWeapons() {
        return saleOfWeapons;
    }

    public boolean isSpam() {
        return spam;
    }

    public boolean isUnoriginalContent() {
        return unoriginalContent;
    }

    public boolean isViolence() {
        return violence;
    }

    public void setOwnerID(int ownerID) {
        this.ownerID = ownerID;
    }

    public void setAdultMaterial(boolean adultMaterial) {
        this.adultMaterial = adultMaterial;
    }

    public void setAnimalAbuse(boolean animalAbuse) {
        this.animalAbuse = animalAbuse;
    }

    public void setCallForBullying(boolean callForBullying) {
        this.callForBullying = callForBullying;
    }

    public void setCallForSuicide(boolean callForSuicide) {
        this.callForSuicide = callForSuicide;
    }

    public void setChildPornography(boolean childPornography) {
        this.childPornography = childPornography;
    }

    public void setDrugPropaganda(boolean drugPropaganda) {
        this.drugPropaganda = drugPropaganda;
    }

    public static void main(String[] args) {

    }

    public void setExtremism(boolean extremism) {
        this.extremism = extremism;
    }

    public void setHostileSpeech(boolean hostileSpeech) {
        this.hostileSpeech = hostileSpeech;
    }

    public void setInsult(boolean insult) {
        this.insult = insult;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    public void setMisleadingFraud(boolean misleadingFraud) {
        this.misleadingFraud = misleadingFraud;
    }

    public void setSaleOfWeapons(boolean saleOfWeapons) {
        this.saleOfWeapons = saleOfWeapons;
    }

    public void setSpam(boolean spam) {
        this.spam = spam;
    }

    public void setUnoriginalContent(boolean unoriginalContent) {
        this.unoriginalContent = unoriginalContent;
    }

    public void setViolence(boolean violence) {
        this.violence = violence;
    }

}
