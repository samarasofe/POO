package empresa;

public class Principal {
	
	public static void main(String[] args) {
		Aluno t = new Aluno();
		t.matricula = 1001;
		t.nome = "Super girafa";
		t.cpf = "000111222333";
		
		Aluno e = new Aluno();
		e.matricula = 1001;
		e.nome = "Groot";
		e.cpf = "555666777888";
		
		t.info();

		t.nome = "Pantera Negra";
		
		t.info();
		e.info();
	}

}
