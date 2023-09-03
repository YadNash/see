    interface Shape{
        double Area();
    }

    interface Color{
        String getColor();
    }
    class Circle implements Shape, Color{
        double radius;
        String color;

        Circle(double  radius, String color){
            this.radius =  radius;
            this.color =  color;
        }
        @Override
        public double Area(){
            return 3.14 *radius*radius;
        }
        @Override
        public String getColor(){
            return this.color;
        }
        
    }
public class MulInheritance {
    public static void main(String[] args) {
        Circle c = new Circle(3, "green");
        System.out.println(c.Area()+"  "+c.getColor());
    }
}
