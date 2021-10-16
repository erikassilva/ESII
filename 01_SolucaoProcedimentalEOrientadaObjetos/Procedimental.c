/*O problema para o qual você deve implementar a solução é o cálculo de salário de funcionários horistas.
Um funcionário horista trabalha uma certa quantidade de horas e recebe um determinado valor por hora.
Ele ainda tem um nome e um CPF.
O salário dele é a multiplicação da quantidade de horas trabalhadas pelo valor da hora.
Envie um arquivo ZIP com dois arquivos: um com a solução procedimental e outro com a orientada a objetos.*/

#include <stdio.h>
#include <stdlib.h>
#define valorPorHoraTrabalhada 81.25
#define tamanho 50

int main(int argc, char *argv[]) {
	
	int quantidadeDeHorasTrabalhadas, i, j;
	char nome[tamanho], ultimoNome[tamanho], cpf[tamanho];
	float calculoSalarioMensal;
	
	printf("Digite o primeiro nome do funcionario: ");
	scanf("%s", nome);
	printf("Digite o ultimo nome do funcionario: ");
	fflush(stdin);
	scanf("%s", ultimoNome);
	printf("\nDigite o CPF do funcionario (somente numeros): ");
	fflush(stdin);
	scanf("%s", cpf);
	printf("Digite a quantidade de horas trabalhadas no mes: ");
	scanf("%d", &quantidadeDeHorasTrabalhadas);
	calculoSalarioMensal = quantidadeDeHorasTrabalhadas * valorPorHoraTrabalhada;
	
	printf("\n-------Calculo do Salario Mensal ---------\n");
	printf("Nome Funcionario: %s %s \n", nome, ultimoNome);
	printf("CPF: %s", cpf);
	printf("\nValor da Hora Trabalhada %.2f \nQuantidade de horas trabalhadas no mes: %d \nSalario a receber: %.2f\n", 
			valorPorHoraTrabalhada, quantidadeDeHorasTrabalhadas, calculoSalarioMensal);
	printf("\n-------Fim do Calculo do Salario Mensal ---------\n");	
	
	return 0;
}