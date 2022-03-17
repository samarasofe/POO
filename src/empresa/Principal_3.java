package empresa;

public class Principal_3 {
	
	public static void main(String[] args) {
		
		Turma nova = new Turma();
		
		nova.prof = new Professor();
		nova.prof.nome="Leonardo";
			
		System.out.println(Carro.milhasParaMetros(10));
	}

}
