/*
* PolimorfismeCoercion.java 6 Mei 2023
* Nama      : Derva Anargya Ghaly
* NIM       : 24060121140149
* Deskripsi : Program polimorfisme coercion 
*/ 

public class PolimorfismeCoercion {

    public static int kuadrat(int bilangan) {
        return bilangan*bilangan;
    }
    public static void main(String[] args) {
        //deklarasi objek integer
        Integer bilangan = 10;
        //objek integer 'dipaksa' untuk diubah
        //meniadi primitif
        int hasilKuadrat = kuadrat (bilangan);
    
        System.out.printf("Hasil kuadrat %d adalah %d",
            bilangan, 
            hasilKuadrat);
    }
}