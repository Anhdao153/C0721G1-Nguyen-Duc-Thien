package Furuma_Resort_Case_Study.services;

import Furuma_Resort_Case_Study.models.Customer;

public interface Service<T> {
     public T edit();
     public void add(T t);
     public void delete();
     public void freefood();
     public void freebeverage();
}
