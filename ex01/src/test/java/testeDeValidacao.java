import org.junit.Test;
import static junit.framework.TestCase.assertEquals;


public class testeDeValidacao {

    @Test
    public void Complexo() {
        Complexo aux2 = new Complexo(2,3);
        Complexo aux3 = new Complexo(6,8);

        aux2.soma(aux3);
        assertEquals("Falha no exercício: ","(8,11)",aux2.toString());
        aux3.subtrai(aux2);
        assertEquals("Falha no exercício: ","(2,3)",aux3.toString());
    }

}
