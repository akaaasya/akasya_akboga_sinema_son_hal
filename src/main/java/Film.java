public class Film {
    private String ad;
    private int sure;
    private String tur;

  
    public Film() {
    }


    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getSure() {
        return sure;
    }

    public void setSure(int sure) {
        this.sure = sure;
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

   
    @Override
    public String toString() {
        return "Film [ad=" + ad + ", sure=" + sure + ", tur=" + tur + "]";
    }
}
