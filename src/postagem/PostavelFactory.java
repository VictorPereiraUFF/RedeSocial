package postagem;

public class PostavelFactory {

	 public static Postavel getPostavel(String tipo) {
	        if (tipo.equals("POSTVIDEO")) {
	            return new PostVideo();
	        } else if (tipo.equals("POSTFOTO")) {
	            return new PostFoto();
	        } else {
	            throw new IllegalArgumentException("Tipo de postagem inválido");
	        }
	 }
}
