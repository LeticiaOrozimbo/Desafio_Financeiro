package desafio_financas;

public enum TipoDeGasto {
	
	ESSENCIAL("Essencial "){
		@Override
		public Double getValorDoSalario(Double valorDoDesconto) {
			return valorDoDesconto * 0.55;
	}
	},
	
	DEGRAU_ACIMA("Degrau Acima "){
		@Override
		public Double getValorDoSalario(Double valorDoDesconto) {
		
		return valorDoDesconto * 0.30;	
	}
	},
	
	INUTILIDAES("Inutilidades "){
		@Override
		public Double getValorDoSalario(Double valorDoDesconto) {
			return valorDoDesconto * 0.10;
	}
	},
	
	EDUCACAO("Educação "){
		@Override
		public Double getValorDoSalario(Double valorDoDesconto) {
			return valorDoDesconto * 0.05;
	}
	};
	
	private String tipo;
	
	private TipoDeGasto(String tipo) {
		this.tipo = tipo;
	}
	public String getTipo() {
		return tipo;
	}



	public abstract Double getValorDoSalario(Double valorDoDesconto);

}


