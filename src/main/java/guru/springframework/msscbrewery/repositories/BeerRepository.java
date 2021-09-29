package guru.springframework.msscbrewery.repositories;

import java.util.UUID;

import org.springframework.data.repository.PagingAndSortingRepository;

import guru.springframework.msscbrewery.domain.Beer;

public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {

}
