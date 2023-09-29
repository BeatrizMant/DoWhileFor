import java.util.Scanner;
public class Idade1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i=0, id;
		String resp;
		
		do {
			System.out.println("Entre com a idade:");
			id = in.nextInt();
			
			if (id < 0) {
				System.out.println("Idade inválida");
			}else if (id < 18){
				System.out.println("Menor de idade");
			}else {
				System.out.println("Maior de idade");
			}
			
			System.out.println("Deseja continuar? (S para SIM ou N para NãO)");
			resp = in.next();
			i++;
				
		} while (resp.equalsIgnoreCase("S"));
		
		in.close();
	}
}
