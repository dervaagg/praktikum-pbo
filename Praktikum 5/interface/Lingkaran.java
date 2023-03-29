import static java.lang.Math.PI;

/*
* Lingkaran.java 27 Maret 2023
* Nama Pembuat : Derva Anargya Ghaly
* NIM          : 24060121140149
* Deskripsi    : File kelas implementasi IArea berupa cara menghitung luas lingkaran
*/

class Lingkaran implements IArea {
    private double jejari;

    public Lingkaran(double r) {
        jejari = r;
    }

    public double hitungLuas() {
        return PI * jejari * jejari;
    }
}