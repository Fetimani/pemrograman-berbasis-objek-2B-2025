package com.mycompany.prak;

public class matakuliah {
    private String kode;
    private String nama;
    private int sks;

    public matakuliah(String kode, String nama, int sks) {
        if (isValidSKS(sks)) {
            this.kode = kode;
            this.nama = nama;
            this.sks = sks;
        } else {
            System.out.println("SKS tidak valid untuk " + nama);
        }
    }

    public static boolean isValidSKS(int sks) {
        return sks == 2 || sks == 3;
    }

    public String toString() {
        return kode + " - " + nama + " (" + sks + " SKS)";
    }
}
