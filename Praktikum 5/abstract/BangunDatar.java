/*
* BangunDatar.java 27 Maret 2023
* Nama         : Derva Anargya Ghaly
* NIM          : 24060121140149
* Deskripsi    : File abstract class bangun datar
*/

 public abstract class BangunDatar {
    protected double luas;

    public abstract double hitungLuas(double sisi);

    public void setLuas(double l) {
        luas = l;
    }

    public double getLuas() {
        return luas;
    }
}