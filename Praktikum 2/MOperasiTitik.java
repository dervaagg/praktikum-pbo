/**
* MOperasiTitik.java 01/03/2023
* Nama/NIM 	: Derva Anargya Ghaly/24060121140149 
* Deskripsi : kelas yang berisi program utama yang memanfaatkan kelas operasi titik
*/

class MOperasiTitik {
    public static void main(String[] args) {
        Titik t1 = new Titik (5.0, 3.0);
        OperasiTitik op = new OperasiTitik();

        System.out.println("Titik("+t1.getAbsis()+","+t1.getOrdinat()+")");

        op.refleksiX(t1);
        System.out.println("\nTitik setelah refleksi sumbu x");
        System.out.println("Titik("+t1.getAbsis()+","+t1.getOrdinat()+")");

        op.refleksiY(t1);
        System.out.println("\nTitik setelah refleksi sumbu Y");
        System.out.println("Titik("+t1.getAbsis()+","+t1.getOrdinat()+")");
    }

}
