import ru.netology.services.CalcService;

public class Main {
    public static void main(String[] args) {

        CalcService calculation = new CalcService();

        int values = calculation.calculate(10_000,3_000,20_000);
        System.out.println("Количество месяцев отдыха в следующем году " + values);

    }
}