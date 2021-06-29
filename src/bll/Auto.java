package bll;

public class Auto {
    private int id;
    private String marke;
    private String name;
    private int preis;
    private int ps;
    private int hubraum;
    private int gewicht;
    private String treibstoff;
    private String antrieb;
    private String color;
    private String ytVideo;

    public Auto(int id, String marke, String name, int preis, int ps, int hubraum, int gewicht, String treibstoff, String antrieb, String color, String ytVideo) {
        this.id = id;
        this.marke = marke;
        this.name = name;
        this.preis = preis;
        this.ps = ps;
        this.hubraum = hubraum;
        this.gewicht = gewicht;
        this.treibstoff = treibstoff;
        this.antrieb = antrieb;
        this.color = color;
        this.ytVideo = ytVideo;
    }

    public Auto(String marke, String name, int preis, int ps, int hubraum, int gewicht, String treibstoff, String antrieb, String color, String ytVideo) {
        this.id = -1;
        this.marke = marke;
        this.name = name;
        this.preis = preis;
        this.ps = ps;
        this.hubraum = hubraum;
        this.gewicht = gewicht;
        this.treibstoff = treibstoff;
        this.antrieb = antrieb;
        this.color = color;
        this.ytVideo = ytVideo;
    }

    public Auto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPreis() {
        return preis;
    }

    public void setPreis(int preis) {
        this.preis = preis;
    }

    public int getPs() {
        return ps;
    }

    public void setPs(int ps) {
        this.ps = ps;
    }

    public int getHubraum() {
        return hubraum;
    }

    public void setHubraum(int hubraum) {
        this.hubraum = hubraum;
    }

    public int getGewicht() {
        return gewicht;
    }

    public void setGewicht(int gewicht) {
        this.gewicht = gewicht;
    }

    public String getTreibstoff() {
        return treibstoff;
    }

    public void setTreibstoff(String treibstoff) {
        this.treibstoff = treibstoff;
    }

    public String getAntrieb() {
        return antrieb;
    }

    public void setAntrieb(String antrieb) {
        this.antrieb = antrieb;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getYtVideo() {
        return ytVideo;
    }

    public void setYtVideo(String ytVideo) {
        this.ytVideo = ytVideo;
    }

    @Override
    public String toString() {
        return name;
    }

    public String getRechnung(){
        return "Mittelscheitel-Carshop\n\nMarke: "+ this.marke +
                "\nName: " + this.name +
                "\nPreis: " + this.preis +
                "\nPS: " + this.ps +
                "\nHubraum: " + this.hubraum +
                "\nGewicht: " + this.gewicht +
                "\nTreibstoff: " + this.treibstoff +
                "\nAntrieb: " + this.antrieb;
    }
}
