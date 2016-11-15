package org.search;

import java.util.Arrays;
import java.util.stream.Stream;

public class Predicate<T extends Comparable<T>> {
    private String fieldName;
    private Operator operator;
    private T value;
    private BooleanOperation booleanOperation;
    private Predicate[] predicates;

    public Predicate(String fieldName, Operator operator, T value) {
        this.fieldName = fieldName;
        this.operator = operator;
        this.value = value;
    }

    public Predicate(BooleanOperation booleanOperation, Predicate[] predicates) {
        this.booleanOperation = booleanOperation;
        this.predicates = predicates;
    }

    public String getFieldName() {
        return fieldName;
    }

    public Operator getOperator() {
        return operator;
    }

    public T getValue() {
        return value;
    }

    public BooleanOperation getBooleanOperation() {
        return booleanOperation;
    }

    public Stream<Predicate> getPredicates() {
        return Arrays.stream(predicates);
    }
}