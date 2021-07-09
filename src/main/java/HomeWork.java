import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        int choice=0;
        Cat[] cats  = {
                new Cat ("Barsik", 500),
                new Cat ("Murzik",1000),
                new Cat ("Yorik",2000)
        };
        Plate plate =new Plate();
        Scanner forChoice = new Scanner(System.in);

        do {
            switch (choice) {
                case 0:
                    System.out.print("Select an action:\n" +
                            "1: Get information about cats\n" +
                            "2: Add food to the plate\n" +
                            "3: Get information about plate\n" +
                            "4: Feed the cats\n" +
                            "9: Exit\n" +
                            "Enter your choice ---> ");
                    choice = forChoice.nextInt();
                    System.out.println();
                    break;
                case 1:
                    for (int i = 0; i < cats.length; i++) {
                        cats[i].getCatInfo();
                        System.out.println();
                    }
                    choice=0;
                    break;
                case 2:
                    plate.setFood();
                    choice=0;
                    break;
                case 3:
                    plate.setPlateInfo();
                    System.out.println();
                    choice=0;
                    break;
                case 4:
                    for (int i = 0; i < cats.length ; i++) {
                        if(cats[i].eat(plate) ==true) {
                            System.out.printf("The cat %s are full ^^\n",cats[i].getName());
                            System.out.println();
                        } else {
                            System.out.printf("The cat %s are not full :(\n", cats[i].getName());
                            System.out.println();
                        }
                    }
                    choice=0;
                    break;
                case 9:
                    break;

                default:
                    System.out.println("Error");
                    choice=0;
                    System.out.println();
                    break;
            }

        } while (choice!=9);

    }
}
