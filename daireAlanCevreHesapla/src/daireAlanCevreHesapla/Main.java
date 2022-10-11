package daireAlanCevreHesapla;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double yariCap;
		System.out.print("Dairenin yarý çapýný giriniz: ");
		yariCap=input.nextDouble();
		double alan=(3.14*(yariCap*yariCap));
		double cevre=(2*3.14*yariCap);
		System.out.print("Dairenin alaný: "+alan+"\nÇevresi: "+cevre);

	}

}
