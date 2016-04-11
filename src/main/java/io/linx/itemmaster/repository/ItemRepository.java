package io.linx.itemmaster.repository;

import io.linx.itemmaster.model.Item;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Integer> {

}
