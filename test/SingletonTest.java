import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class SingletonTest {

    @Test
    @DisplayName("Singleton_Test")
    void funcionSingleton(){
        //Record instancia1 = new Record();
        Singleton instancia1 = Singleton.getInstance();
        Singleton instancia2 = Singleton.getInstance();

        assertEquals(instancia1, instancia2);
    }
}
