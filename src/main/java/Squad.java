import java.util.List;
import java.util.ArrayList;


public class Squad {
    //Adding Squad attributes
    private String mName;
    private int mSize;
    private String mCause;
    private static List<Squad> instances = new ArrayList<Squad>();
    private int mId;
    private List<Hero> mHeroes;

    //Adding Squad class constructor
    public Squad(String name, int size, String cause) {
        mName = name;
        mSize = size;
        mCause = cause;
        instances.add(this);
        mId = instances.size();
        mHeroes = new ArrayList<Hero>();
    }

    //Method to get Squad Name
    public String getName() {
        return mName;
    }

    //Method to get Squad Size
    public int getSize() {
        return mSize;
    }

    //Method to get Squad cause
    public String getCause() {
        return mCause;
    }

    //Method to get Squad list
    public static List<Squad> all() {
        return instances;
    }

    //Method to clear Squad
    public static void clear() {
        instances.clear();
    }

    //Method to get Squad Id
    public int getId() {
        return mId;
    }

    //Method to find Squad using Id
    public static Squad find(int id) {
        return instances.get(id - 1);
    }

    //Method to list heroes in squad
    public List<Hero> getHeroes() {
        return mHeroes;
    }

    // Method to add Hero to squad
    public void addHero(Hero hero) {
        mHeroes.add(hero);
    }

    //Method to check Hero exists in Squad
    public static boolean heroAlreadyExists(Hero newHero) {
        boolean exists = false;
        for (Squad squad : instances) {
            for (Hero hero : squad.getHeroes()) {
                if (hero.getName().equals(newHero.getName())) {
                    exists = true;
                }
            }
        }
        return exists;
    }
}




















}
