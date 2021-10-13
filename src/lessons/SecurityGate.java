package lessons;

import java.util.Objects;

public class SecurityGate {

    private Boolean safe;
    private Police police;
    private int id;

    public SecurityGate(Boolean safe, Police police, int id) {
        this.safe = safe;
        this.police = police;
        this.id = id;
    }

    public Boolean getSafe() {
        return safe;
    }

    public void setSafe(Boolean safe) {
        this.safe = safe;
    }

    public Police getPolice() {
        return police;
    }

    public void setPolice(Police police) {
        this.police = police;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "SecurityGate{" +
                "safe=" + safe +
                ", police=" + police +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SecurityGate that = (SecurityGate) o;
        return id == that.id && Objects.equals(safe, that.safe) && Objects.equals(police, that.police);
    }

    @Override
    public int hashCode() {
        return Objects.hash(safe, police, id);
    }
}