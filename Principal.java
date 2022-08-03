package desafio_financas;

public class Principal {
	
	public static void main(String[] args) {
		
//		55% para essencial
//		5% para educacao
//		10% para coisasInuteis
//		30% para degrauAcima
		
		Pessoa pessoa = new Pessoa("Letícia", 3000D);

		CriadorDeFinanca.CriaFinanca(pessoa);
	}

}
