package desafio_financas;

public class Pessoa {

	private String nome;
	private Double salario;
	
	public Pessoa(String nome, Double salario) {
		this.nome = nome;
		this.salario = salario;
	}
	
	public String getNome() {
		return nome;
	}
	public Double getSalario() {
		return salario;
	}
	
	public Double valorIdealPara(TipoDeGasto tipoDeGasto) {
		return tipoDeGasto.getValorDoSalario(salario);
	}
	
}
