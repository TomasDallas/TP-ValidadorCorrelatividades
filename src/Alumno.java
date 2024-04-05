import java.util.HashSet;
import java.util.List;

public class Alumno {
    public String legajo;
    public List<Materia> aprobadas;
    public String nombre;

    public boolean cumpleCorrelativas(Materia materia){
        if(this.aprobadas.containsAll(materia.correlativas) ) {
            System.out.printf("cumple correlativas");
            return true;
        }
        return false;

    }
}
