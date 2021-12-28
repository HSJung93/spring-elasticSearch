package com.elliot.elastic.repository;

import com.elliot.elastic.document.Person;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface PersonRepository extends ElasticsearchRepository<Person, String> {


}
