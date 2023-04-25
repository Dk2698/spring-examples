package com.kumar.springexamples.mongo;

import org.springframework.data.repository.CrudRepository;

public interface OrderRepository
        extends CrudRepository<TacoOrder, String> {

}
