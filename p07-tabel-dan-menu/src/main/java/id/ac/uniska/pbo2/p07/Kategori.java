/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package id.ac.uniska.pbo2.p07;

/**
 *
 * @author FERDY
 */
public enum Kategori {
    KELUARGA("Keluarga"),
    TEMAN("Teman"),
    KAMPUS("Kampus"),
    KERJA("Kerja");
    
    private final String label;

    Kategori(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return label;
    }
}
