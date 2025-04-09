abstract class area{
    abstract double   calculatevolume();
    abstract double  calculatesurfacearea();
}
class sphere extends area{
    double radius;
    double calculatevolume(){
        return 4/3*3.14*radius*radius*radius;
        }
        double calculatesurfacearea(){
            return 4*3.14*radius*radius;
            }
    }
    class cube extends area{
        double side;
        double calculatevolume(){
            return side*side*side;
            }
            double calculatesurfacearea(){
                return 6*side*side;
                }
                }
class shape{
    public static void main(String[] args) {
        sphere s=new sphere();
        s.radius=5;
        System.out.println("volume of sphere is "+s.calculatevolume());
        System.out.println("surface area of sphere is "+s.calculatesurfacearea());
        cube c=new cube();
        c.side=5;
        System.out.println("volume of cube is "+c.calculatevolume());
        System.out.println("surface area of cube is "+c.calculatesurfacearea());
        }

    }

