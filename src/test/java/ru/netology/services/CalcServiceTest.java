import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.services.CalcService;


public class CalcServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/Test.csv")
    public void NumberOfMonthsOfVacation(int income, int expenses, int threshold, int expected) {
        CalcService service = new CalcService();

        // Расчет количества свободных месяцев
        int actual = service.calculate(income, expenses, threshold);

        // Использоваение метода Assertions для сравнения ожидаемого значения и расчетного
        Assertions.assertEquals(expected, actual);
    }
}
