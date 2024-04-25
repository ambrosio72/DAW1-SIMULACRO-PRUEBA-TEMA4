package zoo;

/**
 * Clase Gallina del Zoológico
 * @author Beep Montilla
 * @since 25/04/2024
 * @version 1.0
 */
public class Gallina extends Ave {
 
    private String cacareo = "GRRRRR";
    
    /**
     * Constructor sin parámetros
     */
    public Gallina () {}
    
    /**
     * Constructor con cuatro parámetros
     * @param habitat Ecosistema donde vive el animal
     * @param comida Alimento que consume
     * @param longevidad Cuánto vive expresado en años
     * @param periodoIncubacion Días de incubación
     */
    public Gallina (Habitat habitat, String comida, int longevidad, int periodoIncubacion) {
        super(habitat, comida, longevidad, periodoIncubacion);
    }
    
    /**
     * Método para establecer el mensaje de cacareo
     * @param cacareo Sonido que emite el animal
     */
    public void setCacareo (String cacareo) { this.cacareo = cacareo; }
    
    /**
     * Método para obtener el mensaje de cacareo
     * @return String con el mensaje de cacareo
     */
    public String getCacareo () { return cacareo; }
    
    /**
     * Método que no devuelve nada y muestra el mensaje de cacareo
     */
    public void rugir () { System.out.println(cacareo); }
    
    /**
     * Método que no devuelve nada y muestra un mensaje con el tipo de comida
     */
    public void comer () { System.out.println("Estoy comiendo " + comida); }
    
    /**
     * Método que no devuelve nada y muestra un mensaje
     */
    public void desplazar () { System.out.println("Estoy volando con mucha dificultad"); }
}
