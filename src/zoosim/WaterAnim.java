/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 *
 * @author micha
 */
public class WaterAnim extends Animal implements ISwimmable{
    private boolean canBreathe;
    
    /**
     * Water animal constructor
     * @param age
     * @param speed
     * @param name
     * @param species
     * @param sex
     * @param size
     * @param sound
     * @param x
     * @param y
     * @param canBreathe
     */
    public WaterAnim(int age, int speed, String name, String species, String sex, String size, String sound, int x, int y, boolean canBreathe){
        super(age, speed, name, species, sex, size, sound, x, y);
        this.canBreathe = canBreathe;
    }
    
    /**
     * Determines if a water animal can surface or not
     * @return
     */
    @Override
    public boolean canSurface(){
        return canBreathe;
    }

    /**
     * @return the canBreathe
     */
    public boolean getCanBreathe() {
        return canBreathe;
    }

    /**
     * @param canBreathe the canBreathe to set
     */
    public void setCanBreathe(boolean canBreathe) {
        this.canBreathe = canBreathe;
    }
}
