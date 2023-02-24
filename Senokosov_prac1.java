import java.util.Scanner;
public class Main{

    public static void main(String[] args) {
        System.out.println("Введите день недели от 1 до 7: ");
        Scanner scan = new Scanner(System.in);

        int DayOfTheWeek = scan.nextInt();
        int sec = 0;
        switch(DayOfTheWeek){
            case 1:
                System.out.println("рабочее время в секундах: " + 8 * 3600);
                break;
            case 2:
                System.out.println("рабочее время в секундах: " + 8 * 3600);
                break;
            case 3:
                System.out.println("рабочее время в секундах: " + 8 * 3600);
                break;
            case 4:
                System.out.println("рабочее время в секундах: " + 8 * 3600);
                break;
            case 5:
                System.out.println("рабочее время в секундах: " + 6 * 3600);
                break;
            case 6:
                System.out.println("рабочее время в секундах: " + 0);
                break;
            case 7:
                System.out.println("рабочее время в секундах:: " + 0);
                break;
            default:
                System.out.println("Ошибка, введено недопустимое значение");


        }

    }
}
