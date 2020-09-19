package ui;

public class Main {
	
	
	public static void main (String[] args) {
		
		System.out.println(1%500);
		System.out.println("hola");
		int index=0;
		int[] number= new int[501];
		int repetidos=0;
		String[] repetidosN= new String[501];
		for (int i = 0; i < 500; i++) {
		int numberIndex = ((int)(Math.random()*500+1)%499);
		if(number[numberIndex]==1) {
			System.out.println("        repetido "+ numberIndex);
			repetidos++;
		}else {
			number[numberIndex]=1;
		}
		System.out.println("Hash key:" + numberIndex);
		}
		System.out.println("Total de repetidos"+repetidos);
	}
}
