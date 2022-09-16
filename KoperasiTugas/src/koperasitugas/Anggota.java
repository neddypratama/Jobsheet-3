package koperasitugas;

public class Anggota {
    private String noKTP;
    private String nama;
    private int limitPinjaman;
    private int jumlahPinjaman;

    Anggota(String noKTP, String nama, int limitPinjaman) {
        this.noKTP = noKTP;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
    }

    public String getNama() {
        return nama;
    }

    public String getKTP() {
        return noKTP;
    }

    public int getLimitPinjaman() {
        return limitPinjaman;
    }

    public void pinjam(int pinjam) {
        if (pinjam > limitPinjaman) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit!");
        } else {
            jumlahPinjaman = pinjam;
        }

    }

    public void angsur(int angsur) {
        int num = jumlahPinjaman / 10;
        if (angsur >= num) {
            jumlahPinjaman -= angsur;
        } else {
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman");
        }
    }

    public int getJumlahPinjaman() {
        return jumlahPinjaman;
    }
}
