package Adapter;

public class ImagemJpeg implements Imagem{
	
	
	@Override
	public void carregarImagem() 
	{
		System.out.println("Loading image Jpeg...");
	}
	
	
	@Override
	public void desenharImagem() 
	{
		System.out.println("Desenha imagem Jpeg.");
	}


}
