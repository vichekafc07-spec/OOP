package interfaces;

public class Parot implements Animal,Category{
    private String title;
    private String type;
    @Override
    public void setType(String title) {
        this.title = title;
    }

    @Override
    public String getType() {
        return title;
    }


    @Override
    public void setTypes(String type) {
        this.type = type;
    }

    @Override
    public String getTypes() {
        return type;
    }
}
