/**
 *
 * Autores:
 * Matheus Caetano
 * Marcos vinicius Santos Souza
 * Renan Maciel
 * 
 * 
 *             ****** ATENCAO ******
 *  Sempre lembre de comentar o codgo, quando criar alguma cariavel ou funcao 
 * lembre-se sempre que tem que ser entendido por todos do grupo
 * se possivel faca uma breve descricao do que a funcao faz e quando 
 * criar variavel indique para que ela serve;
 * 
 */
package pi;

import java.util.Random;
import java.util.Scanner;


public class PI
{
         public static Scanner teste = new Scanner(System.in);
         public static int vida = 3;
         public static int pontuacao=0;
         public static String nome = "";
    
    public static void main(String[] args) {
        menu();
        
       }
    
    
   static int entrarDadosInt(){ 
      Scanner teste = new Scanner(System.in);
      int dados = teste.nextInt();
      return dados;
   }
   static String entrarDadosStr(){ // captura os dados tipo Strings para salvar em variaveis
      Scanner entrar = new Scanner(System.in);
      String dados = entrar.next();
      return dados;
   }
   static void menu(){
        int opcao ;
       do{
        System.out.println("╔════•ೋೋ•════╗ \n" +
                           "          Menu\n" +
                           "╚════•ೋೋ•════╝");
        
            System.out.println(""
                    + "     _\n" +
"            ,---.          U\n" +
"           ;     \\         ;\n" +
"       .==\\\"/==.  `-.___.-'\n" +
"      ((+) .  .:)\n" +
"      |`.-(o)-.'|\n" +
"      \\/  \\_/  \\/         ");
        System.out.print("1- Jogar: \n2- Historia\n3- Créditos\n4- Sair\nEscolha uma opção:  "); 
        opcao = entrarDadosInt();
         switch (opcao){
             case 1:
                 Jogar();
                 break;
             case 2: 
                 Historia();
                 break;
              case 3: 
                 Creditos();
                 break;  
                 case 4: 
                 System.out.println("Muito Obrigado por Jogar, Até a Proxima!");
                 break;
                 default:
                  System.out.println("Escolha uma opção Valida");   
         }
        }while(opcao>4);
    }
   static void Historia(){
       Historinha();
        int opcao = entrarDadosInt() ;
        if(opcao==1){
            Jogar();
        }
        else{
            menu();
        }
             
        
    }
   static void Jogar(){
        int validador;
        Historinha();
        int jogo = entrarDadosInt(); // variavel para verificar se o usurario realmente quer continuar a jogar depois de ler a historia
        if (jogo == 1){
          PrimeiroDesafio();
          validador= Pergunta();         
                   //primeiro if para verificar se o validador retornou uma resposta positiva para dar continuidade
                  if(validador==1){
                      SegundoDesafio();
                      validador = Pergunta();
                      //segundo if para verificar se o validador retornou uma resposta positiva para dar continuidade
                      if(validador==1){
                      TerceiroDesafio();
                      validador = Pergunta();
                      //terceiro if para verificar se o validador retornou uma resposta positiva para dar continuidade
                      if(validador==1){
                          QuartoDesafio();
                          validador = Pergunta();
                       }
                      //terceiro else para caso for negativa o retun
                      else{
                         Reset();
                      }
                      }
                      //segundo else para caso for negativa o retun
                      else{
                         Reset();
                      }
                     }//primeiro else para caso for negativa o retun
                  else{
                       Reset();
                  }
                    
   }// se ele quiser ira dar continuidade ao jogo desencadeando ifs e elses para verificar o seu exito em cada desafio
        else{
            menu();// se ele nao quiser continuar ira voltar para o menu
        }
         }
   static void Creditos(){
              System.out.println("              ╔════•ೋೋ•════╗ \n" +
                                 "                       Créditos\n" +
                                 "              ╚════•ೋೋ•════╝");
                
                System.out.println("Trabalho Projeto Integrador (P.I)");
                System.out.println("Turma 1ºA TADS - Noturno, 1º Semestre, 2019");
                System.out.println("Desenvolvido por Marcos vinicius Santos Souza, Renan Maciel e Matheus Caetano");
                menu();
}
   static public int Pergunta(){
       String[] perguntas = {"O qué é que de manhã tem 4 pernas, a tarde tem 2 e a noite tem 3?",
                             "Dentro de uma vila temos uma tribo cujo existem 35 seres mitologicos formado de minotauros e centauros,\n" +
                                                       " os quais juntos soma 100 pés, qual o numero respectivamente de minotaruros e centauros?\n" +
                                                       " ( use o sistema numerico M+C = 35 | 2M + 4C = 100 \" )",
                             "Se com 37,5 ml de uma poção é a quantidade exata para um ser que possui 3/8 do seu tamanho,\n" +
                           " quantos ml serão necessarios para que obetenham efeito em você? ( considere que tem 1,80 metros)",
                             "Para passar daqui você irá ter que adivinhar quantas almas eu ja absorvi.\n" +
                           " Sendo que o Dobro do antecessor do número total, menos 3,\n" +
                           " é igual a 25! Quantas almas eu já drenei?",
                             "","","","","","",}; // Vetor para guardar as perguntas
       String[] questoes = {"A) Uma sombra de uma cadeira sobre diferetes posições do sol  \nB) Um animal2 \nC) A passagem da vida de um homem \nD) Uma sombra de uma cama sobre diferetes posições do sol",
                            "A) 20 Centauros e 15 Minotauros  \nB) 15 Centauros e 20 Minotauros \nC) 10 Centauros e 25 Minotauros  \nD) 17 Centauros e 18 Minotauros",
                            "A) 100 ML  \nB) 95 ML \nC) 135 ML  \nD) 105 ML",
                            "A) 10 Almas  \nB) 9 Almas \nC) 11 Almas  \nD) 12 Almas ",}; // Vetor para guardar as alternativas
       String[] ajuda = {"Metabolismo","Conta nos dedos"}; // Vetor para ajuda caso haja erro do usuario
       String[] respostas = {"C","B","A","C"}; // Vetor para guardar as respostas certas de cada posicao
       
   Random sorteio = new Random(); // variave sorteio para inicializar o random
   int r = sorteio.nextInt(2); // variavel r= guarda um numero sorteado
   String resposta; // variavel para armezenar resposta dada pelo usuario
   
   do{
   System.out.print(perguntas[r]+"\n"+questoes[r]+"\nResposta: "); // print pergunta e alternativa de acordo com o numero sorteado
   resposta = teste.next(); // armazena a resposta do usuario
    if(resposta.equals(respostas[r])){
        pontuacao = pontuacao+100;
        System.out.println("Voce acertou! \nVidas: "+vida);
    }// se a resposta do usuasario estiver correta da O feedback e adiciona pontos em sua pontuacao
    else{
        vida --; // se estiver errada irá decrementar a vida e depois cair em uma verificacao
        if(vida>0){
        System.out.println("******Voce errou Tente Novamente!******** \n ********Cuidado a cada erro vc perderá uma vida!******** \nVidas:"+vida);
        System.out.println("Dica:"+ajuda[r]);} // se a vida for maior que zero ele tera oportunidades para continuar indicando o quanto de vidas ainda possui
        else{
            System.out.println("Game Over!"); // se a vida for igual a zero o jogo acabou para o usuario
        }
        
        
   }
    }while(!resposta.equals(respostas[r]) && vida>0); // enquanto a resposta for diferente da certa e o número de vidas for maior que zero ele irá realizar o do
   if(resposta.equals(respostas[r]) && vida>0){
       return 1;
   } // se ele acertar a resposta e numero de vidas for maior que 0 ira retornar 1 para o validador
   else{
       return 0; //  se ele errar e suas chances acabar ira retonar 0 para o validador
   }
}
   static void Historinha(){
       System.out.println("                                             _______________________\n" +
"   _______________________-------------------                       `\\\n" +
" /:--__                                                              |\n" +
"||< > |                                   ___________________________/\n" +
"| \\__/_________________-------------------                         |\n" +
"|                                                                  |\n" +
" |                             MAGIC MATH                          |\n" +
" |                                                                  |\n" +
" |      \"Assim como toda historia tem um começo está não            |\n" +
"  |        seria diferente, A nossa historia se passa em algum       |\n" +
"  |      seculo jás perdido em meio as ruinas do tempo,              |\n" +
"  |      em uma terra média chamada Eldia quando a magia e o irreal  |\n" +
"  |      ainda coexistiam, a partir deste ponto temos                 |\n" +
"   |      um jovem rapaz chamado ..., que em poucos dias ele          |\n" +
"   |       começaria uma jornada que mudaria a sua vida,              |\n" +
"   |     a vida neste seculo não é nada facil, toda Eldia está       |\n" +
"  |                                                                   |\n" +
" |                                                                  |\n" +
" |      \"destruida há seculos, a historia e todo o conhecimento    |\n" +
"  |        contido em nosso mundo está escasso, a busca por uma      |\n" +
"  |      coordenada que levara até a verdade sobre o nosso mundo é   |\n" +
"  |       constante e no meio disto a nação soberana de Marven quer  |\n" +
"  |      impedir que alguem consiga obter tais conhecimentos,         |\n" +
"   |      somente obetendo tais informações poderá reconstruir o      |\n" +
"   |      mundo novamente e você é o escolhido para restaurar a paz   |\n" +
"   |         e a ordem em nosso mundo, você aceita continuar?        |\n" +
"  |                                              ____________________|_ \n" +
"  |  ___________________-------------------------                      `\\\n" +
"  |/`--_                 ╔═════•ೋೋ•═════╗                 |\n" +
"  ||[ ]||                    1- [Sim]  || 2- [Não]    __________________/\n" +
"   \\===/___________________--------------------------") ; // funcao criada para printar historia do jogo 
   }
   static void PrimeiroDesafio(){
        System.out.println("╔═══════•ೋೋ•═══════╗ \n" +
                               "         Informe o seu nome:\n" +
                           "╚═══════•ೋೋ•═══════╝");
            nome = entrarDadosStr(); //CAPTURA DO NOME DO PERSONAGEM
        
        
                    System.out.println("                                   ....\n" +
"                                .'' .'''\n" +
".                             .'   :\n" +
"\\\\                          .:    :\n" +
" \\\\                        _:    :       ..----.._\n" +
"  \\\\                    .:::.....:::.. .'         ''.\n" +
"   \\\\                 .'  #-. .-######'     #        '.\n" +
"    \\\\                 '.##'/ ' ################       :\n" +
"     \\\\                  #####################         :\n" +
"      \\\\               ..##.-.#### .''''###'.._        :\n" +
"       \\\\             :--:########:            '.    .' :\n" +
"        \\\\..__...--.. :--:#######.'   '.         '.     :\n" +
"        :     :  : : '':'-:'':'::        .         '.  .'\n" +
"        '---'''..: :    ':    '..'''.      '.        :'\n" +
"           \\\\  :: : :     '      ''''''.     '.      .:\n" +
"            \\\\ ::  : :     '            '.      '      :\n" +
"             \\\\::   : :           ....' ..:       '     '.\n" +
"              \\\\::  : :    .....####\\\\ .~~.:.             :\n" +
"               \\\\':.:.:.:'#########.===. ~ |.'-.   . '''.. :\n" +
"                \\\\    .'  ########## \\ \\ _.' '. '-.       '''.\n" +
"                :\\\\  :     ########   \\ \\      '.  '-.        :\n" +
"               :  \\\\'    '   #### :    \\ \\      :.    '-.      :\n" +
"              :  .'\\\\   :'  :     :     \\ \\       :      '-.    :\n" +
"             : .'  .\\\\  '  :      :     :\\ \\       :        '.   :\n" +
"             ::   :  \\\\'  :.      :     : \\ \\      :          '. :\n" +
"             ::. :    \\\\  : :      :    ;  \\ \\     :           '.:\n" +
"              : ':    '\\\\ :  :     :     :  \\:\\     :        ..'\n" +
"                 :    ' \\\\ :        :     ;  \\|      :   .'''\n" +
"                 '.   '  \\\\:                         :.''\n" +
"                  .:..... \\\\:       :            ..''\n" +
"                 '._____|'.\\\\......'''''''.:..'''\n" +
"                            \\\\ ");
                    
                    System.out.println("olá, caro jovem " +nome+ ", eu sou o 13º mago celestial o ultimo de todos, seu pai foi um grande mago, um excelente matematico,\n" +
" amigo e professor e ele confiou a mim a missão de guia-lo em seu destino, sua jornada se passara nas ruínas do mundo desconhecido\n" +
" onde caso você consiga passar pelos 10 desafios divinos você obtera o conhecimento supremo para enfim restaurar o nosso mundo,\n" +
" o povo de Eldia conta com você, salve o mundo e construa o seu destino...");    
                    
                    System.out.println("");
                    System.out.println("chegando nas ruinas do mundo desconhecido o jovem se depara com o 1º problema,\n" +
" para ele entrar dentro das ruínas ele terá que resolver o enigma de raciocinio");        
              
                    
                    System.out.println("  |||            _.'   _      _.-. |        | |--\n" +
" \\|||         _.'    -    _.-'  _|-|       -| |__\n" +
"  ||;-,    _.'   '-  _.-'' _.-''|  |-'      | `._\n" +
" -'| / \\_,' _    _.-'   _.' |   |  |    -|  |\n" +
" ----|,`   |  _.'   _.-' | ,| ,'| _| |      |_   \n" +
"    _:  _   ,'   .-'    _|/ \\ | | -|  _|_   | '\n" +
"   | |    ,'  .-'     , )|)-( |_|  |-       |    -\n" +
" -   |  ,'  ,'(   `  /_\\||`.'   |- |   -|_  |\n" +
" ___-| /  ,'   )     `.'||.-| _ | ||        | '-'\n" +
" __( |;  /    / ,-    | ||  |/ \\|_ | _|    -|    \n" +
"   | :  ; ,-.-)       | ||  || ||  |   |_   |    _\n" +
"  _| | :/` _..\\  `-.  | ||__||_|;--;--------:  ,'`\n" +
"   | | |,-'  _/       |,-/\\_|  /__/__________\\::::\n" +
"   |-| |   ,' \\, ` ___|||||-|  |  |  _|_     ||___\n" +
" _ | | | ,'   (   ;   :'''' /| ||_|       _  ||---\n" +
" - | | |/     ;  /     :   : | |  |   _|_    ||---\n" +
"   | | |      |,'______|-..| | |_||      |  _||---\n" +
"   | | |      ||_      |   | | |_ |  -      -|----   \n" +
" _|| | |      ;|-:  _  |   | |,|- |-   _|  _ |--,'\n" +
"   | | |______\\| |,' `.|`-.| |:|  | _|    |  |,','\n" +
"   |-| | ~   ~|| ||__|||! !| | ;--;----__---,','|\n" +
"   | | |,._,~_|:.||-'|||! !| |/__/____/\\_\\,','|\\|\n" +
" -.| | ;     _.-'|| - ||`.!| ||  |    ||_|,'| | |,\n" +
"  || ;'|_,-''    -    - `.`| ||  | ___|| ||\\| |,',\n" +
" , | | |    -     -     -  ) '|__||\\  || | \\|,','\n" +
"   ; | | -     -      -      |\\    \\\\ || |_,',' \n" +
"  /| | ;    -     -           \\\\    \\\\|| |','\n" +
" / | |/                        \\\\    \\|| |'");
                    
                    
                    System.out.println("");
         System.out.println("╔════•ೋೋ•════╗ \n" +
                           "       1º Desafio\n" +
                           " ╚════•ೋೋ•════╝");
        
                    
   }
   static void SegundoDesafio(){
      System.out.println("A partir daqui não se pode mais desistir e a morte será certa porém caso consiga você obtera algo de valor inestimavel...");
              
        System.out.println("( finalmente agora dentro das ruinas o héroi se depara com um lago vermelho como sangue\n" +
                                    "e na beira deste lago tem um barqueiro chamado Aqueronte e para atravessar este lago Aqueronte propoe o seguinte enigma ) ");
                                    System.out.println("                      `-.\n" +
"              -._ `. `-.`-. `-.\n" +
"             _._ `-._`.   .--.  `.\n" +
"          .-'   '-.  `-|\\/    \\|   `-.\n" +
"        .'         '-._\\   (o)O) `-.\n" +
"       /         /         _.--.\\ '. `-. `-.\n" +
"      /|    (    |  /  -. ( -._( -._ '. '.\n" +
"     /  \\    \\-.__\\ \\_.-'`.`.__'.   `-, '. .'\n" +
"     |  /\\    |  / \\ \\     `--')/  .-'.'.'\n" +
" .._/  /  /  /  / / \\ \\          .' . .' .'\n" +
"/  ___/  |  /   \\ \\  \\ \\__       '.'. . .\n" +
"\\  \\___  \\ (     \\ \\  `._ `.     .' . ' .'\n" +
" \\ `-._\\ (  `-.__ | \\    )//   .'  .' .-'\n" +
"  \\_-._\\  \\  `-._\\)//    \"\"_.-' .-' .' .'\n" +
"    `-'    \\ -._\\ \"\"_..--''  .-' .'\n" +
"            \\/    .' .-'.-'  .-' .-'\n" +
"                .-'.' .'  .' .-'");
                                    
                                    System.out.println("");
                                    
                                    System.out.println("╔════•ೋೋ•════╗ \n" +
                                                       "        2º Desafio\n" +
                                                       "╚════•ೋೋ•════╝");                       
   }
   static void TerceiroDesafio(){
       System.out.println("( agora já no outro lado do largo o nosso heroi se depara com uma porta e entrando nessa porta ele encontra um grande alquimista louco desaparecido há decadas\n" +
" chamado Nicolas flamel, Nicolas diz que a partir dali as coisas ficarão mais dificeis e que não bastara apenas ter um coração e sim 3,\n" +
" Nicolas desenvolvel após anos de pesquisa o elixir da vida junto com base na famosa pedra filosofal e propoe toma- ló\n" +
" porém para isso ele terá que dar a quantidade exata da formula para o Nicolas porque uma dosagem errado o levará a morte certa)");
        
        System.out.println("                 .\n" +
"\n" +
"                   .\n" +
"         /^\\     .\n" +
"    /\\   \"V\"\n" +
"   /__\\   I      O  o\n" +
"  //..\\\\  I     .\n" +
"  \\].`[/  I\n" +
"  /l\\/j\\  (]    .  O\n" +
" /. ~~ ,\\/I          .\n" +
" \\\\L__j^\\/I       o\n" +
"  \\/--v}  I     o   .\n" +
"  |    |  I   _________\n" +
"  |    |  I c(`       ')o\n" +
"  |    l  I   \\.     ,/\n" +
"_/j  L l\\_!  _//^---^\\\\_ ");
        
        System.out.println("");
        System.out.println("╔════•ೋೋ•════╗ \n" +
                           "        3º Desafio\n" +
                           "╚════•ೋೋ•════╝");
        
       
   }
   static void QuartoDesafio(){
       System.out.println("(Após o jovem heroi conseguir passar por este desafio ele se sente mais forte e confiante sobre o seu destino porém\n" +
"como Nicolas disse a partir dali as coisas ficariam mais dificeis ou seja toda vez que errar ele terá 1/3 de sua vida drenada\n" +
"durante aquele determinado teste,\n" +
" finalmente no 4º desafio ele se depara com uma porta chamada porta da vida e para abrir está porta precisara responde-lá)");
        
        System.out.println("   ---   .    ____        -----      ______   -----        .\n" +
"  ___     / \\             .....................      ____   / \\\n" +
"        .'   '.  --  ..:::::''''''''''''''''':::::..      .'   '.\n" +
"  ---   | ^ ^ |    .::::''''          (_     ''''::::. -- | ^ ^ '\n" +
"        | ^ ^ |  .::''                       _)    ''::.  | ^ ^ | --\n" +
"____     '...'  .::'              .-.      (_        '::.  '...'\n" +
"        .-.!_  .::'       _)     /   \\                '::.   ! ____\n" +
"       / / `-`.:'                '-.-'            _)    ':..\"\"\".\n" +
" --    ' |  '.|:'      _)         .'.       (_          ':/' |  \\\n" +
"       | |   |'.               _/^---^\\_                  |     . --\n" +
" ___    \\ .  '|               \\-------../         (_      \\   '.'\n" +
"        ' :   '        _)      '.\\:::/.'       (_   )_    |'   || ___\n" +
"        | |  .|      _(         | | |'|                   / ' . |\n" +
"    --  | '. | \\                '.\\ /.'                   '.  | |--\n" +
"        |'.   '|                 |[ ]|           (_       | .'  |____\n" +
"__    .'\\ |  .'\\                 '.^.'                    \\ |.  .\n" +
"     .'-.\\'. | |        _)        (:)                     | ||| |\n" +
"   .'    \\'..' .             _..--'''--.._      (_       /'-._.-'| ---\n" +
"   |       `-..'.         .-'             '-.           |      .-'.\n" +
"    \\            `-.    .'  ..            .. '.        .'-._.-'    `.\n" +
"--   )              `-./    '::.        .::'   \\   _.-'             /\n" +
"     '._/-..          /       '::.    .::'      \\-'              .-'\n" +
"         ::.`-.      ''        '::   ::'        ''       _..-\\_.'\n" +
"         :::   '._   | \\         '   '         / |    .-'   .:: _____\n" +
"____     :::      `-.|  '  .----..___..----.  '  | .-'      :::\n" +
"         :::          \\ |  _..--.     .--.._  | /-'         ::: ---\n" +
"         :::   _)     | ' /     |     |     \\ ' |  (        :::\n" +
"   --    :::          )   |   _.'     '._   |   (   )_      :::____\n" +
"    ____ :::          /'. \\_.'   )\\ /(   '._/ .'\\     (_    :::\n" +
"         :::       .-'|  `-->-@ /     \\ @->--'  |-.         :::\n" +
"         :::    .-'   \\         | / \\ |         /  `-.      :::  ---\n" +
" ----    '' _.-'       |        )/   \\(        |      `-.   :::  _____\n" +
"  _.-=--..-'          . \\ /\\               /\\ /          `-. ''\n" +
" /.._    `.        .-'   .\\ '-.\\.\\\\.//./.-' /.`-.           `---.._\n" +
"|    `.    \\    .-'      | '.             .' |   `-.                \\ \n" +
" \\    _\\.   `.-'         |   '-././.\\.\\.-'   |      `.               |\n" +
"  `.-'  |   /::::::::::: \\                   /::::::::`.      ,-.    /\n" +
" - |   /   /        ----  '-.             .-'     ----  `.    |  \\_.'\n" +
"__ \\   | .'     _____        '-._._._._.-'     ____      |    |   |\n" +
"    `--'                                                 `-.  '._ / --\n" +
"                                                            `...-'");
        
        System.out.println("");
        System.out.println("╔════•ೋೋ•════╗ \n" +
                           "        4º Desafio\n" +
                           "╚════•ೋೋ•════╝");
        System.out.println("Porta: "); 
       
   }
   static void QuintoDesafio(){
       
   }
   static void SextoDesafio(){
       
   }
   static void SetimoDesafio(){
       
   }
   static void OitavoDesafio(){
       
   }
   static void NonoDesafio(){
       
   }
   static void DecimoDesafio(){
       
   }
   static void Reset(){
       //funcao driada para resetar o jogo caso o usuario perca todas suas vidas
        int reset;
        System.out.println("****** Sinto Muito Jovem Guerreiro, Não foi desta vez.. Porém, não desista!*****\n1-Sair \n2-Menu");
                       reset=entrarDadosInt();
                         switch(reset){
                             case 1:
                                 System.exit(0);
                                 break;
                             case 2:
                                 vida =3;
                                 pontuacao =0;
                                 menu();
                                 break;
                             default:
                                 System.out.println("Escolha uma opção valida");
       
   } }
}
