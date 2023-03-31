/*
* Asersi2.java 31 Maret 2023
* Nama      : Derva Anargya Ghaly
* NIM       : 24060121140149
* Deskripsi : Program untuk demo asersi (menolak input jari-jari lingkaran yang bernilai nol)
*/ 

package Asersi;

// 
class Lingkaran {
    private double jariJari;
    public Lingkaran (double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungKeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}

public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0;
        assert (jariJari > 0) : "jari jari tidak boleh nol!!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("Keliling Lingkaran = "+ kelilingLingkaran);
    }
}

/* 
 * Jawaban: 
 * Berdasarkan pemahaman saya yang didapat dari penjelasan
 * asprak dan modul, tidak ada kesalahan yang terdapat pada program. 
 */