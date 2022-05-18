package kodlamaio.northwind.core.utilities.results;

public class SuccessDataResult<T> extends DataResult<T>{

    public SuccessDataResult(T data, String Message) {
        super(data, true,message);
    }
    public SuccessDataResult(T Data){
        super(data,true);
    }
    public SuccessDataResult(String Message) {
        super(null, true,message);
    }
    public SuccessDataResult() {
        super(null, true);
    }
}
