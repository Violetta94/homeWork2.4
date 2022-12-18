package Different;

import java.util.Objects;

public class ClassAiB {
    private final int a;
    private final int b;

    public ClassAiB(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClassAiB aClass = (ClassAiB) o;
        return a == aClass.a && b == aClass.b || a == aClass.b && b == aClass.a;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(a) + Objects.hashCode(b);
    }

    @Override
    public String toString() {
        return  a + " * " + b +
                " = " + a *b ;
    }
}
