package chainofresponsability;

public class TipoDespesaMaterialEscritorio implements TipoDespesa {
    private static TipoDespesaMaterialEscritorio instance = new TipoDespesaMaterialEscritorio();

    private TipoDespesaMaterialEscritorio() {
    };

    public static TipoDespesaMaterialEscritorio getTipoDespesaMaterialEscritorio() {
        return instance;
    }
}