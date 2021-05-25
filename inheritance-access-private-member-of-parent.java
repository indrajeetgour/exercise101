class A {
    private String name;
    private String surname;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    A(String name, String sname) {
        this.name = name;
        this.surname = sname;
        System.out.println("Constructor A:" + name + ":" + surname);
    }

    public void hello(String u) {
        System.out.println("How are " + u);
    }

    public static void main(String[] args) {

        A a = new A("Indrajeet", "Gour");
        System.out.println(a.name);
        a.hello("sheetal");

    }
}

class B extends A {
    private String nameb;
    private String surnameb;

    B(String nameb, String surnameb) {
        super(nameb, surnameb);
        this.nameb = nameb;
        this.surnameb = surnameb;
        System.out.println("Constructor B:" + nameb + ":" + surnameb);
    }

    public static void main(String[] args) {
        // A bb = new A("indrajeet", "gour");
        A a = new B("nidhi", "gour");
        // only getter and setter can update and retrive the parent member data varible 
        // we can not access direct member variable like reference dot variable name
        a.setName("private-name-override");
        System.out.println(a.getName());
        // B b = new B("nidhi", "gour");
        // System.out.println(b.nameb);
        // System.out.println(">>" + b.name);
        // System.out.println(">>" + b.surname);
    }
}