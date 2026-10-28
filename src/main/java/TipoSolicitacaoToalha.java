public class TipoSolicitacaoToalha implements TipoSolicitacao {

    private static TipoSolicitacaoToalha tipoSolicitacaoToalha = new TipoSolicitacaoToalha();

    private TipoSolicitacaoToalha() {};

    public static TipoSolicitacaoToalha getTipoSolicitacaoToalha() {
        return tipoSolicitacaoToalha;
    }
}
