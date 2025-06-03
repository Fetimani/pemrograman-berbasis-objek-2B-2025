/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mobil;

/**
 *
 * @author MyBook Hype AMD
 */
public class MainMobil {
    public static void main(String[] args) {
        MobilSport sport = new MobilSport();
        sport.nyalakan_mesin();
        sport.matikan_mesin();

        MobilSedan sedan = new MobilSedan();
        sedan.nyalakan_mesin();
        sedan.matikan_mesin();
    }
}