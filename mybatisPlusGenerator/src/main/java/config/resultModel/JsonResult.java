package config.resultModel;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class JsonResult<T> {

    private Integer code;

    private String msg;

    private T data;

    private JsonResult(){
        this.code = CodeMsg.SUCCESS.getCode();
        this.msg = CodeMsg.SUCCESS.getMsg();
    }

    private JsonResult(T data){
        this.code = CodeMsg.SUCCESS.getCode();
        this.msg = CodeMsg.SUCCESS.getMsg();
        this.data = data;
    }

    private JsonResult(CodeMsg codeMsg){
        if (codeMsg == null){
            return;
        }
        this.code = codeMsg.getCode();
        this.msg = codeMsg.getMsg();
    }

    public static <T> JsonResult<T> success(){
        return new JsonResult<T>();
    }

    public static <T> JsonResult<T> success(T data){
        return new JsonResult<T>(data);
    }

    public static <T> JsonResult<T> error(CodeMsg codeMsg){
        return new JsonResult<T>(codeMsg);
    }
}