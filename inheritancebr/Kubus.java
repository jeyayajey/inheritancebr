package inheritancebr;

public class Kubus extends BangunRuang {
   float s;
    
     float volume(){
        float volume = (float) (s * s * s);
        System.out.println("Volume kubus: " + volume);
        return volume;
    }
    
    float luasPermukaan(){
        float luasPermukaan = (float) (6 * s * s);
        System.out.println("luasPermukaan kubus: " + luasPermukaan);
        return luasPermukaan;
    } 
      
}
