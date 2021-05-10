package finalOOindividual;

import java.io.Serializable;

abstract class Personagem implements Serializable{
	private static final long serialVersionUID = 1L;
	
	//variaveis
	private String nome;
    private int lvl=1;
    private int hp;
    private int hpA;
    private int atk;
    private int def;
    private int xp=0;
        
    //builder
    public Personagem(String n,int l,int h,int a,int d){
        this.nome=n;
        this.lvl=l;
        this.hp=h;
        this.hpA=h;
        this.atk=a;
        this.def=d;
    }
    public void lvlUp(int x) {
    	this.lvl=lvl+x;
    }
    
    //get set
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    public int getLvl() {return lvl;}
    public void setLvl(int lvl) {this.lvl = lvl;}
    public int getHp() {return hp;}
    public void setHp(int hp) {this.hp = hp;}
    public int getHpA() {return hpA;}
    public void setHpA(int hpA) {this.hpA = hpA;}
    public int getAtk() {return atk;}
    public void setAtk(int atk) {this.atk = atk;}
    public int getDef() {return def;}
    public void setDef(int def) {this.def = def;}
    public int getXp() {return xp;}
    public void setXp(int xp) {this.xp = xp;}
}
