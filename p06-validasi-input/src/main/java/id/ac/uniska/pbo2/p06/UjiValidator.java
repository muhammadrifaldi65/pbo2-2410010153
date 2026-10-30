/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.uniska.pbo2.p06;

/**
 *
 * @author FERDY
 */
public class UjiValidator {
    private static int gagal = 0;
    
    private static void cek(String nama, String hasil, boolean harusValid) {
        boolean valid = (hasil == null);
        if (valid != harusValid) {
            gagal++;
        }
        String status = (valid == harusValid) ? "SESUAI " : "SALAH ";
        System.out.println(status + nama + ": " + (valid ? "valid" : hasil));
    }

    public static void main(String[] args) {
        cek("NPM kosong", Validator.npm(""), false);
        cek("NPM 5 digit", Validator.npm("12345"), false);
        cek("NPM berisi huruf", Validator.npm("24100101ab"), false);
        cek("NPM benar", Validator.npm("2410010123"), true);
        cek("Nama terlalu pendek", Validator.nama("Al"), false);
        cek("Nama benar", Validator.nama("Siti Rahmah"), true);
        cek("Email tanpa domain", Validator.email("siti@"), false);
        cek("Email benar", Validator.email("siti.rahmah@uniska-bjm.ac.id"), true);
        cek("Nomor HP terlalu pendek", Validator.nomorHp("0812"), false);
        cek("Nomor HP diawali 62", Validator.nomorHp("6281234567890"), false);
        cek("Nomor HP 12 digit", Validator.nomorHp("081234567890"), true);
        System.out.println();
        if (gagal == 0) {
            System.out.println("Semua aturan bekerja sesuai harapan");
        } else {
            System.out.println(gagal + " aturan belum sesuai");
        }
    }
}
