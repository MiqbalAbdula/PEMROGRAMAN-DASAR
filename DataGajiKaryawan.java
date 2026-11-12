public class DataGajiKaryawan {
    public static void main(String[] args) {
        // Deklarasi dan inisialisasi array 2 dimensi [baris][kolom]
        // Kolom: [0] NAMA, [1] JABATAN, [2] GAPOK, [3] TUNJANGAN
        String[][] dataKaryawan = {
            {"ADIT", "DIREKTUR", "10.000.000", "5.000.000"},
            {"JANI", "MANAGER",  "8.000.000",  "3.500.000"}
        };

        // Menampilkan Header Tabel
        System.out.println("=========================================================================");
        System.out.printf("%-5s %-15s %-15s %-15s %-15s\n", "NO", "NAMA", "JABATAN", "GAPOK", "TUNJANGAN");
        System.out.println("=========================================================================");

        // Perulangan untuk menampilkan isi array 2 dimensi
        for (int i = 0; i < dataKaryawan.length; i++) {
            System.out.printf("%-5d %-15s %-15s %-15s %-15s\n",
                (i + 1),                 // Nomor urut
                dataKaryawan[i][0],      // Nama
                dataKaryawan[i][1],      // Jabatan
                dataKaryawan[i][2],      // Gapok
                dataKaryawan[i][3]       // Tunjangan
            );
        }
        System.out.println("=========================================================================");
    }
}
Hasil Output Program:
Plaintext
=========================================================================
NO    NAMA            JABATAN         GAPOK           TUNJANGAN      
=========================================================================
1     ADIT            DIREKTUR        10.000.000      5.000.000      
2     JANI            MANAGER         8.000.000       3.500.000      
=========================================================================
Jika Anda ingin menambahkan data karyawan ke-3 dan seterusnya, cukup tambahkan baris baru di dalam kurung kurawal dataKaryawan dengan format {"NAMA", "JABATAN", "GAPOK", "TUNJANGAN"},. Apakah ada bagian lain yang ingin disesuaikan?