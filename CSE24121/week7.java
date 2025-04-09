abstract class Animal{
    abstract void sound();
}
class tiger extends Animal{
    void sound(){
        System.out.println("ohhhhhhhhhhh");
        }
        }
class lion extends Animal{
    void sound(){
        System.out.println("hooooooooooooooooo");
        }
        }
class week7{
    public static void main(String[] args){
        Animal a1=new tiger();
        Animal a2=new lion();
        a1.sound();
        a2.sound();
}
}