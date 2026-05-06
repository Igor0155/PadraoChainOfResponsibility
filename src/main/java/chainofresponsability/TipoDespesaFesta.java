package chainofresponsability;

public class TipoDespesaFesta implements TipoDespesa {
    private static TipoDespesaFesta instance = new TipoDespesaFesta();

    private TipoDespesaFesta() {
    };

    public static TipoDespesaFesta getTipoDespesaFesta() {
        return instance;
    }
}