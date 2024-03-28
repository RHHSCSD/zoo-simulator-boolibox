/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 *
 * @author Michael Zheng
 */
public class Animal implements IEntity{
    private Image image;
    private int id;
    private int age;
    private int x;
    private int y;
    private int speed;
    private double direction;
    private int hunger;
    private int fatigue;
    private String name;
    private String species;
    private String sex;
    private String size;
    private String sound;
    
    //Animal constructor

    /**
     * Creates an animal object
     * @param age
     * @param speed
     * @param name
     * @param species
     * @param sex
     * @param size
     * @param sound
     * @param x
     * @param y
     */
    public Animal(int age, int speed, String name, String species, String sex, String size, String sound, int x, int y){
        this.age = age;
        this.speed = speed;
        this.name = name;
        this.species = species;
        this.sex = sex;
        this.size = size;
        this.sound = sound;
        this.x = x;
        this.y = y;
    }
    
    /**
     * Sets an animals hunger
     * @param hunger
     */
    public void setHunger(int hunger){
        this.hunger = hunger;
    }
    
    /**
     * Sets an animals fatigue
     * @param fatigue
     */
    public void setFatigue(int fatigue){
        this.fatigue = fatigue;
    }
    
    /**
     * Gets animal hunger
     * @return
     */
    public int getHunger(){
        return hunger;
    }
    
    /**
     * Gets animal fatigue
     * @return
     */
    public int getFatigue(){
        return fatigue;
    }
    
    /**
     * Makes a sound
     */
    @Override
    public void makeSound(){
        System.out.println(getSound());
    }

    /**
     * Moves an animal depending on speed and direction
     */
    @Override
    public void move(){
        double radians = (getDirection() * 180) / Math.PI;
        setX((int) (getX() + getSpeed() * Math.cos(radians)));
        setY((int) (getY() + getSpeed() * Math.sin(radians)));
        System.out.println(getX() + ", " + getY());
    }

    /**
     * Makes a hungry animal eat
     */
    @Override
    public void eat(){
        hunger = 0;
        System.out.println("Not hungry anymore");
    }

    /**
     * Makes a tired animal sleep
     */
    @Override
    public void sleep(){
        fatigue = 0;
        System.out.println("Not tired anymore");
    }

    /**
     * Turns an animal a certain amount of degrees
     * @param degrees
     */
    @Override
    public void turn(double degrees){
        setDirection(getDirection() + degrees);
    }

    /**
     * Places an animal
     * @param x
     * @param y
     */
    @Override
    public void place(int x, int y){
        this.setX(x);
        this.setY(y);
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * @return the speed
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * @param speed the speed to set
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * @return the direction
     */
    public double getDirection() {
        return direction;
    }

    /**
     * @param direction the direction to set
     */
    public void setDirection(double direction) {
        this.direction = direction;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the species
     */
    public String getSpecies() {
        return species;
    }

    /**
     * @param species the species to set
     */
    public void setSpecies(String species) {
        this.species = species;
    }

    /**
     * @return the sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * @param sex the sex to set
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * @return the size
     */
    public String getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     * @return the sound
     */
    public String getSound() {
        return sound;
    }

    /**
     * @param sound the sound to set
     */
    public void setSound(String sound) {
        this.sound = sound;
    }
}