package ru.neoflex.practice.controller;

import javax.persistence.*;

@Entity
@Table(name = "calculations")
public class Calculation {

    private long id;
    private int a;
    private String operation;
    private int b;
    private int result;
    public Calculation() {

    }
    public Calculation(int a, String operation, int b, int result ) {
        this.a = a;
        this.b = b;
        this.operation = operation;
        this.result = result;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    @Column(name = "a", nullable = false)
    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }
    @Column(name = "operation", nullable = false)
    public String getOperation() {
        return operation;
    }
    public void setOperation(String operation) {
        this.operation = operation;
    }
    @Column(name = "b", nullable = false)
    public int getB() {
        return b;
    }
    public void setB(int b) {
        this.b = b;
    }
    @Column(name = "result", nullable = false)
    public int getResult() {
        return result;
    }
    public void setResult(int result) {
        this.result = result;
    }
}
