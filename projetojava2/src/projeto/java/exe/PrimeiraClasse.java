package projeto.java.exe;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import projetojava2.classes.Aluno;
import projetojava2.classes.Diciplinas;

public class PrimeiraClasse {

	int cont = 0;

	public static void main(String[] args) {
		int op = 0;
		List<Aluno> alunos = new ArrayList<Aluno>();
		while (op == 0) {
				Aluno aluno = new Aluno();
				int matricula = Integer.parseInt(JOptionPane.showInputDialog("Digite a matricula!"));
				String nome = JOptionPane.showInputDialog("Qual seu nome?");
				String sobrenome = JOptionPane.showInputDialog("Qual seu Sobrenome?");
				aluno.setNome(nome);
				aluno.setSobrenome(sobrenome);
				aluno.setId(matricula);
				alunos.add(aluno);

			for (int pos = 0; pos <= 2; pos++) {

				String nomeDiciplina = JOptionPane.showInputDialog("Digite o nome da diciplina");
				String notaDiciplina = JOptionPane.showInputDialog("Digite a nota da diciplina:" + nomeDiciplina);
				Diciplinas diciplina = new Diciplinas();
				diciplina.setDiciplina(nomeDiciplina);
				diciplina.setNota(Double.parseDouble(notaDiciplina));
				aluno.getDiciplinas().add(diciplina);
			}

			int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover uma materia?");

			if (escolha == 0) {
				String h1 = (JOptionPane.showInputDialog(null, "Qual diciplina? 1, 2, 3, 4?"));
				aluno.getDiciplinas().remove(Integer.valueOf(h1).intValue());
			} else {
				int res = JOptionPane.showConfirmDialog(null, "Deseja subistituir ou remover um aluno?");
				String nometroc = JOptionPane.showInputDialog("Qual o nome do aluno que deseja subistituir?");
				if(res  ==1  ) {
				for (int c=0; c<alunos.size(); c++) {
					if(aluno.getNome().equals(nometroc)) {
					alunos.remove(c);
					alunos.get(c).setNome(nometroc);
					}
					
				}
					
					
				}
			}
			
			op = JOptionPane.showConfirmDialog(null, "Deseja Continuar add alunos?");
		}
		for( int i=0; i<alunos.size();i++) {
		System.out.println("Posiçao na lista : "+ alunos.get(i));
		System.out.println(alunos.get(i).getNome());
		System.out.println(alunos.get(i).getSobrenome());
		System.out.println("Media:" + alunos.get(i).getMediaNota());
		System.out.println(alunos.get(i).getResultado() ? "Aprovado" : "Reprovado");
		System.out.println("============================================");
		for (int ini = 0; ini < alunos.get(i).getDiciplinas().size(); ini++) {
			System.out.println("Diciplina: " + alunos.get(i).getDiciplinas().get(ini).getDiciplina());
			System.out.println("Nota: " + alunos.get(i).getDiciplinas().get(ini).getNota());
			System.out.println("============================================");
		}
		}
	}
}
