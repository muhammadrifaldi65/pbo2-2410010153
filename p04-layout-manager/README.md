| Bagian   | Panel  | Layout |
|----------|--------|--------|
| Jendela  | JFrame |  BorderLayout      |
| Header   | headerPerpustakaanPanel       | BoxLayout       |
|Pembungkus| isiPerpustakaanPanel |BorderLayout |
| Isi form | formPerpustakaanPanel       | GridBagLayout        |
| Tombol   |tombolPerpustakaanPanel        |FlowLayout        |
# Gambar Sketsa Form Perpustakaan 
<img width="3472" height="4624" alt="PXL_20261017_192005857 (1)" src="https://github.com/user-attachments/assets/a2874593-e110-41b2-a847-27bbbbe93400" />

# Tangkapan Layar untuk form perpustakaan tampilan awal 
<img width="1917" height="1077" alt="image" src="https://github.com/user-attachments/assets/55f0a92e-e415-43af-8c81-959b90cd5642" />


# Tangkapan Layar Form perpustakaan yang di lebarkan
<img width="1917" height="1077" alt="image" src="https://github.com/user-attachments/assets/6126eafc-773c-4476-a6a0-01029e97b2f8" />

# Tangkapan Layar Di tab design 
<img width="1917" height="1077" alt="image" src="https://github.com/user-attachments/assets/7b3ec843-f0b8-4563-adc4-9283d75f0aeb" />

# Eksperimen praktikum 2 
1. Pada flowPanel, ubah Alignment layout menjadi Center, lalu kecilkan jendela. Apa yang berubah? Baris
mana di initComponents() yang ikut berubah? **semua yang ada di intComponent dan semuanya menyesuaikan ketengah** 


2. Pada gridPanel, ubah Rows menjadi 0 dan Columns menjadi 2. Berapa baris yang terbentuk dan mengapa? **Ada lima baris yang terbentuk karena misalkan rowsnya 0 dia akan menghitung otomatis dari jumlah komponen**

   
3. Pada boxPanel, isi properti maximumSize keempat tombol dengan lebar 32767 dan tinggi sama dengan
tinggi tombol. Bagaimana lebar tombol berubah? Tambahkan juga Vertical Strut dari kategori Swing Fillers di
antara tombol. **Kalau saya tambahkan lebar menjadi  32767 dia akan invalid value untuk menambahkan vertical struc tombol akan menjadi berjarak**


 # Eksperimen praktikum 4
1. Ubah Weight X pada namaField menjadi 0.0, lalu lebarkan jendela. Apa yang terjadi pada isian? **Tidak terjadi apa apa Normal seperti komponen lainya juga**
   
2. Ubah Direction formPanel di dalam isiPanel dari North menjadi Center, lalu tinggikan jendela. Apa
perbedaannya? **formya akan mengikuti jendela kalau kita bikin north dia tidak mengikuti jendela**

3. Hapus baris setMinimumSize(getSize()) di konstruktor, lalu kecilkan jendela sekecil mungkin. Bagian
mana yang rusak lebih dulu? **Bagian Formpanel dia langsung menciut masuk kedalam terus tidak terlihat lagi**

# Saling Menilai

| **No** | **Pemeriksaan** | **Ya atau Belum** |
|:------:|-----------------|-------------------|
| 1 | Label singkat, jelas, dan sejajar |Ya |
| 2 | Isian dikelompokkan dengan judul bagian | Ya |
| 3 | Placeholder dipakai untuk isian yang punya format | Ya |
| 4 | Komponen sesuai jenis data | Ya |
| 5 | Tombol utama menonjol dan berada di kanan bawah |Ya |
| 6 | Jarak antar komponen konsisten | Belum(dibagian Radio button masih agak berantakaan sedikit) |
| 7 | Form tetap rapi saat jendela dilebarkan dan ditinggikan | Ya |
| 8 | Tampilan dibuat dengan JFrame Form dan layout manager, bukan Null Layout atau Absolute Layout | Ya |


# TIDAK MEMAKAI AI 

