package br.com.java.pojo;

public class EstudantePojoPrincipal {
	
	public static void main(String[] args) {
		EstudantePojo estudantePojo = new EstudantePojo();
		estudantePojo.setId(10);
		estudantePojo.setNome("Java");

		int id = estudantePojo.getId();

		System.out.println("Id = : " + id);
		System.out.println("Nome = : " + estudantePojo.getNome());
	}
}
