public class Aula15 {
    public static void main(String[] args) {
        Video[] v = new Video[3];
        v[0] = new Video("Aula 01 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 10 de HTML5");

        /*
        System.out.println(v[0].toString());
        System.out.println("#######################################");
        System.out.println(v[1].toString());
        System.out.println("#######################################");
        System.out.println(v[2].toString());
        System.out.println("#######################################");
        */

        System.out.println("Criando gafanhotos");

        Gafanhoto g[] = new Gafanhoto[3];
        g[0] = new Gafanhoto("Jubileu", "Masculino", 22, 5, "jubi" );
        g[1] = new Gafanhoto("Marta", "Feminino", 27, 8, "mta" );
        g[2] = new Gafanhoto("Sara", "Feminino", 18, 3, "rinha" );

        /*
        System.out.println(g[0].toString());
        System.out.println("############################");
        System.out.println(g[1].toString());
        System.out.println("############################");
        System.out.println(g[2].toString());
        */

        System.out.println("############################");
        Visualizacao vis[] = new Visualizacao[2];
        vis[0] = new Visualizacao(g[0], v[2]); // Jubileu assiste HTML5
        vis[0].avaliar();
        vis[1] = new Visualizacao(g[0], v[1]); // Jubileu assiste PHP
        vis[0].avaliar(0.87F);
        System.out.println(vis[0].toString());
        System.out.println(vis[1].toString());
    }
}
