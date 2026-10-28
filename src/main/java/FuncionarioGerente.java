public class FuncionarioGerente extends Funcionario {

    public FuncionarioGerente(Funcionario superior) {
        listaSolicitacoes.add(TipoSolicitacaoUpgrade.getTipoSolicitacaoUpgrade());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Gerente";
    }

}
