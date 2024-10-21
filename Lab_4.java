abstract class shape{
 double a,b;
shape(double x, double y){
    a=x;
    b=y;
}

}
class Rectangle extends shape{
    Rectangle(double i, double j){
        super(i,j);
    }
    double printArea(){
            return a*b;
    }
}
class Triangle extends shape{
    Triangle(double i,double j){
        super(i,j);
    }
    double printArea(){
        return 0.5*a*b;
    }
}
class Circle extends shape{
   
    Circle(double i){
        super(i,1.0);
    }
    double printCircle(){
        return 3.14*a*a;
    }
}
class Lab_4{
    public static void main(String[] args) {
        
       
       
        Rectangle ob1=new Rectangle(5.0,5.0);
       
        Triangle ob2=new Triangle(2.0, 2.0);
       
        Circle ob3=new Circle(4.0);

        System.out.println("area of Recatngle is  : "+ob1.printArea());
        System.out.println("area of triangle is : "+ob2.printArea());
        System.out.println("area of circle is : "+ob3.printCircle());

    }
}

    
