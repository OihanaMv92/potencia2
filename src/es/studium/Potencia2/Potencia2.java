package es.studium.Potencia2;

import java.util.Scanner;

public class Potencia2
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner (System.in);
		int a, b;
		System.out.println("Dame un numero para la base ");
		a=teclado.nextInt();
		System.out.println("Dame otro numero para el exponente ");
		b=teclado.nextInt();
		teclado.close();
		System.out.println("El número" + a + "elevado a " + b + " es igual a: " + pot (a,b));
		
	}
		public static int pot(int base,int exponente)
		{
			int i,resultado =1;
			for(i=1;i<=exponente;i++) //for(int i=1; i<=exp;i++)
			{
				resultado = resultado*base;
			}
			return(resultado);
		}

}
