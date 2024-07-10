package exerciciopratica;

import java.util.ArrayList;

public class Main {   
	public static void main(String args[]) {
		
	
		
		Comprador comp2 = new Comprador();
		comp2.setNomeComp("Pedro Henrique");
		
		
		Comprador comp1 = new Comprador();
		comp1.setNomeComp("Joao Santos");
		
		Livro livro1 = new Livro();
		livro1.setCodBarras((long) 222222873);
		livro1.setFabricante("Jesus Copy");
		livro1.setGenero("Cristão");
		livro1.setNome("O Custo do Discipulado");
		livro1.setNumPaginas((long)260);
		
		Filme filme1 = new Filme();
		filme1.setCodBarras((long)233423343);
		filme1.setDuracao("duas horas");
		filme1.setFabricante("Hollywood");
		filme1.setGenero("Terror");
		filme1.setNomeN("Aleatorio");
		
		comp1.setFilme(filme1);
		comp1.setLivro(livro1);
		
		Livro livro2 = new Livro();
		livro2.setCodBarras((long) 222222873);
		livro2.setFabricante("Editora Atos");
		livro2.setGenero("Cristão");
		livro2.setNome("A Cruz");
		livro2.setNumPaginas((long)260);
		
		Filme filme2 = new Filme();
		filme2.setCodBarras((long)233423343);
		filme2.setDuracao("duas horas");
		filme2.setFabricante("Netflix");
		filme2.setGenero("Acao");
		filme2.setNomeN("O Resgate");
		
		comp2.setFilme(filme2);
		comp2.setLivro(livro2);
		
		ArrayList<Comprador> comprador = new ArrayList<>();	
		comprador.add(comp1);
		comprador.add(comp2);
		for (Comprador comp : comprador) {
			System.out.println(comp.getNomeComp());
			System.out.println(comp.getFilme().getNomeN());
			System.out.println(comp.getFilme().getGenero());
			System.out.println(comp.getFilme().getDuracao());
			System.out.println(comp.getFilme().getFabricante());
			System.out.println(comp.getFilme().getCodBarras());
			System.out.println("");
			System.out.println(comp.getLivro().getNome());
			System.out.println(comp.getLivro().getGenero());
			System.out.println(comp.getLivro().getNumPaginas());
			System.out.println(comp.getLivro().getFabricante());
			System.out.println(comp.getLivro().getCodBarras());
			System.out.println("");
			
			
			
		}
		
		
}
}