package prueba;

import java.util.Scanner;


public class pruebaMain2
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		
		System.out.print("Introduzca el numero 1: ");
		int num1=sc.nextInt();
		
		System.out.print("Introduzca el numero 2: ");
		int num2=sc.nextInt();
		
		int suma=num1+num2;
		
		System.out.println("La suma de " + num1 + " y " + num2 + " es igual a " + suma);
		
		sc.close();
		
	}

}
