package LUXSHOP;

import java.util.ArrayList;
import java.util.List;

public class UserCatalog {
    private List<User> users;

    public UserCatalog() {
        this.users = new ArrayList<>();
        // 예시 사용자 추가
        users.add(new User("user1@example.com", "password1", "John Doe"));
    }

    public void addUser(String email, String password, String name) {
        users.add(new User(email, password, name));
        System.out.println(name + "님이 성공적으로 등록되었습니다.");
    }

    public User loginUser(String email, String password) {
        for (User user : users) {
            if (user.login(email, password)) {
                System.out.println(email + "로 성공적으로 로그인했습니다.");
                return user;
            }
        }
        System.out.println("로그인 실패: 이메일 또는 비밀번호가 틀렸습니다.");
        return null;
    }

    public void updateUser(User user, String name, String password) {
        user.updateInfo(name, password);
        System.out.println("회원 정보가 업데이트되었습니다.");
    }
}
