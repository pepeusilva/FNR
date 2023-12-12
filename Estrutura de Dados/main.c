#include <stdio.h>

void bubble_sort(int *vetor, int tamanho) {
  int i, p;
  for (i = 0; i < tamanho - 1; i++) {
    for (p = 0; p < tamanho - i - 1; p++) {
      if (vetor[p] > vetor[p + 1]) {
        int aux = vetor[p];
        vetor[p] = vetor[p + 1];
        vetor[p + 1] = aux;
      }
    }
  }
}

void selection_sort(int *vetor, int tamanho) {
  int i, min, p;
  for (i = 0; i < tamanho - 1; i++) {
    min = i;
    for (p = i + 1; p < tamanho; p++) {
      if (vetor[p] < vetor[min]) {
        min = p;
      }
    }
    if (min != i) {
      int aux = vetor[i];
      vetor[i] = vetor[min];
      vetor[min] = aux;
    }
  }
}

void insertion_sort(int *vetor, int tamanho) {
  int i, p;
  for (i = 1; i < tamanho; i++) {
    int valor = vetor[i];
    for (p = i - 1; p >= 0 && vetor[p] > valor; p--) {
      vetor[p + 1] = vetor[p];
    }
    vetor[p + 1] = valor;
  }
}

int main() {
  int vetor[] = {64, 25, 12, 22, 11, 9};
  int tamanho = sizeof(vetor) / sizeof(vetor[0]);

  printf("Vetor original: ");
  for (int i = 0; i < tamanho; i++) {
    printf("%d ", vetor[i]);
  }
  printf("\n");

  bubble_sort(vetor, tamanho);
  printf("Vetor ordenado com Bubble Sort: ");
  for (int i = 0; i < tamanho; i++) {
    printf("%d ", vetor[i]);
  }
  printf("\n");

  selection_sort(vetor, tamanho);
  printf("Vetor ordenado com Selection Sort: ");
  for (int i = 0; i < tamanho; i++) {
    printf("%d ", vetor[i]);
  }
  printf("\n");

  insertion_sort(vetor, tamanho);
  printf("Vetor ordenado com Insertion Sort: ");
  for (int i = 0; i < tamanho; i++) {
    printf("%d ", vetor[i]);
  }
  printf("\n");

  return 0;
}
