package chainofresponsability;

import java.util.ArrayList;

public abstract class Aprovador {

    protected ArrayList listaDespesas = new ArrayList();
    private Aprovador aprovadorSuperior;

    public Aprovador getAprovadorSuperior() {
        return aprovadorSuperior;
    }

    public void setAprovadorSuperior(Aprovador aprovadorSuperior) {
        this.aprovadorSuperior = aprovadorSuperior;
    }

    public abstract String getCargo();

    public String aprovarDespesa(Despesa despesa) {

        if (listaDespesas.contains(despesa.getTipoDespesa())) {
            return getCargo();
        } else {

            if (aprovadorSuperior != null) {
                return aprovadorSuperior.aprovarDespesa(despesa);
            } else {
                return "Sem aprovação";
            }
        }
    }
}