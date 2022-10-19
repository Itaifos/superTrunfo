public class Carta {
    private String classeDeCarta;
    private boolean superTrunfo;

    public Carta(String classeDeCarta, boolean superTrunfo){ 
        setClasseDeCarta(classeDeCarta);
        setSuperTrunfo(superTrunfo);
    }

    private void setClasseDeCarta(String classeDeCarta) {
        this.classeDeCarta = classeDeCarta;
    }

    private void setSuperTrunfo(boolean superTrunfo) {
        this.superTrunfo = superTrunfo;
    }

    public String getClasseDeCarta() {
        return classeDeCarta;
    }

    public Boolean getSuperTrunfo(){
        return superTrunfo;
    }

    public boolean ehSuperTrunfo(){
        if (getSuperTrunfo() == true){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return getClasseDeCarta() + getSuperTrunfo();
    }
}

