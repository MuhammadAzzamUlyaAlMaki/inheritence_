/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author SMK TELKOM 21
 */
public class tabung extends BangunRuang{
    float tinggi;
    float r;
    
    @Override
    float Volume(){
        float volume = 22/7*r*r*tinggi;
        System.out.println("Volume tabung = " + volume );
        return volume; 
    }
}
