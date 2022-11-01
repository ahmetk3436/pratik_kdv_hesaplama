package pratik_kdv_hesaplama;

import java.util.Scanner;

public class Main {
	static int money;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Para miktarı giriniz : ");
		 money =scan.nextInt();
		if(money < 1000 && money > 0)
		{
			System.out.println("Kdv : " + money *0.18f);
		} else 

		{
			System.out.println("Kdv : " + money *0.08f);
		}
		scan.close();

	}

}
