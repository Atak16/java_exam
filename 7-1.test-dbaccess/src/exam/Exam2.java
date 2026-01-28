package exam;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 * 雛形クラスです.<br>
 * これをコピーペーストして問題を解いて構いません。
 * 
 * @author igamasayuki
 */
public class Exam2 {
	public static void main(String[] args) {
		// 接続情報
		String url = "jdbc:postgresql://localhost:5432/student";
		String user = "postgres";
		String password = "akhd0416";

		Connection con = null; // 使用する変数の宣言
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;

		try {
			// (1)データベースに接続
			con = DriverManager.getConnection(url, user, password);

			// (2)SQL文を作成
			sql = "SELECT dep_id from test_members";

			// (3)SQL実行準備
			pstmt = con.prepareStatement(sql);

			// (4)SQL実行
			// ※ここにSQL実行処理を書く
			rs = pstmt.executeQuery();

			// (5)結果の操作
			// ※ここに結果の操作処理を書く
			while (rs.next()) {
				int name = rs.getInt(2);
				System.out.print(name);
				System.out.println();
			}
			

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
			} 
			catch (Exception ex) {
			}
			try {
				rs.close();
			} 
			catch (Exception ex) {
			}
		}
	}
}
