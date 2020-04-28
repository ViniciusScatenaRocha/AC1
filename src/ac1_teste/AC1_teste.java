/* 1- Tela de boas vindas
2 - CPF = 123.456.789-00 (tela de acesso não permitido)
3 - Senha = 01020304
4 - verificar senha ( se estiver errada fazer mais 2 verificações. se der errado
tela de bloqueio, se der certo prosseguir)
5 - Menu
5.1 - 1 - Saldo (exibir Saldo)
       2 - Depósito (Requisitar o valor do deposito e somar ao saldo atual)
       3 - Saque (Requisitar valor do saque e subtrair ao saldo atual)
       4 - Sair
6 - verificar operação (Se for falsa permitir digitar de novo)
7 - Após realizar operação perguntar se deseja fazer nova op ou sair(voltar a
tela inical)

!Desafio!
1 - Fazer transferencia devera solicitar o valor a conta agencia e banco.
atualizar o saldo
2 - Consultar extrato exibir extrattos das movimentações bancarias.
 */
package ac1_teste;
import java.util.Scanner;
public class AC1_teste {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String senha, cpf,k;
        int escolha, escolha2;
        double saldo = 1000.00, dep, saque;
        
        for(int i = 1 ; i ==1;){
            System.out.print("Bem vindo ao Banco\n--- Franbacon Enche ? ---\nDeseja entrar no Sistema?\n1 - Entrar\n2 - Sair\nSua Escolha: ");
            escolha = ler.nextInt();
            switch (escolha){
                case 1:{
                    System.out.print("Digite seu CPF: ");
                cpf = ler.next();
                if(cpf.equals("123.456.789-00")){
                    System.out.print("CPF validado! ");
                    for(int j = 1; j <= 5; j++){
                    System.out.print("\nDigite sua senha: ");
                    senha = ler.next();
                    if(senha.equals("01020304")){
                        j = 6;
                        for (int x = 1;x ==1;){
                        System.out.print("Bem vindo ao menu\nDigite a operação desejada:\n1 - Saldo\n2 - Depósito\n3 - Saque\n4 - Sair\nDigite a operação desejada: ");
                        escolha2 = ler.nextInt();

                            switch (escolha2){
                            case 1:{
                                System.out.print("Seu saldo é de: "+saldo+"\n");
                                System.out.print("Deseja fazer outra operação?\n1 - Sim\n2 - Não\nDigite: ");
                                k = ler.next();
                                if ( k.equals("2")){
                                    System.out.print("Boa noite\n");
                                    x++;
                                }
                                break;
                            }
                            case 2:{
                                System.out.print("Digite o valor desejado para deposito: ");
                                dep = ler.nextDouble();
                                saldo = saldo + dep;
                                System.out.print("Deseja fazer outra operação?\n1 - Sim\n2 - Não\nDigite: ");
                                k = ler.next();
                                if ( k.equals("2")){
                                    System.out.print("Boa noite\n");
                                    x++;
                                }
                                 break;   
                            }
                            case 3:{
                                System.out.print("Digite o valor que deseja sacar: ");
                                saque = ler.nextDouble();
                                saldo = saldo - saque;
                                System.out.print("Deseja fazer outra operação?\n1 - Sim\n2 - Não\nDigite: ");
                                k = ler.next();
                                if ( k.equals("2")){
                                    System.out.print("Boa noite\n");
                                    x++;
                                }
                                break;
                            }
                            case 4:{
                                System.out.print("Obrigado, Boa noite\n");
                                break;
                            }
                        }
                        }
                        break;
                        }else{
                            switch(j){
                            case 1 :{
                                System.out.print("Senha incorreta.\nAtenção, 2 tentativas restantes.");
                                break;
                            }
                            case 2 :{
                                System.out.print("Senha incorreta.\nAtenação, 1 tentativa restante.");
                                break;
                            }
                            case 3 :{
                                System.out.print("Senha incorreta.\nATENÇÃO ULTIMA TENTATIVA.");
                                break;
                            }
                            case 4 :{
                                System.out.print("Senha incorreta, Conta Bloqueada!");
                                break;
                            }
                        }
                    }
                }
                }else
                    System.out.print("CPF inválido!");  
                }
                case 2 :{
                    System.out.print("Obrigado por usar o Banco Franbacon Enche?.\nBoa noite!\n\n");
                    System.exit(0);
                }
            }
        }
        
    }
    
}