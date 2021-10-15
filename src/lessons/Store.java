package lessons;

public class Store<E extends CarObject, T, S> {

    private E[] data;
    private T otherData;
    private S changeFilter;

    public E[] getData() {
        return data;
    }

    public void setData(E[] data) {
        this.data = data;
    }

    public T getOtherData() {
        return otherData;
    }

    public void setOtherData(T otherData) {
        this.otherData = otherData;
    }

    public S getChangeFilter() {
        return changeFilter;
    }

    public void setChangeFilter(S changeFilter) {
        this.changeFilter = changeFilter;
    }
}
