class Estudiantes{
    //1. Atributos
    public int cedula;
    public String nombre;
    public int edad;


    //2.Método constructor (Permite inicializar los atributos)
    public Estudiantes (int cedula,String nombre, int edad) {//tipos de datos
//Parametro = atributo
        this.cedula = cedula;
        this.nombre = nombre;
        this.edad = edad;
    }
    // Método
    public void datos(){
        System.out.println("---------------------------------------" );
        System.out.println("El nombre del estudiante es " + nombre);
        System.out.println("la edad del estudiante es " + edad);
        System.out.println("la edad del estudiante es " + cedula);

    }
    public static void main(String[] args){ // MAIN
        System.out.println("\t\t\tEstudiantes EPN");
// Clase ----- nombre_objeto = método_constructor(dato1,dato2,dato3);
        Estudiantes estudiante_Desarrollo1 = new Estudiantes(1729273290,"David",20);
        estudiante_Desarrollo1.datos(); // llamar a la función

        Estudiantes estudiante_Desarrollo2 = new Estudiantes(1726523659,"Juan",21);
        estudiante_Desarrollo2.datos();
        System.out.println("---------------------------------------" );

    }

}