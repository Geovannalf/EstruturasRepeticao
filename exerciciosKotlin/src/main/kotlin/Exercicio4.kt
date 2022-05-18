fun main(){
    var cont = 0
    var idade = 0
    var sexo = 0
    var opcao = 0
    var pessoasCalmas= 0
    var mulheresNervosas = 0
    var outrosCalmos = 0
    var pessoasNervosas40 = 0
    var pessoasCalmas18 = 0
    var homenAgressivos = 0
    while(cont < 5){
        println(" Pessoa ${cont+1}")

        println("Informe sua idade: ")
        idade = readln().toInt()

        println("Indorme o sexo(1-feminino/2-masculino/ 3-outros " )
        sexo = readln().toInt()

        println("Informe o comportamento"+"\n" +
                "1- calma/2-nervosa/3-agressiva")
        opcao = readln().toInt()

        if (opcao == 1){
            pessoasCalmas++
        }
        if (sexo == 1 && opcao == 2){
            mulheresNervosas++
        }
        if (sexo == 2 && opcao == 1){
            homenAgressivos++
        }
        if (sexo == 3 &&  opcao == 1 ){
            outrosCalmos++
        }
        if (opcao == 2 && idade > 40){
            pessoasNervosas40++
        }
        if (opcao == 1 && idade < 18)
            pessoasCalmas18++
        println("O número de pessoa calmas é: $pessoasCalmas")
        println("O número de mulhres nervosas é: $mulheresNervosas")
        println("O número de homens agressivos é: $homenAgressivos")
        println("O número de outros calmos é: $outrosCalmos")
        println("O número de pessoas nervosas com mais de 40 anos é: $pessoasNervosas40")
        println("O número de pessoas calmas com menos de 18 anos é: $pessoasCalmas18")

    }
}