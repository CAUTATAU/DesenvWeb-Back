package com.example.Back_end.Web.Repositories;

import com.example.Back_end.Web.Entities.Passeio.Passeio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PasseioRepository extends JpaRepository<Passeio, Integer> {
}
