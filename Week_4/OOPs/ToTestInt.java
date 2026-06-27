package Week_4.OOPs;

interface test{
    int square(int x);
}

class arithmetic implements test{
    public int square(int x) {
        return x * x;
    }
}

public class ToTestInt{
    public static void main(String[] args) {
        arithmetic obj = new arithmetic();
        int result = obj.square(5);
        System.out.println("Square of 5: " + result);
    }
}