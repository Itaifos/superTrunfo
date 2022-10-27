import java.util.List;

public class Jogador {
    private String nome;
    private List<CartaDeCarro> mao; 
    private int pontos;

    
    public Jogador(String nome, List<CartaDeCarro> mao) {
        setNome(nome);
        setMao(mao);
        setPontos(0);
    }

    public Jogador(List<CartaDeCarro> mao) {
        setNome("computador");
        setMao(mao);
        setPontos(0);
    }


    private void setNome(String nome) {
        this.nome = nome;
    }

    private void setMao(List<CartaDeCarro> mao) {
        this.mao = mao;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public int getPontos() {
        return pontos;
    }

    public List<CartaDeCarro> getMao() {
        return mao;
    }

    public String getNome() {
        return nome;
    }

    
    
}
