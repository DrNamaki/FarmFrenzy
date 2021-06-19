import java.util.HashMap;

public class Level {
    int Level;
    HashMap<String, Integer> RandomWildAnimal = new HashMap<String, Integer>();
    HashMap<String, Integer> Tasks = new HashMap<String, Integer>();

    public Level(int level) {
        Level = level;
       this.RandomWildAnimal = new HashMap<String, Integer>();
      this.Tasks = new HashMap<String, Integer>();
    }
}
