package chainofresponsability;

public class AprovadorCEO extends Aprovador {

    public AprovadorCEO(Aprovador superior) {
        listaDespesas.add(TipoDespesaAquisicaoEmpresa.getTipoDespesaAquisicaoEmpresa());
        setAprovadorSuperior(superior);
    }

    public String getCargo() {
        return "CEO";
    }
}