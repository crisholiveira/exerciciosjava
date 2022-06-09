package controle;

public class SwichSemBreak {
	public static void main(String[] args) {
		
		String faixa = "roxa";
		
		switch (faixa.toLowerCase()){
		case "preta":
			System.out.println("Sei o Bassai ...");
		case "marrom":
			System.out.println("Sei o Shodan");
		case "roxa":
			System.out.println("Sei Godan");
		default:
			System.out.println("Não sei nada");			
		}
	}

}
