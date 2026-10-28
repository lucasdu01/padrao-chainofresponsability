public class TipoSolicitacaoUpgrade implements TipoSolicitacao {

    private static TipoSolicitacaoUpgrade tipoSolicitacaoUpgrade = new TipoSolicitacaoUpgrade();

    private TipoSolicitacaoUpgrade() {};

    public static TipoSolicitacaoUpgrade getTipoSolicitacaoUpgrade() {
        return tipoSolicitacaoUpgrade;
    }
}
