public class Musteri {
    private String ad;
    private String soyad;


    public Musteri() {
    }


    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    // toString metodu
    @Override
    public String toString() {
        return "Musteri [ad=" + ad + ", soyad=" + soyad + "]";
    }
}
