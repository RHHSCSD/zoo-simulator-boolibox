/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;
import java.util.ArrayList;

/**
 *
 * @author micha
 */
public class Zoo {
    ArrayList<Animal> animals = new ArrayList<Animal>();
    
    public void addAnimal(Animal a){
        animals.add(a);
    }
    public void zooStatistics(LandAnim a){
            System.out.println("Age: " + a.getAge());
            System.out.println("Speed: " + a.getSpeed());
            System.out.println("Name: " + a.getName());
            System.out.println("Species: " + a.getSpecies());
            System.out.println("Sex: " + a.getSex());
            System.out.println("Size: " + a.getSize());
            System.out.println("Sound: " + a.getSound());
            System.out.println("Position: " + a.getX() + ", "  + a.getY());
        }
        
    public void zooStatistics(WaterAnim a){
            System.out.println("Age: " + a.getAge());
            System.out.println("Speed: " + a.getSpeed());
            System.out.println("Name: " + a.getName());
            System.out.println("Species: " + a.getSpecies());
            System.out.println("Sex: " + a.getSex());
            System.out.println("Size: " + a.getSize());
            System.out.println("Sound: " + a.getSound());
            System.out.println("Position: " + a.getX() + ", "  + a.getY());
            System.out.println("Can breathe air: " + a.getCanBreathe());
        }
    public void zooStatistics(BirdAnim a){
            System.out.println("Age: " + a.getAge());
            System.out.println("Speed: " + a.getSpeed());
            System.out.println("Name: " + a.getName());
            System.out.println("Species: " + a.getSpecies());
            System.out.println("Sex: " + a.getSex());
            System.out.println("Size: " + a.getSize());
            System.out.println("Sound: " + a.getSound());
            System.out.println("Position: " + a.getX() + ", "  + a.getY());
            System.out.println("Can fly: " + a.getCanFly());
            System.out.println("Currently flying: " + a.getCurrentlyFlying());
        }
    public void feedAnimals(){
        for(int i = 0; i < animals.size(); i++){
            if(animals.get(i).getHunger() > 0){
                animals.get(i).eat();
            }
        }
    }
    public void sleep(){
        for(int i = 0; i < animals.size(); i++){
            if(animals.get(i).getFatigue() > 0){
                animals.get(i).sleep();
            }
        }
    }
    public void moveAnimals(){
        for(int i = 0; i < animals.size(); i++){
            animals.get(i).move();
        }
    }
}
