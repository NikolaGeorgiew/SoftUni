package shelter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Shelter {
    private int capacity;
    private List<Animal> data;

    public Shelter(int capacity) {
        this.capacity = capacity;
        this.data = new ArrayList<>();

    }
    public void add(Animal animal) {
        if (data.size() < capacity) {
            data.add(animal);
        }
    }
    public boolean remove(String name) {
        return data.removeIf(a -> a.getName().equals(name));
    }
    public Animal getAnimal(String name, String caretaker) {
        for (Animal animal : data) {
            if (animal.getName().equals(name) && animal.getCaretaker().equals(caretaker)){
                return animal;
            }
        }
        return null;
    }
    public Animal getOldestAnimal() {
         return data.stream().max(Comparator.comparingInt(Animal::getAge))
                .orElse(null);
    }
    public int getCount() {
        return data.size();

    }
    public String getStatistics() {
        StringBuilder sb = new StringBuilder();
        sb.append("The shelter has the following animals:");
        if (!data.isEmpty()){
            for (Animal animal : data) {
                sb.append(System.lineSeparator());
                sb.append(animal.getName()).append(" ").append(animal.getCaretaker());
            }
        }

        return sb.toString().trim();
    }
}
