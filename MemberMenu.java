package view;

import java.util.Scanner;

import controller.MemberManager;

public class MemberMenu {

	public static void main(String[] args) {
		// MemberMenu

		MemberManager m = new MemberManager();
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("===== Member Management =====");
			System.out.println("1. 회원 추가");
			System.out.println("2. 전체 조회");
			System.out.println("3. ID 검색");
			System.out.println("4. 회원 삭제");
			System.out.println("0. 종료");
			System.out.print("\n메뉴 선택 : ");
			int no = sc.nextInt();

			switch (no) {
			case 1:
				m.addMember();
				break;
			case 2:
				m.printAll();
				break;
			case 3:
				System.out.print("조회할 ID : ");
				System.out.println(m.findById(sc.next()));
				break;
			case 4:
				m.deleteMember();
				break;
			case 0:
				System.out.print("종료하시겠습니까? (Y/N) : ");
				if (sc.next().toUpperCase().charAt(0) == 'Y') {
					return;
				} else {
					break;
				}
			default : System.out.println("잘못된 번호입니다. \n다시 입력하세요.");
			}
		} while (true);
	}
}
