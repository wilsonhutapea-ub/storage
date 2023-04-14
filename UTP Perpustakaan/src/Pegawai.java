import java.util.*;
public class Pegawai {
    String nama;
    String nomorPegawai;

    Pegawai(String nama, String nomorPegawai){
        this.nama = nama;
        this.nomorPegawai = nomorPegawai;
    }

    public void setNomorPegawai(String nomorPegawai){
        this.nomorPegawai = nomorPegawai;
    }
    public String getNomorPegawai(){
        return this.nomorPegawai;
    }
    public void setNamaPegawai(String namaPegawai){
        this.nama = namaPegawai;
    }
    public String getNamaPegawai(){
        return this.nama;
    }
    void tampilkanInfoPegawai(){
        System.out.printf("Pegawai dengan nama %s memiliki nomor pegawai %s", this.nama, this.nomorPegawai);
    }
    void menambahPelanggan(String nama, String nomorPelanggan){
        Perpustakaan.listPelanggan.add(new Pelanggan(nama, nomorPelanggan));
        // incomplete    
    }
    void menambahBuku(String judul, String penulis, int jumlah){
        Perpustakaan.listBuku.add(new Buku(judul, penulis, jumlah));
        // incomplete
    }




}
