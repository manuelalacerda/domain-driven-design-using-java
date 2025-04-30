# escreva um prograna que leia 5 nomes e exiba a quantidade 
# que iniciam com vogal

#criando uma lista vazia
nomes = []

#preenchendo a lista com os nomes
for i in range(5):
    nome = input('Nome: ')
    nomes.append(nome)

qtde = 0

#percorrer a lista de nomes, verificando as iniciadas com VOGAL
for nome in nomes:
    if nome[0] == 'A' or nome[0] == 'E' or nome[0] == 'I' or nome[0] == 'O' or nome[0] == 'U':
        qtde+=1

print(f'Qtde: {qtde}')