public class Singleton {
    private int numeroAleatorio;
    private int numeroPropuesto;
    private int intentosMax;
    private int contadorIntentos;
    private int puntuacion;
    private String alias;
    private int rondaPartida;
    private int rondaActual;
    private int fallos;

    private static Singleton instance = null;
    private Singleton(){

    }
    public static Singleton getInstance(){
        if (instance==null){
            instance = new Singleton();
        }
        return instance;
    }
    public void setAlias(String alias){
        this.alias=alias;
    }
    public String getAlias() {
        return alias;
    }

    public int getNumeroAleatorio() {
        return numeroAleatorio;
    }

    public void setNumeroAleatorio(int numeroAleatorio) {
        this.numeroAleatorio = numeroAleatorio;
    }

    public int getNumeroPropuesto() {
        return numeroPropuesto;
    }

    public void setNumeroPropuesto(int numeroPropuesto) {
        this.numeroPropuesto = numeroPropuesto;
    }

    public int getIntentosMax() {
        return intentosMax;
    }

    public void setIntentosMax(int intentosMax) {
        this.intentosMax = intentosMax;
    }

    public int getContadorIntentos() {
        return contadorIntentos;
    }

    public void setContadorIntentos(int contadorIntentos) {
        this.contadorIntentos = contadorIntentos;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public int getRondaPartida() {
        return rondaPartida;
    }

    public void setRondaPartida(int rondaPartida) {
        this.rondaPartida = rondaPartida;
    }

    public int getRondaActual() {
        return rondaActual;
    }

    public void setRondaActual(int rondaActual) {
        this.rondaActual = rondaActual;
    }

    public int getFallos() {
        return fallos;
    }

    public void setFallos(int fallos) {
        this.fallos = fallos;
    }

    public static void setInstance(Singleton instance) {
        Singleton.instance = instance;
    }
}
