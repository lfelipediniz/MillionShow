#include <stdio.h>
#include <stdlib.h>

void registrar(Pessoa p, char *nome_arquivo)
{
    printf("Digite seu nome: ");
    fflush(stdin);
    gets(p.nome);
    printf("Digite sua data nascimento: ");
    scanf("%d", &p.nascimento.dia);
    scanf("%d", &p.nascimento.mes);
    scanf("%d", &p.nascimento.ano);
    printf("Digite sua cidade: ");
    fflush(stdin);
    gets(p.cidade);
    printf("Digite sua UF: ");
    fflush(stdin);
    gets(p.uf);
    printf("Linux: ");
    scanf("%f", &p.preferencia.linux);
    printf("MacOS: ");
    scanf("%f", &p.preferencia.macos);
    printf("Windows: ");
    scanf("%f", &p.preferencia.windows);

    printf("Digite seu grupo: ");
    scanf("%d", &p.grupo);

    FILE *f = fopen(nome_arquivo, "ab");
    fwrite(&p, sizeof(Pessoa), 1, f);
    fclose(f);
}