import java.io.IOException;

public class Task1 {
    public static void main(String[] args) throws IOException {

        //System.out.println(convert(5));
        //System.out.println(points(13, 12));
        //System.out.println(footballPoints(3, 4, 2));
        //System.out.println(divisibleByFive(5));
        //System.out.println(and(true, false));
        //System.out.println(howManyWalls(100, 4, 5));
        //System.out.println(squared(9));
        //System.out.println(profitableGamble(0.9, 3, 2));
        //System.out.println(frames(10, 25));
        //System.out.println(mod(218, 5));
    }

    //1. функция, которая принимает целое число минут и преобразует его в секунды.
    public static int convert(int min) {
        return min*60;
    }

    //2. подсчитывает очки за баскетбольный матч, учитывая количество забитых 2-х и 3-х очков,
    // находит окончательные очки для команды и возвращаете это значение.
    public static int points(int x2, int x3) {
        return (2 * x2 + 3 * x3);
    }

    //3. функция, которая принимает количество побед, ничьих и поражений и вычисляет
    // количество очков, набранных футбольной командой на данный момент.
    public  static int footballPoints(int vict, int draw, int fall){
        return (3 * vict + draw);
    }

    //4. функция, которая возвращает true, если целое число равномерно делится на 5,
    // и false в противном случае.
    public static boolean divisibleByFive(int num){
        if (num % 5 == 0) return true;
        else return false;
    }

    //5. принимает два логических значения и возвращает true, если оба значения истинны.
    public static boolean and(boolean a, boolean b){
        if (a == true && b == true) return true;
        else return false;
    }

    //6.функция, которая возвращает количество полных стен, которые можно покрасить
    public static int howManyWalls(int n, int w, int h){
        return n/(w*h);
    }

    //7. исправить ошибку в исходном коде (было return а*a;)
    public static int squared(int b){
        return b*b;
    }

    //8. Создайте функцию, которая принимает три аргумента prob, prize, pay и
    // возвращает true, если prob * prize > pay; в противном случае возвращает false.
    public static boolean profitableGamble(double prob,double prize,double pay) {
    if ((prob * prize - pay) > 0)
        return true;
    else
        return false;
    }

    //9. Создайте метод, который возвращает количество кадров,
    // показанных за заданное количество минут для определенного FPS
    public static int frames(int min, int fps){
        return 60*min*fps;
    }

    //функция, которая работает как оператор модуля % без использования оператора модуля
    public static int mod(int n, int i){
        return (n-(n/i)*i);
    }
}

