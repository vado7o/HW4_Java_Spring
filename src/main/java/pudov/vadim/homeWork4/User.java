package pudov.vadim.homeWork4;

public class User {
    Long id;
    private String name;
    private int age;
    private String email;

    public User() {
    }

    public User(Long id, String name, int age, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setId(Long id) { this.id = id;}
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getEmail() { return email; }
    public Long getId() { return id; }
}
