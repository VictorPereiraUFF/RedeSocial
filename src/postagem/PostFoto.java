package postagem;

import java.lang.module.FindException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class PostFoto implements Postavel{

	private int qtde_fotos, qtde_fixados;
	private List foto;
	private String localizacao;
	private LocalDateTime data_postagem;
	private List<String> lista_comentarios;
	
	
	 public PostFoto() {
	        this.qtde_fotos = 0;
	        this.foto = new ArrayList<>();
	        this.localizacao = "";
	        this.data_postagem = null;
	        this.lista_comentarios = new ArrayList<>();
	        this.qtde_fixados = 0;
	    }

	    public void adicionaFoto(Foto foto) {
	        if (qtde_fotos < 10) {
	            this.foto.add(foto);
	            qtde_fotos++;
	        }
	        else {
	        	throw new FindException("Erro: A lista de fotos está lotada!");
	        }
	    }

	    public void excluiFoto(Foto foto) {
	    	if (qtde_fotos > 0) {
		        this.foto.remove(foto);
		        qtde_fotos--;
	    	}
	    	else {
	    		throw new FindException("Erro: a lista de fotos está vazia!");
	    	}
	    }

	    @Override
	    public boolean posta() {
	        if (qtde_fotos > 0 && qtde_fotos <= 10) {
	            data_postagem = LocalDateTime.now();
	            return true;
	        } else {
	        	throw new FindException("Erro: não há fotos a serem postadas!");
	        }
	    }

	    @Override
	    public boolean comenta() {
	        LocalDateTime dataAtual = LocalDateTime.now();
	        String comentario = "Tá mó gata mesmo hein";
	        int tamanhoMensagem = comentario.length();
	        String comentarioFormatado = "[" + dataAtual + "] " + comentario + " (Tamanho: " + tamanhoMensagem + ")";
	        lista_comentarios.add(comentarioFormatado);
	        return true;
	    }
	}
