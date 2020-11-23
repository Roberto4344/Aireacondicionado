/**
 * Esta clase representa un aire acondicionado
 * 
 * RobertoAbad
 */

public class Aire {
    
    private double temperatura;
    
    
    /**
     * Aqui creamos el aire acondicionado
     */
    public Aire(){
        temperatura = 15.0;
    }
    
    /**
     * Este metodo nos permite saber la temperatura
     */
    public double getTemperatura(){
        return temperatura;
    }
    
    /**
     * Este metodo nos permite subir la temperatura
     */
    public void subirTemperatura(){
        temperatura = temperatura + 5.0;
    }
    
    /**
     * Este metodo nos permite bajar la temperatura
     */
    public void bajarTemperatura(){
        temperatura = temperatura - 5.0;
    }
    
}   