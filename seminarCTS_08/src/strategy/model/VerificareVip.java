package strategy.model;

public class VerificareVip implements Strategy {
    @Override
    public void verificaSpectator(Spectator s) {
        System.out.println("Verificarea la vip pentru spectatorul "+ s.getNume());
    }
}
