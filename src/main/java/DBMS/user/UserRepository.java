package DBMS.user;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.Optional;
@NoRepositoryBean
public interface UserRepository extends CrudRepository<User, Integer> {
    @Override
    default <S extends User> S save(S entity) {
        return null;
    }

    @Override
    default <S extends User> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    default Optional<User> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    default boolean existsById(Integer integer) {
        return false;
    }

    @Override
    default Iterable<User> findAll() {
        return null;
    }

    @Override
    default Iterable<User> findAllById(Iterable<Integer> integers) {
        return null;
    }

    @Override
    default long count() {
        return 0;
    }

    @Override
    default void deleteById(Integer integer) {

    }

    @Override
    default void delete(User entity) {

    }

    @Override
    default void deleteAllById(Iterable<? extends Integer> integers) {

    }

    @Override
    default void deleteAll(Iterable<? extends User> entities) {

    }

    @Override
    default void deleteAll() {

    }
}
