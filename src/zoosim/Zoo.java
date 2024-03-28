/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;
import java.util.ArrayList;

/**
 *
 * @author michael zheng
 */
public class Zoo {
    ArrayList<Animal> animals = new ArrayList<Animal>();
    
    /**
     * Add an animal to the array list (zoo) of animals
     * @param a
     */
    public void addAnimal(Animal a){
        animals.add(a);
    }

    /**
     * Prints out the details of a specific animal
     * @param a
     */
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
        
    /**
     * Prints out the details of a specific animal
     * @param a
     */
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

    /**
     * Prints out the details of a specific animal
     * @param a
     */
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

    /**
     * Refills the hunger of all hungry animals in the zoo
     */
    public void feedAnimals(){
        for(int i = 0; i < animals.size(); i++){
            if(animals.get(i).getHunger() > 0){
                animals.get(i).eat();
            }
        }
    }

    /**
     * Allows all tired animals in the zoo to sleep and refills fatigue
     */
    public void sleep(){
        for(int i = 0; i < animals.size(); i++){
            if(animals.get(i).getFatigue() > 0){
                animals.get(i).sleep();
            }
        }
    }

    /**
     * Moves all animals within the zoo
     */
    public void moveAnimals(){
        for(int i = 0; i < animals.size(); i++){
            animals.get(i).move();
        }
    }
}
