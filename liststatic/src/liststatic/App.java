package liststatic;

public class App {

	public static void main(String[] args) {
		Lista lista = new Lista(5);
		lista.adiciona("Salgueiro");
		lista.adiciona("Cabrobó");
		lista.adiciona("Salgueiro");
		
		System.out.println("Tamanho: " + lista.getTamanho());
		System.out.println("lista: " +lista.buscaBasica(1));
		System.out.println("Verifica " + lista.verifica("salgueirO"));
		System.out.println("posição da segunda " + lista.verificaOcorrecia("salgueiro"));

	}

}
