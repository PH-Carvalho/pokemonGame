public class Jogador {

    private String nomeJogador;
    private int pontos;
    private int level;
    

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }


    public String getNomeJogador() {
        return nomeJogador;
    }

    public void setNomeJogador(String nome) {
        this.nomeJogador = nome;
    }

    public Jogador(String nome,int level,int qtdPokeBolas,int pontos) {
       setNomeJogador(nome);
       setLevel(level);
       setPontos(pontos);
    }

    public Jogador(){

    }

    public void upLevel(){
        
    }
}
