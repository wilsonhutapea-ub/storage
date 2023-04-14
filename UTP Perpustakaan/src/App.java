public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Nama: Wilson Hamonangan Ariyanto Hutapea");
        System.out.println("NIM: 225150600111022");
        
        Pegawai pegawaiPerpus = new Pegawai("Wilson Hamonangan Ariyanto Hutapea", "225150600111022");

        Perpustakaan perpus = new Perpustakaan(pegawaiPerpus);

        pegawaiPerpus.menambahBuku("Tutorial Java", "Graita", 2);
        pegawaiPerpus.menambahBuku("Tutorial Phyton", "Safir", 2);
        pegawaiPerpus.menambahBuku("Tutorial Javascript", "Bagus", 2);
        pegawaiPerpus.menambahBuku("Tutorial Golang", "Budi", 2);
        pegawaiPerpus.menambahBuku("Tutorial Javascript", "Shinta", 2);
        pegawaiPerpus.menambahPelanggan("Wildan", "1");
        pegawaiPerpus.menambahPelanggan("Machsun", "2");
        pegawaiPerpus.menambahPelanggan("Adin", "3");
        pegawaiPerpus.menambahPelanggan("Machsun", "4");
        perpus.pinjam("Wildan", "Tutorial Java");
        perpus.pinjam("Machsun", "Tutorial Java");
        perpus.pinjam("Adin", "Tutorial Java");
        perpus.pinjam("Adin", "Tutorial Phyton");
        perpus.pinjam("Wildan", "Tutorial Golang");
        perpus.pinjam("Wildan", "Tutorial Javascript");
        perpus.pinjam("Wildan", "Tutorial Phyton");
        perpus.pinjam("Cantika", "Tutorial Golang");
        perpus.pinjam("Machsun", "Sastra Inggris");
        perpus.pinjam("Adin", "Tutorial Phyton");
        perpus.pinjam("Cantika", "Cara cepat belajar Phyton");

        perpus.tampilkanInfoPerpustakaan();

    }
}
