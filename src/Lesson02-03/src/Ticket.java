import java.time.LocalDateTime;

public class Ticket {

    private LocalDateTime expireDate;
    private int number;

    public Ticket(LocalDateTime expireDate, int number) {
        this.expireDate = expireDate;
        this.number = number;
    }

    public LocalDateTime getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(LocalDateTime expireDate) {
        this.expireDate = expireDate;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
