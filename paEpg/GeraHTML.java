package paEpg;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class GeraHTML {

public static void gerarHtml(double[] vetor) throws IOException {
		
		String htmlGera = "<html>\r\n" + 
				"<head>\r\n" + 
				"  <script type=\"text/javascript\" src=\"https://www.gstatic.com/charts/loader.js\"></script>\r\n" + 
				"    <script type=\"text/javascript\">\r\n" + 
				"      google.charts.load('current', {'packages':['line']});\r\n" + 
				"      google.charts.setOnLoadCallback(drawChart);\r\n" + 
				"\r\n" + 
				"    function drawChart() {\r\n" + 
				"\r\n" + 
				"      var data = new google.visualization.DataTable();\r\n" + 
				"      data.addColumn('number', 'Crescimento');\r\n" + 
				"      data.addColumn('number', 'Valor');\r\n" + 

				"\r\n" + 
				"      data.addRows([\r\n" + 	dadosGrafico(vetor) +		"      ]);\r\n" + 
				"\r\n" + 
				"      var options = {\r\n" + 
				"        chart: {\r\n" + 
				"          title: 'PA e PG',\r\n" + 
				"          subtitle: 'Feito por: Julio César e Vinicius Goulart Almeida'\r\n" + 
				"        },\r\n" + 
				"        width: 900,\r\n" + 
				"        height: 500\r\n" + 
				"      };\r\n" + 
				"\r\n" + 
				"      var chart = new google.charts.Line(document.getElementById('linechart_material'));\r\n" + 
				"\r\n" + 
				"      chart.draw(data, google.charts.Line.convertOptions(options));\r\n" + 
				"    }\r\n" + 
				"  </script>\r\n" + 
				"</head>\r\n" + 
				"<body>\r\n" + 
				"  <div id=\"linechart_material\"></div>\r\n" + 
				"</body>\r\n" + 
				"</html>\r\n" + 
				"\r\n" + 
				"";
		
		
		FileWriter arq = new FileWriter("C:\\Users\\Vinicius.Almeida\\Desktop\\grafico.html");
	    PrintWriter gravarArq = new PrintWriter(arq);
	 
	    gravarArq.printf(htmlGera);
	    arq.close();
	}
	private static String dadosGrafico(double[] vetor) {
		String dados = "";
		for (int i = 0; i < vetor.length; i++) {
			dados += "[" + String.valueOf(i+1) + ", " + String.valueOf(vetor[i]) +"],\r\n";
		}
		return dados;
	}
	
}
