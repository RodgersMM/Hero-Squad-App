import java.util. *;

public class Hero {
    private String mName;
    private int mAge;
    private String mPower;
    private String mWeakness;
    private int mId;
}
    // Add Hero Method
    public Hero(String name,int age,String power,String weakness ) {
        mName = name;
        mAge = age;
        mPower = power;
        mWeakness = weakness;
        heroes.add(this);
        mId = heroes.size();
    }

    //Method to get Hero Names
    public String getName() {
        return mName;
    }

    //Method to get Hero size
    public int getSize() {
        return mSize;
    }

    // Method to get Hero cause
    public String getCause() {
        return mCause;
    }

    //Method to list squad
    public static List<Squad> all() {
        return instances;
    }

    //Method to clear
    public static void clear() {
        instances.clear();
    }

    //Method to get Hero Id
    public int getId() {
        return mId;
    }

    // Method to find Id
    public static Squad find(int id) {
        return instances.get(id - 1);
    }

    //Method to list Heroes
    public List<Hero> getHeroes() {
        return mHeroes;
    }

    //Method to add a Hero
    public void addHero(Hero hero) {
        mHeroes.add(hero);
    }



























