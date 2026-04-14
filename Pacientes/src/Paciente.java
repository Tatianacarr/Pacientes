public class Paciente {
    private double costoConsulta;
    private int numeroConsultas;
    private int prioridad;
    public String nombre;
    public String identificacion;
    public String seguro;
    public int edad;
    public Paciente(String nombre,String identificacion,String seguro,double costoConsulta,int numeroConsultas,int prioridad,int edad){
        this.nombre=nombre;
        this.identificacion=identificacion;
        this.seguro=seguro;
        this.edad=edad;
        this.numeroConsultas=numeroConsultas;
        this.prioridad=prioridad;
   }
     public void validar(){
        if (edad<=0)
            edad=0;
        if (costoConsulta<=0)
            costoConsulta=0;
        if (prioridad<1||prioridad>5)
            prioridad=1;
        }
        public double calcular(){
        double total=costoConsulta*numeroConsultas;
        if (seguro.equals("Basico"))
            total *=0.9;
        else if (seguro.equals("Premiun"))
            total *=8;
        return total;

        }
        public String clasificacion(){
        if (prioridad>=4)
            return "Atenncion inmediata requerida";
        else if (prioridad>=2)
            return "Prioridad media";
        else
            return "Control regular";

        }
    public String mensaje() {
        if (prioridad >= 4)
            return "Atencion inmediata requerida";
        else if (prioridad >= 2)
            return "Seguimiento necesario";
        else
            return "Control regular";
    }
        public void mostrar(){
        System.out.println("-------Informe------");
        System.out.println("Nombre:"+nombre);
        System.out.println("Cedula:"+identificacion);
        System.out.println("Seguro:"+seguro);
        System.out.println("Edad:"+edad);
        System.out.println("Total:"+calcular());
        System.out.println("Clasificacion:"+clasificacion());
        System.out.println("Mensaje:"+mensaje());

    }


}

