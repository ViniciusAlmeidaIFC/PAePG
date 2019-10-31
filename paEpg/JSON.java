package paEpg;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public class JSON implements Gravacao {

	private String nomeJson;
	
	public String getNomeJson() {
		return nomeJson;
	}

	public void setNomeJson(String nomeJson) {
		this.nomeJson = nomeJson;
	}

	public double[] ler() throws ParseException, FileNotFoundException{
		GsonBuilder builder = new GsonBuilder();
		Gson gson = builder.create();
		BufferedReader bufferedReader = new BufferedReader(new FileReader(nomeJson));

		    Type listType = new TypeToken<double[]>(){}.getType();

		    double[] lista;
		   
		    return lista = new Gson().fromJson(bufferedReader, listType);
	}
	
	public boolean gravar(double[] lista) throws IOException{
		GsonBuilder builder = new GsonBuilder();
	    Gson gson = builder.create();
	    FileWriter writer = new FileWriter(nomeJson);
	    writer.write(gson.toJson(lista));
	    writer.close();
	    return true;
	}
	
}
