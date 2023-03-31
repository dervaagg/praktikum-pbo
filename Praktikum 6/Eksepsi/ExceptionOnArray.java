/*
* ExceptionOnArray.java 31 Maret 2023
* Nama      : Derva Anargya Ghaly
* NIM       : 24060121140149
* Deskripsi : program penggunaan eksepsi menggunakan class library java
*/ 

package Eksepsi;

public class ExceptionOnArray {
    public static void main(String[] args) {
        // inisiasi object array integer
        Integer[] arrayInteger = new Integer[4];
        try{
            arrayInteger[2] = 11;
            arrayInteger[4] = 10;
        }
        catch(ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
        }
        finally{
            System.out.println("clean up code...");
        }
    }
    
}