package projeto.java.exe;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.constantes.statusAluno;
import projetojava2.classes.Aluno;
import projetojava2.classes.Diciplinas;

public class PrimeiraClasse {

	int cont = 0;

	public static void main(String[] args) {

		int op = 0;
		List<Aluno> alunos = new ArrayList<Aluno>();
		List<Aluno> alunosAprovados = new ArrayList<Aluno>();
		List<Aluno> alunosReprovados = new ArrayList<Aluno>();
		List<Aluno> alunosRecuperaçao = new ArrayList<Aluno>();

		while (op == 0) {

			int op1 = JOptionPane.showConfirmDialog(null,
					"##############   MENU    #############" + "1: ADD aluno..." + "2: Listar Alunos..."
							+ "3: Excluir aluno..." + "4: Listar por Status..."
							+ "5: Listar aluno especifico e Status detalhado.");

			switch (op1) {
			case 1: {
				Aluno aluno = new Aluno();

				int matricula = Integer.parseInt(JOptionPane.showInputDialog("Digite a matricula!"));
				String nome = JOptionPane.showInputDialog("Qual seu nome?");
				String sobrenome = JOptionPane.showInputDialog("Qual seu Sobrenome?");

				aluno.setNome(nome);
				aluno.setSobrenome(sobrenome);
				aluno.setId(matricula);
				alunos.add(aluno);
				break;
			}
			case 2: {
				for (int i = 0; i < alunos.size(); i++) {
					System.out.println("Posiçao na lista : " + alunos.get(i));
					System.out.println(alunos.get(i).getNome());
					System.out.println(alunos.get(i).getSobrenome());
					System.out.println("Media:" + alunos.get(i).getMediaNota());
					System.out.println(alunos.get(i).getResultado());
					System.out.println("============================================");
					for (int ini = 0; ini < alunos.get(i).getDiciplinas().size(); ini++) {
						System.out.println("Diciplina: " + alunos.get(i).getDiciplinas().get(ini).getDiciplina());
						System.out.println("Nota: " + alunos.get(i).getDiciplinas().get(ini).getNota());
						System.out.println("============================================");
					}
				}
				break;
			}
			case 3: {
				String nometroc = JOptionPane.showInputDialog("Qual o nome do aluno que deseja subistituir?");
				for (Aluno aluno3 : alunos) {
					if (aluno3.getNome().equals(nometroc)) {
						alunos.remove(aluno3);
					}
				}
				break;
			}
			case 4: {
				for (Aluno aluno : alunos) {
					if (statusAluno.APROVADO.equals(aluno.getResultado())) {
						System.out.println("############   LISTA DE ALUNOS APROVADOS  ##########");
						System.out.println(aluno.getNome());
						System.out.println(aluno.getSobrenome());
						System.out.println("Media:" + aluno.getMediaNota());
						System.out.println(aluno.getResultado());
						System.out.println("============================================");
						for (int ini = 0; ini < aluno.getDiciplinas().size(); ini++) {
							System.out.println("Diciplina: " + aluno.getDiciplinas().get(ini).getDiciplina());
							System.out.println("Nota: " + aluno.getDiciplinas().get(ini).getNota());
							System.out.println("============================================");
						}
					}else(statusAluno.RECUPERAÇAO.equals(aluno.getResultado())) {
						System.out.println("############   LISTA DE ALUNOS RECUPERAÇAO  ##########");
						System.out.println(aluno.getNome());
						System.out.println(aluno.getSobrenome());
						System.out.println("Media:" + aluno.getMediaNota());
						System.out.println(aluno.getResultado());
						System.out.println("============================================");
						for (int ini = 0; ini < aluno.getDiciplinas().size(); ini++) {
							System.out.println("Diciplina: " + aluno.getDiciplinas().get(ini).getDiciplina());
							System.out.println("Nota: " + aluno.getDiciplinas().get(ini).getNota());
							System.out.println("============================================");

						}
					}if {
						System.out.println("############   LISTA DE ALUNOS REPROVADOS  ##########");
						System.out.println(aluno.getNome());
						System.out.println(aluno.getSobrenome());
						System.out.println("Media:" + aluno.getMediaNota());
						System.out.println(aluno.getResultado());
						System.out.println("============================================");
						for (int ini = 0; ini < aluno.getDiciplinas().size(); ini++) {
							System.out.println("Diciplina: " + aluno.getDiciplinas().get(ini).getDiciplina());
							System.out.println("Nota: " + aluno.getDiciplinas().get(ini).getNota());
							System.out.println("============================================");
						
					}
					break;
				}
			}
			case 5: {
				int cont = 0;
				System.out.println("----- MOSTRANDO ESPECIFICAMENTE.......");
				for (Aluno aluno : alunos) {
					cont++;
					System.out.println("##############");
					System.out.println(aluno.getNome() + "Pos: " + cont);
					System.out.println(aluno.getResultado());

				}
				cont = Integer.parseInt(JOptionPane.showInputDialog("Digite o aluno quer quer detalhar!"));
				System.out.println(alunos.get(cont).getNome());
				for (Diciplinas diciplina : alunos.get(cont).getDiciplinas()) {

					System.out.println(diciplina.getDiciplina());
					System.out.println(diciplina.getNota());
				}
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + op1);
			}

		}
		for (Aluno aluno2 : alunos) {

			if (aluno2.getResultado().equals(statusAluno.APROVADO)) {
				alunosAprovados.add(aluno2);
			} else {
				if (aluno2.getResultado().equals(statusAluno.RECUPERAÇAO)) {
					alunosRecuperaçao.add(aluno2);
				} else {
					alunosReprovados.add(aluno2);
				}
			}
		}
	}
}
