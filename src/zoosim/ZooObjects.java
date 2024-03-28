/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 *
 * @author micha
 */
public class ZooObjects implements IObject{
    private String type;
    private int x;
    private int y;
    private String size;
    private double direction = 0;
    
    /**
     * Zoo object constructor
     * @param type
     * @param x
     * @param y
     * @param size
     */
    public ZooObjects(String type, int x, int y, String size){
        this.type = type;
        this.x = x;
        this.y = y;
        this.size = size;
    }

    /**
     * Turns a zoo object
     * @param degrees
     */
    @Override
    public void turn(double degrees){
        direction += degrees;
    }

    /**
     * Places a zoo object
     * @param x
     * @param y
     */
    @Override
    public void place(int x, int y){
        this.x = x;
        this.y = y;
    }
}
