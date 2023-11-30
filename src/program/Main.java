package program;

import java.util.Locale;
import java.util.Scanner;

import entities.Contribuinte;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner std=new Scanner(System.in);
		System.out.print("Renda anual com salário:");
		double salario=std.nextDouble();
		System.out.print("Renda anual com prestação de serviço:");
		double servicos=std.nextDouble();
		System.out.print("Renda anual com ganho de capital:");
		double capital=std.nextDouble();
		System.out.print("Gastos médicos:");
		double gastosMedicos=std.nextDouble();
		System.out.print("Gastos educacionais:");
		double gastodEducacionais=std.nextDouble();
		
		Contribuinte contribuinte=new Contribuinte(salario, servicos, capital, gastosMedicos, gastodEducacionais);
		
		System.out.println(contribuinte.Relatorio());
		
		std.close();
	}

}
