package finalOOindividual;

import finalOOindividual.GameException;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class PersonagemArquivo {
    
    public static void salvaPersonagem(Personagem personagem,Boolean check) throws IOException{
    	if(check==false) {
            FileOutputStream arquivo = new FileOutputStream("save.txt",true);
    	    ObjectOutputStream personagemSalvo= new ObjectOutputStream(arquivo);
    	    personagemSalvo.writeObject(personagem);
            personagemSalvo.flush();
            personagemSalvo.close();
    	}
    	if(check==true) {
    		apaga();
    		FileOutputStream arquivo = new FileOutputStream("save.txt",true);
    	    ObjectOutputStream personagemSalvo= new ObjectOutputStream(arquivo);
    	    personagemSalvo.writeObject(personagem);
            personagemSalvo.flush();
            personagemSalvo.close();
    	}
    }
    
    
	public static ArrayList<Personagem> carregarPersonagem() throws ClassNotFoundException, IOException{
    	Personagem p = null;
    	ArrayList<Personagem> pcs = new ArrayList<Personagem>();
    	FileInputStream input;
    	input = new FileInputStream("save.txt");
    	ObjectInputStream lerInput = new ObjectInputStream(input);
        p =((Personagem)lerInput.readObject());
        input.close();
        pcs.add(p);
    	return pcs;
    }
    public static void apaga() throws IOException {
    	FileOutputStream writer = new FileOutputStream("save.txt");
        writer.write(("").getBytes());
        writer.close();
    }
}