import java.util.*;
import java.util.stream.Collectors;

public class Deposito {
    public Formacion formacion;
    public List<Formacion> formaciones = new ArrayList<>();


    public Locomotora locomotora;

    public List<Locomotora> locomotoras=new ArrayList<>();
    public List<Vagon> vagones=new ArrayList<>(  );
    public List<Locomotora> locomotorasSueltas=new ArrayList<>(  );


    public void setFormacion(List<Formacion> formaciones) {
       this.formaciones = formaciones;}
    public List<Formacion> getFormacion()
    { return formaciones; }
    public void agregarFormacion(Formacion formacion){
            formaciones.add(formacion);}

    /** 8. Si un depósito necesita un conductor experimentado.
     Un depósito necesita un conductor experimentado si alguna
     de sus formaciones es compleja. Una formación es compleja si: tiene más de 20 unidades
     (sumando locomotoras y vagones), o el peso total (sumando locomotoras y vagones) es de más de 10000 kg.**/
    public List<Vagon> vagonMasPesadoPorFormacion() {
        return formaciones.stream()
                .map( Formacion::vagonPesado )
                .collect( Collectors.toList());
    }
    public Long cantVagonesFormacion() {
        return vagones.stream().count();}
    public Long cantLocomotorasFormacion() {
        return locomotoras.stream().count();}
    public Integer pesoTotalVagonesFormacion(){ return vagones
    .stream().map(v->v.getPesoMaximo()).reduce( 0, Integer::sum );}
    public Integer pesoTotalLocoFormacion(){ return locomotoras
    .stream().map(l->l.getPesoLoco()).reduce(0, Integer:: sum);}
    public Boolean cantTotalenFormacion(){if
    (cantLocomotorasFormacion(  ) + cantVagonesFormacion( ) >= 20){return true;}else return false;}
    public Boolean pesoTotalenFormacion(){
        if (pesoTotalVagonesFormacion(  ) + pesoTotalLocoFormacion(  ) >= 10000
        ) { return true;} else return false; }

    public Boolean formacionCompleta(Formacion formacion){if (cantTotalenFormacion(  )
            .equals( true ) || (pesoTotalenFormacion( ).equals( true))){return true;}
    else return false;}

    public Boolean necesitaConductor(Formacion formacion){
        if(formacionCompleta(formacion)
            .equals( true )){return true;} else return false;}
/**Agregar, dentro de un depósito, una locomotora a una formación determinada,
 * de forma tal que la formación pueda moverse.
 Si la formación ya puede moverse, entonces no se hace nada.
 Si no, se le agrega una locomotora suelta del depósito cuyo arrastre útil
 sea mayor o igual a los kilos de empuje que le faltan a la formación. Si no hay ninguna
 locomotora suelta que cumpla esta condición, no se hace nada.**/

    public Boolean formacionPuedeMoverse(Formacion formacion){
    return formacion.puedeMoverseF();}

    public void agregarLocomotora(Formacion formacion) {
        // EXTRA: Podríamos chequear que la formación que se pasa como parámetro
        // pertenezca a este deposito.
        if (!formaciones.contains(formacion)) {
            throw new ParametrosIncorrectosException(
                    "Error agregando locomotora a formación: " +
                            "la formación no pertenece al depósito.");
        }

        if (!formacion.puedeMoverseF()) {
            Integer empujeFaltante = formacion.kilosEmpuje();
            locomotorasSueltas.stream()
                    .filter(locomotora -> locomotora.arrastreUtil() >= empujeFaltante)
                    .findFirst()
                    .ifPresent(locomotora -> {
                        formacion.agregarLocomotora(locomotora);
                        locomotorasSueltas.remove(locomotora);
                    });
        }}}






