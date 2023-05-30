package postagem;

public abstract class Recurso {
	
	private final int id;
	private String url_recurso;
	protected int prox_id = 1;
			
	public Recurso(int id, String url_recurso, int prox_id) {
		super();
		this.id = id;
		this.url_recurso = url_recurso;
		this.prox_id = prox_id;
	}

	public String isUrl_recurso() {
		return url_recurso;
	}

	public void setUrl_recurso(String url_recurso) {
		this.url_recurso = url_recurso;
	}

	public int getProx_id() {
		return prox_id;
	}

	public void setProx_id(int prox_id) {
		this.prox_id = prox_id;
	}

	public int getId() {
		return id;
	}
	
	public abstract boolean validaUrlRecurso(String url_recurso);
	

}
