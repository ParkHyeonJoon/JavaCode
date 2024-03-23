package course2.part1;

import course2.model.Connection;
import course2.model.OracleDriver;

public class DataBaseConnection {
    public static void main(String[] args) {
        Connection conn = new OracleDriver();
        conn.getConnection("jdbc:oracle:thin:@localhost:1525:XE", "system.", "1234");
    }
}
