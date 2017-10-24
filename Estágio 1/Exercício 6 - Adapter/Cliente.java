package Adapter;

public class Cliente {
	
	public static void main(String[] args) {
		ImagemAdapter imagem = new ImagemAdapter();
		Imagem imagemPng = new ImagemPng();
		Imagem imagemJpeg = new ImagemJpeg();
		
		imagem.carregarImagem(imagemJpeg);
		imagem.carregarImagem(imagemPng);
		
		imagem.desenharImagem(imagemJpeg);
		imagem.desenharImagem(imagemPng);
		
	
	
	}
}
