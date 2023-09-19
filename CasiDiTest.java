public class MathUtilsTest {

    @Test
    void testPositiveInput() {
        // Classe di equivalenza: Numeri double positivi
        // Casi di test con valori positivi
        assertEquals(2.0, MathUtils.sqrt(4.0), 0.001);
        assertEquals(3.0, MathUtils.sqrt(9.0), 0.001);
    }

    @Test
    void testZeroInput() {
        // Classe di equivalenza: Zero
        // Caso di test con input zero
        assertEquals(0.0, MathUtils.sqrt(0.0), 0.001);
    }

    @Test
    void testNegativeInput() {
        // Classe di equivalenza: Numeri double negativi
        // Caso di test con input negativo, dovrebbe lanciare un'eccezione
        assertThrows(IllegalArgumentException.class, () -> {
            MathUtils.sqrt(-4.0);
        });
    }

    @Test
    void testNaNInput() {
        // Classe di equivalenza: NaN (Not-a-Number)
        // Caso di test con input NaN, dovrebbe restituire NaN
        assertTrue(Double.isNaN(MathUtils.sqrt(Double.NaN)));
    }

    @Test
    void testInfinityInput() {
        // Classe di equivalenza: Infinito positivo
        // Caso di test con input infinito positivo, dovrebbe restituire infinito positivo
        assertEquals(Double.POSITIVE_INFINITY, MathUtils.sqrt(Double.POSITIVE_INFINITY), 0.001);
    }
}