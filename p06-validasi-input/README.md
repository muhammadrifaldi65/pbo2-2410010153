# PERTANYAAAN DAN JAWABAN PRAKTIKUM 4

1. Ketik huruf pada isian NPM. Apa yang terjadi dan baris mana di npmFieldKeyTyped yang menyebabkannya?
```
        boolean penuh = npmField.getText().length() >= 10
                && npmField.getSelectedText() == null;
        if (!Character.isDigit(evt.getKeyChar()) || penuh) {
            evt.consume(); // karakter tidak dimasukkan ke isian
        }
```
   
2. Isi email dengan siti@, lalu tekan Tab. Kapan pesan kesalahan muncul? **Setelah tekan tab muculfomat email belum benar**
   
3. Klik isian Nama tanpa mengetik, lalu tekan Tab. Mengapa tidak ada pesan kesalahan? **Karena belum divalidasi**
   
4. Centang persetujuan, lalu klik Daftar dengan form kosong. Isian mana yang mendapat fokus? **isian NPM ayng di fokuskan**
   
5. Tekan tombol Alt bersama huruf N. Isian mana yang mendapat fokus, dan properti apa yang mengaturnya? **isian Nama yang di fokuskan**
    
6. Isi beberapa isian, lalu klik Batal dan pilih No. Apakah data tetap ada? **tetap ada dan tidak di hapus**

# TANGKAPAN LAYAR FORM KESALAHAN
<img width="1917" height="1077" alt="image" src="https://github.com/user-attachments/assets/e27e83d6-24ed-468f-8727-e7bee3beaae7" />

# TANGKAPAN LAYAR NAVIGATOR
<img width="1917" height="1077" alt="image" src="https://github.com/user-attachments/assets/00b6beda-3d8c-4511-9d42-f347ed9bdafb" />

# LEMBAR PEER YANG DIISI TEMAN
<img width="582" height="685" alt="image" src="https://github.com/user-attachments/assets/df072164-7e21-492b-b635-8b14f74cffa4" />
