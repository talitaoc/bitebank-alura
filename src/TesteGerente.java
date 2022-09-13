
public class TesteGerente {

	public static void main(String[] args) {

		Gerente gerente = new Gerente();
		gerente.setNome("Marco");
		gerente.setCpf("12345678912");
		gerente.setSalario(5000.0);
		
		System.out.println(gerente.getNome());
		System.out.println(gerente.getCpf());
		System.out.println(gerente.getSalario());
		
		gerente.setSenha(2222);
		boolean autenticou = gerente.autenticacao(2222);
		
		System.out.println(autenticou);
		
		System.out.println(gerente.getBonicacao());
	}

}
