# Caixa Eletronico

Aplicação que simula a entrega de notas quando um cliente efetua um saque em um caixa eletrônico.
#### Os requisitos básicos:

* Entregar o menor número de notas;
* É possível sacar o valor solicitado com as notas disponíveis;
* Saldo do cliente infinito;
* Quantidade de notas infinito (pode-se colocar um valor finito de cédulas para aumentar a dificuldade do problema);
* Notas disponíveis de R$ 100,00; R$ 50,00; R$ 20,00 e R$ 10,00;

## Built With

* [Java](https://docs.oracle.com/javase/7/docs/technotes/guides/language/)
* [Netbeans](https://netbeans.org/)

## Abordagem
No caso mais simples (Dinheiro infinito), a abordagem tomada foi divisão sucessiva com o resto da divisão;
No problema mais complexo (Cedulas Finitas), é realizada um checagem no numero cedeulas:

- O caixa possui cedulas?;
- O numero de cedulas disponiveis é >= ao nescessario?
- Do contrario usaremos as cedulas disponíveis e decrementaremos esse valor do valor total;

```
if(notas.gethundredNotes())> 0){ 
     hundredCedulles = value/100;        
     if(notas.gethundredNotes() >= hundredCedulles)
        Remainder = Remainder%100;
     else{
        hundredCedulles = notas.gethundredNotes();
        Remainder = Remainder - (hundredCedulles * 100);
     }
 }
```

## Testes

No testes buscou-se mapear os possiveis casos de uso, fazendo uso do assertEquals(), verificando se a aplicação tem comportamento desejado.
Todos os testes apresentaram comportamento satisfatório.
```
@Test
 public void TestWithMoneyLimit_780() {
    CashMachine Machine = new CashMachine();
    Cash cash = new Cash(10,20,1,5);
    System.out.println(Machine.Withdral(cash, 780));
    assertEquals("5 Nota(s) de 100;\n1 Nota(s) de 50;\n11 Nota(s) de 20;\n1 Nota(s) de 10;", Machine.Withdral(cash, 780));
}
```

## Author

* **Emerson Sampaio**  [Github](https://github.com/emersonsmp) [Linkedin](https://www.linkedin.com/in/emersonsmp/)
