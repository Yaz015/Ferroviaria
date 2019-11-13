public class VagonPasajero implements Vagon{
        Integer largoMetros;
        Integer anchoMetros;
    String nombreVagon;
    public String nombreVagon() {
        return nombreVagon;
    }
    public String getNombreVagon(){return nombreVagon;}
        public VagonPasajero(Integer largoMetros, Integer anchoMetros){
            this.largoMetros=largoMetros;
            this.anchoMetros=anchoMetros;
        }
        public Integer cantPasajeros(){
            if (anchoMetros<=2.5){return largoMetros*8;}
            else return largoMetros*10;}

    Integer pesoMax;
    public Integer pesoMaximo(){return pesoMax=cantPasajeros()*80;}
    public Integer getPesoMaximo(){return pesoMaximo();}
        public Integer getCantPasajeros(){return cantPasajeros();}
    public Boolean vagonLiviano() {if(pesoMaximo()<2500)
        return true;
    else return false;}}
