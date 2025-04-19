package com.mycompany.prak;

public class kampus {
    private String nama;
    private String alamat;
    private static int totalMahasiswa = 0;

    public kampus(String nama, String alamat) {
        if (isValidNamaKampus(nama)) {
            this.nama = nama;
            this.alamat = alamat;
        } else {
            System.out.println("Nama kampus tidak valid!");
        }
    }

    public static boolean isValidNamaKampus(String nama) {
        return !nama.matches(".*\\d.*");
    }

    public void tampilkanInfoKampus() {
        System.out.println("Nama Kampus: " + nama);
        System.out.println("Alamat Kampus: " + alamat);
    }
}
