package com.icia.member.dto;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;

@Data
public class MemberLoginDTO {

    @NotBlank(message = "이메일은 필수입니다.")
    private String memberEmail;
    @NotBlank
            @Length(min = 2, max = 8,message = "비밀번호를 2~8자로 꼭 써주세요.")
    private String memberPassword;
}
