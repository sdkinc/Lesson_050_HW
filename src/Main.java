import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

  public static void main(String[] args) {
   /*
    Прочитать с клавиатуры сначала количество целых чисел, а затем сами числа.
    Сохранить эти числа в множестве.
    Удалить из множества все нечётные числа.
    Вывести получившееся множество.
    */

    Scanner scanner = new Scanner(System.in);
    System.out.print("Input count:");
    int count = scanner.nextInt();
    Set<Integer> set = new HashSet<>();
    for (int i = 0; i < count; i++) {
      System.out.println("Input num:");
      set.add(scanner.nextInt());

    }

    System.out.println("Before:" + set.size());
    Set<Integer> copy = new HashSet<>(set);
    for (Integer in : copy) {
      if (in % 2 != 0) {
        set.remove(in);
      }
    }
    System.out.println("After:" + set.size());
  }
}
