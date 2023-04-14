import java.util.ArrayList;

public class Perpustakaan {
    // Pegawai[] pegawaiPerpus;
    // static Buku[] listBuku = new Buku[100];
    // static Pelanggan[] listPelanggan = new Pelanggan[20];
    static ArrayList<Buku> listBuku = new ArrayList<Buku>(100);
    public ArrayList<Pegawai> pegawaiPerpus;
    static ArrayList<Pelanggan> listPelanggan = new ArrayList<Pelanggan>(20);

    Perpustakaan(Pegawai pegawai){
        this.pegawaiPerpus.add(pegawai);
    }

    void pinjam(String namaPelanggan, String judulBuku){
        for(int i = 0; i < listPelanggan.size(); i++){
            if(listPelanggan.get(i).getNama().equals(namaPelanggan)){
                listPelanggan.get(i).bukuPinjaman.add(new Buku(judulBuku));
                break;
            } 
        }
    }

    Buku cariBuku(String judulBuku){
        for(int i = 0; i < listBuku.size(); i++){
            if(listBuku.get(i).getJudul().equals(judulBuku)){
                return listBuku.get(i);
            }
        }
        System.out.println("Book not found.");
        return new Buku("Book not found");
    }

    void tampilkanInfoPerpustakaan(){
        System.out.printf("Perpustakaan memiliki total %d buku. %d pegawai, dan %d pelanggan\n", listBuku.size(), pegawaiPerpus.size(), listPelanggan.size());
    }
}
