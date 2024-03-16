public class Q10_AreaCalculation {
    public static double area(int b, int h){
        return (0.5*b*h);
    }
    public static double area(double s){
        return (s*s);
    }
    public static double area(int r){
        return (Math.PI*r*r);
    }
    public static double area(double p, double b){
        return (p*b);
    }
    public static void main(String[] args) {
        System.out.println("Area of triangle is: " + area(5,10));
        System.out.println("Area of square is: " + area(5.1));
        System.out.println("Area of circle is: " + area(4));
        System.out.println("Area of rectangle is: " + area(1.5,5.8)); 
    }
}
