public class Pokemon extends Stats {

   private String nomePokemon;
   private String tipoPokemon;

public String getNomePokemon() {
    return nomePokemon;
}
public void setNomePokemon(String nomePokemon) {
    this.nomePokemon = nomePokemon;
}
public String getTipoPokemon() {
    return tipoPokemon;
}
public void setTipoPokemon(String tipoPokemon) {
    this.tipoPokemon = tipoPokemon;
}

public Pokemon(int qtdVida, int ataque, int defesa,int specialAtaque, int velocidade, String nomePokemon, String tipoPokemon) {
    super(qtdVida, ataque, specialAtaque, defesa, velocidade);
    this.nomePokemon = nomePokemon;
    this.tipoPokemon = tipoPokemon;
}
public Pokemon(String nomePokemon, String tipoPokemon) {
    this.nomePokemon = nomePokemon;
    this.tipoPokemon = tipoPokemon;
}
public Pokemon(){
    
}

public void status(){

    System.out.println("Nome do Pokemon.: "+ getNomePokemon());
    System.out.println("Tipo do Pokemon.: "+ getTipoPokemon());
    System.out.println("HP.: "+ getQtdVida());
    System.out.println("Ataque.: "+ getAtaque());
    System.out.println("Defesa.: "+ getDefesa());
    System.out.println("Ataque Especial.: "+getSpecialAtaque());
    System.out.println("Velocidade.: "+ getVelocidade());
}


    
}
