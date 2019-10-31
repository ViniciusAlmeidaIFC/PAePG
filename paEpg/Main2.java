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
		
		System.out.println("Razão: "+p.retornaRazaoPG(array));
		System.out.println("Quantidade: "+p.retornaQtd(array));
		System.out.println("Somatória: "+p.somatoria(array));
		System.out.println("Média: "+p.media(array));
		System.out.println("Mediana: "+p.mediana(array));
		System.out.println(p.PAouPG(array));
		System.out.println("Arquivo Íntegro: "+p.verificaArq(array));
		
		g.setVetor(array);
		try {
			GeraHTML.gerarHtml(g.getVetor());
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
