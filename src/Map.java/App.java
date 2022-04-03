import java.util.HashMap;


public class App {
    public static void main(String[] args) throws Exception {

        HashMap<String,String> pokedex = new HashMap<>();

       

        addPokemon(pokedex);
       System.out.println(pokedex.size()); 
       System.out.println(pokedex.get("Bulbasaur"));
       System.out.println(pokedex.values());
       System.out.println(pokedex);
        
    }

public static void addPokemon(HashMap<String,String>pokedex){
   

    pokedex.put("Bulbasaur", "Terra");
    pokedex.put("Charmander", "Fogo");
    pokedex.put("Squirtle", "Agua");
    pokedex.put("Pidgey", "Normal");
    pokedex.put("Rattata", "Normal");
    pokedex.put("Spearow", "Normal");
    pokedex.put("Pikachu","eletrico");
    pokedex.put("voltorb", "eletrico");
    pokedex.put("vulpix", "Fogo");
    pokedex.put("Jugglypuff", "Normal");

}
}
