package inheritancebr;

public class Balok extends BangunRuang {
    float p;
    float l;
    float t;
    
    float volume(){
        float volume = (float) (p * l * t);
        System.out.println("Volume balok: " + volume);
        return volume;
    }
    
    float luasPermukaan(){
        float luasPermukaan = (float) (2 * p * l + 2 * l * t + 2 * p * t);
        System.out.println("luasPermukaan balok: " + luasPermukaan);
        return luasPermukaan;
    } 
}
