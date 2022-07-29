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
