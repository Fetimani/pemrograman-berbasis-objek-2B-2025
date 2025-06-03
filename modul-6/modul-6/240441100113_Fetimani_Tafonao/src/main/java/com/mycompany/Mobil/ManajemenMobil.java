/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Mobil;

/**
 *
 * @author MyBook Hype AMD
 */
import java.util.ArrayList;

public class ManajemenMobil {
    private ArrayList<Mobil> daftarMobil;

    public ManajemenMobil() {
        daftarMobil = new ArrayList<>();
    }

    public void tambahMobil(Mobil mobil) {
        daftarMobil.add(mobil);
    }

    public void operasikanSemuaMobil() {
        for (Mobil mobil : daftarMobil) {
            mobil.nyalakanMesin();
            mobil.matikanMesin();
            System.out.println("-------------------");
        }
    }
}
