package streams;

public class MediaTeste {
	
	public static void main(String[] args) {
		
		Media m1 = new Media();
		Media m2 = new Media();
		m1.adicionar(8.3);
		m2.adicionar(6.7);
		
		System.out.println(m1.getValor());
		
		System.out.println(Media.combinar(m1, m2).getValor());
		
		
		
		
		
	}

}
