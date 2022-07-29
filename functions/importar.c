void importar(Pessoa p, char * arquivo_origem, char * arquivo_destino)
{
    FILE *arq = fopen(arquivo_origem, "rb");

    fscanf(arq, "%s", p.nome);
    fscanf(arq, "%d", &p.nascimento.dia);
    fscanf(arq, "%d", &p.nascimento.mes);
    fscanf(arq, "%d", &p.nascimento.ano);
    fscanf(arq, "%s", p.cidade);
    fscanf(arq, "%s", p.uf);
    fscanf(arq, "%f", &p.preferencia.linux);
    fscanf(arq, "%f", &p.preferencia.macos);
    fscanf(arq, "%f", &p.preferencia.windows);
    fscanf(arq, "%d", &p.grupo);

    FILE *f = fopen(arquivo_destino, "ab");
    fwrite(&p, sizeof(Pessoa), 1, f);
    fclose(f);
}