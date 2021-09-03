package repository;

import org.springframework.stereotype.Repository;

import entity.PollEntity;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository("pollRepository")
public interface PollRepository extends JpaRepository<PollEntity, Long> {

}
