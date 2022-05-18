fun main(){
    var idade = 0
    var pessoas21 = 0
    var pessoas50 = 0

    while (idade!= -99){
        print("Informe uma idade: ")
        idade = readln().toInt()
        if (idade!= -99){
            if (idade>21){
                pessoas21++
            }else if(idade >50){
                pessoas50++
            }
        }
    }
    println("O numero de pessoas maiores de 21 é: $pessoas21")
    println("O numero de pessoas maiores de 50 é: $pessoas50")
}