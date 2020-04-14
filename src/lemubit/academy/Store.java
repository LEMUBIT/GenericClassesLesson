package lemubit.academy;

public class Store<T> {
    T value;

    public Store(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void valueClass() {
        System.out.println(value.getClass());
    }
}
