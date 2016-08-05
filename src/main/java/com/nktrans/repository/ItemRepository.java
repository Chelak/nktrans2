package com.nktrans.repository;

import com.nktrans.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by scelac on 8/5/16.
 */
public interface ItemRepository extends JpaRepository<Item, Long> {
}
