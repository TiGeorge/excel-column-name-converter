import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ExcelColumnNameConverterTest {

  private final ExcelColumnNameConverter sut = new ExcelColumnNameConverter();

  @Test
  void convert() {
    List<String> result = sut.convert(150, 18279);

    assertEquals("[150:ET, 18279:AAAA]", result.toString());
  }
}