package ar.edu.uno.final2019;

public class Cancion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

	private String titulo;
	private String interprete;
	private String album;
	private Integer duracion;
	
	public Cancion(String titulo,String interprete,String Album,Integer duracion){
		this.setTitulo(titulo);
		this.setInterprete(interprete);
		this.setAlbum(Album);
		this.setDuracion(duracion);
	}
	
	public Cancion() {
		this(null,null,null,0);
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo=titulo;
	}
	
	public String getInterprete() {
		return interprete;
	}
	
	public void setInterprete(String interprete) {
		this.interprete=interprete;
	}
	
	public String getAlbum() {
		return album;
	}
	
	public void setAlbum(String album) {
		this.album=album;
	}
	
	public Integer getDuracion() {
		return duracion;
	}
	
	public void setDuracion(Integer duracion) {
		this.duracion=duracion;
	}
}
