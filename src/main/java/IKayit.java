// IKayit.java
public interface IKayit {
    void kaydet(String dosyaAdi, Object veri);
    <T> T oku(String dosyaAdi, Class<T> veriTipi);
}
