#include <stdio.h>
#include <stdlib.h>

struct NoArvore {
    int dado;
    struct NoArvore* esquerda;
    struct NoArvore* direita;
};

struct NoArvore* criarNo(int dado) {
    struct NoArvore* novoNo = (struct NoArvore*)malloc(sizeof(struct NoArvore));
    novoNo->dado = dado;
    novoNo->esquerda = novoNo->direita = NULL;
    return novoNo;
}

struct NoArvore* inserirNo(struct NoArvore* raiz, int dado) {
    if (raiz == NULL) {
        return criarNo(dado);
    }

    if (dado < raiz->dado) {
        raiz->esquerda = inserirNo(raiz->esquerda, dado);
    } else if (dado > raiz->dado) {
        raiz->direita = inserirNo(raiz->direita, dado);
    }

    return raiz;
}

void imprimir(struct NoArvore* raiz) {
    if (raiz != NULL) {
        imprimir(raiz->esquerda);
        printf("%d\n", raiz->dado);
        imprimir(raiz->direita);
    }
}

int main() {
    int dados[] = {200, 450, 123, 52, 133, 321, 422, 523, 36, 64};
    int n = sizeof(dados) / sizeof(dados[0]);

    struct NoArvore* raiz = NULL;

    for (int i = 0; i < n; i++) {
        raiz = inserirNo(raiz, dados[i]);
    }

    printf("Árvore Binária:\n");
    imprimir(raiz);

    return 0;
}
