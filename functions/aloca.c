Pessoa *aloca(char *arquivo)
{
    Pessoa *pessoas;
    Pessoa p;
    int qtd_pessoas = 0;

    FILE *o = fopen(arquivo, "ab");
    while (fread(&p, sizeof(Pessoa), 1, o))
        qtd_pessoas++;

    fclose(o);

    pessoas = calloc(qtd_pessoas, sizeof(Pessoa));
    if (pessoas == NULL)
    {
        printf("Erro na alocação de memoria :(");
        return NULL;
    }

    return pessoas;
}
