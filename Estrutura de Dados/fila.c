#include <stdio.h>
#include <stdlib.h>

typedef struct No {
  int dado;
  struct No *proximo;
} No;

typedef struct Fila {
  No *inicio;
  No *fim;
} Fila;

void inicializarFila(Fila *fila) {
  fila->inicio = NULL;
  fila->fim = NULL;
}

void enfileirar(Fila *fila, int numero) {
  No *novoNo = (No *)malloc(sizeof(No));
  novoNo->dado = numero;
  novoNo->proximo = NULL;

  if (fila->fim == NULL) {
    fila->inicio = novoNo;
    fila->fim = novoNo;
  } else {
    fila->fim->proximo = novoNo;
    fila->fim = novoNo;
  }
}

int desenfileirar(Fila *fila) {
  if (fila->inicio == NULL) {
    return -1;
  }

  int numero = fila->inicio->dado;
  No *no = fila->inicio;
  fila->inicio = fila->inicio->proximo;
  free(no);

  if (fila->inicio == NULL) {
    fila->fim = NULL;
  }

  return numero;
}

int retirarNumero(Fila *fila, int numero) {
  No *atual = fila->inicio;
  No *anterior = NULL;

  while (atual != NULL && atual->dado != numero) {
    anterior = atual;
    atual = atual->proximo;
  }

  if (atual == NULL) {
    return 0;
  }

  if (anterior == NULL) {
    fila->inicio = atual->proximo;
  } else {
    anterior->proximo = atual->proximo;
  }

  free(atual);

  if (fila->inicio == NULL) {
    fila->fim = NULL;
  }

  return 1;
}

int filaVazia(Fila *fila) {
  return fila->inicio == NULL;
}

void imprimirFila(Fila *fila) {
  No *no = fila->inicio;
  while (no != NULL) {
    printf("%d\n", no->dado);
    no = no->proximo;
  }
}

int main() {
  Fila fila;

  inicializarFila(&fila);

  enfileirar(&fila, 64);
  enfileirar(&fila, 25);
  enfileirar(&fila, 12);
  enfileirar(&fila, 22);
  enfileirar(&fila, 11);
  enfileirar(&fila, 9);

  printf("Fila original:\n");
  imprimirFila(&fila);

  int numeroARetirar = 22;
  if (retirarNumero(&fila, numeroARetirar)) {
    printf("\nNúmero %d retirado da fila:\n", numeroARetirar);
    imprimirFila(&fila);
  } else {
    printf("\nNúmero %d não encontrado na fila.\n", numeroARetirar);
  }

  return 0;
}