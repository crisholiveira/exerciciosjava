package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		
		String s = "Bom dia, X";
		s = s.replace("X", "Senhora");
		s = s.toUpperCase();
		s = s.concat("!!!");
		
		System.out.println(s);
		
		String x = "Cris".toUpperCase();
		System.out.println(x);
		
		String y = "Bom dia X".replace("X", "Max").toUpperCase().concat("!!!");
		System.out.println(y);
	}

}
