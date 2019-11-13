public class VagonCarga implements Vagon{
    Integer cargaMax;

    public VagonCarga(Integer cargaMax){
        this.cargaMax=cargaMax;
    }
    public Integer pesoMaximo(){return cargaMax+160;}
    public Integer getPesoMaximo(){return pesoMaximo();}

    String nombreVagon;
    public String nombreVagon() {
        return nombreVagon;
    }
    public String getNombreVagon(){return nombreVagon;}
    public Integer cantPasajeros() {
        return 0;}
    public Integer getCantPasajeros(){return cantPasajeros();}
    public Boolean vagonLiviano() {if(pesoMaximo()<2500)
        return true;
    else return false;}
}
