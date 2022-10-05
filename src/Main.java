import sign.Sign;
import sign.factory.SignFactory;
import sign.service.ColorService;
import sign.service.SignService;
import sign.service.ValidateService;
import sign.ui.UI;

import java.time.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        SignService signService = new SignService();
        ColorService colorService = new ColorService();
        ValidateService validateService = new ValidateService();

        boolean stop;
        do {
            try {
                UI.clearConsole();
                UI.printBanner();

                colorService.yellow("Digite a data do seu nascimento (dd/MM/yyyy): ");
                LocalDate localDate = validateService.readDate(sc);

                colorService.yellow("Digite a hora do seu nascimento (HH:mm): ");
                LocalTime localTime = validateService.readTime(sc);

                colorService.yellow("Digite o seu estado de nascimento: ");
                String zone = validateService.readZone(sc);

                LocalDateTime localDateTime = LocalDateTime.of(localDate.getYear(), localDate.getMonth(), localDate.getDayOfMonth(), localTime.getHour(), localTime.getMinute(), localTime.getSecond());

                Sign sign = new SignFactory().create(MonthDay.of(localDateTime.getMonth(), localDateTime.getDayOfMonth()));

                colorService.green("\nAge: ");
                colorService.cyan("" + signService.getAge(localDateTime));
                colorService.green("\nLeap Year: ");
                colorService.cyan("" + signService.isLeapYear(localDateTime));
                colorService.green("\nDate formatted: ");
                colorService.cyan("" + signService.format(localDateTime));
                colorService.green("\nTime Zone: ");
                colorService.cyan("" + signService.timeZone(localDateTime, zone));

                colorService.green("\n\nSign: ");
                colorService.cyan("" + sign);
                colorService.green("\nRising Sign: ");
                colorService.cyan("" + sign.getRisingSign(localDateTime.toLocalTime()));
                colorService.green("\nMoon Sign: ");
                colorService.cyan("" + signService.moonSign(localDateTime.toLocalTime(), zone));

                System.out.println();

            } catch (IllegalArgumentException e) {
                colorService.red("\n" + e.getMessage());
                colorService.red("\nAperte ENTER para continuar");
                sc.nextLine();
            }

            stop = validateService.checkUserAnswer(sc, "\nVocê deseja continuar? (S/N) ");

        } while (stop);

        sc.close();

    }
}