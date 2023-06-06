import models.CatWeightComparator;
import models.Cat;
import models.CatBox;

public class Main {
    public static void main(String[] args) {
        CatBox catBox = new CatBox();
        catBox
                .addCat(new Cat("Lalka",1, "Red", 4.3f))
                .addCat(new Cat("Luci", 6, "White", 4.1f))
                .addCat(new Cat("Fufik",3, "Black",3.6f))
                .addCat(new Cat("Pushistaya", 2, "White", 4.0f));
        System.out.println("Посмотрим на котиков в коробке:");
        for (Cat cat: catBox) {
            System.out.println(cat);
        }
        System.out.println("Перебираем параметры котейки по имени \"Фурия\":");
        Cat cat1 = new Cat("Furiya", 7, "Dark", 5.5f);
        while (cat1.hasNext()){
            System.out.println(cat1.next());
        }

        //сортируем котеек по дефолтному признаку (возраст)
        catBox.sort();
        System.out.println("Отсортированные котейки по дефолтному признаку (возраст):");
        for (Cat cat: catBox) {
            System.out.println(cat);
        }

        //сортируем котеек с помощью компаратора (по весу)
        catBox.sort(new CatWeightComparator());//пропиши внутри такой случай
        System.out.println("Отсортированные котейки по компаратору (вес):");
        for (Cat cat: catBox) {
            System.out.println(cat);
        }

    }
}