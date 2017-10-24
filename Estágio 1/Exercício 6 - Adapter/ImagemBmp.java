package Adapter;

public class ImagemBmp implements Imagem{
	
	
	@Override
	public void carregarImagem() 
	{
		System.out.println("Loading image Bmp...");
	}
	
	
	@Override
	public void desenharImagem() 
	{
		System.out.println("Desenha imagem Bmp.");
	}

}
