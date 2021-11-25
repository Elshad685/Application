package classes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum Division {
    AZN(2, 1),
    thousandAZN(1, 1000),
    millionAZN(1, 1_000_000);
    private int roundParam;
    private int divideParam;

}
