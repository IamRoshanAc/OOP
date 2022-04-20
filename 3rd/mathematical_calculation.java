public class mathematical_calculation {
    public static void main(String[] args) {
        double principle = 10000;
        double time = 2.5;
        double rate = 12;
        double si;
        si = (principle*time*rate)/100;
        System.out.println(si);
    }
}
class area_triangle{
    public static void main(String[] args) {
        double base = 12;
        double height = 5;
        double area ;
        area = 0.5*base*height;
        System.out.println(area);
    }
}
class volume_cube{
    public static void main(String[] args) {
        double length = 5;
        double volume;
        volume = length*length*length;
        System.out.println(volume);
    }
}
class volume_cuboid{
    public static void main(String[] args) {
        double length = 5;
        double width = 5;
        double height = 5;
        double volume;
        volume= length*width*height;
        System.out.println(volume);
    }
}