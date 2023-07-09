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

    //Method to get Hero Age
    public int getAge() {
        return mAge;
    }

    //Method to get Hero's power (Strength)
    public String getPower() {
        return mPower;
    }

    // Method to get Hero's weakness
    public String getWeakness() {
        return mWeakness;
    }

    //Method to get Hero Id
    public int getId() {
        return mId;
    }

    // Method to list Hero
    public static List<Hero> all() {
        return heroes;
    }

    // Method to clear
    public static void clear() {
        heroes.clear();
    }

    // Method to find Hero using Id
    public static Hero find(int id) {
        return heroes.get(id - 1);
    }
}



































