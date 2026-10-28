public class TipoSolicitacaoVendaHotel implements TipoSolicitacao {

    private static TipoSolicitacaoVendaHotel tipoSolicitacaoVendaHotel = new TipoSolicitacaoVendaHotel();

    private TipoSolicitacaoVendaHotel() {};

    public static TipoSolicitacaoVendaHotel getTipoSolicitacaoVendaHotel() {
        return tipoSolicitacaoVendaHotel;
    }
}
