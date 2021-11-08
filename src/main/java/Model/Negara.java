package Model;

public class Negara
{
    int id;
    String nama;
    long populasi;
    String mata_uang;

    public Negara()
    {
        super();
    }

    public Negara(int id, String nama, long populasi, String mata_uang)
    {
        super();
        this.id = id;
        this.nama = nama;
        this.populasi = populasi;
        this.mata_uang = mata_uang;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public long getPopulasi() {
        return populasi;
    }

    public void setPopulasi(long populasi) {
        this.populasi = populasi;
    }

    public String getMata_uang() {
        return mata_uang;
    }

    public void setMata_uang(String mata_uang) {
        this.mata_uang = mata_uang;
    }
}
