package inheritancebr;

public class Bola extends BangunRuang {
    
    float r;
    
     float volume(){
        float volume = (float) (4/3 * Math.PI * r * r);
        System.out.println("Volume Bola: " + volume);
        return volume;
    }
    
    float luasPermukaan(){
        float luasPermukaan = (float) (4 * Math.PI * r * r);
        System.out.println("Keliling Lingkaran: " + luasPermukaan);
        return luasPermukaan;
    }
    
}
