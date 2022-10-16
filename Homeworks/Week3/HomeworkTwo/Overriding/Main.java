package Homeworks.Week3.HomeworkTwo.Overriding;

public class Main {

    public static void main(String[] args) {

        BaseCreditManager[] creditManagers = new BaseCreditManager[] { new TeacherCreditManager(),
                new AgricultureCreditManager(), new StudentCreditManager(), new BaseCreditManager() };

        for (BaseCreditManager creditManager : creditManagers) {

            System.out.println(creditManager.calculate(1000));

        }

    }

}
