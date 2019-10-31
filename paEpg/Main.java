package paEpg;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Progressao p = new Progressao();
		JSON json = new JSON();
		Persistencia pers = new Persistencia(json);
		
		
		p.setA1(1);
		p.setQuantidade(5);
		p.setRazao(5);
		p.setTp(TipoProgressao.PG);
		json.setNomeJson("rodrigo.json");
		
		final int TAM = p.getQuantidade();
		double[] array = new double[TAM];
		//array = p.PA();
		array = p.PG();
		for (int i = 0; i < array.length;i++) {
			System.out.println(array[i]);
		}
		
		
		json.gravar(array);
}
}
