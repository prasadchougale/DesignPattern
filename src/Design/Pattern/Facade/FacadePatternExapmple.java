package Design.Pattern.Facade;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.invoke.SwitchPoint;
import java.nio.Buffer;

interface LaptopHub {   
    public void modelNo();

    public void price();
}

class Hp implements LaptopHub {
    @Override
    public void modelNo() {
        System.out.println("Hp EliteBook");
    }

    @Override
    public void price() {
        System.out.println("Rs 650000");
    }
}

class Dell implements LaptopHub {
    @Override
    public void modelNo() {
        System.out.println("Dell 1400D");
    }

    @Override
    public void price() {
        System.out.println("Rs 45000");
    }
}

class Acer implements LaptopHub {
    @Override
    public void modelNo() {
        System.out.println("Acer NITRO ");
    }

    @Override
    public void price() {
        System.out.println("Rs 75000");
    }
}

class ShopKeeper {
    private LaptopHub Hp;
    private LaptopHub Dell;
    private LaptopHub Acer;

    public ShopKeeper() {
        Hp = new Hp();
        Dell = new Dell();
        Acer = new Acer();
    }

    public void HpSale() {
        Hp.modelNo();
        Hp.price();
    }

    public void DellSale() {
        Dell.modelNo();
        Dell.price();
    }

    public void AcerSale() {
        Acer.modelNo();
        Acer.price();
    }

}

public class FacadePatternExapmple {
    public static int choice;

    public static void main(String[] args) throws NumberFormatException, IOException {
        {
            do {
                System.out.println("====================Laptop Hub=====================");
                System.out.println("       1.Hp       ");
                System.out.println("       2.Dell     ");
                System.out.println("       3.Acer     ");
                System.out.println("       4.EXIT     ");
                System.out.println("       Enter your Choice  ");
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                choice = Integer.parseInt(br.readLine());
                ShopKeeper sk = new ShopKeeper();
                switch (choice) {

                    case 1: {
                        sk.HpSale();

                    }
                    break;
                    case 2: {
                        sk.DellSale();
                    }
                    break;
                    case 3: {
                        sk.AcerSale();
                    }
                    break;
                    default: {
                            System.out.println("Nothing You Purchesed Thanks for visit.....!");
                    }
                    return;
                }

            } while (choice != 4);

        }
    }
}