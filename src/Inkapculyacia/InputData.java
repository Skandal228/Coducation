package Inkapculyacia;



/*Требуется создать программу через которую конечный пользователь может обращаться к переменным, чтобы задать имя
 и возраст, не обращаясь напрямую к исходным данным класса Person. Это нужно для того чтобы разработчик мог внести определенные условия,
 проверку и изменения в самих данных класса. А пользователю не должен трогать внутреннее устройство программы.
 для ввода пользователем своих данных.*/


public class InputData {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();

        person1.setName(" "); // эти методы на экран не выведут информацию поэтому тпереь нужно написать
        person1.setAge(- 15);        // через sout что и метода getName и age
        System.out.println("Вы ввели имя: " + person1.getName());
        System.out.println("Вы ввели возраст: " + person1.getAge());

    }
}
class Person{
    private String name; // обязательно делаем невидимые переменные другим классам
    private int age;

    public void setName(String userName){
        if (userName.isEmpty()){ // теперь мы грейдим код для того чтобы пользователь мог ввести не пустую строку, а точно что-то
            System.out.println("Ты ввел пустое имя");
        }else {
            name = userName;}
    }

    public String getName (){
        return name;
    }
    public void setAge(int userAge){
        if (userAge<0){
            System.out.println("Вы ввели отрицательный возраст");
        }else {
        age = userAge;}
    }

    public int getAge (){
        return age;
    }




}