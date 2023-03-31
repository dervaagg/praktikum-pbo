/*
* AngkaSialException.java 31 Maret 2023
* Nama      : Derva Anargya Ghaly
* NIM       : 24060121140149
* Deskripsi : Program penggunaan Exception buatan sendiri, menolak angka 13
*/ 

package Eksepsi;

public class AngkaSialException extends Exception{
    public AngkaSialException(){
        super("jangan memasukkan angka 13 karena angka sial !!!");
    }
}