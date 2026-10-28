public class FuncionarioRecepcionista extends Funcionario {

    public FuncionarioRecepcionista(Funcionario superior) {
        listaSolicitacoes.add(TipoSolicitacaoToalha.getTipoSolicitacaoToalha());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Recepcionista";
    }

}
