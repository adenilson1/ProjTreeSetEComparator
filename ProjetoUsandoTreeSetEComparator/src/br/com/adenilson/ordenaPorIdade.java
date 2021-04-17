package br.com.adenilson;
import java.util.Comparator;

public class ordenaPorIdade implements Comparator<Funcionario> {

	@Override
	public int compare(Funcionario funcionario, Funcionario outrofuncionario) {
		return funcionario.getIdade() - outrofuncionario.getIdade();
	}

}
