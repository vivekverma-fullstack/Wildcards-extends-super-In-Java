import java.util.ArrayList;
import java.util.List;

public class Demo5 {
    public static void main(String[] args) {
        Box<Integer> box = new Box<>();

    }
    public static <T>void fun(T a, T b){      //type perameter

    }
}
class Box<T>{
        T value;
}

// <T> and <?>
// < ? extends l> and < ? super l>