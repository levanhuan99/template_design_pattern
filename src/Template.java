public abstract class Template {
    abstract void header();
    abstract void menu();
    abstract void body();
    abstract void footer();
    void seperator(){
        System.out.println("---------------------------");

    }
    void show(){
        seperator();
        header();
        menu();
        body();
        footer();
    }
}
