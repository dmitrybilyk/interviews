package guava.base;

import com.learn.guava.guava.PreconditionsLesson;
import org.testng.annotations.Test;

import java.util.Arrays;

/**
 * This class allows to check correctness of parameters
 * passed to our method and throw an appropriate
 * exception when necessary
 */

public class PreconditionsTest {

    PreconditionsLesson preconditionsLesson = new PreconditionsLesson();

    @Test(expectedExceptions = IllegalStateException.class, expectedExceptionsMessageRegExp =
            "Weather is not the best for a sunbath")
    public void shouldThrowIllegalState() throws Exception {

       preconditionsLesson.getSomeSuntan(PreconditionsLesson.Weather.CLOUDY);
    }

    @Test(expectedExceptions = NullPointerException.class, expectedExceptionsMessageRegExp =
            "Team can not be null")
    public void shouldNotAcceptNullFootballTeam() throws Exception {

        // when
        preconditionsLesson.displayFootballTeamMembers(null);
    }

    @Test(expectedExceptions = IllegalArgumentException.class, expectedExceptionsMessageRegExp =
            "Full team should consist of 11 players")
    public void shouldNotAcceptNotFullFootballTeam() throws Exception {

        // when
        preconditionsLesson.displayFootballTeamMembers(Arrays.asList("Casillas", "Pepe", "Ramos", "Marcelo"));
    }


}
