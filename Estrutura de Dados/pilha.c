#include <stdio.h>
#include <stdlib.h>

typedef struct Caixa {
  int valor;
  struct Caixa *proxima;
} Caixa;

void inicializarPilha(Caixa **pilha) {
  *pilha = NULL;
}

void empilhar(Caixa **pilha, int valor) {
  Caixa *novaCaixa = (Caixa *)malloc(sizeof(Caixa));
  novaCaixa->valor = valor;
  novaCaixa->proxima = *pilha;
  *pilha = novaCaixa;
}

Caixa *desempilhar(Caixa **pilha) {
  if (*pilha == NULL) {
    return NULL;
  }

  Caixa *caixa = *pilha;
  *pilha = caixa->proxima;
  caixa->proxima = NULL;

  return caixa;
}

int main() {
  Caixa *pilha;

  inicializarPilha(&pilha);

  empilhar(&pilha, 64);
  empilhar(&pilha, 25);
  empilhar(&pilha, 12);
  empilhar(&pilha, 22);
  empilhar(&pilha, 11);
  empilhar(&pilha, 9);

  Caixa *caixa;
  while ((caixa = desempilhar(&pilha)) != NULL) {
    if (caixa->valor > 9) {
      printf("%d\n", caixa->valor);
    }
    free(caixa);
  }

  return 0;
}
