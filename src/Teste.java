
public class Teste {

	public static void main(String[] args) {
		Estoque e = new Estoque();
		e.addGuitarra(new Guitarra("Suzuki",2016,5));
		e.addGuitarra(new Guitarra("Yamara",2000,10));
		
		View v =new View();
		e.registerObserver(v);
		BuscaBalconista bb= new BuscaBalconista();
		BuscaEstoquista be= new BuscaEstoquista();
		
		v.setB(bb);
		bb.setV(v);
		e.buscaGuitarra(new Guitarra("Suzuki",2016,5));
		
		
		
	System.out.println("------------------------------------------------------------------------------");
	v.setB(be);
	be.setV(v);
	e.buscaGuitarra(new Guitarra("Suzuki",2016,5));

	}

}
