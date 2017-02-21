
public class Guitarra {
	private String marca;
	private int ano;
	private int quantidade;
	
	public Guitarra (String m,int a,int q)
	{
		marca=m;
		ano=a;
		quantidade=q;
	}
	public String getMarca()
	{
		return marca;
	}
	public  int getAno()
	{
		return ano;
	}
	public int getQuantidade()
	{
		return  quantidade;
	} 
	public boolean  matches(Guitarra g)
	{
		if(!marca.equals(g.marca))return false;
		if(ano!=g.ano)return false;
		if(quantidade==0)return false;
		return true;
	}

	
}
