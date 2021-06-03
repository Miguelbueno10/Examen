package Fechas1;

import java.time.DateTimeException;
import java.time.LocalDate;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate fecha;
		Scanner sc = new Scanner(System.in);
		LocalDate fechas[] = new LocalDate[3];
		boolean correcta;
		int a�o, mes, dia;

		for (int i = 0; i < fechas.length; i++) {
			correcta = false;
			System.out.println("Anota a�o");
			a�o = sc.nextInt();
			System.out.println("Anota mes");
			mes = sc.nextInt();
			System.out.println("Anota dia");
			dia = sc.nextInt();
			try {
				fecha = LocalDate.of(a�o, mes, dia);
				fechas[i] = fecha;
			} catch (DateTimeException e) {
				System.out.println("Fecha incorrecta vuelve annotar fecha");
			}
			
		}
		for (int i = 0; i < fechas.length; i++) {
			System.out.println("Fecha: " + fechas[i]);
			System.out.println("");
		}

	}
}
