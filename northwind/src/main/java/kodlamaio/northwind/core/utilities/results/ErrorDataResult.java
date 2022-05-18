package kodlamaio.northwind.core.utilities.results;

public class ErrorDataResult<T> extends DataResult<T>{

    public ErrorDataResult(T data, String Message) {
        super(data, false,message);
    }
    public ErrorDataResult(T Data){
        super(data,false);
    }
    public ErrorDataResult(String Message) {
        super(null, false,message);
    }
    public ErrorDataResult() {
        super(null, false);
    }
}
