package controller;

import java.util.ArrayList;
import java.util.Scanner;

import model.Member;

public class MemberManager {

	private ArrayList<Member> list = new ArrayList<>();
	private Scanner sc = new Scanner(System.in);

	// 신규 회원 등록
	public void addMember() {
		System.out.print("추가할 ID : ");
		String addid = sc.next();
		for (int i = 0; i < list.size(); i++) {
			if (addid.equals(list.get(i).getId())) {
				System.out.println("중복된 아이디입니다.");
				return;
			}
		}
		System.out.print("이름 : ");
		String addname = sc.next();

		System.out.print("나이 : ");
		int addage = sc.nextInt();

		System.out.print("휴대폰 번호 : ");
		String addphone = sc.next();

		System.out.print("이메일 : ");
		String addemail = sc.next();

		Member m = new Member(addid, addname, addage, addphone, addemail);
		list.add(m);

		System.out.println("회원 등록이 완료되었습니다.");
	}

	// 전체 회원 조회
	public void printAll() {
		if (list.size() < 1) {
			System.out.println("등록된 회원 없음.");
		} else {
			for (Member m : list) {
				System.out.println(m);
			}
		}
	}

	// ID로 회원 검색
	public Member findById(String id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId().equals(id)) {
				return list.get(i);
			}
		}
		return null;
	}

	// 회원 삭제
	public void deleteMember() {
		System.out.print("삭제할 ID : ");
		String fid = sc.next();

		Member target = findById(fid);

		if (target == null) {
			System.out.println("해당 ID 없음.");
		} else {
			list.remove(target);
			System.out.println("삭제 완료.");
		}
	}

}
