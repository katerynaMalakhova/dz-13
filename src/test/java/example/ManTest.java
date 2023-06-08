package example;

import people.Man;
import people.Woman;
import dataproviders.TestDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;



public class ManTest {
    private Woman woman;
    private Man man;
    //private static final Logger log = LogManager.getLogger(ManTest.class);

    @Test(groups = "smoke", dataProvider = "man", dataProviderClass = TestDataProvider.class)
    public void getFirstNameTest(Man man){Assert.assertEquals(man.getFirstName(), "ManFirstName", "First name is wrong\n");
    }
    @Test(groups = "smoke", dataProvider = "man", dataProviderClass = TestDataProvider.class)
    public void setFirstNameTest(Man man){
        man.setFirstName("changedFirstName");
        Assert.assertEquals(man.getFirstName(), "changedFirstName", "First name was not reset\n");
    }
    @Test(groups = "smoke", dataProvider = "man", dataProviderClass = TestDataProvider.class)
    public void getLastNameTest(Man man){
        Assert.assertEquals(man.getLastName(), "ManLastName", "Last name is wrong\n");
    }
    @Test(groups = "smoke", dataProvider = "man", dataProviderClass = TestDataProvider.class)
    public void setLastNameTest(Man man){
        man.setLastName("changedLastName");
        Assert.assertEquals(man.getLastName(), "changedLastName", "Last name was not reset\n");
    }
    @Test(groups = "smoke", dataProvider = "man", dataProviderClass = TestDataProvider.class)
    public void getAgeTest(Man man){
        Assert.assertEquals(man.getAge(), 40,"Age is wrong\n");;
    }
    @Test(groups = "smoke", dataProvider = "man", dataProviderClass = TestDataProvider.class)
    public void setAgeTest(Man man){
        man.setAge(31);
        Assert.assertEquals(man.getAge(), 31,"Age was not reset\n");;
    }
    @Test(groups = "smoke", dataProvider = "man", dataProviderClass = TestDataProvider.class)
    public void getSexTest(Man man){
        Assert.assertEquals(man.getSex(), "male","Sex is wrong\n");;
    }
    @Test(groups = "smoke", dataProvider = "man", dataProviderClass = TestDataProvider.class)
    public void setSexTest(Man man){
        man.setSex("female");
        Assert.assertEquals(man.getSex(), "female", "Sex was not reset\n");;
    }
    @Test(dataProvider = "man", dataProviderClass = TestDataProvider.class)
    public void isNotRetiredTest(Man man){
        man.setAge(64);
        Assert.assertEquals(man.isRetired(man), false,"Retirement indicated wrong (the man is not retired)\n");;
    }
    @Test(dataProvider = "man", dataProviderClass = TestDataProvider.class)
    public void isRetiredTest(Man man){
        man.setAge(65);
        Assert.assertEquals(man.isRetired(man), true,"Retirement indicated wrong (the man is retired)\n");;
    }
    @Test(groups = "smoke", dataProvider = "man", dataProviderClass = TestDataProvider.class)
    public void getPartnerTest(Man man){
        Assert.assertEquals(man.getPartner(), null, "Wrong! No partner is registered\n");
    }
    @Test(groups = "smoke", dataProvider = "people", dataProviderClass = TestDataProvider.class)
    public void setPartnerTest(Woman woman, Man man){
        man.setPartner(woman);
        Assert.assertEquals(man.getPartner(), woman, "Partner is set correctly\n");
        man.setPartner(null);
    }

    @Test(dataProvider = "people", dataProviderClass = TestDataProvider.class)
    public void registerPartnershipTest(Woman woman, Man man) {
        man.registerPartnership(woman);
        Assert.assertEquals(man.getPartner(), woman, "Registration of partnership failed. Partner is not set\n");
     }
    @Test(dataProvider = "man", dataProviderClass = TestDataProvider.class)
    public void deregisterPartnershipTest(Man man) {
        man.deregisterPartnership();
        Assert.assertEquals(man.getPartner(), null, "Deregistration of partnership failed. Partner is still set\n");
    }

}
