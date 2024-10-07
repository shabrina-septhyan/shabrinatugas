public class Person {
    public class person {
        private String name;
        private int age;
        
        public person(String name, int age, String gender) {
            this.name = name;
            this.age = age;
        }
    
        public String getName() {
            return name;
        }
        public int getAge() {
            return age;
        }
        public void setName(String name) {
            this.name = name;
        }
        public void setAge(int age) {
            this.age = age;
        }
        public void print() {
            System.out.println("Name\t: " + name);
            System.out.println("Age\t: " + age);
        }
    }
        
        
}
