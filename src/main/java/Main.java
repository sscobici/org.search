import org.search.Builder;
import org.search.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate predicate = Builder.or(
                Builder.and(
                        Builder.eq("sss", 100L),
                        Builder.eq("aaa", "some")),
                Builder.eq("sss", 100L),
                Builder.gt("aaa", "some"));

        predicate = Builder.or(predicate, Builder.gt("www", 10));

        System.out.println("some");
    }
}