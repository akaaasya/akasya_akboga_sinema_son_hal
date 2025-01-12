import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
       
        Film film1 = new Film();
        film1.setAd("Film 1");
        film1.setSure(120);
        film1.setTur("Aksiyon");

        Film film2 = new Film();
        film2.setAd("Film 2");
        film2.setSure(90);
        film2.setTur("Romantik");

        Salon salon = new Salon();
        salon.setAd("Salon 1");
        salon.setFilmler(new ArrayList<>());
        salon.getFilmler().add(film1);

        Musteri musteri = new Musteri();
        musteri.setAd("Ahmet");
        musteri.setSoyad("Yılmaz");

     
        List<Film> filmler = new ArrayList<>();
        filmler.add(film1);
        filmler.add(film2);
        JsonKayitSistemi.yaz("Filmler.json", filmler);

        List<Salon> salonlar = new ArrayList<>();
        salonlar.add(salon);
        JsonKayitSistemi.yaz("Salonlar.json", salonlar);

        List<Musteri> musteriler = new ArrayList<>();
        musteriler.add(musteri);
        JsonKayitSistemi.yaz("Musteriler.json", musteriler);

       
        System.out.println("Filmler:");
        JsonKayitSistemi.oku("Filmler.json", Film.class);

        System.out.println("Salonlar:");
        JsonKayitSistemi.oku("Salonlar.json", Salon.class);

        System.out.println("Musteriler:");
        JsonKayitSistemi.oku("Musteriler.json", Musteri.class);
    }
}
