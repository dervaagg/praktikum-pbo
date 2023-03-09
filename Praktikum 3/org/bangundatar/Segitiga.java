/**
* Segitiga.java 09/03/2023
* Nama/NIM 	: Derva Anargya Ghaly/24060121140149 
* Deskripsi : representasi dari objek segitiga, turunan kelas poligon
*/

package org.bangundatar;

import org.poligon.Poligon;

public class Segitiga extends Poligon {
    private double alas, tinggi;

    public Segitiga(double alas, double tinggi, int jumlahSisi) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.jumlahSisi = jumlahSisi;
    }

    public double hitungLuas(){
        return alas * tinggi / 2;
    }

    public void printInfo(){
        System.out.println("Bangun Segitiga bersisi :" + this.getJumlahSisi());
    }
}
