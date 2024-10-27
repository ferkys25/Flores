public class Plantas {
    String tipo;
    String nombre;
    String color;
    int cantidad;


    public String clasificacion(){
        StringBuilder sb = new StringBuilder();
        sb.append("El tipo es: " + this.tipo + "\nSu nombre es: " + this.nombre);
        sb.append("\nEl color es: " + this.color + "\nLa cantidad en stock es: " + this.cantidad);
        return sb.toString();
    }

    public void otrometodo(){
        System.out.println("El tipo es: " + this.tipo);
        System.out.println("Su nombre es: " + this.nombre);
        System.out.println("El color es: " + this.color);
        System.out.println("La cantidad en stock es: " + this.cantidad);
    }
}