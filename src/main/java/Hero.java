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

    //




























