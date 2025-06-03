/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.kendaraan;

/**
 *
 * @author MyBook Hype AMD
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("=== Menampilkan Informasi Kendaraan");
        System.out.println();
        System.out.println("--Mobil");
        Mobil m1 = new Mobil ();
        m1. berjalan ();
        m1. berhenti ();
        m1. mengisi ();
        m1. membunyikan ();  
    }
}

