package guava.base;

import com.google.common.base.Optional;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.base.Strings;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.learn.guava.guava.geo.Continent;
import com.learn.guava.guava.geo.Country;
import org.testng.annotations.Test;

import javax.annotation.Nullable;
import java.util.Arrays;

import static org.fest.assertions.Assertions.assertThat;
import static org.testng.Assert.assertFalse;


/**
 * Features of Predicates class
 * Predicated used to filter passed object
 */
public class OptionalTest {

    @Test
    public void nullPointerCheckWithOptional() throws Exception {

//        Country country = new Country(100l, "nameOFCountry", "300000", 10000d, Continent.AFRICA, 2);
        Country country = new Country(100l, null, "300000", 10000d, Continent.AFRICA, 2);
        Optional<String> optional = Optional.of(country.getName());
        System.out.println(optional.isPresent() ? country.getName().length() : "noName");
//        System.out.println(country.getName().length());

    }

}
