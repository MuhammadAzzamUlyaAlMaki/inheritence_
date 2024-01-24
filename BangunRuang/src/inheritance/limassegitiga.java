/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author SMK TELKOM 21
 */
public class limassegitiga extends BangunRuang{
    float luasAlas;
    float tinggiLimas;
    
    @Override
    float Volume(){
        float volume = luasAlas*tinggiLimas*1/3;
        System.out.println("Volume Limas = " + volume);
        return volume;
    }
}
