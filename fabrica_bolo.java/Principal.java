public class Principal {
    public static void main(String[] args) {
        FabricaBolo fabricaChocolate = new FabricaBoloChocolate();
        fabricaChocolate.fazerBolo();

        FabricaBolo fabricaMorango = new FabricaBoloMorango();
        fabricaMorango.fazerBolo();

        FabricaBolo fabricaCenoura = new FabricaBoloCenoura();
        fabricaCenoura.fazerBolo();

        FabricaBolo fabricaAbacaxi = new FabricaBoloAbacaxi();
        fabricaAbacaxi.fazerBolo();

        System.out.println("\nDecorando o bolo:");

        Decoracao decorarChantilly = new DecorarChantilly();
        decorarChantilly.decorar();

        Decoracao decorarConfete = new DecorarConfete();
        decorarConfete.decorar();
    }
}

