/*
* Asersi1.java 31 Maret 2023
* Nama      : Derva Anargya Ghaly
* NIM       : 24060121140149
* Deskripsi : Program untuk menunjukkan asersi 
*/ 

package Asersi;

public class Asersi1{
    public static void main(String[] args) {
        int x = 0;
        if(x > 0){
            System.out.println("x bilangan positif");
        }
        else{
            assert (x<0): "ada kesalahan kode";
            System.out.println("x bilangan negatif");
        }
    }
}