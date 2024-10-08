class Reader {
    private String name;
    private String readerId;

    public Reader(String name, String readerId) {
        this.name = name;
        this.readerId = readerId;
    }

    public String rName() {
        return name;
    }

    public String rReaderId() {
        return readerId;
    }

    public void displayInfo() {
        System.out.println("Читатель: " + name + ", ID: " + readerId);
    }
}
