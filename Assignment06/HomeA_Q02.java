public class HomeA_Q02 {
    public static int area(int s){
        return (s*s*s);
    }
    public static double area(double r){
        return ((4/3)*Math.PI*Math.pow(r,3));
    }
    public static int area(int l, int b, int h){
        return l*b*h;
    }

    public static void main(String[] args) {
        System.out.println("Volume of a cube is " + area(5));
        System.out.println("Volume of a sphere is " + area(1.8));
        System.out.println("Volume of a cuboid is " + area(5,4,3));
    }
}
