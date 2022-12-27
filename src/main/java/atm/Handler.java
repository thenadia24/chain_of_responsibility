package atm;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter
@AllArgsConstructor
public abstract class Handler {
    int hnd_pr;
    public Handler next;
    public abstract void process(int price);
}