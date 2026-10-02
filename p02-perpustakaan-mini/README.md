1. Tambahkan baris Koleksi x = new Koleksi("X01", "Uji", 2026); di method main. Apa pesan error
dari kompiler dan mengapa? koleksi bersifat abstrak tidak dapat di inisiasi
2. Pada kelas Buku, ubah nama method hitungDenda menjadi hitungdenda. Apa yang terjadi jika anotasi
@Override ada, dan jika dihapus? apabila di ubah namanya erornya belum membuat method dan override tidak ada parent kalau di hapus class buku bukan abstrak
3. Tambahkan new Buku("B009", "", 2020, "Anonim"). Apa yang terjadi saat program dijalankan? langsung keluar allert judul tidak boleh kosong
4. Ubah private StatusKoleksi status menjadi public, lalu ubah status B002 langsung dari main
menjadi TERSEDIA saat masih dipinjam. Aturan apa yang dilanggar? eror java tidak menemukan kode B002 aturan yang di langgar itu enkapsulasi status tadi yang private

# Tangkapan layar keluaran program Perpustakaan 
<img width="1917" height="1077" alt="image" src="https://github.com/user-attachments/assets/706b1531-a12c-4891-895f-141903989710" />
(pakai AI ChatGpt untuk menjelaskan eror dan menjelaskan alur dari logika cari judul yang ada di class perpustakaan(Promptnya: bantu saya untuk menjelaskan alur dari class perpustakaan untuk membuat cari judul))

```java
public List<Koleksi> cariJudul(String kataKunci) {
    List<Koleksi> hasil = new ArrayList<>();
    for (Koleksi k : daftarKoleksi) {
        if (k.getJudul().toLowerCase().contains(kataKunci.toLowerCase())) {
            hasil.add(k);
        }
    }
    return hasil;
}
```
