import java.util.Scanner;

public class Plate {
    private int food;
    Scanner sc = new Scanner(System.in);

    public Plate() {

    }


    public void decreaseFood (int n) {
        food -=n;
    }

    //set & get
    public int getFood() {
        return food;
    }

    //устанавливаем пользовательское значение еды в тарелке
    public int setFood() {

        while(true) {
            System.out.print("Enter value for food ---> ");
            food=sc.nextInt();
            System.out.println();
            if (food > 0) {
                this.food = food;
                break;
            } else if (food == 0) {
                System.out.println("There can be zero food on the plate.");

            } else {
                System.out.println("There can be no negative food value in the plate.");

            }
        }
        return food;
    }

    public void setPlateInfo() {
        System.out.println("Food in a plate:" +food);
    }
}
