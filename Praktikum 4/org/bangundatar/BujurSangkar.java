/**
* BujurSangkar.java 20/03/2023
* Nama      : Derva Anargya Ghaly
* NIM       : 24060121140149
* Deskripsi : representasi dasar dari objek bujur sangkar
*/

package org.bangundatar;

import org.poligon.Poligon;

public class BujurSangkar extends Poligon{
    double panjangSisi;

    public BujurSangkar(double panjangSisi){
        this.panjangSisi = panjangSisi;
    }
    
    public double hitungLuas(){
        return this.panjangSisi * this.panjangSisi;
    }

    public double getPanjangSisi(){
        return this.panjangSisi;
    }
}