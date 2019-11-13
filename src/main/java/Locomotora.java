import java.util.List;


public class Locomotora  {
    Integer pesoLoco;
    Integer pesoMaxArrastre;
    Integer velMax;
    //public Vagon vagon;
    //        public Vagon vagon(){ return vagon;}
    public Locomotora(Integer pesoLoco, Integer pesoMaxArrastre, Integer velMax) {
        this.pesoLoco = pesoLoco;
        this.pesoMaxArrastre = pesoMaxArrastre;
        this.velMax = velMax;
    }

    public Integer getVelMax(){return velMax;}
    public Integer getPesoLoco(){ return pesoLoco;}
    public Boolean pesoMaxArrastreEfi() {
        if (pesoMaxArrastre>=pesoLoco * 5) {
            return true ; } else  return false;}

    public Integer arrastreUtil(){return pesoMaxArrastre-pesoLoco;}


    String nombre;

    public void nombre(String nombre){this.nombre=nombre;}

    public String getNombre() {return nombre;
    }

}
