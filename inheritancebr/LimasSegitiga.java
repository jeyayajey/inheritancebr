package inheritancebr;

public class LimasSegitiga extends BangunRuang {
    float a;
    float ts;
    float tl;
    
    float volume(){
        float volume = (float) (1/6 * a * ts * tl);
        System.out.println("Volume LimasSegitiga: " + volume);
        return volume;
    }
    
    float luasPermukaan(){
        float luasPermukaan = (float) (1/2 * a * ts) + (3 * 1/2 * a * tl);
        System.out.println("luasPermukaan LimasSegitiga: " + luasPermukaan);
        return luasPermukaan;
    } 
}
