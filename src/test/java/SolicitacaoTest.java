import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolicitacaoTest {

    FuncionarioDiretor diretor;
    FuncionarioGerente gerente;
    FuncionarioSupervisor supervisor;
    FuncionarioRecepcionista recepcionista;

    @BeforeEach
    void setUp() {
        diretor = new FuncionarioDiretor(null);
        gerente = new FuncionarioGerente(diretor);
        supervisor = new FuncionarioSupervisor(gerente);
        recepcionista = new FuncionarioRecepcionista(supervisor);
    }

    @Test
    void deveRetornarRecepcionistaParaAutorizacaoToalha() {
        assertEquals("Recepcionista", recepcionista.autorizarSolicitacao(new Solicitacao(TipoSolicitacaoToalha.getTipoSolicitacaoToalha())));
    }

    @Test
    void deveRetornarSupervisorParaAutorizacaoTrocaQuarto() {
        assertEquals("Supervisor", recepcionista.autorizarSolicitacao(new Solicitacao(TipoSolicitacaoTrocaQuarto.getTipoSolicitacaoTrocaQuarto())));
    }

    @Test
    void deveRetornarGerenteParaAutorizacaoUpgrade() {
        assertEquals("Gerente", recepcionista.autorizarSolicitacao(new Solicitacao(TipoSolicitacaoUpgrade.getTipoSolicitacaoUpgrade())));
    }

    @Test
    void deveRetornarDiretorParaAutorizacaoReembolso() {
        assertEquals("Diretor", recepcionista.autorizarSolicitacao(new Solicitacao(TipoSolicitacaoReembolso.getTipoSolicitacaoReembolso())));
    }

    @Test
    void deveRetornarSemAutorizacaoParaAutorizacaoVendaHotel() {
        assertEquals("Sem autorização", recepcionista.autorizarSolicitacao(new Solicitacao(TipoSolicitacaoVendaHotel.getTipoSolicitacaoVendaHotel())));
    }

}
