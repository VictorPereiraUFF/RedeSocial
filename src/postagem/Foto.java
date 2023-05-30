package postagem;

public class Foto extends Recurso{
	
	private int resolucao;

	public Foto(int id, String url_recurso, int prox_id, int resolucao) {
		super(id, url_recurso, prox_id);
		this.resolucao = resolucao;
	}

	public int getResolucao() {
		return resolucao;
	}

	public void setResolucao(int resolucao) {
		this.resolucao = resolucao;
	}

	@Override
	public boolean validaUrlRecurso(String url_recurso) {
		String[] tiposAceitos = {".jpg", ".png", ".bmp"};
		for(String tipoFoto : tiposAceitos) {
			if(url_recurso.endsWith(tipoFoto)) {
				return true;
			}
		}
		return false;
	}

}
