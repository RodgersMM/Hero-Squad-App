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






}
