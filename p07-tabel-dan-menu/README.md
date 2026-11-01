# PERTANYAAN DAN JAWABAN PRAKTIKUM 5

1. Di KontakTableModel, jadikan baris fireTableRowsInserted(baris, baris); sebagai komentar, lalu
tambah kontak baru. Apakah tabel langsung berubah? **data tidak tampil ditabel**


2. Di method barisTerpilih, ganti isinya menjadi return kontakTable.getSelectedRow();. Cari kata
"ah", pilih Ahmad Fauzi, lalu klik Hapus dan pilih No. Nama siapa yang muncul di dialog konfirmasi? **Siti Rahmah dan Nur Aisah**

3. Di konstruktor DialogKontak, ubah super(pemilik, judul, true) menjadi false. Saat dialog terbuka,
coba klik jendela utama. Apa yang terjadi pada kontak yang ditambahkan? **Kontak tidak muncul saat ditambahkan** 

4. Tekan Ctrl+N, Ctrl+E, dan Ctrl+D. Mengapa Ctrl+E dan Ctrl+D tidak bekerja saat tidak ada baris yang dipilih? **Karena di table ada event mouseclick dulu baru bisa dipakai**
 
5. Di tab Design, ubah accelerator hapusItem menjadi tombol Delete tanpa Ctrl. Baris apa yang berubah di
initComponents()? 
```
tambahItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
```

6. Ubah deklarasi atribut menjadi private KontakTableModel model; lalu isi model = new
KontakTableModel(); setelah initComponents(). Jalankan. Pesan error apa yang muncul dan
mengapa? **eror NullPointerException karena didalam int udah ada setmodel**


# VIDIO DEMO PROYEK MINI

https://youtu.be/0arPr2gN6PE?si=uF5-8llGT6ftYHIL
