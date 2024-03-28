/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package zoosim;

/**
 *
 * @author michael.roy-diclemen
 */
public class ZooSim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Zoo zoo = new Zoo();
        WaterAnim fish = new WaterAnim(5, 2, "siyuan su", "fish", "male", "rotund", "blub", 5, 2, true);
        LandAnim dog = new LandAnim(8, 10, "frank zhang", "dog", "male", "skinny", "woof", 2, 2);
        zoo.addAnimal(fish);
        zoo.addAnimal(dog);
        zoo.zooStatistics(fish);
        fish.turn(360);
        zoo.moveAnimals();
        zoo.zooStatistics(fish);
        fish.makeSound();
    }
}
//There is an inaccuracy with the position calculations after moving due to the sin/cos functions and also because of the variables being integers

//In order to allow for predator/prey interactions, as well as the different type of diets that animals have, I would create a class for each
//of them. In each of the classes, I would create methods that are specific to the animal type, so for example the predator class may have
//a method called hunt that allows it to start hunting other animals in it's enclosure if it's hunger drops too low. 
//All of these classes will also most likely extend the Animal class, since they represent more specific types of animals, such as the WaterAnim,
//BirdAnim, and LandAnim classes. Since animal objects will need to keep track of their roles, they will most likely have has-a relationships