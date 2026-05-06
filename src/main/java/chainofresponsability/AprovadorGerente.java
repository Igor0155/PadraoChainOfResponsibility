package chainofresponsability;

public class AprovadorGerente extends Aprovador {

    public AprovadorGerente(Aprovador superior) {
        listaDespesas.add(TipoDespesaViagemNacional.getTipoDespesaViagemNacional());
        setAprovadorSuperior(superior);
    }

    public String getCargo() {
        return "Gerente";
    }
}