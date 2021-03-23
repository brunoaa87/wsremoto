package variaveis;

public class TipoString {

	public static void main(String[] args) {
		
		String email = "tesTe@teste.cOm.bR";
		System.out.println("Original: " + email);
		System.out.println("Minuscula: " + email.toLowerCase());
		System.out.println("Maiuscula: " + email.toUpperCase());
		System.out.println("Qtde Caracteres: " + email.length());
		System.out.println("É igual: " + email.equals("teste@teste.com.br"));
		System.out.println("É igual 2: " + email.equalsIgnoreCase("teste@teste.com.br"));
		System.out.println("Tem arroba? " + email.contains("@"));
		System.out.println("Posição do @? " + email.indexOf("@"));
		System.out.println("Do 3° até o 5°: " + email.substring(2,5));
		
		//if (email.indexOf("@")>-1){
		if (email.contains("@")==true) {
			System.out.println("Usuário: " + email.substring(0,email.indexOf("@")));
			
		}
		
		System.out.println("Até logo!!!");


		
		
		
		
		
		
		
		
		
		
	}
}
