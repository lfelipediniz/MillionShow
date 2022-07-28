#include <stdio.h>
#include <stdlib.h>

#include "pessoas.c" /* Struct */

/*Funções*/

#include "imprimir.c"
#include "registrar.c"

int main()
{
    Pessoa p;

    imprimir(p, "pessoas.bin");

    return 0;
}