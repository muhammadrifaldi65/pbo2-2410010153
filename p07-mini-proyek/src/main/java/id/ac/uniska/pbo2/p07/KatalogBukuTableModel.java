/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.uniska.pbo2.p07;

/**
 *
 * @author FERDY
 */
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 * Menghubungkan daftar Kontak dengan JTable. JTable bertanya kepada model:
 * berapa baris, berapa kolom, dan apa isi setiap sel.
 */
public class KatalogBukuTableModel extends AbstractTableModel {

    private static final String[] KOLOM = {"Kode", "Judul", "Penulis", "Tahun Terbit", "Status"};
    private final List<Buku> daftar = new ArrayList<>();

    @Override
    public int getRowCount() {
        return daftar.size();
    }

    @Override
    public int getColumnCount() {
        return KOLOM.length;
    }

    @Override
    public String getColumnName(int kolom) {
        return KOLOM[kolom];

    }

    @Override
    public Object getValueAt(int baris, int kolom) {
        Buku d = daftar.get(baris);
        return switch (kolom) {
            case 0 ->
                d.kode();
            case 1 ->
                d.judul();
            case 2 ->
                d.penulis();
            case 3 ->
                d.tahunTerbit();
            default ->
                d.kategori();
        };
    }

    public Buku get(int baris) {
        return daftar.get(baris);
    }

    public void tambah(Buku dataBuku) {
        daftar.add(dataBuku);
        int baris = daftar.size() - 1;
        fireTableRowsInserted(baris, baris); // tampilkan baris baru
    }

    public void ubah(int baris, Buku dataBuku) {
        daftar.set(baris, dataBuku);
        fireTableRowsUpdated(baris, baris);
    }

    public void hapus(int baris) {
        daftar.remove(baris);
        fireTableRowsDeleted(baris, baris);
    }
}
