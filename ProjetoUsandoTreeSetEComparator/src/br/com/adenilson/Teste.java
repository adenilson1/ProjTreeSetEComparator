package br.com.adenilson;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Teste {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario("Maria", 20);
		Funcionario f2 = new Funcionario("Joao", 25);
		Funcionario f3 = new Funcionario("Ana", 10);

		Set<Funcionario> funcionarios = new TreeSet<>(new ordenaPorIdade());
		funcionarios.add(f1);
		funcionarios.add(f2);
		funcionarios.add(f3);

		Iterator<Funcionario> iterador = funcionarios.iterator();

		while (iterador.hasNext()) {
			System.out.println(iterador.next().getNome());
		}

	}

}
