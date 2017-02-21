import java.util.List;

public class View implements Observer{

	
	private Busca  b;
	private List  listaGuitarra;
	
	
	public void  setB(Busca busca)
	{
		b=busca;
	}
	public void update(List l) 
	{
	
		listaGuitarra=l;
		b.busca();
	}
	public void imprimirDadosGuitarra()
	{
		if(!listaGuitarra.isEmpty())
		{
			for(Object i :listaGuitarra)
			{
				Guitarra gui= (Guitarra) i;
				System.out.println("Marca: "+gui.getMarca());
			}
		}
	}
	public void imprimirTodosDados()
	{
		if(!listaGuitarra.isEmpty())
		{
			for(Object i :listaGuitarra)
			{
				Guitarra gui= (Guitarra) i;
				System.out.println("Marca: "+gui.getMarca()+"Ano:"+gui.getAno()+"Quantidade em estoque"+gui.getQuantidade());
			}
		}
	}
	
	
	
	

}
