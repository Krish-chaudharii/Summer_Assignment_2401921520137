package Week_4.OOPs;

class box{
    int length, width;
    public box(int length, int width){
    this.length = length;
    this.width = width;
    }
    
    int area(){
        return length * width;
    }

    int volume(){
        return 0; // Volume is not applicable for 2D box
    }
}

class box3d extends box{
    int length, width, height;

    public box3d(int length, int width, int height){
        this.length = length;
        this.width = width;
        this.height = height;
    }

    int area(){
        return 2 * (length * width + width * height + height * length);
    }

    int volume(){
        return length * width * height;
    }
}

public class File {
    public static void main(String[] args) {
        box b1 = new box(10, 5);
        box3d b2 = new box3d(6, 5, 4);

        System.out.println("Box 1 Area: " + b1.area());
        System.out.println("Box 1 Volume: " + b1.volume());
        System.out.println("Box 2 Area: " + b2.area());
        System.out.println("Box 2 Volume: " + b2.volume());

    }
}