package com.nktrans.repository;

import com.nktrans.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by scelac on 8/5/16.
 */
@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {
}
