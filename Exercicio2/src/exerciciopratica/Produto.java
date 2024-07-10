package exerciciopratica;

public class Produto {
 private String fabricante;
 private Long codBarras;
 private String genero;
public String getGenero() {
	return genero;
}
public void setGenero(String genero) {
	this.genero = genero;
}
public String getFabricante() {
	return fabricante;
}
public void setFabricante(String fabricante) {
	this.fabricante = fabricante;
}
public Long getCodBarras() {
	return codBarras;
}
public void setCodBarras(Long codBarras) {
	this.codBarras = codBarras;
}
}