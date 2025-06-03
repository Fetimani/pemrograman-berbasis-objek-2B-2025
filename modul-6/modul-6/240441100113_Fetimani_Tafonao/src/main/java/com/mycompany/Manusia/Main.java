/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.Manusia;

/**
 *
 * @author MyBook Hype AMD
 */
public class Main {
    public static void main(String[] args) {
        Manusia[] daftar = {new Joko(), new Beni(), new Fani(), new Jani()};

        for (Manusia m : daftar) {
            m.berbicara();
            m.bekerja();
            m.makan();
            System.out.println();
        }
    }
}

