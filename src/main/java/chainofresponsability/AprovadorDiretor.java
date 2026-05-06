package chainofresponsability;

public class AprovadorDiretor extends Aprovador {

    public AprovadorDiretor(Aprovador superior) {
        listaDespesas.add(TipoDespesaViagemInternacional.getTipoDespesaViagemInternacional());
        setAprovadorSuperior(superior);
    }

    public String getCargo() {
        return "Diretor";
    }
}