// task 3
public class Triangle {
    public int a;
    public int b;
    public int c;
    public int perimeter;
    public Triangle(int a, int b, int c ){
        this.a = a;
        this.b = b;
        this.c = c;
        this.perimeter = a + b + c;
    }
    public void triangleDetails(){
        System.out.printf("Three sides of the triangle are: %d, %d, %d%nPerimeter: %d%n", this.a, this.b, this.c, this.perimeter);
    }
    public String printTriangleType(){
        if(a == b && a == c){
            return "This is an Equilateral Triangle.";
        }
        else if(a == b || b ==c || c == a){
            return "This is a Isosceles Triangle.";
        }
        else{
            return "This is a Scalene Triangle.";
        }
    }
    public void compareTriangles(Triangle t){
        if(this == t){
            System.out.println("These two triangle objects have the same address.");
        }
        else{
            if((this.a == t.a && this.b == t.b) && this.c == t.c){
                System.out.println("Addresses are different but the sides of the triangles are equal.");
            }
            else if( this.perimeter == t.perimeter){
                System.out.println("Only the perimeter of both triangles is equal.");
            }
            else{
                System.out.println("Addresses, length of the sides and perimeter all are different.");
            }
        }
    }

}
