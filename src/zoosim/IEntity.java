/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 *
 * @author micha
 */
public interface IEntity extends IObject{
    public void move();
    public void makeSound();
    public void eat();
    public void sleep();
}
