public class FuncionarioSupervisor extends Funcionario {

    public FuncionarioSupervisor(Funcionario superior) {
        listaSolicitacoes.add(TipoSolicitacaoTrocaQuarto.getTipoSolicitacaoTrocaQuarto());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Supervisor";
    }

}
