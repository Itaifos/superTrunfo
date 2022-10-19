public class Carro extends Carta{
    private String pais;
    private String marca;
    private String modelo;

    private int velocidade;
    private int hp;
    private int aceleracao;
    private int cilindrada;
    private int kg;

    public Carro(
        String classeDeCarta,
        boolean superTrunfo,
        String pais,
        String marca,
        String modelo,
        int velocidade,
        int hp,
        int aceleracao,
        int cilindrada,
        int kg
    ){
        super(classeDeCarta, superTrunfo);
        setPais(pais);
        setMarca(marca);
        setModelo(modelo);
        setVelocidade(velocidade);
        setHp(hp);
        setAceleracao(aceleracao);
        setCilindrada(cilindrada);
        setKg(kg);

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

    public String getPais() {
        return pais;
    }
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public int getVelocidade() {
        return velocidade;
    }
    public int getHp() {
        return hp;
    }
    public int getAceleracao() {
        return aceleracao;
    }
    public int getCilindrada() {
        return cilindrada;
    }
    public int getKg() {
        return kg;
    }

    @Override
    public String toString() {
        return super.toString() + " " + getPais() + " " + getMarca() + " " + getModelo() + " " + getVelocidade() + " " + getHp() + " " + getAceleracao() + " " + getCilindrada() + " " + getKg();

    }
}
