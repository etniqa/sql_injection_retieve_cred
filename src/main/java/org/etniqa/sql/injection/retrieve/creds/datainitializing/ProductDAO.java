package org.etniqa.sql.injection.retrieve.creds.datainitializing;

import org.etniqa.sql.injection.retrieve.creds.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDAO extends CrudRepository<Product, Long> { }
