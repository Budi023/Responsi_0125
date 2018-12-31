package Uas;

import java.util.Scanner;
import java.util.regex.Pattern;

public class main {

	private Scanner input;

	public main(String[] args) {
		// TODO Auto-generated method stub
		
		 input = new Scanner (System.in);
		 String nama;
		 String alamat;
		 String telfon;
		 System.out.print("Budi Utomo : " );
		 nama=input.nextLine();
		 System.out.print("Format Nama Salah : " );
		 alamat=input.nextLine();
		 System.out.print("Format Nama Salah : " );
		 telfon=input.nextLine();
		 System.out.println("Anda Memiliki nama "+ nama +" yang beralamat "+alamat +" no telfon "+telfon );
	
	}

}
