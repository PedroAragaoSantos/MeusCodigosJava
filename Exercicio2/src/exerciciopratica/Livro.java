package exerciciopratica;

public class Livro extends Produto {
private String nome;
private Long numPaginas;

public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public Long getNumPaginas() {
	return numPaginas;
}
public void setNumPaginas(Long numPaginas) {
	this.numPaginas = numPaginas;

}
}
