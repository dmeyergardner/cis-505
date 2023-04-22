/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by J. James 2015
    Additional modifications by D. Meyer-Gardner 2023
*/ 
public class Fan {
    // Four constants of fan speed, the numbers represent the fan speed
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    
    private int speed; // private int data field that details the speed of the fan, default is stopped
    private boolean isOn; //private boolean to specify whether the fan is off or on, default is off
    private double radius; // private double data field named radius that specifies the radius of the fan, default is 6
    private String color; // A private string data field named color that specifies the color of the fan, default is white

     // An argument constructor that creates a fan using the four fields as arguments. Arg constructor is first and 0 arg will reset to default below
     public Fan (int speed, boolean isOn, double radius, String color){
        this.speed = speed;
        this.isOn = isOn;
        this.radius = radius;
        this.color = color;
    }
    // A no-argument (0 arg) constructor that creates a default fan (set all fields to their default values). 
    public Fan (){
        this(0, false, 6, "white");
    }
    
    // Accessor and mutator methods for speed
    public int getSpeed (){
        return this.speed;
    }
    public void setSpeed (int s){
        this.speed = s;
    }
    // Accessor and mutator methods for on and off
    public boolean getIsOn(){
        return this.isOn;
    }
    public void setIsOn (boolean o){
        this.isOn = o;
    }
    // Accessor and mutator methods for radius
    public double getRadius (){
        return this.radius;
    }
    public void setRadius (double r){
        this.radius = r;
    }
    // Accessor and mutator methods for color
    public String getColoString (){
        return this.color;
    }
    public void setColorString (String c){
        this.color = c;
    }

    // Override the toString method. Return a string description for the fan. If the fan is on, the method returns the fan speed, color, and radius in a combined string. If the fan is not on, the method returns the fan color, radius, and a message of “fan is off” in a combined string.
    public String toString (){
        String s = new String();
            if (this.isOn == true) {
                s = ("The fan is " + color + " with a radius of " + radius + ", and the fan speed is set to "+ speed + ".");
            } else { s = ("The fan is " + color + " with a radius of " + radius + ", and the fan is off.");
        } 
            return s;
    }
}