import java.util.List;

import java.util.LinkedList;
public class Estoque implements Subject{
	
	private List guitarra;
	private List observers ;
	public Estoque()
	{
		guitarra =new LinkedList();
		observers = new  LinkedList();
	}

	public void registerObserver(Observer o) 
	{
		observers.add(o);
		
	}
	public void notifyObservers(List encontrados) 
	{

		for(Object i: observers)
		{
			Observer ob = (Observer)i;
			ob.update(encontrados);
		}
	}
	public void addGuitarra(Guitarra g)
	{
		guitarra.add(g);
	}
	public void buscaGuitarra(Guitarra g)
	{
		List encontrados =new LinkedList();
		for (Object i : guitarra)
		{
			Guitarra guitarraEstoque = (Guitarra)i;
			if (guitarraEstoque.matches(g)) encontrados.add(guitarraEstoque);
		}
		notifyObservers(encontrados);
		
	}
}
