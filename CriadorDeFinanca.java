package desafio_financas;

import java.util.List;

public class CriadorDeFinanca {

	public static void CriaFinanca(Pessoa pessoa) {
		
		System.out.println("Nome: " + pessoa.getNome());

		List<TipoDeGasto> listaDeTipoDeGastos = List.of(TipoDeGasto.values());
		
		for(TipoDeGasto tipoDeGasto : listaDeTipoDeGastos) {
			System.out.println("Tipo de gasto: " + tipoDeGasto.getTipo() + " R$ " + pessoa.valorIdealPara(tipoDeGasto));
		}
	}

}
