class Asia extends Land {
    private int bevoelkerung;

    public Asia(String name, String hauptstadt, int bevoelkerung) {
        super(name, hauptstadt);
        this.bevoelkerung = bevoelkerung;
    }

    @Override
    public void beschreiben() {
        super.beschreiben();
        System.out.println("Bevölkerung: " + bevoelkerung + " Millionen");
    }
}
