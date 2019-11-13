import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LocomotoraTest {
    private Locomotora locomotora;

    @BeforeEach
    void setUp() {
        locomotora = new Locomotora( 1000, 5000, 500 );
    }

    @Test
    void locomotorapesoMaxArrastreesEfi(){
        assertTrue( locomotora.pesoMaxArrastreEfi() );
    }}
