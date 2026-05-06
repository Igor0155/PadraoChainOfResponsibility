package chainofresponsability;

public class TipoDespesaViagemNacional implements TipoDespesa {
    private static TipoDespesaViagemNacional instance = new TipoDespesaViagemNacional();

    private TipoDespesaViagemNacional() {
    };

    public static TipoDespesaViagemNacional getTipoDespesaViagemNacional() {
        return instance;
    }
}