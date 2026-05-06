package chainofresponsability;

public class TipoDespesaAquisicaoEmpresa implements TipoDespesa {
    private static TipoDespesaAquisicaoEmpresa instance = new TipoDespesaAquisicaoEmpresa();

    private TipoDespesaAquisicaoEmpresa() {
    };

    public static TipoDespesaAquisicaoEmpresa getTipoDespesaAquisicaoEmpresa() {
        return instance;
    }
}