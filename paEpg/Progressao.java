package paEpg;

public class Progressao {

	private double a1;
	private double razao;
	private int quantidade;
	private TipoProgressao tp;
	
	public double getA1() {
		return a1;
	}
	public void setA1(double a1) {
		this.a1 = a1;
	}
	public double getRazao() {
		return razao;
	}
	public void setRazao(double razao) {
		this.razao = razao;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public TipoProgressao getTp() {
		return tp;
	}
	public void setTp(TipoProgressao tp) {
		this.tp = tp;
	}
	
	public double[] PA() {
		int cont = 1;
		double [] num = new double[quantidade];
		for (int i = 0; i < quantidade; i++) {
			if (cont == 1) {
				num[i] = a1;
			}
			else
			{
				num[i] = a1 + ((cont-1)*razao);
			}
			cont++;
		}
		return num;
	}
	
	public double[] PG() {
		int cont = 1;
		double [] num = new double[quantidade];
		for (int i = 0; i < quantidade; i++) {
			if (cont == 1) {
				num[i] = a1;
			}
			else
			{
				num[i] = a1 *  Math.pow(razao,cont-1);
			}
			cont++;
		}
		return num;
	}
	
	public double retornaA1(double[] array) {
		return array[0];
	}
	
	public double retornaRazaoPA(double[] array) {
		double num = array[1] - array[0];
		return num;
	}
	
	public double retornaRazaoPG(double[] array) {
		double num = array[1]/array[0];
		return num;
	}
	
	public int retornaQtd (double[] array) {
		int qtd = array.length;
		
		return qtd;
	}
	
	public double somatoria(double[]array) {
		double soma = 0;
		for (int i = 0; i < array.length;i++) {
		soma = soma + array[i];
	}
		return soma;
}
	public double media(double[] array) {
		double media = 0;
		media = somatoria(array)/retornaQtd(array);
		return media;
	}
	
	public double mediana(double[] array) {
		double mediana = 0;
		if (array.length / 2 == 0) {
		int esq=0;
		int dir=array.length-1;
		int meio;
		meio=(esq+dir)/2;
		mediana = array[meio];
		}
		else {
			int p1, p2;
			p1 = (array.length / 2)-1;
			p2=p1+1;
			mediana = (array[p1] + array[p2])/2;
		}
		
		return mediana;
	}
	
	public String PAouPG(double[] array) {
		if (array[1] == array[2] - retornaRazaoPA(array)) {
			return "PA";
		}
		else if (array[1] == array[2]/ Math.pow(retornaRazaoPG(array),1)){
			return "PG";
		}
		else {
			return "Arquivo Inválido";
		}
	}
	
	public boolean verificaArq(double[] array) {
		String resultado = "";
		resultado = PAouPG(array);
		if (resultado.equals("Arquivo Inválido")) {
			return false;
		}
		else
			return true;
	}
	
}
