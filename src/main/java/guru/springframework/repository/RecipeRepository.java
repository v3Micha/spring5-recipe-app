package guru.springframework.repository;

import guru.springframework.domain.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by ev-3micha on 11/18/2017.
 */
public interface RecipeRepository extends JpaRepository<Recipe, Long> {

}
