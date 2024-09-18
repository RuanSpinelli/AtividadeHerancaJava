package br.com.tarefa.modelo;

public class Gato extends Animal{
	
	@Override
	public void emitirSom() {
		System.out.println("Miau Miau Miau");
	}
	
	
	public void arranharMovel() {
		System.out.println("O gatinho está arranhando os moveis");
	}
}
