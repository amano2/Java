

public class Shapes {
    double perimeter;
    double area;

public double CalculatePerimeter(double length, double breadth){

    return (2*(length*breadth));

}
public double CalculateArea(double length, double breadth){

    return (length*breadth);

}

public void SetPerimeter(double perimeter){
    this.perimeter=perimeter;
}

public void SetArea(double area){
    this.area=area;
}

public double getArea(){
    return area;
}

public double getPerimeter(){
    return perimeter;
}
    public static void main(String[] args){
          Shapes S = new Shapes();
          S.SetPerimeter(200.50);
          System.out.println("The Perimeter is "+S.getPerimeter()+"Sqrt");

    }
}
