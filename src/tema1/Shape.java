package tema1;

/*
In clasa Shape avem 2 metode :
- calculateSquareArea (care calucleaza aria unui patrat cu formula
length * lenght) si calculateRectangleArea (care calculeaza aria
unui dreptunghi cu formula length*width)
- Avem 3 constructori :
u Unul care primeste ca parametru length si executa metoda
calculateSquareArea
u Unul care primeste ca parametru length si width si executa metoda
calculateRectangleArea
u Unul care primeste ca parametru o variabila double care se
cheama radius si care calculeaza raza unui cerc cu formula
radius*radius*Math.PI
 */

public class Shape {
// nu avem variabile la nivel de clasa in nici una dintre clase - tricky note :), avem doar variabile nestatice care apartin obiectelor
    public int length;
    public int width;
    public double radius;

    public Shape (int length){
        this.length = length;
        calculateSquareArea(this.length); // aici initial am pus length, pt ca este acelasi lucru, dar pare mai corect cu this.length (you tell me)
    }

    public Shape (int length, int width){
        this.length = length;
        this.width = width;
        calculateRectangleArea(this.length,this.width);
    }

    public Shape (double radius){
        this.radius = radius;
        System.out.println("The area of the circle is: " + this.radius*this.radius*Math.PI);
    }

// initial am creat metode ca in curs cu return type int. Dar dat fiind ca nu le foloseam nicaieri am revenit la void :)
    public void calculateSquareArea(int length){
        System.out.println("The area of the square is: " + length*length);
    }

    public void calculateRectangleArea(int length, int width){
        System.out.println("The area of the rectangle is: " + length*width);
    }

}
