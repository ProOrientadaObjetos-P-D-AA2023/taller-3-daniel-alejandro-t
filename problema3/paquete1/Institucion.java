package problema3.paquete1;

public class Institucion {
    String nombre, tipoInstitucion;
    float gastoProyectadoPorEstudiante, presupuesto;
    int numeroEstudiantes, numeroDocentes, numeroSedes;

    // Constructor
    public Institucion(String nombre, String tipoInstitucion, float gastoProyectadoPorEstudiante, float presupuesto, int numeroEstudiantes, int numeroDocentes, int numeroSedes) {
        this.nombre = nombre;
        this.tipoInstitucion = tipoInstitucion;
        this.gastoProyectadoPorEstudiante = gastoProyectadoPorEstudiante;
        this.presupuesto = presupuesto;
        this.numeroEstudiantes = numeroEstudiantes;
        this.numeroDocentes = numeroDocentes;
        this.numeroSedes = numeroSedes;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public String getTipoInstitucion() {
        return tipoInstitucion;
    }

    public float getGastoProyectadoPorEstudiante() {
        return gastoProyectadoPorEstudiante;
    }

    public float getPresupuesto() {
        return presupuesto;
    }

    public int getNumeroEstudiantes() {
        return numeroEstudiantes;
    }

    public int getNumeroDocentes() {
        return numeroDocentes;
    }

    public int getNumeroSedes() {
        return numeroSedes;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipoInstitucion(String tipoInstitucion) {
        this.tipoInstitucion = tipoInstitucion;
    }

    public void setGastoProyectadoPorEstudiante(float gastoProyectadoPorEstudiante) {
        this.gastoProyectadoPorEstudiante = gastoProyectadoPorEstudiante;
    }

    public void setPresupuesto() {
        this.presupuesto = numeroEstudiantes * gastoProyectadoPorEstudiante;
    }

    public void setNumeroEstudiantes(int numeroEstudiantes) {
        this.numeroEstudiantes = numeroEstudiantes;
    }

    public void setNumeroDocentes(int numeroDocentes) {
        this.numeroDocentes = numeroDocentes;
    }

    public void setNumeroSedes(int numeroSedes) {
        this.numeroSedes = numeroSedes;
    }

    // Métodos
    public float calcularPresupuestoPorEstudiante() {
        return presupuesto / numeroEstudiantes;
    }
}
