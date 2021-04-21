public class Human {

    private String name;
    private String surname;
    private int age;

    public  Human(String name,String surname,int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String toString(){
        return this.getClass().getName() + ":"+ this.getName()+" "+getSurname()+" "+getAge();
    }


    public static void main(String[] args) {
        Person person1 = new Person("Leonid","Bars",23);

        Human human = new Human("Default","Unknown",34);

        getClassInfo(person1);
        getClassInfo(human);


        Object [] humans = new Object[6];

        int humanCount = 0;
        int personCount = 0;

         humans[0] = new Human("Leonid","Bars",34);
         humans[1] = new Human("Leonid","Bars",34);
         humans[2] = new Human("Leonid","Bars",34);
         humans[3] = new Person("Leonid","Bars",34);
         humans[4] = new Person("Leonid","Bars",34);
         humans[5] = new Person("Leonid","Bars",34);

        for(Object val:humans){

            if (val.getClass() == Human.class){
                humanCount++;
            }
            if(val.getClass() == Person.class){
                personCount++;
            }

        }
        System.out.println(humanCount);
        System.out.println(personCount);

    }

    public static void getClassInfo(Object object){
        System.out.println(object.toString());

    }



}

//TODO: Что такое InstanceOf()  Переписать масивы класов и счеткики через InstanseOf()



// TODO: Создать несколько классоа Burger , Cheeseburger , BigMac . Создать клас Order который будет хранить в себе масив обьектов  и Создать класс OrderBuilder
// Todo: который будет состоять из
