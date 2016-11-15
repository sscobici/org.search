import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

/**
 * Created by Serghei on 16.11.2016.
 */
public class Test {
    public void test() {
        CriteriaBuilder b = null;
        Root<String> root = null;
        org.search.Predicate pr = null;
        Predicate p = b.greaterThan(root.get("sss"), pr.getValue());
    }
}
