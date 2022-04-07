import java.util.Random;
import java.util.Scanner;

public class Ex_3 {
	public static void main(String[] args) {

		int aux, nr;
		Scanner t = new Scanner(System.in);
		String[] gabarito = new String[10];
		String[] respostas=new String[10];

		System.out.print("Quantos alunos tem na sala? --> ");
		nr = t.nextInt();

		gab(gabarito);
		corrigir(gabarito, respostas, nr);
	}

	public static void gab(String[] gabarito) {
		Scanner t=new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			System.out.print("Qual a respodta da questão " + (i + 1) + "?");
			gabarito[i]=t.next();
		}
	}
	public static void corrigir(String[] gabarito, String[] respostas, int nr) {
		Scanner t=new Scanner(System.in);
		int aux, nota = 0;
		Random y = new Random();
		
		for (int i = 0; i < nr; i++) {
			for (int j = 0; j < 10; j++) {
				aux = y.nextInt(5);
				if (aux == 0) {
					respostas[j] = "a";
				}
				if (aux == 1) {
					respostas[j] = "b";
				}
				if (aux == 2) {
					respostas[j] = "c";
				}
				if (aux == 3) {
					respostas[j] = "d";
				}
				if (aux == 4) {
					respostas[j] = "e";
				}
				System.out.print(respostas[j] + "\t");
			}
			System.out.println();

			for (int j = 0; j < gabarito.length; j++) {
				if (respostas[j].equals(gabarito[j])) {
					nota++;
				}
			}

			System.out.println();

			if (nota >= 7) {
				System.out.println(";) aprovado");
			} else {
				System.out.println(":( reprovado");
			}
			
			nota = 0;
		}
		
	}
}

