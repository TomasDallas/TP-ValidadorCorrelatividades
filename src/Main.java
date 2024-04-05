import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        List<Materia> lista = new ArrayList<Materia>();
        Materia syo = new Materia();
        syo.nombre="Sistemas y organizaciones";
        syo.correlativas=lista;

        Materia discreta = new Materia();
        discreta.nombre="Matematica Discreta";
        discreta.correlativas=lista;

        lista.add(syo);
        lista.add(discreta);
        Materia pdep = new Materia();
        pdep.nombre="Paradigmas de Programacion";
        pdep.correlativas=lista;

        lista.remove(syo);
        lista.remove(discreta);
        lista.add(pdep);
        Materia dds = new Materia();
        dds.nombre="Diseño de Sistemas";
        dds.correlativas=lista;

        lista.remove(pdep);
        lista.add(syo);
        lista.add(discreta);

        Alumno pepe = new Alumno();
        pepe.nombre="pepe";
        pepe.legajo="1";
        pepe.aprobadas = lista;


        Alumno tito = new Alumno();
        pepe.nombre="tito";
        pepe.legajo="2";
        pepe.aprobadas = lista;

        lista.remove(syo);
        lista.remove(discreta);

        Alumno cacho = new Alumno();
        pepe.nombre="cacho";
        pepe.legajo="3";
        pepe.aprobadas = lista;


        lista.add(pdep);

        Inscripcion inscripcion1 = new Inscripcion();
        inscripcion1.alumno = pepe;
        inscripcion1.materias = lista;

        lista.add(dds);

        Inscripcion inscripcion2 = new Inscripcion();
        inscripcion2.alumno = tito;
        inscripcion1.materias = lista;

        lista.remove(pdep);
        lista.remove(dds);
        lista.add(syo);
        lista.add(discreta);

        Inscripcion inscripcion3 = new Inscripcion();
        inscripcion1.alumno = cacho;
        inscripcion1.materias = lista;


        inscripcion1.aprobada();
        inscripcion2.aprobada();
        inscripcion3.aprobada();

        System.out.printf("Hello and welcome!");
    }

}
