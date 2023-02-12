package application;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product_2;
import entities.importedProduct_2;
import entities.usedProduct_2;

//EXERCÍCIO DE FIXAÇÃO

		/*
		 * Fazer um programa para ler os dados de N produtos (N fornecido pelo usuário). Ao final,
		 * mostrar a etiqueta de preço de cada produto na mesma ordem em que foram digitados.
		 * 
		 * Todo produto possui nome e preço. Produtos importado possuem uma taxa de alfândega, e produtos usados
		 * possuem data de fabricação. Estes dados específicos devem ser acrescentados na etiqueta de preço. Para produtos
		 * importados, a taxa e alfândega deve ser acrescentada ao preço final do produto.
		 * 
		 * Favor implementar o programa conforme projeto ao lado.
		 */


public class Program_6 {

public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product_2> list = new ArrayList<>();
		
		System.out.print("Entre com o numero de produtos: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Datos do produto #" + i + ":");
			System.out.print("Comum, usado, importado (c/u/i)? ");
			char type = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Preco: ");
			double price = sc.nextDouble();
			if (type == 'c') {
				list.add(new Product_2(name, price));
			}
			else if (type == 'u') {
				System.out.print("Data de fabricacao (DD/MM/YYYY): ");
				LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				list.add(new usedProduct_2(name, price, date));
			}
			else {
				System.out.print("Taxa de importacao: ");
				double customsFee = sc.nextDouble();
				list.add(new importedProduct_2(name, price, customsFee));
			}
		}

		System.out.println();
		System.out.println("ETIQUETAS DE PRECO:");
		for (Product_2 prod : list) {
			System.out.println(prod.priceTag());
		}
		
		sc.close();
	}
}
