import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExcelColumnNameConverter {

  public List<String> convert(Integer... numbers) {
    return Arrays.stream(numbers).map(this::convertInt).collect(Collectors.toList());
  }

  private String convertInt(Integer number) {
    char[] chars = Integer.toString(number, 26).toCharArray();

    for (int i = 0; i < chars.length; i++) {
      char curChar = chars[i];
      if (Character.isDigit(curChar)) {
        chars[i] = (char) ('a' + Character.getNumericValue(curChar) - 1);
      } else {
        chars[i] = (char) (curChar + 9);
      }
    }

    return number + ":" + String.valueOf(chars).toUpperCase();
  }

}
