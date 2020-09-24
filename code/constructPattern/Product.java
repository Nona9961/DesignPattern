package constructPattern;

import lombok.Data;
import lombok.ToString;

/**
 * 产品类
 */
@Data
@ToString
public class Product {
    private String type;
    private String name;
    private String gender;
    private int atk;
    private int def;
}
