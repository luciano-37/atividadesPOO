package trabalho;

public class Main {
	
	public static void main(String[] args) {

		Notbook notbook = new Notbook ("DELL");
	
		System.out.println(notbook.getTipoAparelho());
		notbook.carregar();
		System.out.println(notbook.toString());
		System.out.println("CARREGADOR" + notbook.getMAH());
		System.out.println(notbook.getModeloProcessador());
		System.out.println("capacidade: " + notbook.getPotencia());
		System.out.println("touch: " + notbook.getTipoTela());
	
}

}
