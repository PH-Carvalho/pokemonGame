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
        int opcao=0;

        System.out.println("Seja bem vindo ao nosso Mini Game cardPokemon!\nQual é o seu nome?");
       try {
            jogador.setNomeJogador(teclado.nextLine());
            System.out.println(jogador.getNomeJogador()+ " Já há 15 pokemons armazenados Na pokedex.");

            do{   
            
            System.out.println("Você deseja incluir algum outro Pokemon?");
               System.out.println("1==>SIM\n2==>Visualizar os Pokemons cadastrados\nOUTRO NUMERO ==>Jogar");
               System.out.println("Opção.:");
               opcao=teclado.nextInt();

           
               if(opcao==1){
                   System.out.println("Quantos Pokemons você que incluir na lista?");
                   System.out.println("Obs.: As 15 cartas iniciais foram setadas de acordo com o site  https://www.pokemon.com/br/pokedex/. Esse site é uma boa dica para você listar o seus pokemons.");
                  System.out.println("Opção.:");
                   opcao=teclado.nextInt();
                   int i=0;
                   do{
                      Pokemon pokemon = new Pokemon();

                      System.out.print("Nome do Pokemon.: ");
                      pokemon.setNomePokemon(teclado.next());

                      System.out.print("Tipo do Pokemon.: ");
                      pokemon.setTipoPokemon(teclado.next());

                      System.out.print("Valor de Ataque.: ");
                      pokemon.setAtaque(teclado.nextInt());

                      System.out.print("Valor de Defesa.: ");
                      pokemon.setDefesa(teclado.nextInt());

                      System.out.print("Valor Do Ataue Especial.: ");
                      pokemon.setSpecialAtaque(teclado.nextInt());

                      System.out.print("Valor Da Velocidade.: ");
                      pokemon.setVelocidade(teclado.nextInt());

                      System.out.print("Valor Do HP");
                      pokemon.setQtdVida(teclado.nextInt());

                      pokedex.add(pokemon);
                     i++;
                   }while(i<opcao);
                }    
                else if(opcao==2){
                    System.out.println("*---------------------------------*");
                   for (Pokemon pokemon : pokedex) {
                       System.out.println(pokemon.getNomePokemon()); 
                     }
                    
                     System.out.println("*---------------------------------*");
                } 

            } while(opcao>0 && opcao<3);

        }  
        catch (Exception e) {
            System.out.println("Digito invalido");
        }

        System.out.println("Ok "+jogador.getNomeJogador()+" iremos sortear suas 5 cartas.");

        for (int i = 0; i < 5; i++) {
            int numAleatorio = (int)(Math.random() * 14 );

            cartasJogador.add(pokedex.get(numAleatorio));
        }

        for (int i = 0; i < 5; i++) {
            int numAleatorio = (int)(Math.random() * 14 );

            cartasCpu.add(pokedex.get(numAleatorio));
        }
        
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

                        Thread.sleep(2000);

                        disputa.combate();
                        
                        cartasJogador.remove(opcao);
                        cartasCpu.remove(numAleatorio);
                        pularLinha();
                        rounds--;

                        if(rounds==0){

                            System.out.println("Fim da Partida.");
                            Thread.sleep(2000);
                            System.out.println("Vamos Para o Resultado final!");
                            System.out.println("3");
                            Thread.sleep(1000);
                            System.out.println("2");
                            Thread.sleep(1000);
                            System.out.println("1");
                            Thread.sleep(1000);

                            pularLinha();


                            if(disputa.getVitoriaDesafiador()>disputa.getVitoriaDesafiante()){
                                System.out.println("PARABENS VOCÊ FOI O VENCEDOR DESTA PARTIDA!");

                            }else if(disputa.getVitoriaDesafiador()<disputa.getVitoriaDesafiante()){
                                System.out.println("QUE PENA NÃO FOI DESSA VEZ. TENTE NOVAMENTE MAIS TARDE. ");
                            }

                            else{
                                System.out.println("ESSA FOI DUREZA A PARTIDA TERMINOU EMPATADA.");
                            }
                            opcao=10;

                            System.out.println(jogador.getNomeJogador() +"Você fez "+ disputa.getVitoriaDesafiador()+" Pontos entre as 5 Rodadas.");
                            System.out.println("A CPU fez "+disputa.getVitoriaDesafiante());
                            
                        }

                    }  
                    else{
                        System.out.println("Opção invalida tente alguma das opções listadas.");
                    }

                    break;
                
                    default:

                     pularLinha();
                      System.out.println("ESCOLHA UMA DAS OPÇÕES LISTADA NO MENU.");
                      Thread.sleep(2000);
                      pularLinha();
                      pularLinha();

                   
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
        System.out.println("*-----------MENU-----------*");
        System.out.println("1==> verificar Suas cartas.");
        System.out.println("2==> Jogar carta");
    }
    
    public static void pularLinha(){
        for (int i = 0; i < 5; i++) {
            System.out.println();
        }
       
    }

}
