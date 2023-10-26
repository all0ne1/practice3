package practice2;

import java.util.*;

public class Hospital {
    public static void main(String[] args) throws InterruptedException {

        Cabinet checkUp = new Cabinet("чек-ап у терапевта");
        Cabinet mrt = new Cabinet("МРТ");

        List<Person> queue1 = new ArrayList<>();
        List<Thread> queue2 = new ArrayList<>();


        int id = 0;
        while (true){
            Person person = new Person(id++);
            person.appointment(checkUp, mrt);
            Thread thread = new Thread(person);
            thread.start();
            Thread.sleep(new Random().nextInt(2000));
        }
    }
}
