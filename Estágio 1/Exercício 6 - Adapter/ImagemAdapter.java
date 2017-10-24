package Adapter;

public class ImagemAdapter implements ImagemTarget{
	
	private Imagem imagem;
	
	@Override
	public void carregarImagem(Imagem imagem) 
	{
		imagem.carregarImagem();
	}
	
	@Override
	public void desenharImagem(Imagem imagem)
	{
		imagem.desenharImagem();
	}

}
