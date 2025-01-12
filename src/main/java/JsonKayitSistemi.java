import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class JsonKayitSistemi {

    // JSON dosyasına veri yazdığım kısım.
    public static void yaz(String dosyaAdi, List<?> veriler) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            // Verileri JSON formatında dosyaya yazdığım yer.
            objectMapper.writeValue(new File(dosyaAdi), veriler);
            System.out.println(dosyaAdi + " dosyasına veri yazıldı.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // JSON dosyasından veri okuma methodu oluşturdum
    public static <T> void oku(String dosyaAdi, Class<T> tip) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            // JSON dosyasındaki veriyi okuyup nesneye dönüştürdüm
            List<T> veriler = objectMapper.readValue(new File(dosyaAdi), objectMapper.getTypeFactory().constructCollectionType(List.class, tip));
            // Okunan verileri ekrana yazdırdığım alan
            for (T veri : veriler) {
                System.out.println(veri);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
