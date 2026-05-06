package chainofresponsability;

public class AprovadorSupervisor extends Aprovador {

    public AprovadorSupervisor(Aprovador superior) {
        listaDespesas.add(TipoDespesaMaterialEscritorio.getTipoDespesaMaterialEscritorio());
        setAprovadorSuperior(superior);
    }

    public String getCargo() {
        return "Supervisor";
    }
}