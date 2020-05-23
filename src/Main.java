import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("chon trang web");
        System.out.println("1.thanh nien");
        System.out.println("2.tuoi tre");
        Scanner scanner=new Scanner(System.in);
        int choice=scanner.nextInt();
        switch (choice){
            case 1:
                Template thanhnien=new Thanhnien();
                thanhnien.show();

                break;
            case 2:
                Template tuoitre=new Tuoitre();
                tuoitre.show();

                break;
            default:
                System.out.println("chua ho tro");
        }
    }
}
