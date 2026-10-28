public class TipoSolicitacaoTrocaQuarto implements TipoSolicitacao {

    private static TipoSolicitacaoTrocaQuarto tipoSolicitacaoTrocaQuarto = new TipoSolicitacaoTrocaQuarto();

    private TipoSolicitacaoTrocaQuarto() {};

    public static TipoSolicitacaoTrocaQuarto getTipoSolicitacaoTrocaQuarto() {
        return tipoSolicitacaoTrocaQuarto;
    }
}
