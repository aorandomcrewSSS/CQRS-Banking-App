package com.cqrs.cqrsbankingapp.service;

public interface CommandService<T> {

    void create(T object);

}
