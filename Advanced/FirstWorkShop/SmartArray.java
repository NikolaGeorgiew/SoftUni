package FirstWorkShop;

public class SmartArray<T> {
    Object[] elements;
    int size;

    public SmartArray() {
        this.elements = new Object[4];
        this.size = 0;
    }
    public void add(T element) {
        if (this.size == this.elements.length) {
            this.elements = grow();
        }
        this.elements[size] = element;
        size++;
    }
    public T get(int index) {
        validateIndex(index);
        return  (T)this.elements[index];

    }
    public boolean contains(T element) {
        for (int i = 0; i < this.elements.length; i++) {
            if (element == this.elements[i]){
                return true;
            }
        }
        return false;
    }
    public void add(int index, T element) {
        validateIndex(index);
        T lastElement = (T)this.elements[size -1];
        for (int i = size - 1; i > index ; i--) {
            this.elements[i] = this.elements[i - 1];
        }
        this.elements[index] = element;
        this.add(lastElement);
    }
    public Object[] shrink (){
        Object[] newElements =  new Object[this.elements.length -1];
        System.arraycopy(this.elements,0,newElements,0,newElements.length);

        return newElements;

    }
    public T remove(int index) {
        validateIndex(index);
        T element = (T)this.elements[index];
        for (int i = 0; i < size -1; i++) {
            this.elements[i] = this.elements[i + 1];
        }
        elements[size -1] = null;
        this.size--;

        if (this.elements.length > 4 && this.size <= this.elements.length /4) {
            this.elements = shrink();
        }
        return element;
    }
    public Object[] grow() {
        Object[] newElements = new Object[size * 2];
        System.arraycopy(this.elements,0,newElements,0,this.elements.length);
        return newElements;
    }
    public void validateIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index is OutOfBounds");
        }
    }
}
