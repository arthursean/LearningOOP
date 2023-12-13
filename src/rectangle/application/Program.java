package rectangle.application;

import rectangle.entities.Rectangle;

public class Program {
    public static void main(String[] args){
        Rectangle retangulo = new Rectangle();
        retangulo.height = 3;
        retangulo.width = 4;
        System.out.println(retangulo);
        System.out.println("Area: " + retangulo.area());
        System.out.println("Perimetro: " + retangulo.perimeter());
        System.out.println("Diagonall: " + retangulo.diagonal());
    }
}
