package com.nktrans.repository;

import com.nktrans.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by scelac on 8/5/16.
 */
@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
}
