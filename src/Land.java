class Land {
    private String name;
    private String hauptstadt;

    public Land(String name, String hauptstadt) {
        this.name = name;
        this.hauptstadt = hauptstadt;
    }

    public String getName() {
        return name;
    }

    public String getHauptstadt() {
        return hauptstadt;
    }

    public void beschreiben() {
        System.out.println("Land: " + name);
        System.out.println("Hauptstadt: " + hauptstadt);
    }
}