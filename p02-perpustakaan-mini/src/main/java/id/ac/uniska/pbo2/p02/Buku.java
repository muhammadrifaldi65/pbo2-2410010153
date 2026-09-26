/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.uniska.pbo2.p02;

/**
 *
 * @author FERDY
 */
public class Buku extends Koleksi{
    
    private final String penulis;
    
    public Buku(String kode, String judul, int tahunTerbit, String penulis) {
        super(kode, judul, tahunTerbit);
        this.penulis = penulis;
    }
    public String getPenulis() {
        return penulis;
    }
    
    @Override
    public int batasHariPinjam() {
        return 7;
    }
    @Override
    public long hitungDenda(int hariTerlambat) {
        return hariTerlambat * 1000L;
    }
    
    @Override
    public String keterangan() {
        return "Buku karya " + penulis;
    }
}
