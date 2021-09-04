import java.io.*;
import java.util.*;

/* Implement your classes here. Do not use access modifiers in your class declarations. */

class Circle{
    
    float radius;
    
    Circle(float radius){
        this.radius = radius;
        getArea(radius);
    }
    
    float getArea(float radius){
        float area = 3.14149265f * this.radius * this.radius;
        return area;
    }
    
}

class Rectangle{
    float width;
    float height;
    
    Rectangle(float width, float height){
        this.width = width;
        this.height = height;
    }
    
    float getArea(float width, float height){
        return (float)Math.ceil((width * height));
    }
    
    
}

class Square{
    float width;
    
    Square(float width){
        this.width = width;
    }
    
    float getArea(float width){
        return (float)Math.ceil(width * width);
    }
}

public class Solution {
    public static void main(String[] args) throws NumberFormatException, IOException {
        Scanner sc = new Scanner(System.in);        
        
        float radius = Float.parseFloat(sc.nextLine());
        Circle c1 = new Circle(radius);
      	System.out.println(c1.getArea(5));   
        
        float width = sc.nextFloat();
        float height = sc.nextFloat();
        Rectangle r1 = new Rectangle(width, height);
      	System.out.println(r1.getArea(3,4));
      	sc.nextLine();
        
        radius = Float.parseFloat(sc.nextLine());
        Circle c2 = new Circle(radius);
      	System.out.println(c2.getArea(2));
    
        width = Float.parseFloat(sc.nextLine());
        Square s1 = new Square(width);
      	System.out.println(s1.getArea(3.3f));
        
      	width = sc.nextFloat();
        height = sc.nextFloat();
        Rectangle r2 = new Rectangle(width, height);
      	System.out.println(r2.getArea(5, 7.5f));
        
        sc.close();
    }
}
