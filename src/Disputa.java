public class Disputa extends Stats{
    Pokemon desafiante;
    Pokemon desafiador;
    public int pontosDesafiador;
    public int pontosDesafiante;
    public int vitoriaDesafiante;
    public int vitoriaDesafiador;
    private int rounds;
    


    public int getRounds() {
        return rounds;
    }



    public void setRounds(int rounds) {
        this.rounds = 5;
    }



    public int getVitoriaDesafiante() {
        return vitoriaDesafiante;
    }



    public void setVitoriaDesafiante(int vitoriaDesafiante) {
        this.vitoriaDesafiante = vitoriaDesafiante;
    }



    public int getVitoriaDesafiador() {
        return vitoriaDesafiador;
    }



    public void setVitoriaDesafiador(int vitoriaDesafiador) {
        this.vitoriaDesafiador = vitoriaDesafiador;
    }



    public int getPontosDesafiador() {
        return pontosDesafiador;
    }



    public void setPontosDesafiador(int pontosDesafiador) {
        this.pontosDesafiador = pontosDesafiador;
    }



    public int getPontosDesafiante() {
        return pontosDesafiante;
    }



    public void setPontosDesafiante(int pontosDesafiante) {
        this.pontosDesafiante = pontosDesafiante;
    }


    public Pokemon getDesafiante() {
        return desafiante;
    }



    public void setDesafiante(Pokemon desafiante) {
        this.desafiante = desafiante;
    }



    public Pokemon getDesafiador() {
        return desafiador;
    }



    public void setDesafiador(Pokemon desafiador) {
        this.desafiador = desafiador;
    }

    
    public Disputa(Pokemon desafiante, Pokemon desafiador) {
        this.desafiante = desafiante;
        this.desafiador = desafiador;
    }

    public void combateAtaque(){

        if(desafiador.getAtaque()>desafiante.getAtaque()){

            setPontosDesafiador(this.pontosDesafiador=this.pontosDesafiador+1);
            System.out.println("Ataque Vencedor.: " + desafiador.getNomePokemon());
        }
        else if((desafiador.getAtaque())<(desafiante.getAtaque())){

            setPontosDesafiante(this.pontosDesafiante=this.pontosDesafiante+1);
            System.out.println("Ataque Vencedor.: " + desafiante.getNomePokemon());
        }
        else{

            setPontosDesafiador(this.pontosDesafiador=this.pontosDesafiador+1);
            setPontosDesafiante(this.pontosDesafiante=this.pontosDesafiante+1);
            System.out.println("Empate em Ataque.");
        }

    }


    public void combateDefesa(){

        if(desafiador.getDefesa()>desafiante.getDefesa()){

            setPontosDesafiador(this.pontosDesafiador+=this.pontosDesafiador+1);
            System.out.println("Defesa Vencedor.: " + desafiador.getNomePokemon());
        }
        else if(desafiador.getDefesa()<desafiante.getDefesa()){

            setPontosDesafiante(this.pontosDesafiante=this.pontosDesafiante+1);
            System.out.println("Defesa Vencedor.: " + desafiante.getNomePokemon());
        }
        else{

            setPontosDesafiador(this.pontosDesafiador+=this.pontosDesafiador+1);
            setPontosDesafiante(this.pontosDesafiante=this.pontosDesafiante+1);
            System.out.println("Empate em Defesa.");
        }

    }

    public void combateVida(){
        
        if(desafiador.getQtdVida()>desafiante.getQtdVida()){

            setPontosDesafiador((this.pontosDesafiador=this.pontosDesafiador+1));
            System.out.println("Vida vencedor.: " + desafiador.getNomePokemon());
        }
        else if(desafiador.getQtdVida()<desafiante.getQtdVida()){

            setPontosDesafiante(this.pontosDesafiante=this.pontosDesafiante+1);
            System.out.println("Vida vencedor.: " + desafiante.getNomePokemon());
        }
        else{

            setPontosDesafiador(this.pontosDesafiador=this.pontosDesafiador+1);
            setPontosDesafiante(this.pontosDesafiante=this.pontosDesafiante+1);
            System.out.println("Empate em Vida");
        }

    }

    public void combateSpecialAtaque(){

        if(desafiador.getSpecialAtaque()>desafiante.getSpecialAtaque()){

            setPontosDesafiador(this.pontosDesafiador=this.pontosDesafiador+1);
            System.out.println("Especial Ataque Vencedor.: " + desafiador.getNomePokemon());
        }
        else if(desafiador.getSpecialAtaque()<desafiante.getSpecialAtaque()){

            setPontosDesafiante(this.pontosDesafiante=this.pontosDesafiante+1);
            System.out.println("Especial Ataque Vencedor.: " + desafiante.getNomePokemon());
        }
        else{

            setPontosDesafiador(this.pontosDesafiador=this.pontosDesafiador+1);
            setPontosDesafiante(this.pontosDesafiante=this.pontosDesafiante+1);
            System.out.println("Empate no Especial Ataque");
        }

    }

    public void combateVelocidade(){

        if(desafiador.getVelocidade()>desafiante.getVelocidade()){

            setPontosDesafiador(this.pontosDesafiador=this.pontosDesafiador+1);
            System.out.println("Velocidade Vencedor.: " + desafiador.getNomePokemon());
        }
        else if(desafiador.getVelocidade()<desafiante.getVelocidade()){

            setPontosDesafiante(this.pontosDesafiante=this.pontosDesafiante+1);
            System.out.println("Velocidade Vencedor.: " + desafiante.getNomePokemon());
        }
        else{

            setPontosDesafiador(this.pontosDesafiador=this.pontosDesafiador+1);
            setPontosDesafiante(this.pontosDesafiante=this.pontosDesafiante+1);
            System.out.println("Empate Velocidade");
        }

    }

    public void combate() throws InterruptedException {
        
        combateDefesa();
        Thread.sleep(2000);
        combateAtaque();
        Thread.sleep(2000);
        combateSpecialAtaque();
        Thread.sleep(2000);
        combateVelocidade();
        Thread.sleep(2000);
        combateVida();
        Thread.sleep(2000);

        if(getPontosDesafiador()>getPontosDesafiante()){
            setVitoriaDesafiador(this.vitoriaDesafiador=this.vitoriaDesafiador+1);
            System.out.println("VENCEDOR DA RODADA.:  " + desafiador.getNomePokemon() );
        }
        else if((getPontosDesafiador())<(getPontosDesafiante())){
            setVitoriaDesafiante(this.vitoriaDesafiante=this.vitoriaDesafiante+1);
            System.out.println("VENCEDOR DA RODADA.: " + desafiante.getNomePokemon());
        }
        else{
            setVitoriaDesafiador(this.vitoriaDesafiador=this.vitoriaDesafiador+1);;
            setVitoriaDesafiante(this.vitoriaDesafiante=this.vitoriaDesafiante+1);

            System.out.println("RODADA EMPATADA ");
        }

        Thread.sleep(2000);

    }


}
