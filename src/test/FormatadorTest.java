import org.junit.Test;
import exemplo.Formatador;
import static org.junit.Assert.assertEquals;

public class FormatadorTest {

    Formatador formatador = new Formatador();

    @Test
    public void deveFormatarNome() {
        String nomeEsperado = "JOCA";
        String nomeFormatado = formatador.formatarPalavra("jOcA");

        assertEquals(nomeFormatado, nomeEsperado);
    }
}
