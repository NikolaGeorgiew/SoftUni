package ListyIterator;

import java.util.Iterator;
import java.util.List;

public class ListyIterator implements Iterable<String> {
    private List<String> elements;
    int index = 0;

    public ListyIterator(String... elements) {
        this.elements = List.of(elements);
    }
    public void Create(String... elements) {
        ListyIterator listyIterator = new ListyIterator(elements);
    }
    public boolean HasNext() {
        return index < this.elements.size() -1;
    } public boolean Move() {
        if (index >= elements.size() - 1) {
            return false;
        }
        index++;
        return true;
    }
    public void Print() {
        if (elements.isEmpty()) {
            throw new IllegalStateException("Invalid Operation!");
        }
        System.out.println(elements.get(index));
    }
    public void PrintAll() {
        for (String element : elements) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            int index = 0;
            @Override
            public boolean hasNext() {
                return index < elements.size() -1;
            }

            @Override
            public String next() {
                String result =elements.get(index);
                index++;
                return result;
            }
        };
    }
}
