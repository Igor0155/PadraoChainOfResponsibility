package chainofresponsability;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AprovadorTest {

    Aprovador supervisor;
    Aprovador gerente;
    Aprovador diretor;
    Aprovador ceo;

    @BeforeEach
    void setUp() {
        ceo = new AprovadorCEO(null);
        diretor = new AprovadorDiretor(ceo);
        gerente = new AprovadorGerente(diretor);
        supervisor = new AprovadorSupervisor(gerente);
    }

    @Test
    void deveRetornarSupervisorParaAprovarMaterialEscritorio() {
        Despesa despesa = new Despesa(TipoDespesaMaterialEscritorio.getTipoDespesaMaterialEscritorio());
        assertEquals("Supervisor", supervisor.aprovarDespesa(despesa));
    }

    @Test
    void deveRetornarGerenteParaAprovarViagemNacional() {
        Despesa despesa = new Despesa(TipoDespesaViagemNacional.getTipoDespesaViagemNacional());
        assertEquals("Gerente", supervisor.aprovarDespesa(despesa));
    }

    @Test
    void deveRetornarDiretorParaAprovarViagemInternacional() {
        Despesa despesa = new Despesa(TipoDespesaViagemInternacional.getTipoDespesaViagemInternacional());
        assertEquals("Diretor", supervisor.aprovarDespesa(despesa));
    }

    @Test
    void deveRetornarCEOParaAprovarAquisicaoEmpresa() {
        Despesa despesa = new Despesa(TipoDespesaAquisicaoEmpresa.getTipoDespesaAquisicaoEmpresa());
        assertEquals("CEO", supervisor.aprovarDespesa(despesa));
    }

    @Test
    void deveRetornarSemAprovacaoParaFesta() {
        Despesa despesa = new Despesa(TipoDespesaFesta.getTipoDespesaFesta());
        assertEquals("Sem aprovação", supervisor.aprovarDespesa(despesa));
    }
}