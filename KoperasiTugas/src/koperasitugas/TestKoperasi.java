package koperasitugas;

import java.util.Scanner;

public class TestKoperasi {

    public static void menu() {
        System.out.println("Masukkan Operasi yang diinginkan: ");
        System.out.println("1. Pinjam Dana");
        System.out.println("2. Ansur Dana");
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        Scanner ipjm = new Scanner(System.in);
        Scanner iplh = new Scanner(System.in);

        Anggota agt = new Anggota("222333444", "Donny", 5000000);
        System.out.println("Nama\t: " + agt.getNama());
        System.out.println("NIK\t: " + agt.getKTP());
        System.out.println("Limit\t: " + agt.getLimitPinjaman());
        int pilih;

        do {
            menu();
            pilih = iplh.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan nilai pinjaman: ");
                    int pjm = ipjm.nextInt();
                    agt.pinjam(pjm);
                    System.out.println("Jumlah pinjaman: " + agt.getJumlahPinjaman());
                    break;
                case 2:
                    System.out.print("Masukkan nilai angsur: ");
                    int asr = ipjm.nextInt();
                    agt.angsur(asr);
                    System.out.println("Jumlah pinjaman: " + agt.getJumlahPinjaman());
                    break;
            }
        } while (pilih == 1 || pilih == 2);
        System.out.println("Selesai");
    }
}
