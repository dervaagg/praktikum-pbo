/**
* Segitiga.java 20/03/2023
* Nama      : Derva Anargya Ghaly
* NIM       : 24060121140149
* Deskripsi : representasi dasar dari objek segitiga,turunan kelas poligon
*/

package org.bangundatar;

import org.poligon.Poligon;

public class Segitiga extends Poligon{
    private double alas,tinggi;

    public Segitiga(double alas, double tinggi, int jumlahSisi){
        this.alas = alas;
        this.tinggi = tinggi;
        this.jumlahSisi= jumlahSisi;
    }

    public double hitungLuas(){
        return (alas * tinggi)/2;
    }

    public void printInfo(){
        System.out.println("Bangun Segitiga Berisi"+ " " +this.getJumlahSisi());
    }
}