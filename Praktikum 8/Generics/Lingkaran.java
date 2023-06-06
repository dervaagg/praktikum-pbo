/**
 * Lingkaran.java 20/05/2023
 * Nama         : Derva Anargya Ghaly
 * NIM          : 24060121140149
 * Deskripsi    : implementasi Lingkaran sebagai Bangun Datar
 */

public class Lingkaran extends BangunDatar{
    private double jejari;

    public Lingkaran(double jejari) {

        this.jejari = jejari;
    }
    public double hitungKeliling() {

        return 2*jejari*3.14;
    }
}