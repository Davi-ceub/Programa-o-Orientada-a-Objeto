#Escreva um algoritmo que solicita ao usuário dois operandos e um código de operação (1 - Soma, 2 - Subtração, 3 - Divisão ou 4 - Multiplicação) e realiza a operação correspondente sobre os operandos fornecidos pelo usuário:
# Exercicio para entrega
x = int(input("Digite um valor: "))
y = int(input("Digite um valor: "))
operacao = int(input("Digite o código da operação entre 1 - soma, 2 - subtração, 3 - multiplicação, 4 - divisão: "))
if operacao == 1 :
    print(x + y)
if operacao == 2 :
    print(x - y)
if operacao == 3 :
    print(x * y)
if operacao == 4 :
    print(x / y)


#Ex 1:
x = int(input("Digite a nota: "))
y = int(input("Digite a nota: "))
z = int(input("Digite a nota: "))
if x >= 5 :
    print("aprovado",x)
else :
    print("reprovado",x)
if y >= 5 :
    print("Aprovado",y)
else :
    print("Reprovado",y)
if z >= 5 :
    print("Aprovado",z)
else :
    print("Reprovado",z)
    
#Ex 2:
x = int(input("Digite um valor: "))
y = int(input("Digite um valor: "))
if x > y :
    print("o maior valor é",x)
else :
    print("o maior valor é",y)

#Ex 3:
x = int(input("Digite um horário: "))
if   0 <= x < 6 :
    print("Madrugada, horas:",x)
if  6 <= x < 12 :
    print("dia,horas:",x)
if  12 <= x < 18 :
    print("Tarde,horas:",x)
if  18 <= x < 24 :
    print("noite, horas:",x)

#Ex 4:
n1 = int(input("nota1: "))
n2 = int(input("nota2: "))
n3 = int(input("nota3: "))
media = (n1 + n2 + n3)/3
if    0 >  n1  > 10 :
    print("invalido")
if  0 > n2 > 10 :
    print("Invalido")
if 0 > n3 > 10 :
    print("Invalido")
if media >= 7 :
    print("Aprovado,media:",media)
else :
    print("Reprovado,media:",media)

#Ex 5:
nota1 = int(input("nota1: "))
nota2 = int(input("nota2: "))
nota3 = int(input("nota3: "))
mediap = ((nota1 * 1) + (nota2 * 1.5) + (nota3 * 2))/5.5 
if mediap == 0 :
    print("SR")
if mediap < 2 :
    print("II")
if   2 <= mediap < 5 :
    print("MI")
if  5 <= mediap < 7 :
    print("MM")
if 7 <= mediap < 9 :
    print("MS")
if mediap >= 9 :
    print("SS")

#EX 5.1:
a1 = int(input("digite a primeira nota: "))
a2 = int(input("Digite a segunda nota: "))
m = (a1 + a2)/2
if m >= 5 :
    print("Aprovado:true")
else :
    print("Aprovado:false")

#Ex 6:
p1 = int(input("Digite a nota: "))
p2 = int(input("Digite a nota: "))
p3 = int(input("Digite a nota: "))
ma = (p1 + p2 + p3)/3
if      0 > p1 > 10 :
    print("nota invalida")
if    0 > p2 > 10 :
    print("nota invalida")
if   0 > p3 > 10 :
    print("nota invalida")
if ma >= 7 :
    print("Aprovado com media",ma)
else :
    print("reprovado com media",ma)

