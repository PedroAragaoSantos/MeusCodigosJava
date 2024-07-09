package PraticasJava;

import java.util.ArrayList;

public class Main {
	public static void main(String args[]) {

		Lampada lampada1 = new Lampada();
		lampada1.setCor("azul");
		lampada1.setMarca("philips");
		lampada1.setPreco("8,90");
		lampada1.setTipoDeLampada("fluorescente");
		lampada1.setVoltagem("220");
		Comprador comprador1 = new Comprador();
		comprador1.setNomeCompleto("Pedro Henrique");
		comprador1.setLampada(lampada1);
		
		
		Lampada lampada2 = new Lampada();
		lampada2.setCor("vermelha");
		lampada2.setMarca("taschibra");
		lampada2.setPreco("9,90");
		lampada2.setTipoDeLampada("fluorescente");
		lampada2.setVoltagem("220");
		Comprador comprador2 = new Comprador();
		comprador2.setNomeCompleto("Lucas Vicente");
		comprador2.setLampada(lampada2);
		
		
		Lampada lampada3 = new Lampada();
		lampada3.setCor("branca");
		lampada3.setMarca("elgin");
		lampada3.setPreco("7,90");
		lampada3.setTipoDeLampada("fluorescente");
		lampada3.setVoltagem("220");
		Comprador comprador3 = new Comprador();
		comprador3.setNomeCompleto("Marcos Antônio");
		comprador3.setLampada(lampada3);
		
		
		ArrayList<Comprador> comprador = new ArrayList<>();
		comprador.add(comprador1);
		comprador.add(comprador2);
		comprador.add(comprador3);
		
		for (Comprador compradores : comprador) {
        System.out.println(compradores.getNomeCompleto());
        System.out.println(compradores.getLampada().getCor());
        System.out.println(compradores.getLampada().getMarca());
        System.out.println(compradores.getLampada().getPreco());
        System.out.println(compradores.getLampada().getVoltagem());
        System.out.println(compradores.getLampada().getTipoDeLampada());
        System.out.println("");
		}

	}
}
