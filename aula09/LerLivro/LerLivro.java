public class LerLivro {

    public static void main( String[] args){

        /*
        minha implementação
         */
        /*
        Pessoa p = new Pessoa("João", 15, "Masculino");
        Livro l = new Livro("Admirável mundo novo", "Aldous Leonard Huxley e Vidal de Oliveira"
                            ,200, p );
        l.detalhes();
        l.avancarPagina();
        l.fechar();
        p.fazerAniversario();
        l.detalhes();

         */

        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Pedro", 22, "Masculinho");
        p[1] = new Pessoa("Maria", 25, "Feminino");

        l[0] = new Livro("Admirável mundo novo", "Aldous Leonard Huxley e Vidal de Oliveira", 200, p[0]);
        l[1] = new Livro("O Senhor do Mundo", "Robert Hugh Benson", 262, p[1]);
        l[2] = new Livro("A revolução dos bichos: Um conto de fadas", "George Orwell e Heitor Aquino Ferreira", 160, p[0]);


        for ( int i = 0; i < l.length; i++){
            System.out.println(l[i].detalhes());
        }

    }

}
