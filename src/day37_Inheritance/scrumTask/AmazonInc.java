package day37_Inheritance.scrumTask;

public class AmazonInc {

    public static void main(String[] args) {

        String company = "Amazon Inc";

        ProductOwner po = new ProductOwner("Suhaib", 29, 'M',1,160000, company);

        BusinessAnalyst ba = new BusinessAnalyst("Cihad", 30, 'M', 2, 150000, company);

        ScrumMaster sm = new ScrumMaster("Anel", 26, 'F', 3, 145000, company);


        Tester tester1=new Tester("Chinara",32,'F',1415,"QA",125000,company);

        Tester tester2=new Tester("Yasaman",31,'F', 1416,"QA",130000,company);

        Tester tester3=new Tester("Irena",29,'F',1417,"SDET",128000,company);

        Tester tester4=new Tester("Cihad",26,'M',1418,"QA",125000,company);

        Tester[] testers={tester1,tester2,tester3,tester4};


        Developer developer1=new Developer("Max", 40, 'M', 3665, "Senior Java Developer", 180000, company);

        Developer developer2=new Developer("Allison", 18, 'F', 364, "Junior Java Developer", 120000, company);

        Developer developer3=new Developer("Tom", 26, 'M', 3654, "Java Developer", 140000, company);

        Developer developer4=new Developer("Manas", 40, 'M', 6568, "Full Stack Developer", 280000, company);

        Developer developer5=new Developer("Evelyn", 30, 'F', 788, "JS Developer", 160000, company);

        Developer[] developers={developer1,developer2,developer3,developer4,developer5};

        ScrumTeam scrumTeam = new ScrumTeam(po, ba, sm);

        scrumTeam.addDevelopers(developers);
        scrumTeam.addTesters(testers);

        System.out.println(scrumTeam); //ScrumTeam{PO=Suhaib, BA=Cihad, SM=Anel, numberOfTesters=4, numberOfDevelopers=5}

        System.out.println("------------------------------------------------");

        for (Tester tester : scrumTeam.testers) {
            System.out.println(tester.name + " : " + tester.salary);
        }


        System.out.println("------------------------------------------------");

        for (Developer developer : scrumTeam.developers) {
            System.out.println(developer.name + " : " + developer.salary);
        }


    }
}


/*

9. Create a class named AmazonInc:

			create the objects of ProductOwner, ScrumMaster, and BusinessAnalyst
			Create 4 objects of Testers
			Create 5 Objects of Developers

			Create an object of ScrumTeam

			Add the ProductOwner, ScrumMaster, and BusinessAnalyst, Testers and Developers object into the scrum team

 */