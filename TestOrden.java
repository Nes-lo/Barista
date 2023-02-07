import java.util.ArrayList;
public class TestOrden {
    public static void main(String[] args) {
    
        // Elementos del menú
        //Crea 4 variables de artículo de tipo Artículo e instancia cada una como un objeto Artículo. Nómbralos artículo1, artículo2, etc.
       //Establece el precio y el nombre de cada uno: "moka", "latte", "café de goteo" y "capuchino" (¡el precio lo decides tú!)
         
         ArrayList<Articulo> articulos=new ArrayList<>();
         articulos.add(new Articulo("moka",3.99));
         articulos.add(new Articulo("latte",6.49));
         articulos.add(new Articulo("Cafe de goteo",8.99));
         articulos.add(new Articulo("capuchino",5.99));        
       
        //Crea 2 pedidos para invitados no especificados (sin especificar un nombre);
        ArrayList<Orden> pedidos=new ArrayList<>();
        
        pedidos.add(new Orden());
        pedidos.add(new Orden());
       
       //Crea 3 pedidos usando el constructor sobrecargado para darle a cada uno un nombre para el pedido.

       pedidos.add(new Orden("Cindhuri"));
       pedidos.add(new Orden("Jimmy"));
       pedidos.add(new Orden("Noah"));     

       //Agrega al menos 2 artículos a cada uno de los pedidos usando el método addItem que escribiste. 
       //Por ejemplo, para agregar el artículo1 al pedido3, necesitarías llamar al método addItem desde 
       //la instancia del pedido3 de la siguiente manera: pedido3.addArtículo(artículo1);

       pedidos.get(0).addItem(articulos.get(3));
       pedidos.get(0).addItem(articulos.get(2));
       pedidos.get(0).addItem(articulos.get(0));

       pedidos.get(1).addItem(articulos.get(2));
       pedidos.get(1).addItem(articulos.get(1));

       pedidos.get(2).addItem(articulos.get(2));
       pedidos.get(2).addItem(articulos.get(3));

       pedidos.get(3).addItem(articulos.get(3));
       pedidos.get(3).addItem(articulos.get(2));
       pedidos.get(3).addItem(articulos.get(1));

       pedidos.get(4).addItem(articulos.get(3));
       pedidos.get(4).addItem(articulos.get(1));
       pedidos.get(4).addItem(articulos.get(2));
       pedidos.get(4).addItem(articulos.get(0));

      //Prueba los resultados y el método display llamando al método display en todos tus pedidos, así: pedido3.display();

        pedidos.stream().forEach(Orden::display);
        System.out.println("------------------------------------------------------------------------------");

      //Prueba la funcionalidad de getStatusMessage configurando algunos pedidos para que estén listos e
      // imprimiendo los mensajes para cada pedido. Por ejemplo: pedido2.setReady(true); System.out.println(pedido2.getStatusMessage());

      pedidos.get(0).setListo(true);
      pedidos.get(3).setListo(true);
      
      pedidos.stream().map(Orden::getStatusMessage).forEach(System.out::println);   
      System.out.println("------------------------------------------------------------------------------"); 
      
    }
}
