package Week_4.OOPs;

class outer{
    void display(){
        System.out.println("Outer class method");
    }

    class inner{
        void display(){
            System.out.println("Inner class method");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        outer obj = new outer();
        obj.display();

        outer.inner innerObj = new outer().new inner(); // or obj.new inner();
        innerObj.display(); 
    }
}
