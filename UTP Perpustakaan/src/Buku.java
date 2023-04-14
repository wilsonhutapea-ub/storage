public class Buku {
    String judul;
    String penulis;
    int jumlah;

    Buku(String judul, String penulis, int jumlah){
        this.judul = judul;
        this.penulis = penulis;
        this. jumlah = jumlah;
    }
    Buku(String judul){
        this.judul = judul;
    }

    public void setJudul(String judul){
        this.judul = judul;
    }
    public String getJudul(){
        return this.judul;
    }
    public void setJumlah(int jumlah){
        this.jumlah = jumlah;
    }
    public int getJumlah(){
        return this.jumlah;
    }
    public String getPenulis(){
        return this.penulis;
    }
    public void setPenulis(String penulis){
        this.penulis = penulis;
    }
    void tampilkanInfoBuku(){
        System.out.printf("Buku \"%s\" ditulis oleh %s memiliki jumlah %d\n",this.judul,this.penulis,this.jumlah);
    }

}