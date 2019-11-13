import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Formacion {
    public List<Vagon> vagones = new ArrayList<>();
    private List<Locomotora> locomotoras = new ArrayList<>();
    //List<String> formacion= new ArrayList<>(  );
    public LocomotoraSuelta locomotorasSuelta;

    public void setVagonesyLoco(List<Vagon> vagones, List<Locomotora> locomotoras) {
        this.vagones = vagones;
        this.locomotoras = locomotoras;
    }

    public void setLocomotoras(Locomotora locomotora) {
        this.locomotoras = locomotoras;
    }

    public Integer totalPasajerosFormacion() {
        return
                vagones.stream()
                        .map( vagon -> vagon.getCantPasajeros() )
                        .reduce( 0, Integer::sum );
    }

    public Long cantVagonLiviano() {
        return vagones.stream().filter( vagon -> vagon.vagonLiviano() )
                .count();
    }

    public Integer velMaxFormacion() {
        return locomotoras.stream().map( loco -> loco.getVelMax() )
                .min( Comparator.comparingInt( Integer::intValue ) ).get();
    }

    public Boolean esEficiente() {
        return locomotoras.stream().allMatch( loco -> loco.pesoMaxArrastreEfi().equals( true ) );
    }

    public Integer arrastreUtilTotal() {
        return locomotoras.stream().map( loco -> loco.arrastreUtil() ).reduce( 0, Integer::sum );
    }

    public Integer pesoMaxTotalVagon() {
        return
                vagones.stream().map( v -> v.getPesoMaximo() ).reduce( 0, Integer::sum );
    }

    public Boolean puedeMoverseF() {
        if
        (arrastreUtilTotal() >= pesoMaxTotalVagon()) {
            return true;
        } else return false;
    }

    public Integer kilosEmpuje() {
        if (puedeMoverseF().equals( true )) {
            return 0;
        } else
            return pesoMaxTotalVagon() - arrastreUtilTotal();
    }

    public Vagon vagonPesado() {
        return
                vagones.stream().max( Comparator.comparing( vagoness -> vagoness.getPesoMaximo() ) ).get();
    }

    public List<Vagon> getVagones() {
        return vagones;
    }

    public List<Locomotora> getLocomotoras() {
        return locomotoras;
    }

    public void setLocomotorasSuelta(LocomotoraSuelta locomotorasSuelta) {
        this.locomotorasSuelta = locomotorasSuelta;

    }
    public Boolean sirveLocoSuelta(LocomotoraSuelta locomotorasSuelta) {
        if (locomotorasSuelta.arrastreUtil() >= this.kilosEmpuje()) {
            return true;} else return false;
    }
    public void agregarLocomotora(Locomotora locomotora) {
        locomotoras.add(locomotora);
    }}





