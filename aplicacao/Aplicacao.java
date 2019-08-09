package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circulo;
import entities.Forma;
import entities.Retangulo;
import entities.enuns.Corobj;

public class Aplicacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Forma> lista = new ArrayList<>();

		System.out.print("Entre com o mumero de Formas: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			System.out.println("Dados da #" + i + "Figura");

			System.out.print("Figura será Retngulo ou Circulo (r/c): ");
			char fg = sc.next().charAt(0);

			System.out.print("Cor (Azul/Vermelho/Preto :");
			Corobj cor = Corobj.valueOf(sc.next());

			if (fg == 'r' || fg == 'R') {

				System.out.println("Altura: ");
				Double alt = sc.nextDouble();

				System.out.println("Largura: ");
				Double larg = sc.nextDouble();

				lista.add(new Retangulo(cor, larg, alt));
			} else {

				System.out.println("Raio: ");
				Double raio = sc.nextDouble();

				lista.add(new Circulo(cor, raio));

			}

		}

		for (Forma l : lista) {

			System.out.println(String.format("%.2f", l.Area()));
		}
		sc.close();
	}
	
}
