/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.uniska.pbo2.uts;

/**
 *
 * @author FERDY
 */
public final class ValidatorNilai {
    
    private ValidatorNilai(){
    

}
    public static String wajibDiisi(String nilai, String namaIsian){
        if (nilai == null || nilai.isBlank()) {
            return namaIsian + "Wajib diisi";
        
        }
        return null;
    
    }
    public static String npm(String npm) {
        String kosong = wajibDiisi(npm, "NPM");
        if (kosong != null) {
            return kosong;
        }
        if (!npm.trim().matches("\\d{10}")) {
            return "NPM harus berisi 10 digit angka";
        }
        return null;
    }
    
    public static String nama(String nama) {
        String kosong = wajibDiisi(nama, "Nama");
        if (kosong != null) {
            return kosong;
        }
        if (nama.trim().length() < 3) {
            return "Nama minimal 3 huruf";
        }
        if (nama.trim().matches(".*\\d.*")) {
            return "Nama Tidak boleh angka";
        }
        return null;
    }
 public static String tugas(String tugas) {
    String kosong = wajibDiisi(tugas, "Nilai Tugas");

    if (kosong != null) {
        return kosong;
    }

    try {
        double nilai = Double.parseDouble(tugas.trim());

        if (nilai < 0 || nilai > 100) {
            return "Nilai Tugas harus antara 0-100";
        }
    } catch (NumberFormatException e) {
        return "Nilai Tugas harus berupa angka";
    }

    return null;
}   
  public static String uts(String uts) {
    String kosong = wajibDiisi(uts, "Nilai UTS");

    if (kosong != null) {
        return kosong;
    }

    try {
        double nilai = Double.parseDouble(uts.trim());

        if (nilai < 0 || nilai > 100) {
            return "Nilai UTS harus antara 0-100";
        }
    } catch (NumberFormatException e) {
        return "Nilai UTS harus berupa angka";
    }

    return null;
}
public static String uas(String uas) {
    String kosong = wajibDiisi(uas, "Nilai UAS");

    if (kosong != null) {
        return kosong;
    }

    try {
        double nilai = Double.parseDouble(uas.trim());

        if (nilai < 0 || nilai > 100) {
            return "Nilai UAS harus antara 0-100";
        }
    } catch (NumberFormatException e) {
        return "Nilai UAS harus berupa angka";
    }

    return null;
}
}
