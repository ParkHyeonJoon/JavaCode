package course2.model;

public class OracleDriver implements Connection {

    @Override
    public void getConnection(String url, String username, String password) {
        System.out.println("url, username, password를 이용하여 db 접속 시도 중");
    }
}
