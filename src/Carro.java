public class Carro{
    private String pais;
    private String marca;
    private String modelo;

    private int velocidade;
    private int hp;
    private int aceleracao;
    private int cilindrada;
    private int kg;

    public Carro(
        String pais,
        String marca,
        String modelo,
        int velocidade,
        int hp,
        int aceleracao,
        int cilindrada,
        int kg
    ){
        this.pais = pais;
        this.marca = marca;
        this.modelo = modelo;
        this.velocidade = velocidade;
        this.hp = hp;
        this.aceleracao = aceleracao;
        this.cilindrada = cilindrada;
        this.kg = kg;

    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
    public void setAceleracao(int aceleracao) {
        this.aceleracao = aceleracao;
    }
    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
    public void setKg(int kg) {
        this.kg = kg;
    }


}
