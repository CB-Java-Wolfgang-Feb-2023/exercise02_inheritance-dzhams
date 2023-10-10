class EU extends Land {
    private String euMitgliedschaft;

    public EU(String name, String hauptstadt, String euMitgliedschaft) {
        super(name, hauptstadt);
        this.euMitgliedschaft = euMitgliedschaft;
    }

    @Override
    public void beschreiben() {
        super.beschreiben();
        System.out.println("EU-Mitgliedschaft: " + euMitgliedschaft);
    }
}