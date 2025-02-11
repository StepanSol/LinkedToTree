public class ClassForMap {
    public int value;

    public ClassForMap(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClassForMap that = (ClassForMap) o;
        return value == that.value;
    }

    @Override
    public int hashCode() {
        return 10;
    }
}
