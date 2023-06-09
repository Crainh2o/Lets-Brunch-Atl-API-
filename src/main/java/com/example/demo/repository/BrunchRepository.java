package com.example.demo.repository;

import com.example.demo.model.BrunchPlaces;
import com.example.demo.model.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrunchRepository extends JpaRepository<BrunchPlaces, Long> {
    BrunchPlaces findByMenuIdAndName(Long menuId, String brunchName);

    BrunchPlaces findByMenuIdAndId(Long menuId, Long brunchId);


}
