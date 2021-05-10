package finalOOindividual;



import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class GameMain {

    public static void main(String[] args) throws ClassNotFoundException, IOException {
    	int escolha;
    	Scanner teclado = new Scanner(System.in);
        ArrayList<Personagem> personagens=new ArrayList<Personagem>();
        System.out.println("1.New Game");
        boolean check = Save.exists();
        if(check==true) {
        	System.out.println("2.Continue");
        }
        while (true){
        	escolha=teclado.nextInt();
            if (escolha==1) {
            	personagens=GetPersonagens.criar(personagens);
            	PersonagemArquivo.salvaPersonagem(personagens.get(0),false);
            	break;
            }
            if(escolha==2 && check==true) {
            	personagens=PersonagemArquivo.carregarPersonagem();
            	break;
            }
        }
        System.out.println("Bem vindo ao jogo!");
        while(true) {
            System.out.println("1.Procurar um combate\n2.Descansar na cidade\n3.Olhar os personagens\n4.Sair do jogo");
            escolha = teclado.nextInt();
            if(escolha==1) { //upa o lvl para testar se o save esta funcionando como deveria
            	personagens.get(0).lvlUp(1);
            }
            if(escolha==3) {
            	System.out.println(personagens.get(0).getNome());
            	System.out.println(personagens.get(0).getLvl());
            }
            if(escolha==4) {
                teclado.close();
                PersonagemArquivo.salvaPersonagem(personagens.get(0),true);
                return;
            }
        }
    }
}