package exam;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 * 雛形クラスです.<br>
 * これをコピーペーストして問題を解いて構いません。
 * 
 * @author igamasayuki
 */
public class Exam1 {
	public static void main(String[] args) {
		// 接続情報
		String url = "jdbc:postgresql://localhost:5432/student";
		String user = "postgres";
		String password = "akhd0416";

		Connection con = null; // 使用する変数の宣言
		PreparedStatement pstmt = null;
		String sql = null;

		try {
			// (1)データベースに接続
			con = DriverManager.getConnection(url, user, password);

			// (2)SQL文を作成
			sql1 = "INSERT  INTO test_members(name, age, dep_id) VALUES('山田太郎', 62, 1)";
			sql2 = "INSERT  INTO test_members(name, age, dep_id) VALUES('佐藤花子', 33, 2)";
			sql3 = "INSERT  INTO test_members(name, age, dep_id) VALUES('遠藤次郎', 55, 2)";

			// "INSERT  INTO テーブル名(カラム名) VALUES(登録する値)";

			// (3)SQL実行準備
			pstmt = con.prepareStatement(sql1);
			pstmt = con.prepareStatement(sql2);
			pstmt = con.prepareStatement(sql3);

			// (4)SQL実行
			// ※ここにSQL実行処理を書く
			int numOfUpdate = pstmt.executeUpdate();

			// (5)結果の操作
			// ※ここに結果の操作処理を書く
			System.out.println(numOfUpdate + "件更新しました");
			

		} catch (SQLException ex) {
			System.err.println("SQL = " + sql);
			ex.printStackTrace();
		} finally {
			// (6) メモリの解放(切断)
			try {
				con.close();
			} catch (Exception ex) {
			}
			try {
				pstmt.close();
			} catch (Exception ex) {
			}
		}
	}
}
