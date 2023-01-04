package id.kawahedukasi.model;

public class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // read only username
    public String getUsername() {
        return username;
    }

    // read only password
    public String getPassword() {
        return password;
    }

    // Method untuk verifikasi username
    public void verifyUsername(String username) {
        if (this.username.equals(username)) {
            System.out.println("Username yang anda masukkan benar");
        } else {
            System.out.println("Username yang anda masukkan salah");
            System.exit(0);
        }
    }
    // Method untuk verifikasi password
    public void verifyPassword(String password) {
        if(this.password.equals(password)){
            System.out.println("Password yang anda masukkan benar");
        } else{
            System.out.println("Password yang anda masukkan salah");
            System.exit(0);
        }
    }
}