import java.util.*;

public class Main {
    public static void main(String[] Args) {
        Deposito deposito1 = new Deposito();
        Deposito deposito2 = new Deposito();

        VagonCarga vagonCarga1 = new VagonCarga( 2500 );
        VagonCarga vagonCarga2 = new VagonCarga( 1000 );

        VagonPasajero vagonPasajeros1 = new VagonPasajero( 12, 3 );
        VagonPasajero vagonPasajeros2 = new VagonPasajero( 3, 1 );
        VagonPasajero vagonPasajeros3 = new VagonPasajero( 2, 1 );

        vagonPasajeros1.nombreVagon="VP1";
        vagonPasajeros2.nombreVagon="VP2";
        vagonPasajeros3.nombreVagon="VP3";
        vagonCarga1.nombreVagon="VC1";
        vagonCarga2.nombreVagon="VC2";

        Locomotora locomotora1 = new Locomotora( 2000, 10000, 5000 );
        Locomotora locomotora2 = new Locomotora( 1000, 5000, 3000 );
        Locomotora locomotora3 = new Locomotora( 1000, 4000, 1000 );
        Locomotora locomotora4 = new Locomotora( 200, 15000, 500);
        LocomotoraSuelta locomotora1Suelta= new LocomotoraSuelta();
        locomotora1Suelta.setPesoLoco(200);
        locomotora1Suelta.setPesoMaxArrastre(15000);
        locomotora1Suelta.setVelMax( 500 );
        locomotora1Suelta.arrastreUtil();


        List<Vagon> vagonesF1 = new ArrayList<>();
        vagonesF1.add( vagonPasajeros1 );
        vagonesF1.add( vagonPasajeros2 );
        vagonesF1.add( vagonPasajeros3 );

        List<Vagon> vagonesF2 = new ArrayList<>();
        vagonesF2.add( vagonCarga1 );
        vagonesF2.add( vagonCarga2 );

        List<Vagon> vagonList=new ArrayList<>(  );
        vagonList.addAll(vagonesF1);
        vagonList.addAll(vagonesF2);

        List<Locomotora> locomotorasSuelta= new ArrayList<>();
        locomotorasSuelta.add(locomotora1);

        List<Locomotora>locomotorasF1=new ArrayList<>(  );
        locomotorasF1.add(locomotora1);

        List<Locomotora> locomotorasF2 = new ArrayList<>();
        //locomotorasF2.add( locomotora1 );
        locomotorasF2.add( locomotora2 );
        locomotorasF2.add( locomotora3 );

        Formacion formacion1A = new Formacion();
        Formacion formacion2B = new Formacion();

        formacion1A.setVagonesyLoco( vagonesF1, locomotorasF1 );
        formacion1A.getVagones();
        formacion1A.getLocomotoras();

        formacion2B.setVagonesyLoco( vagonesF2, locomotorasF2);

        List <Formacion>formacionList=new ArrayList<>();
        formacionList.add(formacion1A);
        formacionList.add( formacion2B );

        deposito1.setFormacion( formacionList);

        System.out.println( vagonPasajeros1.cantPasajeros() + " ♥ Cantpasajeros vagon 1" );
        System.out.println( vagonPasajeros2.cantPasajeros() + " ♥ Cantpasajeros vagon 2" );
        System.out.println( formacion1A.totalPasajerosFormacion( ) + " ♥ Cantpasajeros Formacion1" );
        System.out.println( vagonPasajeros1.pesoMaximo() + " ♥ Peso max V1" );
        System.out.println( vagonPasajeros2.pesoMaximo() + " ♥ Peso max V2" );
        System.out.println( vagonPasajeros3.pesoMaximo() + " ♥ Peso max V3" );
        System.out.println( vagonCarga1.pesoMaximo() );
        System.out.println( vagonCarga2.pesoMaximo() );
        System.out.println( formacion1A.cantVagonLiviano() + " ♥ Cant vagones livianos pasajeros" );
        System.out.println( formacion2B.cantVagonLiviano( ) + " ♥ Cant vagones livianos carga" );
        System.out.println( formacion2B.velMaxFormacion( ) +" ♥ velmax locof2");
        System.out.println( formacion2B.esEficiente()+ " ♥ es eficiente formacion2?" );
        System.out.println( formacion1A.esEficiente( ) + " ♥ es eficiente formacion1?" );
        System.out.println( formacion2B.puedeMoverseF( )+ " ♥ puede moverse formacion2?");
        System.out.println( formacion1A.puedeMoverseF( )+ " ♥ puede moverse formacion1?");

        //System.out.println(deposito1.listaVagonPesado(vagonesF1,vagonesF2));
        //System.out.println( formacion1A.vagonPesado( vagonesF1).nombreVagon()+ " ♥ vagon pesado F1");
        //System.out.println( formacion2B.vagonPesado( vagonesF2 ).nombreVagon()+ " ♥ vagon pesado F2");
        //System.out.println( deposito1.vagonPesadoFormaciones(vagonList));
        //deposito1.setLocomotorasSuelta( locomotora1Suelta );
        System.out.println( deposito1.formacionCompleta( formacion1A) );
        System.out.println( deposito1.necesitaConductor(formacion2B)+ " Necesita conductor");
        //locomotora1Suelta.nombre("LocoSuelta1 ");
        deposito1.agregarFormacion( formacion1A );
        //deposito1.nuevaLocoSuelta( locomotora1Suelta );
        formacion1A.setLocomotorasSuelta(locomotora1Suelta );
        //formacion1A.getLocomotorasSuelta();
        //formacion2B.agregarLocoSuelta( locomotora1Suelta );
        System.out.println(formacion1A.kilosEmpuje( )+" ♥ kilos de empuje F1");
        System.out.println( formacion2B.kilosEmpuje() +" ♥ kilos de empuje F2" );
        //System.out.println( formacion2B.nuevaLocoSuelta( locomotora1Suelta )+"  nueva loco funciona f2" );
        //System.out.println( formacion1A.nuevaLocoSuelta(  locomotora1Suelta ) );
        System.out.println( deposito1.formacionPuedeMoverse(formacion1A )+ " se mueve f1" );
        System.out.println( deposito1.formacionPuedeMoverse( formacion2B));
        System.out.println( locomotora1Suelta.arrastreUtil()+" Arrastre LocoSuelta" );
       // System.out.println( deposito1.agregarLocomotoraAFormacion(formacion2B) );
        //System.out.println( formacion1A.sirveLocoSuelta( locomotora1Suelta ) );

        deposito1.agregarFormacion( formacion1A );
        //System.out.println( deposito1.agregarLocomotora(formacion1A));
        System.out.println( deposito1.formacionPuedeMoverse( formacion1A ) );
    }}
