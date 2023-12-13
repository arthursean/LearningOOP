package circle.application;

import circle.util.Circle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        System.out.print("Enter a radius: ");
        System.out.println(Circle.circumference(radius));
        radius = sc.nextDouble();
        System.out.println(Circle.circumference(radius));
        System.out.println(Circle.volume(radius));
        System.out.println(Circle.PI);


    }
}
