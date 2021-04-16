package hello.servlet.basic.domain.member;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Member {

    private Long id;
    private String username;
    private int age;

    public Member(final String username, final int age) {
        this.username = username;
        this.age = age;
    }
}
