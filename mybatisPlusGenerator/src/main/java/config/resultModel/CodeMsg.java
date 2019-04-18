package config.resultModel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum CodeMsg {
    SUCCESS(0, "success");

    private Integer code;

    private String msg;
}
