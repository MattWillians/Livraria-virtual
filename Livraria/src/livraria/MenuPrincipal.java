package livraria;

public class MenuPrincipal {
    public static void main(String[] args) throws Exception {

        LivroDigital d1 = new LivroDigital("Carros 2", new Autor("Macqueen","macqueen@gmail.com", "Americano"), "Aventura", 2, 23, 43.5);
        d1.info();

        LivroFisico f1 = new LivroFisico("Toy Story 4", new Autor("Walt Disney", "disneypictures@gmail.com", "Europeu"), "Ação", 4, 32, 1);
        f1.info();

    }
}
