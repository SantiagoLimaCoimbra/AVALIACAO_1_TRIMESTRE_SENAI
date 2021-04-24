try:
  open('./arquivo.txt', 'x')
except:
  pass
while True:
  inp = input('Qual operação deseja realizar?\n1.listar contatos\n2.adicionar novo contato\n\n')
  if int(inp) == 1:
    print('\n')
    with open('./arquivo.txt', 'r') as arq:
      for line in arq:print('Contato: '+line)
    print('\n')
  elif int(inp) == 2:
    name = input("\nDigite o nome do contato para adicionar: ")
    email = input("\nDigite o email do contato para adicionar: ")
    tel = input('\nDigite o telefone:')
    cpf = input('\nDigite o CPF do contato: ')
    dtnc = input('\nInsira a data de nascimento do contato: ')
    cep = input('\nInsira o cep do contato: ')
    arq = open('./arquivo.txt', 'r').readlines()
    arq.append(f'Nome: {name}, Email: {email}, Numedo do telefone: {tel}, CPF: {cpf}, Data de Nascimento: {dtnc}, CEP: {cep}')
    with open('./arquivo.txt', 'w') as arqW:
      arqW.write('\n'.join(arq))
    print('Contato salvo com sucesso!\n')