package aula0303;

public class CadastroPessoa {

		String nome;
		Integer idade;
		String email;
		String login;
		String senha;
		
	
	
	CadastroPessoa(String nome, Integer idade, String email, String login, String senha ){
		this.nome = nome;
		this.idade = idade;
		this.email = email;
		this.login = login;
		this.senha = senha;
	}

	public static boolean ValidarCadastro(String nome, Integer idade, String email, String login, String senha  ) {
	int cont = 0;
		if (nome == null ) {
		 cont++;
		}
		if ( idade == null ) {
			 cont++;
		 }
		if (email == null ) {
			 cont++;
		 }
		if (login == null ) {
			 cont++;
		 }
		if (senha == null ) {
			 cont++;
		 }
		
	 if(cont>=1) {
		return false;
		}
	 return true;
	}
	
}
