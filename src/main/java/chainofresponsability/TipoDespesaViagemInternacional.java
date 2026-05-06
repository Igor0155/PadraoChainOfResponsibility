package chainofresponsability;

public class TipoDespesaViagemInternacional implements TipoDespesa {
    private static TipoDespesaViagemInternacional instance = new TipoDespesaViagemInternacional();

    private TipoDespesaViagemInternacional() {
    };

    public static TipoDespesaViagemInternacional getTipoDespesaViagemInternacional() {
        return instance;
    }
}