public class SistemaBotanico{
    public static void main(String[] args){
        Plantas rosa = new Plantas();
        rosa.tipo = "Familia rosaceae";
        rosa.nombre = "Rosa";
        rosa.color = "Rojo";
        rosa.cantidad = 500;
        System.out.println(" ");
        System.out.println(rosa.clasificacion());

        Plantas pino = new Plantas();
        pino.tipo = "Arbol";
        pino.nombre = "Pino";
        pino.color = "Verde";
        pino.cantidad = 200;
        System.out.println(" ");
        System.out.println(pino.clasificacion());

        Plantas claveles = new Plantas();
        claveles.tipo = "Caryophyllaceae";
        claveles.nombre = "Claveles";
        claveles.color = "Blanco";
        claveles.cantidad = 120;
        System.out.println(" ");
        claveles.otrometodo();

        Plantas orquideas = new Plantas();
        orquideas.tipo = "monocotiledóneas";
        orquideas.nombre = "Orquideas";
        orquideas.color = "Morado";
        orquideas.cantidad = 1000000000;
        System.out.println(" ");
        orquideas.otrometodo();

    }



}