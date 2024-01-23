import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		//String nome = teclado.nextLine();
		//System.out.print(nome);
		int a = teclado.nextInt();
		int b = teclado.nextInt();
		int divisores = 0;
		List primos = new ArrayList();
		for (int i = a; i <= b; i++) {
			for (int j = 1;j <= i; j++ ) {
				if (i % j == 0) {
					divisores += 1;
				} 
			}
			if (divisores == 2) {
				primos.add(i);
			}
			divisores = 0;
		}
		if (primos.size() != 0) {
		int c = 1;
		int soma = 0;
		for (int i = 0; i < primos.size(); ++i){
			int aux = (Integer) primos.get(i);
			for (int j = 1; j <= aux; j++) {
				c *= j;
			}
			soma += c;
			c = 1;
		}
		
		System.out.println(primos);
		System.out.println(soma);
		} else {
			System.out.printf("Não há números primos no intervalo de %d a %d.", a,b);
		}
		//System.out.print(primos.get(0));
		   //.get(0) pega o valor que tá na posição do número dentro do ponto;
	}
}