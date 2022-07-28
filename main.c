#include <stdio.h>
#include <stdlib.h>

// #include "pessoas.c"
// #include "imprimir.c"
// #include "registrar.c"

typedef struct
{
    int dia, mes, ano;
} data;

typedef struct
{
    float linux, macos, windows;
} so;

typedef struct
{
    char nome[100];
    data nascimento;
    char cidade[100];
    char uf[100];
    so preferencia;
    int grupo;

} Pessoa;

void imprimir(Pessoa p, char *nome_arquivo)
{
    FILE *f = fopen(nome_arquivo, "rb");

    if (!f)
    {
        printf("Erro ao tentar ler o arquivo.\n");
        exit(1);
    }

    while (fread(&p, sizeof(Pessoa), 1, f))
    {
        printf("Grupo: %d\n", p.grupo);
        printf("Nome: %s\n", p.nome);
        printf("Data de Nascimento: %d/%d/%d\n", p.nascimento.dia, p.nascimento.mes, p.nascimento.ano);
        printf("Cidade: %s\n", p.cidade);
        printf("UF: %s\n", p.uf);
        printf("Notas dos S.O de 0 a 1:\n");
        printf("Linux: %.1f\n", p.preferencia.linux);
        printf("MacOS: %.1f\n", p.preferencia.macos);
        printf("Windows: %.1f\n\n", p.preferencia.windows);
    }

    fclose(f);
}

int main()
{

    Pessoa p;

    imprimir(p, "pessoas.bin");

    return 0;
}