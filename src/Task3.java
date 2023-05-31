import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task3 {

  public static void main(String[] args) {
    /*
    Прочитать с клавиатуры сначала количество записей в телефонной книге,
    а затем сами записи (номер телефона и имя).
    Сохранить эти записи в словаре (телефон (строка) - имя (строка)).
    Спросить имя для удаления.
    Удалить из словаря все телефоны, имя для которых совпадает с указанным.
    Вывести получившийся словарь.
     */
    Scanner scanner = new Scanner(System.in);
    System.out.print("Input count of records:");
    int count = scanner.nextInt();
    scanner.nextLine();
    Map<String,String> phoneBook = new HashMap<>();
    for (int i = 0; i < count; i++) {
      System.out.print("Input name:");
      String name = scanner.nextLine();
      System.out.print("Input phone:");
      String phone = scanner.nextLine();
      phoneBook.put(phone,name);
    }
    System.out.println(phoneBook.size());
    System.out.print("Input name to remove:");
    String nameToRemove = scanner.nextLine();
    Map<String,String> copy = new HashMap<>();
    copy.putAll(phoneBook);
    for (String key: copy.keySet()) {
      if(copy.get(key).equals(nameToRemove)){
        phoneBook.remove(key);
      }
    }
    System.out.println(phoneBook.size());
  }
}
