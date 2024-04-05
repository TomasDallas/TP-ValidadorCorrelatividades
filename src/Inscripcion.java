import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Inscripcion {
    public Alumno alumno;
    public List<Materia> materias;

    public boolean aprobada() {
        List<Materia> aprob = new ArrayList<Materia>();
        aprob = this.materias.stream().filter(x-> this.alumno.cumpleCorrelativas(x)).toList();
        if (this.materias.containsAll(aprob)){
            System.out.printf("incsripcion aprobada");
            return true;
        }
        System.out.printf("inscripcion rechazada");
        return false;
    }
}
