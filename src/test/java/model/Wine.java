package model;

public class Wine {
    private String title;
    private String color;
    private String compound;
    private String expirationDate;
    private String usefulness;
    private String madeIn;
    private int alcoholVolume;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCompound() {
        return compound;
    }

    public void setCompound(String compound) {
        this.compound = compound;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getUsefulness() {
        return usefulness;
    }

    public void setUsefulness(String usefulness) {
        this.usefulness = usefulness;
    }

    public String getMadeIn() {
        return madeIn;
    }

    public void setMadeIn(String madeIn) {
        this.madeIn = madeIn;
    }

    public int getAlcoholVolume() {
        return alcoholVolume;
    }

    public void setAlcoholVolume(int alcoholVolume) {
        this.alcoholVolume = alcoholVolume;
    }
}