package Week_4.OOPs;

class point{
    private int x,y;

    public point(){
        this.x = 0;
        this.y = 0;
    }

    public point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }
}

// public class Test {
//     public static void main(String[] args) {
//         point p1 = new point();
//         point p2 = new point(10, 20);

//         p1.setX(5);
//         p1.setY(8);
//         p2.setXY(15, 25);
//     }
// }