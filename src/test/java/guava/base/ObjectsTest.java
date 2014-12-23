package guava.base;


import com.learn.guava.guava.UserProfile;
import org.testng.annotations.Test;

import static org.fest.assertions.Assertions.assertThat;


/**
 * helps to implement equals(), hashcode() and toString methods. Also contains firstNonNull useful method
 */

@Test
public class ObjectsTest {

    UserProfile objectsLesson = new UserProfile("name", "nickname", 20);
    UserProfile objectsLesson2 = new UserProfile("name", "nickname", 20);
    UserProfile nullNicknameObject = new UserProfile("name", null, 20);

    @Test
    public void shouldTestEquals() throws Exception {

        assertThat(objectsLesson).isEqualTo(objectsLesson2);
    }

    @Test
    public void shouldTestHashcode() throws Exception {

        assertThat(objectsLesson.hashCode()).isEqualTo(objectsLesson2.hashCode());
    }

    @Test
    public void shouldRenderNameAsDisplayableName() throws Exception {

        // then
        assertThat(nullNicknameObject.getDisplayName()).isEqualTo("name");
    }

    @Test
    public void shouldShowHowToStringMethodWorks() throws Exception {

        assertThat(objectsLesson.toString())
                .isEqualTo("UserProfile{name=name, nickname=nickname, 20}");

    }
}
