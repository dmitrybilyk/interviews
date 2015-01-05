package guava.base;

import com.google.common.base.Function;
import com.google.common.base.Functions;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.learn.guava.guava.geo.Country;
import com.learn.guava.guava.geo.ModifiedCountry;
import org.bouncycastle.util.Strings;
import org.jetbrains.annotations.Nullable;
import org.testng.annotations.Test;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import static org.fest.assertions.Assertions.assertThat;

/**
 * Class to show how Functions in Guava works
 * Function is used to transform one list of values to another list with modified values
 */

public class FunctionsTest {

    @Test
    public void shouldPrintCountryWithCapitalCityUpperCase() throws Exception {

        // given
        Function<Country, String> capitalCityFunction = new Function<Country, String>() {
            public String apply(@Nullable Country country) {
                if (country == null) {
                    return "";
                }
                return country.getCapitalCity();
            }
        };

        // when
        Collection<String> capitalCities = Collections2.transform(Country.getSomeCountries(), capitalCityFunction);

        // then
        assertThat(capitalCities).contains("Warsaw", "Madrid");


//      to make all countries with using capital letters
      Function<Country, Country> turnToCapitalLetters = new Function<Country, Country>() {
        @Nullable
        @Override
        public Country apply(@Nullable Country input) {
          assert input != null;
          input.setName(Strings.toUpperCase(input.getName()));
          return input;
        }
      };

      Collection<Country> capitalizedCountries = Collections2.transform(Country.getSomeCountries(), turnToCapitalLetters);

      for (Country capitalizedCountry : capitalizedCountries) {
        System.out.println(capitalizedCountry.getName());
      }


//      to modified country

      Function<Country, ModifiedCountry> toModifiedCountry = new Function<Country, ModifiedCountry>() {
        @Nullable
        @Override
        public ModifiedCountry apply(@Nullable Country input) {
          ModifiedCountry newModifiedCountry = new ModifiedCountry();
          assert input != null;
          newModifiedCountry.setName(input.getName());
          return newModifiedCountry;
        }
      };

      Collection<ModifiedCountry> modifiedCountries = Collections2.transform(Country.getSomeCountries(), toModifiedCountry);

      for (ModifiedCountry modifiedCountry : modifiedCountries) {
        System.out.println(modifiedCountry.getName());
      }

    }

    @Test
    public void shouldComposeTwoFunctions() throws Exception {
        Function<Country, String> upperCaseFunction = new Function<Country, String>() {
            public String apply(@Nullable Country country) {
                if (country == null) {
                    return "";
                }
                return country.getCapitalCity().toUpperCase();
            }
        };

        Function<String, String> reverseFunction = new Function<String, String>() {
            public String apply(String string) {
                if(string == null) {
                    return null;
                }
                return new StringBuilder(string).reverse().toString();
            }
        };
        Function<Country, String> composedFunction = Functions.compose(reverseFunction, upperCaseFunction);

        // when
        Collection<String> reversedCapitalCities = Collections2.transform(Country.getSomeCountries(), composedFunction);

        // then
        assertThat(reversedCapitalCities).contains("WASRAW", "DIRDAM");
    }

    @Test
    public void shouldUseForMapFunction() throws Exception {

        // given
        Map<String, String> map = Maps.newHashMap();
        map.put(Country.POLAND.getName(), Country.POLAND.getCapitalCity());
        map.put(Country.BELGIUM.getName(), Country.BELGIUM.getCapitalCity());
        map.put(Country.SPAIN.getName(), Country.SPAIN.getCapitalCity());
        map.put(Country.ENGLAND.getName(), Country.ENGLAND.getCapitalCity());

        // when
        Function<String, String> capitalCityFromCountryName = Functions.forMap(map);

        List<String> countries = Lists.newArrayList();
        countries.add(Country.POLAND.getName());
        countries.add(Country.BELGIUM.getName());

        // then
        Collection<String> capitalCities = Collections2.transform(countries, capitalCityFromCountryName);

        assertThat(capitalCities).containsOnly(Country.POLAND.getCapitalCity(), Country.BELGIUM.getCapitalCity());
    }

    @Test(expectedExceptions = IllegalArgumentException.class, expectedExceptionsMessageRegExp = "Key 'Belgium' not present in map")
    public void shouldUseForMapFunctionWithNonExistingKey() throws Exception {

        // given
        Map<String, String> map = Maps.newHashMap();
        map.put(Country.POLAND.getName(), Country.POLAND.getCapitalCity());

        // we omit this one intentionally
        // map.put(Country.BELGIUM.getName(), Country.BELGIUM.getCapitalCity());
        map.put(Country.SPAIN.getName(), Country.SPAIN.getCapitalCity());
        map.put(Country.ENGLAND.getName(), Country.ENGLAND.getCapitalCity());

        // when
        Function<String, String> capitalCityFromCountryName = Functions.forMap(map);

        List<String> countries = Lists.newArrayList();
        countries.add(Country.POLAND.getName());
        countries.add(Country.BELGIUM.getName());

        // then
        Collection<String> capitalCities = Collections2.transform(countries, capitalCityFromCountryName);

        assertThat(capitalCities).containsOnly(Country.POLAND.getCapitalCity(), Country.BELGIUM.getCapitalCity());
    }

    @Test
    public void shouldUseForMapFunctionWithDefaultValue() throws Exception {

        // given
        Map<String, String> map = Maps.newHashMap();
        map.put(Country.POLAND.getName(), Country.POLAND.getCapitalCity());

        // we omit this one intentionally
        // map.put(Country.BELGIUM.getName(), Country.BELGIUM.getCapitalCity());
        map.put(Country.SPAIN.getName(), Country.SPAIN.getCapitalCity());
        map.put(Country.ENGLAND.getName(), Country.ENGLAND.getCapitalCity());

        // when
        Function<String, String> capitalCityFromCountryName = Functions.forMap(map, "Unknown");

        List<String> countries = Lists.newArrayList();
        countries.add(Country.POLAND.getName());
        countries.add(Country.BELGIUM.getName());

        // then
        Collection<String> capitalCities = Collections2.transform(countries, capitalCityFromCountryName);

        assertThat(capitalCities).containsOnly(Country.POLAND.getCapitalCity(), "Unknown");
    }
}