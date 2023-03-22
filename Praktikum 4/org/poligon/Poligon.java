/**
* Poligon.java 02/04/2014
* Nama      : Derva Anargya Ghaly
* NIM       : 24060121140149
* Deskripsi : representasi dasar dari objek poligon (segi banyak)
*/

package org.poligon;

public class Poligon {
    protected int jumlahSisi;

    public void poligon(){
        jumlahSisi = 0;
    }

    public void setJumlahSisi(int n){
        jumlahSisi = n;
    }
    public int getJumlahSisi(){
        return this.jumlahSisi;
    }
}