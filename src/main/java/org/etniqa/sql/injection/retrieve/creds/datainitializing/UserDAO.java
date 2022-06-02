package org.etniqa.sql.injection.retrieve.creds.datainitializing;

import org.etniqa.sql.injection.retrieve.creds.model.Product;
import org.etniqa.sql.injection.retrieve.creds.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO extends CrudRepository<User, Long> { }
