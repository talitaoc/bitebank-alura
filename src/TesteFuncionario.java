
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario nico = new Funcionario();
		nico.setNome("Nico");
		nico.setCpf("22222222222");
		nico.setSalario(2600.0);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonicacao());
		
		Funcionario funcionario1 = new Funcionario();
		
		funcionario1.setSalario(3000.0);
		//System.out.println(funcionario1.getTipo());
		System.out.println(funcionario1.getBonicacao());
		
		
		Funcionario funcionario2 = new Funcionario();
		//funcionario2.setTipo(1);
		funcionario2.setSalario(5000.0);
		//System.out.println(funcionario2.getTipo());
		System.out.println(funcionario2.getBonicacao());

	}

}
