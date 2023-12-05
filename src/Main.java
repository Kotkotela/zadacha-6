import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        Integer age;
        String name2;
        Integer age2;
        System.out.println("введите имя: ");
        name = scanner.nextLine();
        System.out.println("введите возраст: ");
        age = Integer.valueOf(scanner.nextLine());
        User user = new User(name,age);
        System.out.println(user.toString());
        System.out.println("введите второе имя: ");
        name2 = scanner.nextLine();
        System.out.println("введите возраст: ");
        age2 = Integer.valueOf(scanner.nextLine());
        User user2 = new User(name2,age2);
        System.out.println(user2.toString());
        User user3 = (user.getAge() < user2.getAge()) ? user : user2;
        System.out.println("самый молодой пользователь: " + user3.toString());

    }
}
    class User{
        private String name;
        private Integer age;
        public User(String name, Integer age){
            this.name = name;
            this.age = age;
        }
        public void setName(String name){
            this.name = name;
        }
        public void setAge(Integer age){
            this.age = age;
        }
        public String getname(){
        return name;
        }
        public Integer getAge(){
            return age;
        }
        public String toString(){
            return name + ", возраст " + age + " лет";
        }
    }
