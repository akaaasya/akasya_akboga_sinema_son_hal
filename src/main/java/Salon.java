import java.util.ArrayList;
import java.util.List;

public class Salon {
    private String ad;
    private List<Film> filmler;

   
    public Salon() {
        this.filmler = new ArrayList<>();
    }

   
    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public List<Film> getFilmler() {
        return filmler;
    }

    public void setFilmler(List<Film> filmler) {
        this.filmler = filmler;
    }

 
    @Override
    public String toString() {
        return "Salon [ad=" + ad + ", filmler=" + filmler + "]";
    }
}
