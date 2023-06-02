package postagem;

import java.time.LocalDateTime;
import java.util.List;

public class PostVideo implements Postavel{

	private Video video;
	private LocalDateTime data_postagem;
	private List[] lista_comentarios;
	
	@Override
	public boolean posta() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean comenta() {
		// TODO Auto-generated method stub
		return false;
	}

}
