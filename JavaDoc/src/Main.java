import java.io.*;

public class Main {

	public static void main(String[] args) {
				
		ObjetoASerializar objetoASerializar = new ObjetoASerializar();
		//Inicializo ListaDeNumero
		objetoASerializar.ListaDeNumeros.add(7);
		objetoASerializar.ListaDeNumeros.add(5);
		objetoASerializar.ListaDeNumeros.add(8);
		objetoASerializar.ListaDeNumeros.add(2);
		objetoASerializar.ListaDeNumeros.add(3);
		objetoASerializar.ListaDeNumeros.add(1);
		objetoASerializar.ListaDeNumeros.add(4);
		objetoASerializar.ListaDeNumeros.add(6);
		objetoASerializar.ListaDeNumeros.add(9);
		//Inicializo ListaDeTextos
		objetoASerializar.ListaDeTextos.add("aaa");
		objetoASerializar.ListaDeTextos.add("aab");
		objetoASerializar.ListaDeTextos.add("aba");
		objetoASerializar.ListaDeTextos.add("abb");
		objetoASerializar.ListaDeTextos.add("bbb");
		objetoASerializar.ListaDeTextos.add("aaaa");
		objetoASerializar.ListaDeTextos.add("Aab");
		objetoASerializar.ListaDeTextos.add("aAa");
		objetoASerializar.ListaDeTextos.add("ZZZ");
		
		//Ordeno
		ArrayHelpers.OrdenarAscendente(null);
		
		//Persisto
		try {
			FileOutputStream streamOut = new FileOutputStream("MyObject.ser");
			ObjectOutputStream objectoutputStream = new ObjectOutputStream(streamOut);
			objectoutputStream.writeObject(objetoASerializar);
			objectoutputStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Recupero
		try {
		    FileInputStream streamIn = new FileInputStream("MyObject.ser");
		    ObjectInputStream objectinputstream = new ObjectInputStream(streamIn);
		    ObjetoASerializar objetoDesserializado = (ObjetoASerializar) objectinputstream.readObject();
		    objectinputstream.close();
		    System.out.println(objetoDesserializado.Nombre);
		} catch (Exception e) {
		    e.printStackTrace();
		}
	}

}
