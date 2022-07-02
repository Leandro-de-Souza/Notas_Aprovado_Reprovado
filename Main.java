import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double nota1, nota2, notafinal;
		
		System.out.print("Digite a primeira nota: ");
		nota1 = sc.nextDouble();
		System.out.print("Digite a segunda nota: ");
		nota2 = sc.nextDouble();
		
		notafinal = nota1 + nota2;
		
		System.out.println("NOTA FINAL = " + String.format("%.1f", notafinal));
		
		if (notafinal < 60.0) {
			System.out.print("REPROVADO");
		}

		sc.close();
	}

}
