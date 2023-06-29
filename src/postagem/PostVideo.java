package postagem;

import java.lang.module.FindException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class PostVideo implements Postavel{

	private Video video;
	private LocalDateTime data_postagem;
	private List<String> lista_comentarios;
	private String localizacao;
	
	public PostVideo() {
        this.video = null;
        this.data_postagem = null;
        this.lista_comentarios = new ArrayList<>();
    }

    public void adicionaVideo(Video video) {
        this.video = video;
    }

    @Override
    public boolean posta() {
        if (video != null) {
            data_postagem = LocalDateTime.now();
            return true;
        } else {
        	throw new FindException("Erro: não há vídeo a ser postado!");
        }
    }

    @Override
    public boolean comenta() {
        LocalDateTime dataAtual = LocalDateTime.now();
        String comentario = "Exemplo de comentário";
        int tamanhoMensagem = comentario.length();
        String comentarioFormatado = "[" + dataAtual + "] " + comentario + " (Tamanho: " + tamanhoMensagem + ")";
        lista_comentarios.add(comentarioFormatado);
        return true;
    }
}
	


