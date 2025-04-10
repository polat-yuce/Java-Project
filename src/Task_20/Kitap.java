package Task_20;

class Kitap {
    private static int kitapNumarasiCounter = 1001;

    private int kitapNumarasi;
    private String kitapAdi;
    private String yazarAdi;
    private int yayinYili;
    private double fiyat;

    public Kitap(String kitapAdi, String yazarAdi, int yayinYili, double fiyat) {
        this.kitapNumarasi = kitapNumarasiCounter++;
        this.kitapAdi = kitapAdi;
        this.yazarAdi = yazarAdi;
        this.yayinYili = yayinYili;
        this.fiyat = fiyat;
    }

    public int getKitapNumarasi() {
        return kitapNumarasi;
    }

    public String getKitapAdi() {
        return kitapAdi;
    }

    public String getYazarAdi() {
        return yazarAdi;
    }

    public int getYayinYili() {
        return yayinYili;
    }

    public double getFiyat() {
        return fiyat;
    }

    @Override
    public String toString() {
        return "Kitap Numarası: " + kitapNumarasi +
                "\nKitap Adı: " + kitapAdi +
                "\nYazar Adı: " + yazarAdi +
                "\nYayın Yılı: " + yayinYili +
                "\nFiyat: " + fiyat + " TL\n";
    }
}
