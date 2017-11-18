public class CetakSiswa1{

    public static void main (String[]args){
        Siswa1 sis = new Siswa1(12345, "Jonowati");
        System.out.println ("Nis :" + sis.getNis());
        System.out.println ("Nama  :" + sis.getNama());
    }
}

/**
pendeklarasian object pada baris 4 harus menggunakan parameter
karena method construktor pada class Siswa1 memiliki parameter dan harus diisi jka tidak di isi maka akan error
 */