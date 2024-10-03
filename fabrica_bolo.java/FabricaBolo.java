public abstract class FabricaBolo {
    public void fazerBolo() {
        Bolo bolo = criarBolo();
        bolo.preparar();
    }

    public abstract Bolo criarBolo();
}
