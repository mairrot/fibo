package fibo;
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pri,se,ter,in,con;
		con=0;
		pri=1;
		se=1;
		ter=0;
		System.out.println(pri);
		System.out.println(se);
		do {
			ter=pri+se;
			System.out.println(ter);
			pri=ter+se;
			System.out.println(pri);
			se=pri+ter;
			System.out.println(se);
			con =con+1; 
		}
		while (con>0);
	}

}
