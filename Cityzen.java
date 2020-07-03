class Citizen {
    private int id;
    private String name;
    private String surname;
    private String address;
    private int phoneNumber;
    private String email;
    
    Citizen(int id, String name, String surname, String address, int phoneNumber, String email) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return this.id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getSurname() {
        return this.surname;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return this.address;
    }
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public int getPhoneNumber() {
        return this.phoneNumber;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return this.email;
    }
}
