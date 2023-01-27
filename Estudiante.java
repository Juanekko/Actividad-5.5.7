public class Estudiante implements Comparable<Estudiante>{
    private String nombre;
    private int edad;
    private int altura;
    public Estudiante(String nombre,int edad, int altura){
        this.altura=altura;
        this.edad=edad;
        this.nombre=nombre;
    }
    public int compareTo(Estudiante e){
        return (int) (this.altura - e.altura);
    }

    @Override
    public String toString() {
        return String.format("(%s, %d)",nombre,altura,edad);
    }
}
