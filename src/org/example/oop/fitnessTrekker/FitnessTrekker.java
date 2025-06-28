package org.example.oop.fitnessTrekker;

public class FitnessTrekker {
    public static void main(String[] args) {
        AccountSportsmen firstSportsmen = new AccountSportsmen("Jen",27,3,1986,"jen@mail.com",
                "555-123-4567","Alice", 90.1, 110, 10000);

        AccountSportsmen secondSportsmen = new AccountSportsmen("Nej",26,2,2003,"nej@mail.com",
                "555-987-4567","Ecila", 89.1, 110, 10000);

        AccountSportsmen thirdSportsmen = new AccountSportsmen("Bob",26,2,1995,"bob@mail.com",
                "555-987-2222","Marley", 89.1, 110, 10000);

        AccountSportsmen fourthSportsmen = new AccountSportsmen("Jack",26,2,2007,"jack@mail.com",
                "555-987-1111","Chan", 89.1, 110, 10000);

        AccountSportsmen fifthSportsmen = new AccountSportsmen("Kcaj",26,2,1965,"ksaj@mail.com",
                "555-987-7777","Chan", 89.1, 110, 10000);

        firstSportsmen.printAccountInfo();
        secondSportsmen.printAccountInfo();
        thirdSportsmen.printAccountInfo();
        fourthSportsmen.printAccountInfo();
        fifthSportsmen.printAccountInfo();

        fifthSportsmen.setSurname("Nach");
        fifthSportsmen.setPressure(130);
        fifthSportsmen.printAccountInfo();

        secondSportsmen.setSteps(5035);
        secondSportsmen.setWeight(74);
        secondSportsmen.printAccountInfo();
    }
}
