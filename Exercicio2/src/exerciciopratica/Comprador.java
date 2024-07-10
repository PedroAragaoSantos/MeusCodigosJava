package exerciciopratica;

public class Comprador {
private String nomeComp;
private Livro livro;
private Filme filme;
public Livro getLivro() {
	return livro;
}

public void setLivro(Livro livro) {
	this.livro = livro;
}

public Filme getFilme() {
	return filme;
}

public void setFilme(Filme filme) {
	this.filme = filme;
}

public String getNomeComp() {
	return nomeComp;
}

public void setNomeComp(String nomeComp) {
	this.nomeComp = nomeComp;
}
}
