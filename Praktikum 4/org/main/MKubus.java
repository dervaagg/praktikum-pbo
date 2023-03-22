/**
* MKubus.java 20/03/2023
* Nama      : Derva Anargya Ghaly
* NIM       : 24060121140149
* Deskripsi : Kelas yang berisi program untuk menjalankan kelas Kubus.
*/

package main;

import org.bangunruang.Kubus;
import org.bangundatar.BujurSangkar;

public class MKubus {
    public static void main(String[] args) {
        BujurSangkar bujurSangkar = new BujurSangkar(4);
        Kubus kubus = new Kubus(bujurSangkar);
        System.out.println("Luas Alas Kubus: "+ kubus.hitungLuasAlas());
        System.out.println("Volume Kubus: "+ kubus.hitungVolume());
    }
    
}