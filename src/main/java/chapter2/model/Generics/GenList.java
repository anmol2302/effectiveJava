package chapter2.model.Generics;

public class GenList<T> {
    private T t;

    public void add(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }


    public static void main(String[] args) {


        GenList<Integer> integerGenList=new GenList<>();
        integerGenList.add(new Integer(100));
        System.out.println(integerGenList.get());
        GenList<String> stringGenList=new GenList<>();
        stringGenList.add("hjshshsh");
        System.out.println(stringGenList.get());
    }



}
