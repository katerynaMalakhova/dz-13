package dataproviders;

import people.Man;
import people.Woman;
import org.testng.annotations.DataProvider;

import static utils.DBReader.getPeopleFromDB;

public class TestDataProvider {

    @DataProvider(name = "people")
    public static Object[][] people() {
        return new Object[][]{{new Woman ("WomanFirstName", "WomanLastName", 30), new Man("ManFirstName", "ManLastName", 40)}};
    }
//    @DataProvider(name = "woman")
//    public static Object[][] woman() {
//        return new Object[][]{{new Woman ("WomanFirstName", "WomanLastName", 30)}};
//    }
//    @DataProvider(name = "man")
//    public static Object[][] man() {
//        return new Object[][]{{ new Man("ManFirstName", "ManLastName", 40)}};
//    }
@DataProvider(name = "numbersDB")
public static Object[][] numbersFromDB() {
    return getPeopleFromDB().stream().map(people -> new Object[]{people.getFirstName(), people.getLastName(), people.getAge(), people.getSex()})
            .toArray(Object[][]::new);
}
}
