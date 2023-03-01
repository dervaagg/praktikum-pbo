/**
* Mtitik.java 22/02/2023
* Nama/NIM 	: Derva Anargya Ghaly/24060121140149 
* Deskripsi : kelas yang berisi program utama yang memanfaatkan kelas titik
*/

class MTitik{
	public static void main(String[] args){
		Titik t1 = new Titik();
		t1.setAbsis(1.0);
		t1.setOrdinat(2.0);
		
		Titik t2 = new Titik();
		t2.setAbsis(3.0);
		t2.setOrdinat(4.0);

		int counterTitik = t1.getCounterTitik();
		
		System.out.println("jumlah objek titik" + counterTitik);
		System.out.println("t1("+ t1.getAbsis()+", "+t1.getOrdinat()+")");
		System.out.println("t2("+ t1.getAbsis()+", "+t2.getOrdinat()+")");
	}
}