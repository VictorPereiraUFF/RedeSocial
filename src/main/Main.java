package main;

import java.lang.module.FindException;

import postagem.Foto;
import postagem.PostFoto;
import postagem.PostVideo;
import postagem.Postavel;
import postagem.PostavelFactory;
import postagem.Video;

public class Main {

	public static void main(String[] args) {
		//Tentativa de postagem de texto
        Postavel postagem1 = PostavelFactory.getPostavel("POSTVIDEO");
        boolean postagem1Result = false;
        try {
        	postagem1Result = postagem1.posta();
        	String msg1 = ("Postagem bem sucedida!");
        	System.out.println(msg1);
        } catch (FindException e) {
        	System.out.println(e.getMessage());
        }
        System.out.println("Resultado da postagem: " + postagem1Result); 

        //Tentativa de postagem de vídeo
        Postavel postagem2 = PostavelFactory.getPostavel("POSTVIDEO");
        ((PostVideo) postagem2).adicionaVideo(new Video(0, null, 0, 0, 0));
        boolean postagem2Result = postagem2.posta();
        System.out.println("Resultado da postagem: " + postagem2Result); 

        //Tentativa de postagem de vídeo sem vídeo
        Postavel postagem3 = PostavelFactory.getPostavel("POSTVIDEO");
        boolean postagem3Result = false;
        try {
        	postagem3Result = postagem3.posta();
        	String msg3 = ("Postagem bem sucedida!");
        	System.out.println(msg3);
        } catch (FindException e) {
        	System.out.println(e.getMessage());
        }
        System.out.println("Resultado da postagem: " + postagem3Result); 
        
        //Tentativa de postagem de foto sem foto
        Postavel postagem4 = PostavelFactory.getPostavel("POSTFOTO");
        boolean postagem4Result = false;
        try {
        	postagem4Result = postagem4.posta();
        	String msg4 = ("Postagem bem sucedida!");
        	System.out.println(msg4);
        } catch (FindException e) {
        	System.out.println(e.getMessage());
        }
        System.out.println("Resultado da postagem: " + postagem4Result);

        //Tentativa de postagem de 5 fotos
        Postavel postagem5 = PostavelFactory.getPostavel("POSTFOTO");
        for (int i = 0; i < 5; i++) {
            ((PostFoto) postagem5).adicionaFoto(new Foto(i, null, i, i));
        }
        boolean postagem5Result = false;
        try {
        	postagem5Result = postagem5.posta();
        	String msg5 = ("Postagem bem sucedida!");
        	System.out.println(msg5);
        } catch (FindException e) {
        	System.out.println(e.getMessage());
        }
        System.out.println("Resultado da postagem: " + postagem5Result);
        
        //Tentativa de postagem de 11 fotos
        Postavel postagem6 = PostavelFactory.getPostavel("POSTFOTO");
        for (int i = 0; i < 11; i++) {
        boolean postagem6Result = false;
        try {
        	postagem6Result = postagem6.posta();
        	String msg6 = ("Postagem bem sucedida!");
        	System.out.println(msg6);
        } catch (FindException e) {
        	System.out.println(e.getMessage());
        }
        System.out.println("Resultado da postagem: " + postagem6Result); 

        //Tentativa de comentário na foto
        Postavel postagem7 = PostavelFactory.getPostavel("POSTFOTO");
        postagem7.comenta();

        //Tentativa de comentário no vídeo
        Postavel postagem8 = PostavelFactory.getPostavel("POSTVIDEO");
        postagem8.comenta();

        //Tentativa de postagem de vídeo irregular
        Postavel postagem9 = PostavelFactory.getPostavel("POSTVIDEO");
        boolean postagem9Result = false;
        try {
            postagem9Result = postagem9.posta();
            ((PostVideo) postagem9).adicionaVideo(null);
        } catch (FindException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        System.out.println("Resultado da postagem: " + postagem9Result); 

        //Tentativa de postagem de foto irregular
        Postavel postagem10 = PostavelFactory.getPostavel("POSTFOTO");
        boolean postagem10Result = false;
        try {
            postagem10Result = postagem10.posta();
            ((PostFoto) postagem10).adicionaFoto(null);
        } catch (FindException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        System.out.println("Resultado da postagem: " + postagem10Result); 
    }
}
}