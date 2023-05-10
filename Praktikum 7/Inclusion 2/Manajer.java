/*
* Manajer.java 6 Mei 2023
* Nama      : Derva Anargya Ghaly
* NIM       : 24060121140149
* Deskripsi : Program berupa Subclass dari Pegawai 
*/ 

 class Manajer extends Pegawai{
	private int tunjangan = 700000;
	
	public Manajer(String nama) {
		this.setNama(nama);
	}
	
	public void tampilData() {
		super.tampilData();
		System.out.printf("Tunjangan : %d \n", this.tunjangan);
	}
}