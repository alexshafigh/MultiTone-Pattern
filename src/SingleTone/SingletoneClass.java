package SingleTone;


public class SingletoneClass {

    private String name;
    private String family;

    static Car instance;

    private SingletoneClass() { //constructor
        instance = null;
    }

    public static Car getInstance() {
        if (instance == null)
            instance = new Car();
        else ;
        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }
}
