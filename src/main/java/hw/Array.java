package hw;

public class Array { //класс называется так, потомучто изначально хотела проверить пример на массивах
    public int sum(int N){
        int rez = 0;
        for(int i = 0;i <= N;i++){
            rez+=i;
        }
        return rez;
    }
}
