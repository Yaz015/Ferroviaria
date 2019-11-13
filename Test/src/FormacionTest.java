import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

class FormacionTest {
    private List<Locomotora> locomotora;
    private Formacion formacion;

    @BeforeEach
    void setUp(){
        formacion=new Formacion();
        locomotora= Collections.singletonList(
                new Locomotora( 1000, 20000, 500 ) );
    }

    @Test
    //void locomotorapesoMaxArrastre(){ assertTrue( locomotora. );}
    void locomotoraEseficiente(){
        assertTrue(formacion.esEficiente());}
}
