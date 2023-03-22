/**
* MPoligon.java 20/03/2023
* Nama      : Derva Anargya Ghaly
* NIM       : 24060121140149
* Deskripsi : driver class untuk poligon dan persegi panjang
*/

package main;

import org.bangundatar.*;

public class MPoligon {
    public static void main(String[] args) {
        PersegiPanjang persegi = new PersegiPanjang(10, 10, 4);
        persegi.printInfo();
        Segitiga segitiga = new Segitiga(3, 4, 3);
        segitiga.printInfo();
        System.out.println("Luas Persegi Panjang : "+ persegi.hitungLuas());
        System.out.println("Luas Segitiga : "+ segitiga.hitungLuas());
    }
}