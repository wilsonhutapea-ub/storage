import java.util.ArrayList;
public class Pelanggan {
    private String nama;
    private String nomorPelanggan;
    // Buku[] bukuPinjaman = new Buku[3];
    public ArrayList<Buku> bukuPinjaman = new ArrayList<Buku>(3);
    
    Pelanggan(String nama, String nomorPelanggan){
        this.nama = nama;
        this.nomorPelanggan = nomorPelanggan;
    }

    public void setNama(String nama){
        this.nama = nama;
    }
    public String getNama(){
        return this.nama;
    }
    public void setNomorPelanggan(String nomorPelanggan){
        this.nomorPelanggan = nomorPelanggan;
    }
    public String getNomorPelanggan(){
        return this.nomorPelanggan;
    }

    
    void tambahBuku(Buku bukuPinjam){
        bukuPinjaman.add(bukuPinjam);
    }
    void tampilkanInfoPelanggan(){
        System.out.printf("Pelanggan ini memiliki nama %s, memiliki nomor pelanggan %s, dan memiliki %d buku pinjaman\n", this.nama, this.nomorPelanggan, this.bukuPinjaman.size());
    }


}
