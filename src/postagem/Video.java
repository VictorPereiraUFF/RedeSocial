package postagem;

public class Video extends Recurso{
	
	private int frame_rate, duracao;

	public Video(int id, String url_recurso, int prox_id, int frame_rate, int duracao) {
		super(id, url_recurso, prox_id);
		this.frame_rate = frame_rate;
		this.duracao = duracao;
	}

	public int getFrame_rate() {
		return frame_rate;
	}

	public void setFrame_rate(int frame_rate) {
		this.frame_rate = frame_rate;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	@Override
	public boolean validaUrlRecurso(String url_recurso) {
		String[] tiposAceitos = {".mp4", ".mov", ".wmv"};
		for(String tipoVideo : tiposAceitos) {
			if(url_recurso.endsWith(tipoVideo)) {
				return true;
			}
		}
		return false;
	}
	
	

}
