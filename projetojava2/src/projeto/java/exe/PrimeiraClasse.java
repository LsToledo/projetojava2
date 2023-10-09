package projeto.java.exe;

import javax.swing.JOptionPane;

import projetojava2.classes.Aluno;
import projetojava2.classes.Diciplinas;

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
	 * 
	 */

	int cont = 0;

	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		int matricula = Integer.parseInt(JOptionPane.showInputDialog("Digite a matricula!"));
		String nome = JOptionPane.showInputDialog("Qual seu nome?");
		String sobrenome = JOptionPane.showInputDialog("Qual seu Sobrenome?");
		aluno.setNome(nome);
		aluno.setSobrenome(sobrenome);
		aluno.setId(matricula);
		for(int pos =1; pos<=4; pos++){
			
			String nomeDiciplina = JOptionPane.showInputDialog("Digite o nome da diciplina");
			String notaDiciplina = JOptionPane.showInputDialog("Digite a nota da diciplina:"+nomeDiciplina);
			Diciplinas diciplina = new Diciplinas();
			diciplina.setDiciplina(nomeDiciplina);
			diciplina.setNota(Double.parseDouble(notaDiciplina));
			aluno.getDiciplinas().add(diciplina);
		}
			int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover uma materia?");
			if(escolha==0) {
				String h1= (JOptionPane.showInputDialog(null, "Qual diciplina? 1, 2, 3, 4?"));
				aluno.getDiciplinas().remove(Integer.valueOf(h1).intValue());
			}
		

		System.out.println(aluno.toString());
		System.out.println("Media:"+aluno.getMediaNota());
		System.out.println(aluno.getResultado()?"Aprovado": "Reprovado");

	}

}
