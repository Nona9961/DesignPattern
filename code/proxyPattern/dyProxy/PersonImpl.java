package proxyPattern.dyProxy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonImpl implements Person {
    private String name;

    @Override
    public boolean intro() {
        System.out.println(name);
        return true;
    }
}
