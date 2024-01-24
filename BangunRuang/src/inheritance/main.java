/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author SMK TELKOM 21
 */
public class main {
    public static void main(String[]args){
        bola Bola = new bola();
        Bola.r = 2;
                
        tabung Tabung = new tabung();
        Tabung.tinggi = 6;
        Tabung.r = 2;
                
        limassegitiga LimasSegitiga = new limassegitiga();
        LimasSegitiga.luasAlas = 8;
        LimasSegitiga.tinggiLimas = 12;
                
        kubus Kubus = new kubus();
        Kubus.sisi = 4;
        
        Bola.Volume();
        Tabung.Volume();
        LimasSegitiga.Volume();
        Kubus.Volume();
    }
}
