public class FuncionarioDiretor extends Funcionario {

    public FuncionarioDiretor(Funcionario superior) {
        listaSolicitacoes.add(TipoSolicitacaoReembolso.getTipoSolicitacaoReembolso());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Diretor";
    }

}
