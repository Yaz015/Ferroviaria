public class LocomotoraSuelta {

    private Integer pesoLoco;
    private Integer pesoMaxArrastre;
    private Integer velMax;

    public Integer getPesoLoco() {
        return pesoLoco;
    }

    public void setPesoLoco(Integer pesoLoco) {
        this.pesoLoco = pesoLoco;
    }

    public Integer getPesoMaxArrastre() {
        return pesoMaxArrastre;
    }

    public void setPesoMaxArrastre(Integer pesoMaxArrastre) {
        this.pesoMaxArrastre = pesoMaxArrastre;
    }

    public Integer getVelMax() {
        return velMax;
    }

    public void setVelMax(Integer velMax) {
        this.velMax = velMax;
    }
    public Integer arrastreUtil(){return pesoMaxArrastre-pesoLoco;}
}



