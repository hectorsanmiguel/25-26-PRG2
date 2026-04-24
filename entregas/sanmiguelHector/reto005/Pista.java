class Pista {

    int[][] pista;
    private int numeroJugadores;
    private int tamañoPista;

    public Pista(int numeroJugadores, int tamañoPista) {

        numeroJugadores = this.numeroJugadores;
        tamañoPista = this.tamañoPista;

        pista = new int[tamañoPista][numeroJugadores];
        for (int i = 0; i < numeroJugadores; i++){
            pista[0][i]= i;
        }
    }
    
    public void mostrar() {
        for(int i = 0; i < numeroJugadores; i++){
            for(int j = 0; j < tamañoPista; j++){
                System.out.print(pista[i][j]);
            }
            System.out.println();
        }
    }

    public void meter(Caballo caballo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'meter'");
    }


    public boolean hayGanadores() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'hayGanadores'");
    }

    public void mostrarEstadoFinal() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrarEstadoFinal'");
    }

    public void mover(Caballo caballo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mover'");
    }
    
}