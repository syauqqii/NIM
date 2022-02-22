import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        long nim_mahasiswa, dua_digit_nomor_belakang_nim;
        int increment = 0, day = 0;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input NIM: ");
        nim_mahasiswa = input.nextLong();
        
        dua_digit_nomor_belakang_nim = nim_mahasiswa % 100;
        
        // Untuk cek apakah benar ini ambil 2 digit dari angka belakang NIM (boleh dihapus)
        // System.out.println("Dua digit : " + dua_digit_nomor_belakang_nim + " (sebelum di ubah, jika < 10)");
        
        if(dua_digit_nomor_belakang_nim < 10){
            dua_digit_nomor_belakang_nim = dua_digit_nomor_belakang_nim + 10;
        }
        
        // Untuk cek apakah benar ini ambil 2 digit dari angka belakang NIM (boleh dihapus)
        // tapi setelah perubahan, jika 2 digit tersebut < 10 (boleh dihapus)
        // System.out.println("[#] Dua digit : " + dua_digit_nomor_belakang_nim + " (setelah di ubah)");
        
        System.out.print("OUTPUT   : ");
        
        while(increment != dua_digit_nomor_belakang_nim){
            if(increment != dua_digit_nomor_belakang_nim){
                switch(day){
                    case 0:
                        System.out.print("Senin ");
                        break;
                    case 1:
                        System.out.print("Selasa ");
                        break;
                    case 2:
                        System.out.print("Rabu ");
                        break;
                    case 3:
                        System.out.print("Kamis ");
                        break;
                    case 4:
                        System.out.print("Jumat ");
                        break;
                    case 5:
                        System.out.print("Sabtu ");
                        break;
                    case 6:
                        System.out.print("Minggu ");
                        break;
                }
            } else if(increment == dua_digit_nomor_belakang_nim){
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
            }
            
            if(day != 6){
                day++;
            } else {
                day = 0;
            }
            
            increment++;
        }
    }
}
