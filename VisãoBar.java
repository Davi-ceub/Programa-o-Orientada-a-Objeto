package Apresentação;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import Negócio.Caipirinha;
import Negócio.Drink;
import Negócio.DryMartini;
import Negócio.Mixer;
import Negócio.MoscowMule;
import Negócio.OldFashion;

public class VisãoBar {
	public static void main(String[] args) {
		// declaração de váriaveis
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		Drink objDrink = null;
		int opcao = 0;

		// entrada de dados
		try {
			System.out.println("+================+");
			System.out.println("|    Cardápio    |");
			System.out.println("+================+");
			System.out.println("| 1 - Caipirinha |");
			System.out.println("| 2 - DryMartini |");
			System.out.println("| 3 - OldFashion |");
			System.out.println("| 4 - MoscowMule |");
			System.out.println("+================+");
			System.out.print("Digite a sua opção: ");
			opcao = Integer.parseInt(leitor.readLine());

			switch (opcao) {
			case 1:
				objDrink = new Caipirinha();
				break;

			case 2:
				objDrink = new DryMartini();
				break;

			case 3:
				objDrink = new OldFashion();
				break;

			case 4:
				objDrink = new MoscowMule();
				break;
			}
			((Mixer) objDrink).misturar();
			objDrink.beber();
		} catch (Exception erro) {
			System.out.println("Chega de beber e vá pra casa");
		}
	}
}
