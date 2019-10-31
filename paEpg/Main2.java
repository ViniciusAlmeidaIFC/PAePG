package paEpg;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class Main2 {

	public static void main(String[] args) throws FileNotFoundException, ParseException {
		GeraGrafico g = new GeraGrafico();
		
		
		
		Progressao p = new Progressao();
		JSON json = new JSON();
		Persistencia pers = new Persistencia(json);
		
		double[] array = new double[10];
		
		String nomeArq = "rodrigo.json";
		json.setNomeJson(nomeArq);
		array = json.ler();
		for (int i = 0; i < array.length;i++) {
			System.out.println(array[i]);
		}
		
		System.out.println("Raz�o: "+p.retornaRazaoPG(array));
		System.out.println("Quantidade: "+p.retornaQtd(array));
		System.out.println("Somat�ria: "+p.somatoria(array));
		System.out.println("M�dia: "+p.media(array));
		System.out.println("Mediana: "+p.mediana(array));
		System.out.println(p.PAouPG(array));
		System.out.println("Arquivo �ntegro: "+p.verificaArq(array));
		
		g.setVetor(array);
		try {
			GeraHTML.gerarHtml(g.getVetor());
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
