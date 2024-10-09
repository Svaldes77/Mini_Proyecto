public abstract class Rango {
    int nivel;
    
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

