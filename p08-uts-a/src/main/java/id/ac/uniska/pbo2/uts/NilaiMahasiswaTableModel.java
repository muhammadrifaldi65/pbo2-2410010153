/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.uniska.pbo2.uts;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author FERDY
 */


public class NilaiMahasiswaTableModel extends AbstractTableModel {

    private final String[] kolom = {
        "NPM", "Nama", "Tugas", "UTS", "UAS", "Akhir", "Huruf"
    };

    private final List<NilaiMahasiswa> data = new ArrayList<>();

    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public int getColumnCount() {
        return kolom.length;
    }

    @Override
    public String getColumnName(int column) {
        return kolom[column];
    }

    @Override
    public Object getValueAt(int row, int column) {
        NilaiMahasiswa m = data.get(row);

        return switch (column) {
            case 0 -> m.getNpm();
            case 1 -> m.getNama();
            case 2 -> m.getTugas();
            case 3 -> m.getUts();
            case 4 -> m.getUas();
            case 5 -> String.format("%.2f", m.getNilaiAkhir());
            case 6 -> m.getHurufMutu();
            default -> null;
        };
    }

    public void tambahData(NilaiMahasiswa m) {
        data.add(m);
        fireTableRowsInserted(data.size() - 1, data.size() - 1);
    }

    public boolean npmSudahAda(String npm) {
        return data.stream()
                .anyMatch(m -> m.getNpm().equals(npm));
    }

    public int getJumlahMahasiswa() {
        return data.size();
    }

    public double getRataRata() {
        return data.stream()
                .mapToDouble(NilaiMahasiswa::getNilaiAkhir)
                .average()
                .orElse(0);
    }
}
