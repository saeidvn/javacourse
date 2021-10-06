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
}
