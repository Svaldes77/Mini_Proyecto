public abstract class Rango {
    private int nivel;
    
    public Rango(int nivel) {
        this.nivel = nivel;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    abstract void realizarAccion();
}

