import java.util.Arrays;

public class Main {
    public static void main(String[]arg){
        Estudiante[] estudiantes=new Estudiante[5];
        estudiantes[0]=new Estudiante("Patri",12,170);
        estudiantes[1]=new Estudiante("Manuel",43,173);
        estudiantes[2]=new Estudiante("Javier",72,189);
        estudiantes[3]=new Estudiante("Alicia",52,168);
        estudiantes[4]=new Estudiante("Alberto",35, 185);
        System.out.println("Antes "+Arrays.toString(estudiantes));
        Arrays.sort(estudiantes);
        System.out.println("Despues "+Arrays.toString(estudiantes));
    }
}
