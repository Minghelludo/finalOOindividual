package finalOOindividual;

import java.util.ArrayList;

public class GetPersonagens {
	public static ArrayList<Personagem> criar(ArrayList<Personagem> lista){
		Guerreiro p1 = new Guerreiro("Dudu Mario");
		lista.add(p1);
		return lista;
	}
}
