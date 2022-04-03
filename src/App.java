import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        Jogador jogador = new Jogador();

      //  Pokemon []cartasJogador = new Pokemon[5];
      //Pokemon []cartasCpu = new Pokemon[5];

        List<Pokemon> cartasJogador = new ArrayList<>();
        List<Pokemon> cartasCpu = new ArrayList<>();
        List<Pokemon> pokedex = new ArrayList<>() ;
        addCartasIniciais(pokedex);

        System.out.print("Seja bem vindo ao nosso Mini Game cardPokemon!\nQual é o seu nome?");
        jogador.setNomeJogador(teclado.nextLine());

        System.out.println("Ok "+jogador.getNomeJogador()+" iremos sortear suas 5 cartas.");

        for (int i = 0; i < 5; i++) {
            int numAleatorio = (int)(Math.random() * 14 );

            cartasJogador.add(pokedex.get(numAleatorio));
        }

        for (int i = 0; i < 5; i++) {
            int numAleatorio = (int)(Math.random() * 14 );

            cartasCpu.add(pokedex.get(numAleatorio));
        }
        
        int opcao=0;
        int rounds=5;
        do{
            menu();
            opcao=teclado.nextInt();
            

            switch(opcao){
            
                case 1: 
                pularLinha();
                   for (Pokemon carta : cartasJogador) {
                        System.out.println();
                        carta.status();
                        System.out.println("--------------------------------");  
                    }
                    opcao=teclado.nextInt();  
                    break;
                case 2: 
                
                 System.out.println("Escolha sua carta de acordo com a sequência de sua lista.");
                 System.out.println("Qual carta você quer utilizar nesta rodada?");

                    for (int i = 0; i < cartasJogador.size(); i++) {
                        System.out.println(i+"==> "+cartasJogador.get(i).getNomePokemon());
                    }

                 opcao=teclado.nextInt();

                 pularLinha();
                    if((opcao<=cartasJogador.size() && opcao>=0)){
                        
                        int numAleatorio = (int)(Math.random() * cartasCpu.size() );
     
                        System.out.println("Carta da CPU.: "+ cartasCpu.get(numAleatorio).getNomePokemon());

                        Disputa disputa =new Disputa(cartasJogador.get(opcao), cartasCpu.get(numAleatorio));
 
                        disputa.combate();
                        
                        cartasJogador.remove(opcao);
                        cartasCpu.remove(numAleatorio);
                        pularLinha();
                        rounds--;

                        if(rounds==0){
                            if(disputa.getVitoriaDesafiador()>disputa.getVitoriaDesafiante()){
                                System.out.println("PARABENS VOCÊ FOI O VENCEDOR DESTA PARTIDA!");

                            }else if(disputa.getVitoriaDesafiador()<disputa.getVitoriaDesafiante()){
                                System.out.println("QUE PENA NÃO FOI DESSA VEZ. TENTE NOVAMENTE MAIS TARDE. ");
                            }

                            else{
                                System.out.println("ESSA FOI DUREZA A PARTIDA TERMINOU EMPATADA.");
                            }
                            opcao=10;
                        }

                    }  
                    else{
                        System.out.println("Opção invalida tente alguma das opções listadas.");
                    }

                    break;
                    
            }

        }
        while(opcao!=10);

        teclado.close();

    }

    public static void addCartasIniciais(List<Pokemon>pokedex){

        pokedex.add(new Pokemon(3,3,3,4,3,"Bulbasaur","Terra"));
        pokedex.add(new Pokemon(3,4,3,4,4,"Charmander","Fogo"));
        pokedex.add(new Pokemon(3,3,4,4,3,"Squirtle","Agua"));
        pokedex.add(new Pokemon(2,4,3,2,5,"Rattata","Normal"));
        pokedex.add(new Pokemon(3,4,3,3,6,"Pikachu","Electric"));
        pokedex.add(new Pokemon(5,3,3,4,3,"Clefairy","Fada"));
        pokedex.add(new Pokemon(3,3,3,3,4,"vulpix","Fogo"));
        pokedex.add(new Pokemon(7,3,2,3,2,"Jigglypuff","Fada"));
        pokedex.add(new Pokemon(3,3,3,2,4,"Zubat","Venenoso"));
        pokedex.add(new Pokemon(3,3,3,3,6,"Meowth","Normal"));
        pokedex.add(new Pokemon(3,4,3,4,4,"Psyduck","Agua"));
        pokedex.add(new Pokemon(5,5,3,3,3,"Machop","Lutador"));
        pokedex.add(new Pokemon(2,3,5,6,3,"Magnemite","Electric"));
        pokedex.add(new Pokemon(3,5,4,3,2,"Paras","Inseto"));
        pokedex.add(new Pokemon(3,5,3,3,5,"Mankey","Lutador"));
    }

    public static void menu(){
        System.out.println("MENU\n*---------------------------------------------*");
        System.out.println("1==> verificar Suas cartas.");
        System.out.println("2==> Jogar carta");
        System.out.println("4==> finalizar o jogo");
    }
    
    public static void pularLinha(){
        for (int i = 0; i < 5; i++) {
            System.out.println();
        }
       
    }

}
