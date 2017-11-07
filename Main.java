package malyar;
/*Написать метод, который создаст список, положит в него 10
элементов, затем удалит первые два и последний, а затем выведет
результат на экран.*/

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            a.add((int) (Math.random() * 100));
        }
        System.out.println(a);

        a.remove(1);
        a.remove(2);
        a.remove(a.size()-1);

        System.out.println(a);
    }
}

