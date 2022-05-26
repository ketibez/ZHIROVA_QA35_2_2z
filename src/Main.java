public class Main {
    public static void main(String[] args) {
        int account = 890; // текущий счет клиента
        int accountAdd = 360; // сумма пополнения
        int accountSum; // итоговый счет клиента
        int bonus; // текущее количество бонусных рублей
        int bonusAdd; // начисленные бонусные рубли
        int bonusSum; // итоговое количество бонусных рублей

        accountSum = account + accountAdd;
        bonus = account / 100;
        bonusAdd = accountAdd / 100;
        bonusSum = bonus + bonusAdd;

        System.out.println("Итоговый счет: " + accountSum);
        System.out.println("Количество бонусных рублей: " + bonusSum);
    }

}
