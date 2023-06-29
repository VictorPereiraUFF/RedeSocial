package postagem;

import java.time.LocalDateTime;

public class Comentario {
	
	private LocalDateTime data;
	private boolean fixado;
	private int tamanho;
	private String texto;
	
	public Comentario(LocalDateTime data, boolean fixado, int tamanho, String texto) {
		this.data = LocalDateTime.now();
		this.fixado = false;
		this.tamanho = texto.length();
		this.texto = texto;
	}

	public LocalDateTime getData() {
		return data;
	}

	public boolean isFixado() {
		return fixado;
	}

	public void setFixado(boolean fixado) {
		this.fixado = fixado;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	
	
	

}
