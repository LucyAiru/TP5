import java.io.Serializable;
import java.util.ArrayList;

public class ObjetoASerializar implements Serializable{
	private static final long serialVersionUID = 3824034953682065806L;
	public String Nombre = "DAO";
	public String Tp = "TP5";
	public ArrayList<Integer> ListaDeNumeros = new ArrayList<Integer>();
	public ArrayList<String> ListaDeTextos = new ArrayList<String>();	
}
