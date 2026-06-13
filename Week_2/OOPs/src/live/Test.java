package live;

import music.Playable;
import music.string.Veena;
import music.wind.Saxophone;

public class Test {
    public static void main(String[] args) {
        Veena v = new Veena();
        Saxophone s = new Saxophone();

        v.play();
        s.play();

        // instances in a variable of type Playable and then call play()
        Playable p;

        p = new Veena();
        p.play();

        p = new Saxophone();
        p.play();
    }
}
