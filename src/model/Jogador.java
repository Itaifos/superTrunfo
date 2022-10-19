public class Jogador {
    private String nome;
    private int pontos;

    
    public Jogador(String nome, int pontos) {
        setNome(nome);
        setPontos(pontos);
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    private void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public int getPontos() {
        return pontos;
    }

    public String getNome() {
        return nome;
    }

    
    
}
