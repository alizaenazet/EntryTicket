import java.util.Scanner;

public class Game {
    private Player p;

    public Game() {
        p = new Player();
        Scanner s = new Scanner(System.in);
        System.out.println("Your Username : ");
        String name = s.next();
        p.setUsername(name);
    }

    public void playGame() {
        int pilihan = 0;
        while (pilihan <= 9) {
            //Tampilkan menu
            System.out.println("WHAT TO DO :");
            System.out.println("1. Buy a Pet");
            System.out.println("2. Play with Pet");
            System.out.println("3. Train Pet");
            System.out.println("4. Feed Pet");
            System.out.println("5. Put Pet to Bath");
            System.out.println("6. Put Pet to Sleep");
            System.out.println("7. Show Pet Status");
            System.out.println("8. Sell Pet");
            System.out.println("9. Exit");
            System.out.println("Choose : ");
            Scanner s = new Scanner(System.in);
            pilihan = s.nextInt();

            //Suruh pet dari player untuk melakukan aktivitas yg dipilih
            switch (pilihan) {
                case 1:
                    //1. Buat objek Dog baru
                    Dog newDog = new Dog();
                    System.out.println("Name your pet");
                    String dogName = s.nextLine() + s.next();
                    newDog.setName(dogName);
                    //2. Assign objek Dog baru menjadi pet-nya Pkayer
                    p.addDog(newDog);
                    break;
                case 2:
                    //cek apakah player punya pet
                    if (p.getPet() != null) {
                        p.getPet().play();
                    } else {
                        System.out.println("You must buy a oet first!");
                    }
                    break;
                case 3:
                    //cek apakah player punya pet
                    if (p.getPet() != null) {
                        p.getPet().train();
                    } else {
                        System.out.println("You must buy a oet first!");
                    }
                    break;
                case 4:
                    //cek apakah player punya pet
                    if (p.getPet() != null) //cek apakah food stock player mencukup
                    {
                        if (p.getFoodStock() >= p.getPet().getFoodAmount()) {
                            int food = p.getPet().eat();
                            p.foodStock(food);
                        } else {
                            System.out.println("You don't have enough food to feed your pet");
                        }
                    } else {
                        System.out.println("You must buy a oet first!");
                    }
                    break;
                case 5:
                    //cek apakah player punya pet
                    if (p.getPet() != null) {
                        p.getPet().bath();
                    } else {
                        System.out.println("You must buy a oet first!");
                    }
                    break;
                case 6:
                    //cek apakah player punya pet
                    if (p.getPet() != null) {
                        p.getPet().sleep();
                    } else {
                        System.out.println("You must buy a oet first!");
                    }
                    break;
                case 7:
                    Dog d = p.getPet();
                    System.out.println("Your Pet Status");
                    System.out.println("Name        : " + d.getName());
                    System.out.println("Age         : " + d.getAge());
                    System.out.println("Health      : " + d.getHealth());
                    System.out.println("Happiness   : " + d.getHappiness());
                    System.out.println("Intelligence: " + d.getIntelligence());
                    System.out.println("Cleanliess    : " + d.getCleniness());
                    System.out.println("Fullness    : " + d.getFullness());
                    System.out.println("Price       : " + d.getPrice());
                    break;
                case 8:
                    if (p.getPet() != null) {
                        p.sellDog();
                    } else {
                        System.out.println("You don't have a pet to sell");
                    }
                    break;
                case 9:
                    System.exit(0);
            }

            //cek pet hidup/mati
            if (p.getPet() != null) {
                if (p.getPet().isDie()) {
                    p.dogDies();
                }
            }
        }
    }
}
