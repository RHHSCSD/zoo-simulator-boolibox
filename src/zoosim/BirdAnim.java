/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 *
 * @author micha
 */
public class BirdAnim extends Animal implements IFlyable{
    private boolean canFly;
    private boolean currentlyFlying;
    
    public BirdAnim(int age, int speed, String name, String species, String sex, String size, String sound, int x, int y, boolean canFly){
        super(age, speed, name, species, sex, size, sound, x, y);
        this.canFly = canFly;
    }
    @Override
    public void fly(){
        if(canFly == true && currentlyFlying == false){
            System.out.println("Flying");
            setCurrentlyFlying(true);
        }
    }
    @Override
    public void land(){
        System.out.println("Landing");
        setCurrentlyFlying(false);
    }
    @Override
    public boolean isFlying(){
        return currentlyFlying;
    }

    /**
     * @return the canFly
     */
    public boolean getCanFly() {
        return canFly;
    }

    /**
     * @param canFly the canFly to set
     */
    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    /**
     * @return the currentlyFlying
     */
    public boolean getCurrentlyFlying() {
        return currentlyFlying;
    }

    /**
     * @param currentlyFlying the currentlyFlying to set
     */
    public void setCurrentlyFlying(boolean currentlyFlying) {
        this.currentlyFlying = currentlyFlying;
    }
}
