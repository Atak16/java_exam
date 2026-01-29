package exam;

import java.lang.reflect.Member;

import dao.MemberDao;

/**
 * insert()メソッド、動作確認用の実行クラスです.
 * 
 * @author igamasayuki
 *
 */
public class InsertMain {

	public static void main(String[] args) {
		MemberDao dao = new MemberDao();
		Member member = new Member();
		
		member.setId(1000);
		member.setName("シロー");
		member.setAge(54);
		member.setDepId(3);



		System.out.println("insert終了");
	}

}
