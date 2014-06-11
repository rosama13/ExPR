import javax.swing.JComboBox;


public class Coche {
	
	private int id;
	private String matricula;
	private int hentrada;
	private int hsalida;
	private String precio;
	private String observaciones;
	private int veintitres;
	
	public Coche() {
		
		id=0;
		matricula="";
		hentrada=0;
		hsalida=0;
		precio="";
		observaciones="";
	
	}
public Coche(JComboBox<?> listadoCoches) {
		// TODO Auto-generated constructor stub
	}
//Metodos set	
public void setId(int i){id=i;}
public void setMatricula(String m){matricula=m;}
public void setHentrada(int he){hentrada=he;}
public void setHsalida(int hs){hsalida=hs;}
public void setPrecio(String p){precio=p;}
public void setObsevacion(String o){observaciones=o;}
//Metodos get
public int getId(){return id;}
public String getMatricula(){return matricula;}
public int getHentrada(){return hentrada;}
public int getHsalida(){return hsalida;}
public String getPrecio(){return precio;}
private String getObservacion(){return observaciones;}
//Metodo toString para el JComboBox
public String toString(){return matricula;}


}

