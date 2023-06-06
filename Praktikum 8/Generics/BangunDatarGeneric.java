/**
 * BangunDatarGeneric.java 20/05/2023
 * Nama         : Derva Anargya Ghaly
 * NIM          : 24060121140149
 * Deskripsi    : kelas konstruksi generic BangunDatar
 */

public class BangunDatarGeneric<T extends BangunDatar> {
    private T bangunDatar;

    public void set(T tipeBangunDatar) {

        bangunDatar = tipeBangunDatar;
    }

    public T get() {

        return bangunDatar;
    }

    public double hitungKeliling() {

        return bangunDatar.hitungKeliling();
    }

}

//Salah satu strategi untuk memberikan nama yang lebih deskriptif kepada parameter generik
//yaitu dengan mengubah karakter 'T' menjadi karakter lain, seperti T1, T2, atau T1234.
//Pendekatan ini bertujuan untuk memberikan fleksibilitas dalam penggunaan data
//dan juga membedakan ketika terdapat lebih dari satu parameter generik dalam kelas tersebut.