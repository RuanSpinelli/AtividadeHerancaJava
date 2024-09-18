package br.com.tarefa.modelo;

public class Cachorro extends Animal {
	
	@Override
	public void emitirSom(){
		System.out.println("Au Au Au");
	}
	
	
	public void abanarRabo() {
		System.out.println("Doguinho está abanando o rabinho que fofinho cuti cuti");
	}
}
