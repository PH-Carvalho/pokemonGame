public abstract class Stats {
    
    protected int qtdVida;
    protected int ataque;
    protected int defesa;
    protected int SpecialAtaque;
    protected int velocidade;

    public int getQtdVida() {
        return qtdVida;
    }
    public void setQtdVida(int qtdVida) {
        this.qtdVida = qtdVida;
    }
    public int getAtaque() {
        return ataque;
    }
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }
    public int getDefesa() {
        return defesa;
    }
    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }
    public int getVelocidade() {
        return velocidade;
    }
    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
    public int getSpecialAtaque() {
        return SpecialAtaque;
    }
    public void setSpecialAtaque(int specialAtaque) {
        SpecialAtaque = specialAtaque;
    }
    public Stats(int qtdVida, int ataque, int defesa,int specialAtaque, int velocidade) {
        this.qtdVida = qtdVida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.SpecialAtaque=specialAtaque;
        this.velocidade = velocidade;
    }

    public Stats(){

    }
    
    
    
}
