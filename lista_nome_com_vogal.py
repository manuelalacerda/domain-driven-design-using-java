# escreva um programa que leia 5 nomes , exiba a quantidade
# que iniciam com vogal e armazene esses nomes em uma lista (e os exiba)

#criando uma lista vazia
nomes = []
nomes_vogal = []

#preenchendo a lista com os nomes
for i in range(5):
    nome = input('Nome: ')
    nomes.append(nome)

#variável contadora
qtde = 0

#percorrer a lista de nomes ,verificando as iniciadas com VOGAL
for nome in nomes:
    if nome[0] == 'A' or nome[0] == 'E' or nome[0] == 'I' or nome[0] == 'O' or nome[0] == 'U':
        qtde+=1
        nomes_vogal.append(nome)



print(f'Nomes que começam com VOGAL: {qtde,nomes_vogal}')

#percorrendo a lista e acessando os elementos um por um
print('---------------------------------------')
print('Nomes iniciados com VOGAL')
for nome in nomes_vogal:
    print(f'Nome: {nome}')