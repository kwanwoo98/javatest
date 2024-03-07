package ex_240306;

import ex_240304.Idol;

public class Ex_01_try_class_boygroup_inheritance_1_main {

	public static void main(String[] args) {
		// 부모 클래스 : Idol 
		// 상속 받은 자식 클래스 : Ex_01_try_class_boygroup_inheritance_1
		// 사용하기. -> 클래스명과 이름이 동일한, 생성자로 초기화를 한답니다.
		// 기본문법 : 클래스명 레퍼런스 변수명 = new 클래스명();
		// 클래스명() : 생성자라고 부릅니다. 역할, 해당 인스턴스화를 해서 초기화해서 사용하기 위해 사용함.
		// 매개변수가 3개인 생성자 포맷
		// (String groupName, String[] groupMembers, String[] groupAlbums) {
		
		// 배열 정의 
		// 기본 문법
		// 타입 [] 배열이름 = new 타입[크기]
		// 방법1
		//String [] boygroups = new String[3];
		// 방법2 
		// 타입 [] 배열이름 = { "문자열타입요소1", "문자열타입요소2","문자열타입요소3" }
		String [] boyGroups = {"상용 연습생1","상용 연습생2","상용 연습생3"};
		
		String [] boyGroupsAlbum = {"상용 앨범1","상용 앨범2","상용 앨범3"};
		
		Ex_01_try_class_boygroup_inheritance_1 boyGroup1 = new 
				Ex_01_try_class_boygroup_inheritance_1("연습생 보이그룹1", boyGroups,boyGroupsAlbum);
		
		boyGroup1.introduceMember();
		boyGroup1.introduceAlbum();
		
		// 접근 지정자 : 
		// 1) public : 모든 곳에서 접근이 가능(다 보인다.)
		// 2) private : 해당 클래스 내부에서만 다보이고, 나머지 다른 위치에서는 보이지 않는다.
		// 그래서, 접근해서, 값을 설정하거나, 값을 가져오거나 할 때는 , -> getter/setter 해야한다. 
		// 3) default : 같은 패키지 내부에서는 다 보인다. 
		// 4) protected : 상속을 받은 자식 클래스에서만 보인다. 
		
		// 1)call by value, 2)call by reference
		// 1) 메서드에서 인자값으로 전달시 복사해서 사용하고, 지역변수에서 이용후 소멸함. 
		// 2) 참조형으로(레퍼런스, 인스턴스)로 메서드에 전달하면, 해당 메모리 위치 주솟값을 재사용하고, 
		// 메서드를 사용후 , 소멸 하지 않는다. 
		
		
		
	}

}


