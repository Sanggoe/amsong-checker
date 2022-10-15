package com.sanggoe.pjtdaejanggan.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CheckingInfoDto { // 점검할 암송 구절 선별 위한 정보를 담아 request 할 때 사용하는 Dto

    @NotNull
    @Size(min = 3, max = 50)
    private String username;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @NotNull
    @Size(min = 3, max = 100)
    private String password;

    @NotNull
    @Size(min = 3, max = 50)
    private String nickname;

    /*
    React 단에서 하위 데이터들 추가 결정 되면 하기로

    checkingType: checkingType,
    headList: headList,
    order: order,
    verseType: verseType,
    count: { chapter: chapter, contents: contents },
    weight: {
        is73checked: is73checked,
        in73Chapter: in73Chapter,
        in73Contents: in73Contents,
        out73Chapter: out73Chapter,
        out73Contents: out73Contents,
	},

     */
}