package course2.model;

public class MSSQLDriver implements Connection {
    @Override
    public void getConnection(String url, String username, String password) {
        System.out.println("url, username 등으로 접속 시도");
    }
}
