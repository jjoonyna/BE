package nomad.searchspace.domain.member.domain;

import jakarta.persistence.*;
import lombok.*;
import nomad.searchspace.domain.BaseTimeEntity;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Member extends BaseTimeEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String email;

    @Setter
    private String password;

    @Setter
    @Column(length = 50)
    private String nickname;

    @Setter
    private Boolean gender;

    @Setter
    @Column(length = 50)
    private String birth;

    @Setter
    @Column(length = 50)
    private String phoneNumber;

    private String role;

    @Builder
    private Member(String password, String email,  String nickname, Boolean gender, String birth, String phoneNumber, String role) {
        this.password = password;
        this.email = email;
        this.nickname = nickname;
        this.gender = gender;
        this.birth = birth;
        this.phoneNumber = phoneNumber;
        this.role = role;
    }

}