# Eksperimen Praktikum 3
1. Hapus pemeriksaan if (evt.getStateChange() == ItemEvent.SELECTED) dan tambahkan
System.out.println("item berubah"); di dalam event handler. Berapa kali pesan tercetak setiap
pilihan diganti? **Pesan tercetak 2 kali**


2. Di jendela Properties bagian Events, kosongkan event keyReleased pada celsiusField, lalu buat event
keyPressed yang memanggil konversi(). Mengapa hasil yang tampil terlambat satu karakter? **Karena harus di tekan dulu pilihanya biar dia bisa menentukan hasilnya**



3. Hapus blok try dan catch di method konversi, lalu ketik huruf pada isian. Apa yang muncul di jendela
Output? **Tidak ada keluaran apa apa di output**

# Eksperimen Praktikum 4
1. Buat event actionPerformed untuk kaliButton melalui Events tanpa menghapus lambda di konstruktor, lalu
tambahkan System.out.println("kali"); di kedua tempat. Berapa kali pesan tercetak? Mengapa satu
tombol sebaiknya hanya memakai satu cara? **Pesan tercetak dua kali di form dan di output. karena ini sudah menjadi sebuah aplikasi form dan tidak lagi pakai output run saja**


2. Tambahkan tombol % untuk sisa bagi (modulus). Apa saja yang diubah di tab Design dan di tab Source? **menambahnya button di operator panel dan di tab source saya menambahkan case case '%' -> a % b; dan menambahkan event ActionPerformed dan didalamnya ada hitung('%')


3. Tekan tombol Hapus. Mengapa kursor langsung berada di isian pertama? **Karena sudah di kasih actionEvent untuk focus ke angkafield yang pertama**


# Tabel Rancangan Praktikum 2
| No | Tindakan | Event yang tercatat |
|:--:|----------|---------------------|
| 1 | Arahkan kursor ke tombol, lalu jauhkan | MouseEvent kurso masuk ke tombol dan kursor keluar dari tombol |
| 2 | Klik tombol Klik saya | ActionEvent tombl diklik |
| 3 | Centang lalu hapus centang Aktifkan fitur | itemEvent kotak dicentang dan centang dihapus |
| 4 | Ganti pilihan dari Pagi menjadi Malam | itemEvent memilih Malam |
| 5 | Klik isian, lalu ketik kata "abc" | keyEvent mengetik huruf a , mengetik huruf b , dan mengetik huruf c |
| 6 | Klik tombol setelah mengetik di isian | focusEvent isian kehilangan fokus |


# Tankapan Layar Event pada Tombol Daftar
<img width="1917" height="1077" alt="image" src="https://github.com/user-attachments/assets/3cd171d5-09f4-41cc-bad1-b162780ee3c4" />

# Tangkapan Dialog Di perpustakaan 
<img width="1917" height="1077" alt="image" src="https://github.com/user-attachments/assets/0c3a8b2f-511a-4a92-9f88-396a07275777" />
<img width="1917" height="1077" alt="image" src="https://github.com/user-attachments/assets/38ac2a22-c6cf-45d2-af62-a965577ca9e6" />


# Memakai AI GEMINI  untuk mencari 10 digit di npm 
```
private void updateDigitLabel(){
    String npm = npmField.getText();
    int jumlahDigit = npm.length();
    
    digitLabel.setText(jumlahDigit + "dari 10 digit");

}
```
