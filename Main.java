import java.util.Scanner;

// Nama Class harus sama seperti nama file.
public class Main{
    // Buat function main()
    public static void main(){
        // [tipe data long] Buat variabel nim_mahasiswa : untuk menampung input nim_mahasiswa
        // [tipe data long] Buat variabel dua_digit_nomor_belakang_nim : untuk menampung 2 digit belakang nomor nim_mahasiswa
        long nim_mahasiswa, dua_digit_nomor_belakang_nim;
        
        // [tipe data int] Buat variabel increment : untuk perulangan saja.
        // [tipe data int] Buat variabel day : untuk output hari saja.
        int increment = 0, day = 0;
        
        // Deklarasi input untuk input
        Scanner input = new Scanner(System.in);

        // Tampilkan "Input NIM: " di konsol      
        System.out.print("Input NIM: ");
        // Proses input nim_mahasiswa
        nim_mahasiswa = input.nextLong();
        
        // Proses pengambilan 2 digit nomor nim_mahasiswa
        dua_digit_nomor_belakang_nim = nim_mahasiswa % 100;
        
        // Jika 2 digit nomor nim_mahasiswa kurang dari 10, maka...
        if(dua_digit_nomor_belakang_nim < 10){
            // Untuk cek apakah benar ini ambil 2 digit dari angka belakang NIM (boleh dihapus)
            // Tampilkan 2 digit angka
            System.out.println("Dua digit : " + dua_digit_nomor_belakang_nim + "  (sebelum di ubah, jika < 10)");
            
            // .. maka akan di tambah 10
            dua_digit_nomor_belakang_nim = dua_digit_nomor_belakang_nim + 10;
        }
        
        // Untuk cek apakah benar ini ambil 2 digit dari angka belakang NIM (boleh dihapus)
        // tapi setelah perubahan, jika 2 digit tersebut < 10 (boleh dihapus)
        // Tampilkan 2 digit angka setelah di ubah
        System.out.println("Dua digit : " + dua_digit_nomor_belakang_nim + " (setelah di ubah, + 10)");
        
        // Tampilkan "OUTPUT : " di konsol
        System.out.print("OUTPUT   : ");
        
        // Ketika 0 tidak sama dengan dua digit nomor nim_mahasiswa, maka..
        while(increment != dua_digit_nomor_belakang_nim){
            // switch statement
            switch(day){
                case 0:
                    System.out.print("Senin");
                    break;
                case 1:
                    System.out.print("Selasa");
                    break;
                case 2:
                    System.out.print("Rabu");
                    break;
                case 3:
                    System.out.print("Kamis");
                    break;
                case 4:
                    System.out.print("Jumat");
                    break;
                case 5:
                    System.out.print("Sabtu");
                    break;
                case 6:
                    System.out.print("Minggu");
                    break;
            }  
            
            // Jika increment < 2 digit nomor nim_mahasiswa, maka..
            if(increment < dua_digit_nomor_belakang_nim-1){
                // Kasih spasi..
                System.out.print(" ");
            }
            
            // Jika hari tidak sama dengan 6
            if(day != 6){
                // hari bertambah 1
                day++;
            } // Jika hari sama dengan 6
            else {
                // reset, hari menjadi kembali 0
                day = 0;
            }
            
            // increment bertambah 1
            increment++;
        }
    }
}
