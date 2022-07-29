#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#include "./functions/pessoas.c" /* Struct */

/*Funções*/

#include "./functions/imprimir.c"
#include "./functions/registrar.c"
#include "./functions/menu.c"
#include "./functions/aloca.c"
#include "./functions/importar.c"

int main()
{
    Pessoa p;
    int sair = 1;
    int escolha;
    char importacao[100];
    int qtd_pessoas = 0;
    Pessoa *pessoas;

    while (sair)
    {
        menu();
        scanf("%d", &escolha);

        if (escolha == 0)
            sair = 0;
        if (escolha == 1)
        {
            printf("Qual arquivo deseja importar: ");
            scanf("%s", importacao);
            pessoas = aloca("./import/pessoas.bin");

            importar(p, "./import/pessoas.bin", "./database/database.bin");
        }
        if (escolha == 2)
            registrar(p, "./database/database.c");
    }

    imprimir(p, "./import/pessoas.bin");

    return 0;
}