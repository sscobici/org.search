package org.search;

public class Builder {
    public static <T extends Comparable<T>> Predicate eq(String fieldName, T value) {
        return new Predicate(fieldName, Operator.EQ, value);
    }

    public static <T extends Comparable<T>> Predicate gt(String fieldName, T value) {
        return new Predicate(fieldName, Operator.GT, value);
    }

    public static Predicate and(Predicate... predicates) {
        return new Predicate(BooleanOperation.AND, predicates);
    }

    public static Predicate or(Predicate... predicates) {
        return new Predicate(BooleanOperation.OR, predicates);
    }
}
