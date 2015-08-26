package br.com.treinar.estudo.atividade.roger;

public class Coordenardor {

	public void confirmarMatricula(){
		
		Professor a = new Professor();
		
			try {
				a.alunoConfirmar();
			} catch (ErroDados e) {
				System.out.println("Recadastrar o aluno");
				e.printStackTrace();
			}
		
			
			
			
	
	}	
}
