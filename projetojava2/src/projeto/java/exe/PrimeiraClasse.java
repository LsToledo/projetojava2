package projeto.java.exe;

import javax.swing.JOptionPane;

import projetojava2.classes.Aluno;

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
	
	int cont=0;
	public static void main(String[] args) {
		
			
			
			
			Aluno cont = new Aluno();	
			
			String nome= JOptionPane.showInputDialog("Qual seu nome?");
			String sobrenome= JOptionPane.showInputDialog("Qual seu Sobrenome?");
			String nota1= JOptionPane.showInputDialog("Qual Sua Nota1?");
			String nota2= JOptionPane.showInputDialog("Qual Sua Nota2?");
			String nota3= JOptionPane.showInputDialog("Qual Sua Nota3?");
			String nota4= JOptionPane.showInputDialog("Digite Sua Nota4?");
			cont.setNome(nome);
			cont.setSobrenome(sobrenome);
			cont.setNota1(Double.parseDouble(nota1));
			cont.setNota2(Double.parseDouble(nota2));
			cont.setNota3(Double.parseDouble(nota3));
			cont.setNota4(Double.parseDouble(nota4));
			
		
			cont.toString();
			System.out.println("\n\nA media da Nota é\n\n"+ cont.getMediaNota());
			System.out.println("Resultado é:"+(cont.getResultado()?"Aprovado":"Reprovado"));
			
		
			}
		
		
		
	}
	