package org.openlmis.rearchpoc.reference.repository;

import org.openlmis.rearchpoc.reference.domain.User;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserRepository extends PagingAndSortingRepository<User, Long> {
}
