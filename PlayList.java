package ar.edu.uno.final2019;
import java.util.*;
import java.io.*;

public class PlayList{

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		PlayList lista= new PlayList();
		Cancion c1 = new Cancion("Si Me Gano Un Grammy","Jon Z","Loco, Humilde y Real",157);
		Cancion c2 = new Cancion("No Puedo","Paulo Londra","Homerun",177);
		Cancion c3 = new Cancion("Party","Paulo Londra","Homerun",224);
		Cancion c4 = new Cancion("China","Anuel AA, Daddy Yankee, Karol G, Ozuna & J Balvin","China",301);
		lista.agregarC(c1);
		lista.agregarC(c2);
		lista.agregarC(c3);
		lista.agregarC(c4);
		lista.borrarC("China");
		lista.archivar();
	}

	private LinkedList<Cancion> canciones;
	
	public PlayList(LinkedList<Cancion> canciones) {
		this.setCanciones(canciones);
	}
	
	public PlayList() {
		this(new LinkedList<Cancion>());
	}
	
	public void agregarC(Cancion a) {
		this.getCanciones().add(a);
	}
	
	public void borrarC(String a) {
		try{
			for(Cancion c:this.getCanciones()) {
				if (c.getTitulo()==a) {
					this.getCanciones().remove();
					return;
				}			
			}
			throw new Exception();
		}
		catch(Exception miException){
			System.out.println("Cancion no encontrada");
		}
		finally{
			System.out.println("La busqueda finalizo");
		}				
	}
		
	public int cantidad() {
		return this.getCanciones().size();
	}
	
	public Integer duracionTotal() {
		Integer x=0;
		for(Cancion c : this.getCanciones()) {
			x=c.getDuracion()+x;
		}
		return x;
	}
	
	public void archivar() throws IOException{
		String miPath=("C:\\Users\\Administrador\\Desktop\\");
		BufferedWriter a= new BufferedWriter(new FileWriter(miPath+"miLista.txt"));
		for(Cancion c:this.getCanciones()) {
			a.write("Interprete:"+ c.getInterprete()+" Titulo:"+ c.getTitulo()+" Album:"+ c.getAlbum()+" Duración:"+ c.getDuracion());
			a.newLine();
		}
		a.close();
	}
	
	public LinkedList <Cancion> getCanciones() {
		return canciones;
	}
	
	public void setCanciones(LinkedList <Cancion> canciones) {
		this.canciones=canciones;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PlayList other = (PlayList) obj;
		if (canciones == null) {
			if (other.canciones != null)
				return false;
		} else if (!canciones.equals(other.canciones))
			return false;
		return true;
	}
	
	
}
