public class Cat {
    private String name;
    private int appetite;


    public  Cat (String name,int appetite) {
        this.name=name;
        this.appetite=appetite;
    }


    public void getCatInfo () {
        System.out.println("Name: " +name);
        System.out.println("Appetite: "+appetite);
    }

    public boolean eat (Plate plate) {
        if(appetite<=plate.getFood()) {
            plate.decreaseFood(appetite);
            return true;
        } else {
            System.out.println("Not enough food on the plate :(");

        }
        return false;
    }

    //setter & getter
    public void setName(String name) {
        this.name = name;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }
}
