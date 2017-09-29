package Adapter;

public class ImagemPng implements Imagem{
	
	@Override
	public void carregarImagem() 
	{
		System.out.println("Loading image Png...");
	}
	
	
	@Override
	public void desenharImagem() 
	{
		System.out.println("Desenha imagem Png.");
	}


}
