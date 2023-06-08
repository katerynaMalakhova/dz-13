package example;

import people.Man;
import people.Woman;
import dataproviders.TestDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WomanTest {

private Woman woman;
private Man man;

    @Test(groups = "smoke", dataProvider = "woman", dataProviderClass = TestDataProvider.class)
    public void getFirstNameTest(Woman woman){
        Assert.assertEquals(woman.getFirstName(), "WomanFirstName", "First name is wrong\n");
    }
    @Test(groups = "smoke", dataProvider = "woman", dataProviderClass = TestDataProvider.class)
    public void setFirstNameTest(Woman woman){
        woman.setFirstName("changedFirstName");
        Assert.assertEquals(woman.getFirstName(), "changedFirstName", "First name was not reset\n");
    }
    @Test(groups = "smoke", dataProvider = "woman", dataProviderClass = TestDataProvider.class)
    public void getLastNameTest(Woman woman){
        Assert.assertEquals(woman.getLastName(), "WomanLastName", "Last name is wrong\n");
    }
    @Test(groups = "smoke", dataProvider = "woman", dataProviderClass = TestDataProvider.class)
    public void setLastNameTest(Woman woman){
        woman.setLastName("changedLastName");
        Assert.assertEquals(woman.getLastName(), "changedLastName", "Last name was not reset\n");
    }
    @Test(groups = "smoke", dataProvider = "woman", dataProviderClass = TestDataProvider.class)
    public void getMaidenNameTest(Woman woman){
        Assert.assertEquals(woman.getMaidenName(), "WomanLastName", "Maiden name is wrong\n");
    }

    @Test(groups = "smoke", dataProvider = "woman", dataProviderClass = TestDataProvider.class)
    public void getAgeTest(Woman woman){
        Assert.assertEquals(woman.getAge(), 30,"Age is wrong\n");;
    }
    @Test(groups = "smoke", dataProvider = "woman", dataProviderClass = TestDataProvider.class)
    public void setAgeTest(Woman woman){
        woman.setAge(31);
        Assert.assertEquals(woman.getAge(), 31,"Age was not reset\n");;
    }
    @Test(groups = "smoke", dataProvider = "woman", dataProviderClass = TestDataProvider.class)
    public void getSexTest(Woman woman){
        Assert.assertEquals(woman.getSex(), "female","Sex is wrong\n");;
    }
    @Test(groups = "smoke", dataProvider = "woman", dataProviderClass = TestDataProvider.class)
    public void setSexTest(Woman woman){
        woman.setSex("male");
        Assert.assertEquals(woman.getSex(), "male", "Sex was not reset\n");;
    }
    @Test(dataProvider = "woman", dataProviderClass = TestDataProvider.class)
    public void isNotRetiredTest(Woman woman){
        woman.setAge(59);
        Assert.assertEquals(woman.isRetired(woman), false,"Retirement indicated wrong (the woman is not retired)\n");;
    }
    @Test(dataProvider = "woman", dataProviderClass = TestDataProvider.class)
    public void isRetiredTest(Woman woman){
        woman.setAge(60);
        Assert.assertEquals(woman.isRetired(woman), true,"Retirement indicated wrong (the woman is retired)\n");;
    }
    @Test(groups = "smoke", dataProvider = "woman", dataProviderClass = TestDataProvider.class)
    public void getPartnerTest(Woman woman){
        Assert.assertEquals(woman.getPartner(), null, "Wrong! No partner is registered\n");
    }
    @Test(groups = "smoke", dataProvider = "people", dataProviderClass = TestDataProvider.class)
    public void setPartnerTest(Woman woman, Man man){
        woman.setPartner(man);
        Assert.assertEquals(woman.getPartner(), man, "Partner is set correctly\n");
        woman.setPartner(null);
    }

    @Test(dataProvider = "people", dataProviderClass = TestDataProvider.class)
    public void registerPartnershipTest(Woman woman, Man man) {
        woman.registerPartnership(man);
        Assert.assertEquals(woman.getPartner(), man, "Registration of partnership failed. Partner is not set\n");
        Assert.assertEquals(woman.getLastName(), man.getLastName(), "Registration of partnership failed. LastName was not changed\n");
    }
    @Test(dataProvider = "woman", dataProviderClass = TestDataProvider.class)
    public void deregisterPartnershipTest(Woman woman) {
        woman.deregisterPartnership();
        Assert.assertEquals(woman.getPartner(), null, "Deregistration of partnership failed. Partner is still set\n");
        Assert.assertEquals(woman.getLastName(), woman.getMaidenName(), "Deregistration of partnership failed. LastName was not updated\n");
    }

}
