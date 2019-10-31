package paEpg;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.List;

public interface Gravacao {
	
	public boolean gravar(double[] list) throws IOException;
	public double[] ler() throws ParseException, FileNotFoundException;

}
