
public class BuscaEstoquista implements Busca {
	private View v;
	private Estoque e;
	public void setV(View view)
	{
		v=view;
	}
	public void busca()
	{
		v.imprimirTodosDados();
	}

}
