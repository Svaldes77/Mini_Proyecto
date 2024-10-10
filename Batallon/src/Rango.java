public abstract class Rango {
    protected int nivel;
    
    public Rango(int nivel) {
        this.nivel = nivel;
    }

    //public abstract void realizarAccion();

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    abstract void realizarAccion();
}



