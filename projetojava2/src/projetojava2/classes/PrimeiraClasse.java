package projetojava2.classes;

public class PrimeiraClasse {
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno();
		aluno1.nome= "Esther";
		aluno1.sobrenome= "Oliveira";
		aluno1.setNota1(20);
		aluno1.setNota2(20);
		aluno1.setNota3(30);
		aluno1.setNota4(60);
		
		
		Aluno aluno2 = new Aluno();
		aluno2.nome= "Esther";
		aluno2.sobrenome= "Toledo";
		aluno2.setNota1(50);
		aluno2.setNota2(20);
		aluno2.setNota3(30);
		aluno2.setNota4(60);
		
		System.out.println("\n\nA Nome do aluno\n\n"+ aluno1.getNome());
		System.out.println("\n\nA media da Nota é\n\n"+ aluno1.getMediaNota());
		
		System.out.println("\n\nA Nome do aluno\n\n"+ aluno2.getNome());
		System.out.println("\n\nA media da Nota é\n\n"+ aluno2.getMediaNota());
		
	}
}
