package br.fundatec.lp1unica.app;

import br.fundatec.lp1unica.Carros;
import br.fundatec.lp1unica.Funcionario;
import br.fundatec.lp1unica.Motorista;

public class app2 {

	public static void main(String[] args) {

		Motorista dae = new Motorista("Daenerys", "123456789");
		Funcionario jorah = new Funcionario("Jorah");
		Carros uno = new Carros("Fiat Uno", dae);

		jorah.setDs_carros(uno);

		System.out.println(
				jorah.getDs_carros().getDs_dono().getDs_nome() + " levou seu " + jorah.getDs_carros().getDs_marca() + " para lavar, " + jorah.getDs_nome() + " ficou responsável por lavar seu carro");
	}

}
