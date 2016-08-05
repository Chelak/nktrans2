package com.nktrans.repository;

import com.nktrans.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by scelac on 8/5/16.
 */
public interface CategoryRepository extends JpaRepository<Category,Long> {
}
