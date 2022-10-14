public class Carta {
    String classeDeCarta;
    boolean superTrunfo;

    public Carta(String classeDeCarta, boolean superTrunfo){ 
        this.classeDeCarta = classeDeCarta;
        this.superTrunfo = superTrunfo;
    }

    public void setClasseDeCarta(String classeDeCarta) {
        this.classeDeCarta = classeDeCarta;
    }

    public void setSuperTrunfo(boolean superTrunfo) {
        this.superTrunfo = superTrunfo;
    }

    public String getClasseDeCarta() {
        return classeDeCarta;
    }

    public Boolean getSuperTrunfo(){
        return superTrunfo;
    }


}

