/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.Mobil;

/**
 *
 * @author MyBook Hype AMD
 */
public class Main {
    public static void main(String[] args) {
        ManajemenMobil manajemen = new ManajemenMobil();

        Mobil sport = new MobilSport();
        Mobil sedan = new MobilSedan();

        manajemen.tambahMobil(sport);
        manajemen.tambahMobil(sedan);

        manajemen.operasikanSemuaMobil();
    }
}

