package midletest2;

import java.util.HashMap;
import java.util.Scanner;

public class PhoneManager {
    private HashMap<String, Phone> phoneBook;

    public PhoneManager() {
        phoneBook = new HashMap<>();
    }

    public void addContact(String name, String tel, String address) {
        Phone phone = new Phone(name, tel, address);
        phoneBook.put(name, phone);
    }

    public Phone getContact(String name) {
        return phoneBook.get(name);
    }

    public void showContact(String name) {
        Phone phone = getContact(name);
        if (phone != null) {
            System.out.println(phone);
        } else {
            System.out.println(name + " 은(는) 없습니다.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhoneManager manager = new PhoneManager();

        System.out.print("인원수 >> ");
        int count = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < count; i++) {
            System.out.print("이름과 전화번호(번호는 연속적으로 입력), 주소 >> ");
            String[] input = scanner.nextLine().split(" ");
            manager.addContact(input[0], input[1], input[2]);
        }

        System.out.println("저장되었습니다...");

        while (true) {
            System.out.print("검색할 이름 >> ");
            String name = scanner.nextLine();
            if (name.equals("exit")) {
                System.out.println("프로그램을 종료합니다...");
                break;
            }
            manager.showContact(name);
        }

        scanner.close();
    }
}
