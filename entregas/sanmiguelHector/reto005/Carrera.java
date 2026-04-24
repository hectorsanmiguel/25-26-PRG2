class Carrera {
    private final int NUMERO_JUGADORES = 2;
    private Caballo[] caballos;
    private Pista pista;
    private Turno turno;

    public Carrera() {
        pista = new Pista(NUMERO_JUGADORES);
        turno = new Turno();
        caballos = new Caballo[NUMERO_JUGADORES];
        for (int i = 0; i < NUMERO_JUGADORES; i++) {
            caballos[i] = new Caballo(i);
            pista.meter(caballos[i]);
        }

    }

    public void jugar() {
        do {
            pista.mostrar();
            for (int i = 0; i < NUMERO_JUGADORES; i++) {
                pista.meter(caballos[i]);
                turno.cambiar(i);
            }

        } while (!pista.hayGanador());
    }
}