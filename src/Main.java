import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        /*Дан массив строк, необходимо убрать из него все дубли, оставшиеся строки
        обьединить в одну в порядке следования в массиве*/

        String[] array = {"Dup", "lic", "Dup", "at", "at", "lic", "es"};

        ArrayList nonDup = new ArrayList();

        for (int i = 0; i < array.length; i++) {
            if (!nonDup.contains(array[i])) {
                nonDup.add(array[i]);
            }
        }

        System.out.println(nonDup.toString().replaceAll(", ", "").replace("[","").replace("]",""));
    }
}