package projeto.java.exe;

import java.util.ArrayList;
import java.util.List;

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

		int per = Integer.parseInt(JOptionPane.showInputDialog("Quantos alunos deseja cadastrar?"));

		List<Aluno> alunos = new ArrayList<Aluno>();
		for (int ini = 1; ini <= per; ini++) {
			Aluno aluno = new Aluno();
			int matricula = Integer.parseInt(JOptionPane.showInputDialog("Digite a matricula!"));
			String nome = JOptionPane.showInputDialog("Qual seu nome?");
			String sobrenome = JOptionPane.showInputDialog("Qual seu Sobrenome?");
			aluno.setNome(nome);
			aluno.setSobrenome(sobrenome);
			aluno.setId(matricula);
			alunos.add(aluno);
			for (int pos = 0; pos < 2; pos++) {

				String nomeDiciplina = JOptionPane.showInputDialog("Digite o nome da diciplina");
				String notaDiciplina = JOptionPane.showInputDialog("Digite a nota da diciplina:" + nomeDiciplina);
				Diciplinas diciplina = new Diciplinas();
				diciplina.setDiciplina(nomeDiciplina);
				diciplina.setNota(Double.parseDouble(notaDiciplina));
				aluno.getDiciplinas().add(diciplina);

			}
			int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover uma materia?");
			if (escolha == 0) {
				int remover = 0;
				while (remover == 0) {
					int h1 = Integer
							.parseInt(JOptionPane.showInputDialog("QUal diciplina quer remover? 1, 2, 3, 4..."));
					aluno.getDiciplinas().remove(Integer.valueOf(h1).intValue());
					int escolha1 = JOptionPane.showConfirmDialog(null, "Deseja remover mais??");
					remover = escolha1;
				}
			}
			alunos.add(aluno);

			System.out.println("####################################################");
			for (int nu = 0; nu < alunos.size(); nu++) {

				System.out.println(alunos.get(nu).getNome());
				System.out.println("Media:" + alunos.get(nu).getMediaNota());
				System.out.println(alunos.get(nu).getResultado());
				System.out.println("----------------------------------------------------");

				for (int nu1 = 0; nu1 < aluno.getDiciplinas().size(); nu1++) {
					Diciplinas dic = aluno.getDiciplinas().get(nu1);
					System.out.println(
							"Nome da diciplina: " + dic.getNomeDiciplina() + " Nota da diciplina: " + dic.getNota());
				}
			}
		}
	}
}
