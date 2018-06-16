import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        Show sh = new Show();
        sh.power();
        ArrayList<Man> people1 = new ArrayList<>();
        String name;
        String gender;
        String attack;
        String attribute;
        boolean flag = true;
        while (flag){
            int n = sca.nextInt();
            switch (n){
                case 1:
                    System.out.println("姓名:");
                    name = sca.next();
                    System.out.println("性別:");
                    gender = sca.next();
                    System.out.println("攻擊:");
                    attack = sca.next();
                    System.out.println("屬性:");
                    attribute = sca.next();
                    Man person = new Man(name,gender,attack,attribute);
                    people1.add(person);
                    break;
                case 2:
                    System.out.println("1.姓名");
                    System.out.println("2.性別");
                    System.out.println("3.攻擊");
                    System.out.println("4.屬性");
                    int m = sca.nextInt();
                    int list = 0;
                    String number = sca.next();
                    for (int i = 0;i<people1.size();i++){
                        if (people1.get(i).name.equals(number)){
                            list = i;
                            break;
                        }
                    }
                    switch (m){
                        case 1:
                            System.out.println("輸入名字:");
                            name = sca.next();
                            people1.get(list).setName(name);
                            break;
                        case 2:
                            System.out.println("輸入性別:");
                            gender = sca.next();
                            people1.get(list).setGender(gender);
                            break;
                        case 3:
                            System.out.println("輸入攻擊:");
                            attack = sca.next();
                            people1.get(list).setAttack(attack);
                            break;
                        case 4:
                            System.out.println("輸入屬性:");
                            attribute = sca.next();
                            people1.get(list).setAttribute(attribute);
                            break;
                    }
                    break;
                case 3:
                    System.out.println("輸入刪除名字:");
                    int list1 = 0;
                    String number1 = sca.next();
                    for (int i=0;i<people1.size();i++) {
                        if (people1.get(i).name.equals(number1)) {
                            list1 = i;
                            break;
                        }
                    }
                    people1.remove(list1);
                    System.out.println("刪除完成");
                    break;
                case 4:
                    flag = false;
                    System.out.println("執行結束");
                    break;
            }
        }
    }

}
