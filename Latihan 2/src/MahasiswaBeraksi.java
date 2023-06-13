/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS VIVOBOOK 14
 */
public class MahasiswaBeraksi {
    // atribut
    String npm,nama,prodi;
    
    // constructor
    public class Mahasiswa {
       String npm,nama,prodi;
    }
    public String getNpm() {
        return npm;
    }
    public String getnama() {
        return nama;
    }
    public String getprodi() {
        return prodi;
    }
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("2110010301", "Wahyu Ramadani", "Teknik Informatika");
        System.out.println("NPM: "mhs1.getNPM());"
        System.out.println("Nama: "mhs1.getNama());"
    }
    
}
