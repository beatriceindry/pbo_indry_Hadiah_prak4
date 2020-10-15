import java.util.Scanner;
public class HadiahPraktek{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		String nama, alamat;
		char tipe, pilihan;
		int bayar, kembalian;
		boolean loop = true;
		
		System.out.println("Tipe dan harga Tiket Pesawat: ");
		System.out.println("Tipe Pesawat A = Rp. 5.000.000");
		System.out.println("Tipe Pesawat B = Rp. 2.000.000");
		System.out.println("Tipe Pesawat c = Rp. 1.000.000");
		System.out.println();
		System.out.print("Masukkan Nama Customer = ");
		nama = input.nextLine();
		System.out.print("Masukkan Tujuan = ");
		alamat = input.nextLine();
		System.out.print("Pilihan = ");
		pilihan = input.next().charAt(0);
		System.out.print("Bayar = ");
		bayar = input.nextInt();
		System.out.println();
		
		while(loop){
 			switch(pilihan){
 				case 'a':kembalian = bayar - 5000000;
 					System.out.println("Nama = "+nama);
 					System.out.println("Tipe Pesawat = "+pilihan);
 					System.out.println("Kembalian = "+kembalian);
 					loop = false;
 					break;
 				case 'b':kembalian = bayar - 2000000;
 					System.out.println("Nama = "+nama);
 					System.out.println("Tipe Pesawat = "+pilihan);
 					System.out.println("Kembalian = "+kembalian);
 					loop= false;
 					break;
 				case 'c':kembalian = bayar - 1000000;
 					System.out.println("Nama = "+nama);
 					System.out.println("Tipe Pesawat = "+pilihan);
 					System.out.println("Kembalian = "+kembalian);
 					loop = false;
 					break;
 				default:
 					System.out.println("Silahkan Pilih Tipe Pesawat");
 			}
 		}
 		System.out.println("Tiket Anda Sedang Diproses");
	}
}